package library.refactor.connection;

import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.sql.*;

public class JDBC {
    
    // 유일한 인스턴스를 저장할 private static 변수를 선언
    private static JDBC instance = null;
    private Connection conn = null;
    
    // 생성자를 private으로 선언하여 외부에서 인스턴스를 생성불가
    private JDBC() {
        try {
            // JDBC 드라이버 로드
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // 데이터베이스 연결 생성
            String url = "jdbc:oracle:thin:@192.168.119.119:1521/dink";
            String user = "scott";
            String password = "tiger";
            conn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    // 유일한 인스턴스를 반환하는 static 메서드를 정의
    public static JDBC getInstance() {
        if (instance == null) {
            instance = new JDBC();
        }
        return instance;
    }
    
    public Connection getConnection() {
        return conn;
    }
    
    // Connection 종료
    public void closeConnection() {
        try {
            conn.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Connection이 정상적으로 종료되었는지 확인
    public void isClosed() {
        try {
            if (conn.isClosed()) {
                System.out.println("JDBC 연결 해제 성공");
            } else {
                System.out.println("JDBC 연결 해제 실패");
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
//    public void loadScript(String filePath) {
//        try (Statement stmt = conn.createStatement()) {
//            String sql = Files.readString(Paths.get(filePath), Charset.forName("UTF-8"));
//            stmt.executeUpdate(query);
//            stmt.execute(sql);
//        } catch (IOException | SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    public void loadScript(String fileName) {
//        try {
//            String query = Files.readString(Paths.get(fileName), Charset.forName("UTF-8"));
//            Statement stmt = conn.createStatement();
//            stmt.executeUpdate(query);
//            stmt.close();
//        } catch (IOException | SQLException e) {
//            e.printStackTrace();
//        }
//    }
    public void loadScript(String filePath) {
        try {
            StringBuilder sb = new StringBuilder();
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), Charset.forName("UTF-8")));
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            String query = sb.toString();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(query);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }



}

//    public Connection getConnection() throws ClassNotFoundException, SQLException {
//        if (conn == null) {
//            Class.forName("oracle.jdbc.driver.OracleDriver");
//            String url = "jdbc:oracle:thin:@192.168.119.119:1521/dink";
//            String user = "scott";
//            String password = "tiger";
//            conn = DriverManager.getConnection(url, user, password);            
//        }
//        return conn;
//
//    }


//    public static Connection getConnection() {
//        Connection conn = null;
//        try {
//            
//            Class.forName("oracle.jdbc.driver.OracleDriver");
//            String url = "jdbc:oracle:thin:@192.168.119.119:1521/dink";
//            String user = "scott";
//            String password = "tiger";
//            conn = DriverManager.getConnection(url, user, password);
//            return conn;
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

//    public void closeConnection() {
//        if (conn != null) {
//            try {
//                conn.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }