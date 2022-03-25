package study03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 3개 입력 : ");
		int sum = 0;
		int n = 0;
		for (int i = 0; i < 3; i++) {
			System.out.print(i + " >>");
			try {
				n = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				scan.nextLine(); // 현재 입력 스트림에 남아 있는 토큰을 지운다.
				i--; // 인덱스가 증가하지 않도록 미리 감소
				continue; // 다음 루프
			}
			sum += n;
		}

		System.out.println("합은 : " + sum);
		scan.close();

	}

}
