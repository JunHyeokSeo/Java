package p2023_08_11.boardEx;

import java.sql.*;
import java.text.SimpleDateFormat;

public class SelectBoard {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs01 = null, rs02 = null;
		int count = 0;
		String sql;

		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jsptest";

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "jspid", "jsppass");

			sql = "select count(*) from BOARD";
			pstmt = con.prepareStatement(sql);
			rs01 = pstmt.executeQuery();
			if (rs01.next()) count = rs01.getInt(1);
			System.out.println("총 데이터 개수 : " + count);
			sql = "select * from BOARD order by no desc limit 5";
			pstmt = con.prepareStatement(sql);
			rs02 = pstmt.executeQuery();

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss (E)");

			System.out.println("번호\t작성자\t비밀번호\t제목\t내용\t날짜");
			System.out.println("--------------------------------------------------------------------");
			while (rs02.next()) {
				int no = rs02.getInt("no");
				String writer = rs02.getString("writer");
				String passwd = rs02.getString("passwd");
				String subject = rs02.getString("subject");
				String content = rs02.getString("content");
				Timestamp ts = rs02.getTimestamp("reg_date");

				System.out.printf("%d\t\t%s\t\t%s\t\t%s\t%s\t%s\n", no, writer, passwd, subject, content, sdf.format(ts));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs01 != null) rs01.close();
				if (rs02 != null) rs02.close();
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
