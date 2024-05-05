
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.sql.*;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Kalyani
 */
@WebService(serviceName = "ex14")
public class ex14 {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     * @param name
     */
    @WebMethod(operationName = "display")
    public String display(@WebParam(name = "name") String name) {
        try{
            Connection c=DriverManager.getConnection("jdbc:derby://localhost:1527/product");
            Statement st=c.createStatement();
            ResultSet rs=st.executeQuery("Select * from products");
            while(rs.next())
            {
                if(name.equals(rs.getString(1)) || name.equals(rs.getString(2)))
                {
                    String nameee = rs.getString(1);
                    String category = rs.getString(2);
                    double price = rs.getDouble(3);
                }
            }
        }
        catch(SQLException e)
        {
            
        }
        
   
        return "product available";
    }
}
