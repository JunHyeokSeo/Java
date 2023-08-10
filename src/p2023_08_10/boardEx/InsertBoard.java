package p2023_08_10.boardEx;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertBoard {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String writer, passwd, subject, content, sql;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");

			System.out.println("게시글 생성");
			System.out.print("writer : "); writer = br.readLine();
			System.out.print("passwd : "); passwd = br.readLine();
			System.out.print("subject: "); subject = br.readLine();
			System.out.print("content: "); content = br.readLine();

			sql = "insert into BOARD values (board_seq.nextval, ?, ?, ?, ?, sysdate)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, writer);
			pstmt.setString(2, passwd);
			pstmt.setString(3, subject);
			pstmt.setString(4, content);

			if (pstmt.executeUpdate() == 1) {
				System.out.println("글작성 성공");
			} else {
				System.out.println("글작성 실패");
			}
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
				br.close();
			}catch (Exception e){
				e.printStackTrace();
			}
		}
	}
}
