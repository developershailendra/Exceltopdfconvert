package com.spring.jpa.Service;

import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.spring.jpa.Entity.User;
import com.spring.jpa.Repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveExcelData(MultipartFile file) throws IOException {
        try (Workbook workbook = new XSSFWorkbook(file.getInputStream())) {
            Sheet sheet = workbook.getSheetAt(0);
            for (Row currentRow : sheet) {
                if (currentRow.getRowNum() == 0) {
                    continue; // Skip header row
                }
                
                User user = new User();
                
                // Get Name - Handle String and Numeric types
                Cell nameCell = currentRow.getCell(0);
                String name = getStringCellValue(nameCell);
                user.setName(name);
                
                // Get Email - Handle String and Numeric types
                Cell emailCell = currentRow.getCell(1);
                String email = getStringCellValue(emailCell);
                user.setEmail(email);
                
                // Save the employee object to the database
                if (!name.isEmpty() && !email.isEmpty()) {
                    userRepository.save(user);
                }
            }
        }
    }

    // Helper method to handle email values correctly
    private String getStringCellValue(Cell cell) {
        if (cell == null) {
            return ""; // Return empty string for null or blank cells
        }

        return switch (cell.getCellType()) {
            case STRING -> cell.getStringCellValue();
            case NUMERIC -> String.valueOf((int) cell.getNumericCellValue());
            default -> "";
        }; // Return string value
        // Convert numeric value to string
        // Return an empty string for unsupported types or blank cells
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

}
