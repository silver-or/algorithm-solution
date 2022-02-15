package level1;

public class Rps2 {

	public static void main(String[] args) {
//		rps();
		int a = (int)(Math.random() * 3) + 1;
		int b = (int)(Math.random() * 3) + 1;
		System.out.println(a);
		System.out.println(b);
		System.out.println((a == b) ? "Draw" : (b > (a + 1) % 3) ? "Win" : "Lose"); 
	}

	private static void rps() {
		int a = (int)(Math.random() * 3) + 1;
		int b = (int)(Math.random() * 3) + 1;
		String s = "";
		if (a == b) s = "Draw";
		else s = (b > (a + 1) % 3) ? "Win" : "Lose";
		System.out.println(s);
		/**
		 * 2%3 2 3
		 * 3%3 0 1
		 * 1%3 1 2
		 * */
		
		// 차이가 1이 되면 진다
	}

}
