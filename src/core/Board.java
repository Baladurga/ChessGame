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
			pieces.add(new Piece(0, Piece.PAWN, 1, i));
			pieces.add(new Piece(1, Piece.PAWN, 6, i));
		}
		pieces.add(new Piece(0, Piece.ROOK, 0, 0));
		pieces.add(new Piece(0, Piece.ROOK, 0, 7));
		pieces.add(new Piece(1, Piece.ROOK, 7, 0));
		pieces.add(new Piece(1, Piece.ROOK, 7, 7));

		pieces.add(new Piece(0, Piece.KNIGHT, 0, 1));
		pieces.add(new Piece(0, Piece.KNIGHT, 0, 6));
		pieces.add(new Piece(1, Piece.KNIGHT, 7, 1));
		pieces.add(new Piece(1, Piece.KNIGHT, 7, 6));

		pieces.add(new Piece(0, Piece.BISHOP, 0, 2));
		pieces.add(new Piece(0, Piece.BISHOP, 0, 5));
		pieces.add(new Piece(1, Piece.BISHOP, 7, 2));
		pieces.add(new Piece(1, Piece.BISHOP, 7, 5));

		pieces.add(new Piece(0, Piece.QUEEN, 0, 3));
		pieces.add(new Piece(1, Piece.QUEEN, 7, 3));

		pieces.add(new Piece(0, Piece.KING, 0, 4));
		pieces.add(new Piece(1, Piece.KING, 7, 4));
	}

	private void populateBoard() {
		for (Piece p : pieces) {
			board[p.getRow()][p.getCol()] = p;
		}
	}

}
