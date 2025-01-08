 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> User  </title>
    <style>
        body {
            background-color: #f2f6ff;
            margin: 0;
            padding: 16px;
        }
        #form-heading {
            font-size: 32px;
            padding-top: 56px;
            padding-bottom: 32px;
        }

        #input-wrapper {
             background-color: white;
             text-align: center;
             width: 700px;
             margin-left: auto;
             margin-right: auto;
             border: 1px solid #ccc;
        }
        .input-box {
             font-size: 18px;
             Padding-Bottom: 12px;
             Margin-Bottom: 36px;
             Border: 0;
             Border-Bottom: 1px solid #ccc;
             width: 100%;
        }
    </style>
</head>
<body>
<div id="input-wrapper">
    <h1 id="form-heading" >The User Information</h1>
    <div class="input-box">User Name =>> ${theUser.userName} </div>
    <div class="input-box">password =>> ${theUser.password} </div>
    <div class="input-box">country =>>  ${theUser.country} </div>
    <div class="input-box">Programming Language =>> ${theUser.programmingLanguage} </div>
    <div class="input-box">Operating System =>> ${theUser.operatingSystem} </div>
</div>
</body>
</html>


