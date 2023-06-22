import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
    static Connection con;
    public static Connection CreateC(){
        try{
            //load
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/student_details";
            String user = "root";
            String password = "Nitish@2001";

            con = DriverManager.getConnection(url,user,password);

        }catch (Exception e){
            e.printStackTrace();
        }

        return con;
        

    }
}
