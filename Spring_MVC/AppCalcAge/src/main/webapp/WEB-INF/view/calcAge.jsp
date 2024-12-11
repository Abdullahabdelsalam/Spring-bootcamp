<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> Calculate The Age</title>
    <style>
        body {
            background-color: #f2f6ff;
            margin: 0;
            padding: 16px;
        }

        form {
            background-color: white;
            text-align: center;
            width: 700px;
            margin-left: auto;
            margin-right: auto;
            border: 1px solid #ccc;
        }

        #form-heading {
            font-size: 32px;
            padding-top: 56px;
            padding-bottom: 32px;
        }

        #input-wrapper {
            padding-top: 80px;
            padding-bottom: 40px;
            padding-left: 80px;
            padding-right: 80px;
        }

        .input-box {
            font-size: 18px;
            Padding-Bottom: 12px;
            Margin-Bottom: 36px;
            Border: 0;
            Border-Bottom: 1px solid #ccc;
            width: 100%;
        }
         #btn-submit {
             Background-Color: #0056ff;
             Padding-Top: 12px;
             padding-Bottom: 12px;
             Padding-Left: 24px;
             padding-right: 24px;
             Font-Size: 18px;
             Color: white;
             Border: None;
             border-radius: 5rem;
         }

    </style>
</head>
<body>
     <form action="processForm">
            <h1 id="form-heading">APP To Calculate The Age</h1>
            <h3>Enter date of birth </h3>

            <div id="input-wrapper">
                <div>
                    <input class="input-box" type="text" name="year" placeholder="Year">
                </div>
                <div>
                    <input class="input-box" type="text" name="month" placeholder="Month">
                </div>

                <div>
                    <input class="input-box" type="text" name="day" placeholder="Day">
                </div>
                <input id="btn-submit" type="submit" value="Register">
            </div>
        </form>
</body>
</html>

