const uploadForm = document.getElementById("uploadForm");
const fileInput = document.getElementById("fileInput");
const resultDiv = document.getElementById("result");

function uploadFile() {
  const file = fileInput.files[0];

  if (!file) {
    alert("Please select a file.");
    return;
  }
  3;

  const formData = new FormData();
  formData.append("file", file);

  const xhr = new XMLHttpRequest();
  xhr.open("POST", "http://localhost:8080/home/upload");

  xhr.onload = () => {
    if (xhr.status === 200) {
      resultDiv.textContent = "Data inserted successfully: " + xhr.responseText;
    } else {
      resultDiv.textContent =
        "Error occurred while processing file: " + xhr.responseText;
    }
  };

  xhr.send(formData);
}

uploadForm.addEventListener("submit", (e) => {
  e.preventDefault();
  uploadFile();
});
