package level1;

import java.util.Random;

public class Dice {
	public static void main(String[] args) {
//		dice5TimesSum();
//		diceUntilOddSum();
		diceGame();
	}

	private static void diceGame() {
		// 플레이어 (Math 랜덤 값)을 생성해 컴퓨터 (Random 랜덤 값) 와 주사위 굴리기를 해 이기면
		// "You Win!", 비기면 "Draw", 지면 "You Lose!"를 출력하시오.
		Random random = new Random(); // 메모리 할당
		int player = (int)(Math.random() * 6) + 1; // 메모리 할당 X, 싱글톤
		int com = random.nextInt(5) + 1;
		String result = "Draw";
		if(player != com) result = (player > com) ? "You Win!" : "You Lose!";
		System.out.println("player : " + player + ", com : " + com + "\n" + result);
	}

	private static void diceUntilOddSum() {
		// 홀수가 나올 때까지 주사위를 굴려 합하는 프로그래밍
		// Random random = new Random();
		Random random = new Random();
		int result = 0;
		while(true) {
			int r = random.nextInt(5) + 1;
			System.out.println("주사위 값 : " + r);
			if (r % 2 != 0) {
				break;
			}
			result += r;
		}
		System.out.println(result);
	}

	private static void dice5TimesSum() {
		// 6면인 주사위를 5회 굴려서 나온 합계를 구하시오.
		// (int)(Math.random() * 최댓값) + 최솟값
		int result = 0;
		for(int i = 0; i < 5; i++) {
			double d = Math.random();
			int temp = (int) (d * 6) + 1; // 랜덤으로 정수 값 (1 ~ 6)
			System.out.println(temp);
			result += temp;
		}
		System.out.println("주사위를 5회 굴려서 나온 합계 : " + result);
	}
}
/**
 * 랜덤 값을 구하는 방법은 두 가지
 * (int)(Math.random() * 최댓값) + 최솟값 → 클래스(static) 메소드 사용
 * Random random = new Random(); → 인스턴스 메소드 방식
 * 
 * 자바의 타입 : Primitive (소문자 → int boolean double), Reference (대문자) 타입
 */