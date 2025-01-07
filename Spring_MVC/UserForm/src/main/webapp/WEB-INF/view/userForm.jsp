<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> User Form</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/user-form.css"
</head>

<body>
    <div class="container d-flex justify-content-center align-items-center vh-100">
        <div class="form-container">
            <h3 class="text-center form-title mb-4">User Form</h3>
            <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
            <form method="POST" action="/user/process" modelAttribute="user">
                <!-- Username Field -->
                <div class="mb-3">
                    <label for="username" class="form-label">Username</label>
                    <input type="text" class="form-control" id="username" placeholder="Administrator" path="userName">
                </div>
                <!-- Password Field -->
                <div class="mb-3">
                    <label for="password" class="form-label">Password</label>
                    <input type="password" class="form-control" id="password" placeholder="********" path="password">
                </div>
                <!-- Country Dropdown -->
                <div class="mb-3">
                    <label for="country" class="form-label">Country</label>
                    <select class="form-select" id="country" path="country">
                        <option selected>Brazil</option>
                        <option>United States</option>
                        <option>India</option>
                        <option>Germany</option>
                    </select>
                </div>
                <!-- Preferred Programming Language -->
                <div class="mb-3">
                    <label class="form-label">Preferred Programming Language</label>
                    <div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="language" id="java" value="java" path="programmingLanguage">
                            <label class="form-check-label" for="java">Java</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="language" id="csharp" value="csharp" path="programmingLanguage">
                            <label class="form-check-label" for="csharp">C#</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="language" id="php" value="php" path="programmingLanguage">
                            <label class="form-check-label" for="php">PHP</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="language" id="ruby" value="ruby" path="programmingLanguage">
                            <label class="form-check-label" for="ruby">Ruby</label>
                        </div>
                    </div>
                </div>
                <!-- Preferred Operating System -->
                <div class="mb-3">
                    <label class="form-label">Preferred Operating System</label>
                    <div>
                        <div class="form-check">
                            <input class="form-check-input" type="checkbox" id="linux" value="linux" checked path="operatingSystem">
                            <label class="form-check-label" for="linux">Linux</label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="checkbox" id="macos" value="macos" path="operatingSystem">
                            <label class="form-check-label" for="macos">Mac OS</label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="checkbox" id="windows" value="windows" path="operatingSystem">
                            <label class="form-check-label" for="windows">MS Windows</label>
                        </div>
                    </div>
                </div>
                <!-- Submit Button -->
                <button type="submit" class="btn btn-custom w-100">Submit</button>
            </form>
        </div>
    </div>

    <!-- Bootstrap JS Bundle -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
</body>

</html>

