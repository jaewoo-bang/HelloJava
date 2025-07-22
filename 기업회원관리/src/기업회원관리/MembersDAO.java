package 기업회원관리;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MembersDAO {
	public boolean insert(Members member) {
        Connection conn = DButil.getConnect();
        String checkSql = "SELECT COUNT(*) FROM members WHERE username = ? OR email = ?";
        try {
            PreparedStatement checkStmt = conn.prepareStatement(checkSql);
            checkStmt.setString(1, member.getUsername());
            checkStmt.setString(2, member.getEmail());
            ResultSet rs = checkStmt.executeQuery();
            if (rs.next() && rs.getInt(1) > 0) {
                System.out.println("중복된 사용자명 또는 이메일입니다.");
                return false;
            }
        String query = "INSERT INTO members (id, username, password, name, email, dept_no, dept_name, position) VALUES (?, ?, ?, ?, ?, ?, ? ,?)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, member.getId());
            pstmt.setString(2, member.getUsername());
            pstmt.setString(3, member.getPassword());
            pstmt.setString(4, member.getName());
            pstmt.setString(5, member.getEmail());
            pstmt.setString(6, member.getDept_no());
            pstmt.setString(7, member.getDept_name());
            pstmt.setString(8, member.getPosition());
            int r = pstmt.executeUpdate();
            return r > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // 단건 조회
    public Members findById(int id) {
        Connection conn = DButil.getConnect();
        String sql = "SELECT * FROM members WHERE id = ?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                Members m = new Members();
                m.setId(rs.getInt("id"));
                m.setUsername(rs.getString("username"));
                m.setPassword(rs.getString("password"));
                m.setName(rs.getString("name"));
                m.setEmail(rs.getString("email"));
                m.setDept_no(rs.getString("dept_no"));
                m.setDept_name(rs.getString("dept_name"));
                m.setPosition(rs.getString("position"));
                return m;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    

    // 전체 조회
    public List<Members> findAll() {
        List<Members> list = new ArrayList<>();
        Connection conn = DButil.getConnect();
        String sql = "SELECT * FROM members";
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Members m = new Members();
                m.setId(rs.getInt("id"));
                m.setUsername(rs.getString("username"));
                m.setPassword(rs.getString("password"));
                m.setName(rs.getString("name"));
                m.setEmail(rs.getString("email"));
                m.setDept_no(rs.getString("dept_no"));
                m.setDept_name(rs.getString("dept_name"));
                m.setPosition(rs.getString("position"));
                list.add(m);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    // 수정 (비밀번호 수정 예시)
    public boolean updatePassword(int id, String newPassword) {
        Connection conn = DButil.getConnect();
        String query = "UPDATE members SET password = ? WHERE id = ?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, newPassword);
            pstmt.setInt(2, id);
            int r = pstmt.executeUpdate();
            return r > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // 삭제
    public boolean delete(int id) {
        Connection conn = DButil.getConnect();
        String query = "DELETE FROM members WHERE id = ?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, id);
            int r = pstmt.executeUpdate();
            return r > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public Members login(String username, String password) {
        Connection conn = DButil.getConnect();
        String sql = "SELECT * FROM members WHERE username = ? AND password = ?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, password);

            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                // 로그인 성공: 사용자 정보 객체 반환
                Members member = new Members();
                member.setId(rs.getInt("id"));
                member.setUsername(rs.getString("username"));
                member.setPassword(rs.getString("password")); // 실제 프로젝트에서는 반환 안하는 게 좋음
                member.setName(rs.getString("name"));
                member.setEmail(rs.getString("email"));
                member.setDept_no(rs.getString("ept_no"));
                member.setDept_name(rs.getString("ept_name"));
                member.setPosition(rs.getString("position"));
                
                return member;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // 로그인 실패
        return null;
    }
}//end class

	
		
