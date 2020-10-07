package Dictionary;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class Database {
    public Database() {
    }

    private static Connection connect() {
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:test.db";
            conn = DriverManager.getConnection(url);
            conn.setAutoCommit(false);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public ArrayList wordLookup(String word) throws SQLException{
        ArrayList<Word> output = new ArrayList<Word>();
        String query;
        if (!word.equals("")) {
            String param = "\"" + word + "%\"";
            query = "SELECT * FROM test1 WHERE word LIKE" + param;
        } else {
            query = "SELECT * FROM test1";
        }
        long start = System.currentTimeMillis();
        Connection conn = this.connect();
        Statement stmt = conn.createStatement(java.sql.ResultSet.TYPE_FORWARD_ONLY,
                java.sql.ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = stmt.executeQuery(query);
        stmt.setFetchSize(250);
        if (rs == null){
            System.out.println("No result");
            return null;
        } else {
            while (rs.next()) {
                output.add(new Word(rs.getString(1), rs.getString(2)));
            }
            stmt.close();
            rs.close();
            conn.close();
            long end = System.currentTimeMillis();
            System.out.println(end - start);
            return output;
        }
    }

    public Word findWord(String w) throws SQLException {
        String query = "SELECT * FROM test1 WHERE word = " + "\"" + w + "\"";
        Connection conn = this.connect();
        Statement stmt = conn.createStatement(java.sql.ResultSet.TYPE_FORWARD_ONLY,
                java.sql.ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = stmt.executeQuery(query);
        if (rs.isClosed()) {
            stmt.close();
            conn.close();
            return null;
        }
        String word = rs.getString(1);
        String meaning = rs.getString(2);
        stmt.close();
        rs.close();
        conn.close();
        return new Word(word, meaning);
    }

    public boolean deleteWord(String w) throws SQLException {
        if (findWord(w) == null) {
            return false;
        }
        String query = "DELETE FROM test1 WHERE word = " + "\"" + w + "\"";
        Connection conn = this.connect();
        Statement stmt = conn.createStatement(java.sql.ResultSet.TYPE_FORWARD_ONLY,
                java.sql.ResultSet.CONCUR_READ_ONLY);
        stmt.executeUpdate(query);
        conn.commit();
        stmt.close();
        conn.close();
        return true;
    }

    public boolean modifyWord(String w, String newWord) throws SQLException {
        if (findWord(w) == null) {
            return false;
        }
        String query = "UPDATE test1 SET word = " + "\"" + newWord + "\"" + "WHERE word = " + "\"" + w + "\"";
        Connection conn = this.connect();
        Statement stmt = conn.createStatement(java.sql.ResultSet.TYPE_FORWARD_ONLY,
                java.sql.ResultSet.CONCUR_READ_ONLY);
        stmt.executeUpdate(query);
        conn.commit();
        stmt.close();
        conn.close();
        return true;
    }

    public boolean modifyMeaning(String w, String meaning) throws SQLException {
        if (findWord(w) == null) {
            return false;
        }
        String query = "UPDATE test1 SET meaning = " + "\"" + meaning + "\"" + "WHERE word = " + "\"" + w + "\"";
        Connection conn = this.connect();
        Statement stmt = conn.createStatement(java.sql.ResultSet.TYPE_FORWARD_ONLY,
                java.sql.ResultSet.CONCUR_READ_ONLY);
        stmt.executeUpdate(query);
        conn.commit();
        stmt.close();
        conn.close();
        return true;
    }

//    public static void main(String[] args) throws SQLException {
//        Database a = new Database();
//        System.out.println(a.modifyMeaning("test1", "test5"));
//    }
}
