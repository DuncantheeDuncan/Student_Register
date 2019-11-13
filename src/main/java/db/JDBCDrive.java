package db;

import java.sql.*;

public class JDBCDrive {

    public  static void main(String[] args) {

//        try (Connection conn = DriverManager.getConnection(
//                "jdbc:postgresql://127.0.0.1:5432/onlineRegister", "coder", "pg123");
//             Statement statement = conn.createStatement(); PreparedStatement psinsert = conn.prepareStatement("SQL_INSERT");
//             PreparedStatement psupdate = conn.prepareStatement("SQL_UPDATE")) {
//
//            if (conn != null) {
//                System.out.println("Connected to the database!");
//            } else {
//                System.out.println("Failed to make connection!");
//            }
//
////            statement.execute(SQL_TABLE_DROP);
//            statement.execute(SQL_TABLE_CREATE);
//
//            conn.setAutoCommit(false);
//
////            (student_no, student_name, second_name," + "surname,contact,email,gender,title,parent_contact,parent_email)
//
//        } catch (SQLException e) {
//            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//    private static final String SQL_INSERT = "INSERT INTO STUDENT (student_no, student_name, second_name," +
//            "surname,contact,email,gender,title,parent_contact,parent_email) VALUES (?,?,?,?,?,?,?,?,?,?)";
////    private static final String SQL_UPDATE = "UPDATE STUDENT SET SALARY=? WHERE NAME=?";
//
//    private  static final String SQL_TABLE_CREATE = new StringBuilder()
//            .append("CREATE TABLE STUDENT")
//            .append("(")
//            .append("student_no integer not null primary key,")
//            .append("student_name VARCHAR(12),")
//            .append("second_name VARCHAR(12),")
//            .append("surname VARCHAR(12),")
//            .append("contact integer,")
//            .append("email VARCHAR(12),")
//            .append("gender VARCHAR(7),")
//            .append("title VARCHAR(5),")
//            .append("parent_contact integer,")
//            .append("parent_email VARCHAR(12)")
//            .append(")")
//            .toString();
//
//    private static final String SQL_TABLE_DROP = "DROP TABLE STUDENT";

    }
}
