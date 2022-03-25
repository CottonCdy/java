package study03;

public class ReturnArray {

	// 정수형 배열을 리턴하는 메소드
	static int[] makeArray() {
		int temp[] = new int[4]; // 배열 생성

		for (int i = 0; i < temp.length; i++)
			temp[i] = i; // 배열의 원소를 0, 1, 2, 3으로 초기화

		return temp;
	}

	public static void main(String[] args) {
		int intArray[];
		intArray = makeArray();

		for (int i : intArray) {
			System.out.print(i + " ");
		}

	}

}
