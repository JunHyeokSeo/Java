package p2023_07_27;

import java.text.DecimalFormat;

public class Report {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat(".00");
		final double RADIUS = 5;
		double circumference = 2 * Math.PI * RADIUS;
		double area = Math.PI * RADIUS * RADIUS;
		double surfaceArea = 4 * Math.PI * RADIUS * RADIUS;
		double volume = (4.0 / 3.0) * Math.PI * RADIUS * RADIUS * RADIUS;
		
		System.out.println("원주(원둘레)\t: " + df.format(circumference));
		System.out.println("원의 면적 \t: " + df.format(area));
		System.out.println("구의 표면적 \t: " + df.format(surfaceArea));
		System.out.println("구의 부피 \t: " + df.format(volume));
	}
}
