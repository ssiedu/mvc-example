<jsp:useBean scope="session" id="data" class="mypkg.Product"/>
<html>
    <body>
        <h3>Product-Details</h3>
        <hr>
        <pre>
            Code    <jsp:getProperty name="data" property="code"/>
            Name    <jsp:getProperty name="data" property="name"/>
            Desc    <jsp:getProperty name="data" property="description"/>
            Catg    <jsp:getProperty name="data" property="category"/>
            Price   <jsp:getProperty name="data" property="price"/>
        </pre>
        <hr>
        <a href="search.jsp">Search-More</a><br>
        <a href="index.jsp">Home</a>
        
    </body>
</html>
