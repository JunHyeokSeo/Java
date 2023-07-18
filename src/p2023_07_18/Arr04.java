package p2023_07_18;

public class Arr04 {
	public static void main(String[] args) {
		int[][] score = {
				{85, 60, 70},   // 0 행
				{90, 95, 80},   // 1 행
				{75, 80, 100},  // 2 행
				{80, 70, 95},   // 3 행
				{100, 65, 80}   // 4 행
		};
		int[] subject = new int[3]; // 과목 총점 저장
		int[] student = new int[5]; // 학생의 총점 저장
		String[] subject_name = {"국어", "영어", "수학"};
		String[] student_name = {"학생1", "학생2", "학생3", "학생4", "학생5"};
		int r, c;

		System.out.println("각 과목별 총점 구하기");
		for (c = 0; c < 3; c++) { // 과목
			for (r = 0; r < 5; r++) { // 학생
				subject[c] += score[r][c];
			}
			System.out.printf("%s : %d\n", subject_name[c], subject[c]);
		}
		System.out.println();
		System.out.println("학생별 총점 구하기");
		for (r = 0; r < 5; r++) { // 학생
			for (c = 0; c < 3; c++) { // 과목
				student[r] += score[r][c];
			}
			System.out.printf("%s : %d\n", student_name[r], student[r]);
		}
	}
}
