import java.util.Scanner;

public class TicTacToe {
	public static void main(String[] args) {
		game("a");
	}

	public static Boolean playerTurn = true;

	public static void game(String a) {
		// true = x turn, false == o turn
		grid();
		while (winner == 0) {
			if (playerTurn == true) {
				Scanner input = new Scanner(System.in);
				String storedCords = input.nextLine();
				Scanner cordsUsable = new Scanner(storedCords);
				int cordX = cordsUsable.nextInt();
				int cordY = cordsUsable.nextInt();
				players(cordX, cordY);
				winCheck++;
				grid();
				playerTurn = false;
				int startCheck = 0;
				winCondition();
			}
			if (playerTurn == false) {
				Scanner input = new Scanner(System.in);
				String storedCords = input.nextLine();
				Scanner cordsUsable = new Scanner(storedCords);
				int cordX = cordsUsable.nextInt();
				int cordY = cordsUsable.nextInt();
				players(cordX, cordY);
				winCheck++;
				grid();
				playerTurn = true;
				winCondition();
			}

		}
		while (winCondition != null) {
			if (winCondition == true) {
				System.out.println("X is winner");
			}

			if (winCondition == false) {
				System.out.println("o is winner");
			}
		}
	}

	static Boolean[][] players = new Boolean[3][3];

	public static int winner = 0;

	public static int winCheck = 0;

	public static Boolean winCondition;

	public static void winCondition() {

		if (players[0][0] == players[0][1] == players[0][2]) {
			winCondition = true;
		}
		else {
			System.out.println("lol");
		}

	}

	public static void grid() {

		System.out.println("+-+-+-+");

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				System.out.print("|");

				if (players[i][j] == null) {

					System.out.print(" ");

				} else if (players[i][j] == false) {

					System.out.print("O");

				} else {

					System.out.print("X");

				}

			}

			System.out.println("|");
			System.out.println("+-+-+-+");

		}

	}

	public static void players(int cordX, int cordY) {
		cordX--;
		cordY--;
		if (playerTurn == true) {
			if (players[cordX][cordY] != null) {
				System.out.println("Try Again");
				playerTurn = true;
				Scanner input = new Scanner(System.in);
				String storedCords = input.nextLine();
				Scanner cordsUsable = new Scanner(storedCords);
				int newCordX = cordsUsable.nextInt();
				int newCordY = cordsUsable.nextInt();
				players(newCordX, newCordY);
			}
			if (players[cordX][cordY] == null) {
				players[cordX][cordY] = true;
			}
		}

		if (playerTurn == false) {
			if (players[cordX][cordY] != null) {
				System.out.println("Try Again");
				playerTurn = false;
				Scanner input = new Scanner(System.in);
				String storedCords = input.nextLine();
				Scanner cordsUsable = new Scanner(storedCords);
				int newCordX = cordsUsable.nextInt();
				int newCordY = cordsUsable.nextInt();
				players(newCordX, newCordY);
			}
			if (players[cordX][cordY] == null) {
				players[cordX][cordY] = false;
			}
		}

	}

}