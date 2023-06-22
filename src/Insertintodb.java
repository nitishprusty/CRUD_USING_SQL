import java.sql.Connection;
import java.sql.PreparedStatement;

public class Insertintodb {
    public static boolean insertTodb(Student obj){
        boolean flag = false;
        try{
            Connection con = CP.CreateC();

            String query = "INSERT INTO student(sname,sage,sphone,scity) values(?,?,?,?)";

            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1,obj.getStudentname());
            pstmt.setString(2, obj.getStudentage());
            pstmt.setString(3, obj.getstudentphone());
            pstmt.setString(4,obj.getstudentcity());

            pstmt.executeUpdate();
            flag = true;


        }catch (Exception c){
            c.printStackTrace();
        }

        return flag;

    }
    
}
