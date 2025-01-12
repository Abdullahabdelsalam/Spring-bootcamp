<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Registration Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/employee-form.css">
</head>
<body>
  <div class="container">
    <div class="form-container">
      <h2 class="text-center mb-4">Employee Registration Form</h2>
      <form:form id="registrationForm" action="/submitForm" method="POST">
        <div class="mb-3">
          <label for="username" class="form-label">Username</label>
          <input type="text" class="form-control" id="username" placeholder="Enter Username" path="username">
          <div class="error" id="usernameError">This field cannot be empty or null</div>
        </div>

        <div class="mb-3">
          <label for="email" class="form-label">Email Address</label>
          <input type="email" class="form-control" id="email" placeholder="Enter Email Address" path="email">
          <div class="error" id="emailError">Please enter a valid email address</div>
        </div>

        <div class="mb-3">
          <label for="password" class="form-label">Password</label>
          <input type="password" class="form-control" id="password" placeholder="Enter Password" path="password">
          <div class="password-requirements" id="passwordRequirements">
            <p>Password must contain:</p>
            <ul>
              <li id="lengthRequirement">At least 8 characters</li>
              <li id="uppercaseRequirement">At least one uppercase letter</li>
              <li id="lowercaseRequirement">At least one lowercase letter</li>
              <li id="numberRequirement">At least one number</li>
              <li id="specialCharRequirement">At least one special character (!@#$%^&*)</li>
            </ul>
          </div>
        </div>

        <div class="mb-3">
          <label for="confirmPassword" class="form-label">Confirm Password</label>
          <input type="password" class="form-control" id="confirmPassword" placeholder="Confirm Password">
          <div class="error" id="passwordError">Passwords do not match</div>
        </div>

        <button type="submit" class="btn btn-primary w-100">Submit</button>
      </form:form>
    </div>
  </div>

  <!-- Bootstrap JS -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>

  <!-- Custom JavaScript for validation -->
  <script>
    document.getElementById("registrationForm").addEventListener("submit", function (e) {
      e.preventDefault();

      // Get form fields
      const username = document.getElementById("username").value.trim();
      const email = document.getElementById("email").value.trim();
      const password = document.getElementById("password").value;
      const confirmPassword = document.getElementById("confirmPassword").value;

      // Error flags
      let hasError = false;

      // Validate username
      if (!username) {
        document.getElementById("usernameError").style.display = "block";
        hasError = true;
      } else {
        document.getElementById("usernameError").style.display = "none";
      }

      // Validate email
      const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
      if (!email || !emailPattern.test(email)) {
        document.getElementById("emailError").style.display = "block";
        hasError = true;
      } else {
        document.getElementById("emailError").style.display = "none";
      }

      // Validate password
      const passwordRequirements = document.getElementById("passwordRequirements");
      const lengthRequirement = document.getElementById("lengthRequirement");
      const uppercaseRequirement = document.getElementById("uppercaseRequirement");
      const lowercaseRequirement = document.getElementById("lowercaseRequirement");
      const numberRequirement = document.getElementById("numberRequirement");
      const specialCharRequirement = document.getElementById("specialCharRequirement");

      let isPasswordValid = true;

      // Check each password requirement
      if (password.length < 8) {
        lengthRequirement.style.color = "red";
        isPasswordValid = false;
      } else {
        lengthRequirement.style.color = "green";
      }

      if (!/[A-Z]/.test(password)) {
        uppercaseRequirement.style.color = "red";
        isPasswordValid = false;
      } else {
        uppercaseRequirement.style.color = "green";
      }

      if (!/[a-z]/.test(password)) {
        lowercaseRequirement.style.color = "red";
        isPasswordValid = false;
      } else {
        lowercaseRequirement.style.color = "green";
      }

      if (!/[0-9]/.test(password)) {
        numberRequirement.style.color = "red";
        isPasswordValid = false;
      } else {
        numberRequirement.style.color = "green";
      }

      if (!/[!@#$%^&*]/.test(password)) {
        specialCharRequirement.style.color = "red";
        isPasswordValid = false;
      } else {
        specialCharRequirement.style.color = "green";
      }

      if (!isPasswordValid) {
        passwordRequirements.style.display = "block";
        hasError = true;
      } else {
        passwordRequirements.style.display = "none";
      }

      // Check if passwords match
      if (password !== confirmPassword) {
        document.getElementById("passwordError").style.display = "block";
        hasError = true;
      } else {
        document.getElementById("passwordError").style.display = "none";
      }

      // Submit if no errors
      if (!hasError) {
        alert("Form submitted successfully!");
      }
    });
  </script>
</body>
</html>
