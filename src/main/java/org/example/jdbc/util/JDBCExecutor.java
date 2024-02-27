package org.example.jdbc.util;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCExecutor {
    public static void main(String... args){
        DatabaseConnectionManager dcm= new DatabaseConnectionManager("localhost"
                ,"postgres","postgres","");
        try {
            Connection connection= dcm.getConnection();
            CustomerDAO customerDAO=new CustomerDAO(connection);
            Customer cstm = customerDAO.findById(200);
            System.out.println("This is Customer");
            System.out.println(cstm.getFirstName());

////                //Insert
//                Customer customer2=new Customer();
//                customer2.setId(200);
//                customer2.setFirstName("Prince");
//                customer2.setLastName("Raj");
//                customer2.setEmail("prince@123gmail.com");
//                customer2.setPhone("9602723097");
//                customer2.setAddress("Delhi");
//                customer2.setCity("Noida");
//                customer2.setState("Delhi");
//                customer2.setZipcode("201303");
//                customerDAO.create(customer2);
//update Data from Database
//                Customer customer=customerDAO.findById(10000);
//                System.out.println(customer.getFirstName()+" "+customer.getLastName()+" "+customer.getEmail());
//                customer.setEmail("update it yet");
//                customer.setFirstName("Kartik");
//                customer.setLastName("Goel");
//                customer=customerDAO.update(customer);
//                System.out.println(customer.getFirstName()+" "+customer.getLastName()+" "+customer.getEmail());
        }catch (SQLException e){

            e.printStackTrace();

        }
    }
}