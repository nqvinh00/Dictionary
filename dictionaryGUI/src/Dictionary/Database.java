package Dictionary;

import java.sql.*;
import java.util.ArrayList;

/**
 * @author Nguyen Vinh
 */
public class Database {

    /**
     * connect with database.
     * @return conn
     */
    private Connection connect() {
        Connection conn = null;
        try {
            String url = "jdbc:sqlite::resource:test.db";
            conn = DriverManager.getConnection(url);
            conn.setAutoCommit(false);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    /**
     * add word to database.
     * @param word word
     * @param meaning of word
     * @return true if success
     * @throws SQLException if query error
     */
    public boolean addWord(String word, String meaning) throws SQLException {
        if (findWord(word) != null) {
            return false;
        }
        String query = "INSERT INTO test1(word, meaning) VALUES (?, ?)";
        Connection conn = this.connect();
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, word);
        stmt.setString(2, meaning);
        stmt.executeUpdate();
        stmt.close();
        conn.commit();
        conn.close();
        return true;
    }

    /**
     * find word start with string <word>.
     * @param word to find
     * @return arrayList of word
     * @throws SQLException if query error
     */
    public ArrayList wordLookup(String word) throws SQLException{
        ArrayList<Word> output = new ArrayList<Word>();
        String query;
        if (!word.equals("")) {
            String param = "\"" + word + "%\"";
            query = "SELECT * FROM test1 WHERE word LIKE" + param;
        } else {
            query = "SELECT * FROM test1";
        }
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
            return output;
        }
    }

    /**
     * find word.
     * @param w word to find
     * @return matched Word
     * @throws SQLException if query error
     */
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

    /**
     * delete word from database
     * @param w word to delete
     * @throws SQLException if error
     */
    public void deleteWord(String w) throws SQLException {
        if (findWord(w) == null) {
            return;
        }
        String query = "DELETE FROM test1 WHERE word = " + "\"" + w + "\"";
        Connection conn = this.connect();
        Statement stmt = conn.createStatement(java.sql.ResultSet.TYPE_FORWARD_ONLY,
                java.sql.ResultSet.CONCUR_READ_ONLY);
        stmt.executeUpdate(query);
        conn.commit();
        stmt.close();
        conn.close();
    }

    /**
     * modify word.
     * @param w word need to modify
     * @param newWord word to replace
     * @return true if success
     * @throws SQLException if query error
     */
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

    /**
     * modify meaning.
     * @param w word need to modify
     * @param meaning to replace
     * @return true if success
     * @throws SQLException if query error
     */
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
//        System.out.println(a.addWord("test1", "test5"));
//    }
}
