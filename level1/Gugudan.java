package level1;
/**
 * for (변수명 시작값, 끝값, 증가값)
 * for (k 2, 10, 4)
 * for (i 1, 10, 1)
 * for (j k, k+4, 1)
 * j * i = (j * i)
 * */
public class Gugudan {
	public static void main(String[] args) {
		for(int k = 2; k < 10; k += 4) { // 면을 반복 // 단
			for (int i = 1; i < 10; i++) {
				for(int j = k; j < k + 4; j++) { // 단
					System.out.print(j + " * " + i + " = " + (j * i) + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
