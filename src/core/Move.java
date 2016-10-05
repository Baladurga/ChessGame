package core;

import java.util.ArrayList;

public class Move {
	public boolean doMove(Player player, String src, String dest) {
		if (checkSqValidity(src)) {
			if (checkSqValidity(dest)) {

			}
		}

		return true;
	}

	public ArrayList<ArrayList<Integer>> possibleKingMoves(Piece piece) {
		ArrayList<Integer> mvmtX = new ArrayList<Integer>();
		ArrayList<Integer> mvmtY = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> xAndY = new ArrayList<ArrayList<Integer>>();
		int x = piece.getRow();
		int y = piece.getCol();
		mvmtX.add(x);
		mvmtY.add(y - 1);// left
		mvmtX.add(x);
		mvmtY.add(y + 1);// right
		mvmtX.add(x - 1);
		mvmtY.add(y);// up
		mvmtX.add(x + 1);
		mvmtY.add(y);// down
		mvmtX.add(x - 1);
		mvmtY.add(y - 1);// up-left
		mvmtX.add(x - 1);
		mvmtY.add(y + 1);// up-right
		mvmtX.add(x + 1);
		mvmtY.add(y + 1);//down-left
		mvmtX.add(x + 1);
		mvmtY.add(y - 1);//down-right
		xAndY.add(mvmtX);
		xAndY.add(mvmtY);

		return xAndY;
	}

	public ArrayList<ArrayList<Integer>> possibleQueenMoves(Piece piece) {

		return null;

	}

	public ArrayList<ArrayList<Integer>> possibleBishopMoves(Piece piece) {

		return null;

	}

	public ArrayList<ArrayList<Integer>> possibleRookMoves(Piece piece) {

		return null;

	}

	public ArrayList<ArrayList<Integer>> possibleKnightMoves(Piece piece) {

		return null;

	}

	public ArrayList<ArrayList<Integer>> possiblePawnMoves(Piece piece) {

		return null;

	}

	public boolean checkSqValidity(String src) {
		char[] validColumns = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
		char[] validRows = { '1', '2', '3', '4', '5', '6', '7', '8' };
		if (src.length() == 2) {
			char letter = src.charAt(0);
			char number = src.charAt(1);
			for (char c = 0; c < validColumns.length; c++) {

				if (c == letter) {
					for (char r = 0; r < validRows.length; r++) {

						if (r == number) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
}
