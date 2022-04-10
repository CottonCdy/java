package study04;

public class CircleArray {

	public static void main(String[] args) {
		CircleEx c[]; // Circle 배열에 대한 레퍼런스 c 선언
		c = new CircleEx[5]; // 5개의 레퍼런스 배열 생성

		for (int i = 0; i < c.length; i++) // 배열의 개수 만큼
			c[i] = new CircleEx(i); // i번째 원소 객체 생성

		for (int i = 0; i < c.length; i++)
			System.out.print((int) (c[i].getArea()) + " ");
	}

}
