package core;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {

		Board board = new Board();
		Scanner scan = new Scanner(System.in);
		Move move = new Move();
		Player player1 = new Player(0);
		Player player2 = new Player(1);
		int whosTurn = 0;
		String src, dest;
		boolean legalmove = false;
		while (!legalmove) {
			System.out.println("What piece you'd like to move? (notation)");
			src = scan.nextLine();
			System.out.println("Where you'd like to move that piece? (notation)");
			dest = scan.nextLine();
			if (whosTurn == player1.getSide()) {
				legalmove = move.doMove(player1, src, dest);
			} else if (whosTurn == player2.getSide()) {
				legalmove = move.doMove(player2, src, dest);
			}
			if (!legalmove) {
				System.out.println("Illegal move");
			}
		}

	}

}
