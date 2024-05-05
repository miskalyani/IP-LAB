/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalyani;

/**
 *
 * @author Kalyani
 */
public class Kalyani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       if(("product available".equals(display("pen"))))
               
    {
        System.out.println("product available");
    }
    }

      
       

    private static String display(java.lang.String name) {
        demo.Ex14_Service service = new demo.Ex14_Service();
        demo.Ex14 port = service.getEx14Port();
        return port.display(name);
    }
    
}
