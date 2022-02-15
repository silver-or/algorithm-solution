package level1;

public class Rps {
	public static void main(String[] args) {
		/**
		 * 가위 : 1, 바위 : 2, 보 : 3
		 * 1 2 → 2
		 * 2 3 → 3
		 * 1 3 → 1
		 * */
		String[] arr = {"가위", "바위", "보", "Draw", "Win", "Lose"};
		int[] arr2 = new int[2];
		for(int i = 0; i < arr2.length; i++) arr2[i] = (int)(Math.random() * 3) + 1;
		int player = arr2[0], com = arr2[1];
		System.out.printf("Player : %s %d \n", arr[player-1], player);
		System.out.printf("Computer : %s %d \n", arr[com-1], com);
		int i = 3;
		switch(Math.abs(player - com)) {
			case 1 : i = (player > com) ? 4 : 5; break;
			case 2 : i = (player > com) ? 5 : 4; break;
			default : break;
		}
		System.out.printf("Player : %s", arr[i]);
	}
}
