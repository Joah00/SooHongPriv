import java.sql.*;

public class Dbclass {
    private Connection con = null;
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost:3306/ams";
    private String userName = null;
    private String password = null;
    private Statement stmt = null;
    
    public Dbclass (){
        userName = "root";
        password = "joah123";
    }
    
    public Connection connectDB() {
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(url, userName, password);
            if (con != null){
                System.out.println("Successfully connected!");
            }
        } catch (Exception e){
            System.out.println(e);
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
        return con;
    }
}
