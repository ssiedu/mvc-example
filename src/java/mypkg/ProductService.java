package mypkg;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class ProductService {

    Connection con; PreparedStatement ps;
    ResultSet rs;

public Product searchProduct(int code){
    Product product=new Product();
    try{
    ps=con.prepareStatement("select * from products where pcode=?");
    ps.setInt(1, code);
    rs=ps.executeQuery();
    boolean b=rs.next();
    if(b){
        product.setCode(rs.getInt(1));
        product.setName(rs.getString(2));
        product.setDescription(rs.getString(3));
        product.setCategory(rs.getString(4));
        product.setPrice(rs.getInt(5));
    }
    
    }catch(Exception e){
        e.printStackTrace();
    }
    return product;
}
    
public ProductService(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shopdata","root","root");
    }catch(Exception e){
        e.printStackTrace();
    }
}
    
}
