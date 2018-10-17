package Database;
import java.util.*;
import java.sql.*;
public class DBUtil {
    private static Connection getConnecion(){
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql.:..localhost:3306/test?useUnicode=true"+
                    "&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&autoReconnect=true&failOverReadOnly=false";
            con=DriverManager.getConnection(url,"root","123456");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
    public static String getUserIString (String content){
        Connection con=getConnecion();
        Statement st=null;
        ResultSet rs=null;
        String sql="" ;
        String mess="" ;
        try{
            st=con.createStatement();
            sql="select user_id from users where username="+content;
            rs=st.executeQuery(sql);
            while (rs.next()){
                mess=rs.getString(1);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try{rs.close();} catch (SQLException e) {
                e.printStackTrace();
            }
            try{st.close();} catch (SQLException e) {
                e.printStackTrace();
            }
            try{con.close();} catch (SQLException e) {
                e.printStackTrace();
            }
        }
return mess;

    }
    public  static  String getUserId(String content){
        Connection con=getConnecion();
        Statement st=null;
        ResultSet rs=null;
        String sql="";
        String mess="";
        try{
            st=con.createStatement();
            sql="select count(*)from users where user_id="+content;
            rs=st.executeQuery(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            
        }
    }
}
