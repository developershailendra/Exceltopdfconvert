package com.spring.jpa.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.itextpdf.text.DocumentException;
import com.spring.jpa.Entity.User;
import com.spring.jpa.Service.PdfService;
import com.spring.jpa.Service.UserService;

@RestController
@RequestMapping("/home")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private PdfService pdfService;

    
    @GetMapping("/pdf")
    public ResponseEntity<byte[]> getUsersPdf() {
        List<User> users = userService.findAll();
        StringBuilder sb = new StringBuilder();

        for (User user : users) {  // Correctly iterate over each User
            sb.append("ID: ").append(user.getId()).append("\n");
            sb.append("Name: ").append(user.getName()).append("\n");
            sb.append("Email: ").append(user.getEmail()).append("\n\n");
        }

        try {
            byte[] pdfBytes = pdfService.generatePdf(sb.toString());
            HttpHeaders headers = new HttpHeaders();
            headers.set(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=users.pdf");
            headers.setContentType(MediaType.APPLICATION_PDF);

            return new ResponseEntity<>(pdfBytes, headers, HttpStatus.OK);
        } catch (DocumentException | IOException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    
    @PostMapping("/upload")
    public ResponseEntity<String> uploadExcelFile(@RequestParam("file") MultipartFile file) {
        try {
            userService.saveExcelData(file);
            return ResponseEntity.ok("Data inserted successfully.");
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error occurred while processing file.");
        }
    }
}
