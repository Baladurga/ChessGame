package core;

import java.util.*;

public class Board {
	Piece[][] board = new Piece[8][8];
	private ArrayList<Piece> pieces = new ArrayList<Piece>(32);

	public Board() {
		createPieces();
	}

	public void createPieces() {
		for (int i = 0; i < 8; i++) {
			pieces.add(new Piece(1, Piece.PAWN, 1, i));
			pieces.add(new Piece(0, Piece.PAWN, 6, i));
		}
		pieces.add(new Piece(1, Piece.ROOK, 0, 0));
		pieces.add(new Piece(1, Piece.ROOK, 0, 7));
		pieces.add(new Piece(0, Piece.ROOK, 7, 0));
		pieces.add(new Piece(0, Piece.ROOK, 7, 7));

		pieces.add(new Piece(1, Piece.KNIGHT, 0, 1));
		pieces.add(new Piece(1, Piece.KNIGHT, 0, 6));
		pieces.add(new Piece(0, Piece.KNIGHT, 7, 1));
		pieces.add(new Piece(0, Piece.KNIGHT, 7, 6));

		pieces.add(new Piece(1, Piece.BISHOP, 0, 2));
		pieces.add(new Piece(1, Piece.BISHOP, 0, 5));
		pieces.add(new Piece(0, Piece.BISHOP, 7, 2));
		pieces.add(new Piece(0, Piece.BISHOP, 7, 5));

		pieces.add(new Piece(1, Piece.QUEEN, 0, 3));
		pieces.add(new Piece(0, Piece.QUEEN, 7, 3));

		pieces.add(new Piece(1, Piece.KING, 0, 4));
		pieces.add(new Piece(0, Piece.KING, 7, 4));
	}

	public void display(int row, int col) {

		for (Piece pieces : pieces) {
			if (row == pieces.getRow() && col == pieces.getCol()) {
				System.out.print(pieces.getAcronym());
			}
		}
	}

	public void showGameStateWithNotation() {
		System.out.println("  a   b   c   d   e   f   g   h");
		System.out.println(" |------------------------------|");
		for (int i = 0; i < 8; i++) {
			System.out.print(i);

			for (int j = 0; j < 8; j++) {
				if (i == 2 || i == 3 || i == 4 || i == 5) {
					System.out.print("|");
					System.out.print("  ");
					System.out.print("|");

				} else {
					System.out.print("|");
					display(i, j);
					System.out.print("|");
				}
			}

			System.out.println("");
			System.out.println(" |------------------------------|");

		}

	}

}
