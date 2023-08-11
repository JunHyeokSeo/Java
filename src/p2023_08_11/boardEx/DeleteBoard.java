package p2023_08_11.boardEx;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteBoard {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int no = 0;
		String sql;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jsptest";

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "jspid", "jsppass");
			System.out.print("삭제할 글 번호를 입력하세요 : ");
			no = Integer.parseInt(br.readLine());

			sql = "delete from BOARD where no=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			if (pstmt.executeUpdate() == 1) System.out.println("삭제 성공");
			else System.out.println("삭제 실패");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("숫자만 입력 하세요.");
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
