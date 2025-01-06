<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Professional User Form</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f3f4f6;
        }

        .form-container {
            background: #ffffff;
            border-radius: 12px;
            box-shadow: 0 8px 20px rgba(0, 0, 0, 0.1);
            padding: 30px;
            max-width: 500px;
            margin: auto;
        }

        .form-title {
            font-weight: bold;
            color: #0d6efd;
            text-transform: uppercase;
            letter-spacing: 1px;
        }

        .form-label {
            font-size: 0.95rem;
            font-weight: 600;
            color: #6c757d;
        }

        .btn-custom {
            background-color: #198754;
            color: #fff;
            font-weight: bold;
            border: none;
            padding: 10px 15px;
        }

        .btn-custom:hover {
            background-color: #146c43;
        }

        .form-check-input:checked {
            background-color: #198754;
            border-color: #198754;
        }
    </style>
</head>

<body>
    <div class="container d-flex justify-content-center align-items-center vh-100">
        <div class="form-container">
            <h3 class="text-center form-title mb-4">User Form</h3>
            <form>
                <!-- Username Field -->
                <div class="mb-3">
                    <label for="username" class="form-label">Username</label>
                    <input type="text" class="form-control" id="username" placeholder="Administrator">
                </div>
                <!-- Password Field -->
                <div class="mb-3">
                    <label for="password" class="form-label">Password</label>
                    <input type="password" class="form-control" id="password" placeholder="********">
                </div>
                <!-- Country Dropdown -->
                <div class="mb-3">
                    <label for="country" class="form-label">Country</label>
                    <select class="form-select" id="country">
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
                            <input class="form-check-input" type="radio" name="language" id="java" value="java">
                            <label class="form-check-label" for="java">Java</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="language" id="csharp" value="csharp">
                            <label class="form-check-label" for="csharp">C#</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="language" id="php" value="php">
                            <label class="form-check-label" for="php">PHP</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="language" id="ruby" value="ruby">
                            <label class="form-check-label" for="ruby">Ruby</label>
                        </div>
                    </div>
                </div>
                <!-- Preferred Operating System -->
                <div class="mb-3">
                    <label class="form-label">Preferred Operating System</label>
                    <div>
                        <div class="form-check">
                            <input class="form-check-input" type="checkbox" id="linux" value="linux" checked>
                            <label class="form-check-label" for="linux">Linux</label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="checkbox" id="macos" value="macos" >
                            <label class="form-check-label" for="macos">Mac OS</label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="checkbox" id="windows" value="windows" >
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

