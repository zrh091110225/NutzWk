<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    String url = basePath + "private/index";
%>
<html>
<head>
    <meta http-equiv=refresh content=0;url=<%=url %>>
</head>
</html>