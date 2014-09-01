<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link rel="stylesheet" type="text/css" href="http://cdn.staticfile.org/twitter-bootstrap/3.2.0/css/bootstrap.css" media="screen">
    </head>
    <body>
        <div class="container nav">
            <ul class="nav navbar-nav">
                <li>
                    <a href="#topics">Topics</a>
                </li>
                <li>
                    <a href="#spiders">Spiders</a>
                </li>
                <li>
                    <a href="#shows">Shows</a>
                </li>
            </ul>
        </div>

        <div class="container content">

        </div>

        <script type="text/template" id="TopicRowTemplate">

        </script>

        <script type="text/template" id="TopicShowTemplate">

        </script>

        <script type="text/template" id="ShowRowTemplate">

        </script>

        <script type="text/javascript"
        data-main="${pageContext.request.contextPath}/resources/js/index"
        src="http://cdn.staticfile.org/require.js/2.1.14/require.js"></script>
    </body>
</html>
