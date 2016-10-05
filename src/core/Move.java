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
		ArrayList<Integer> mvmtX,mvmtY;
		ArrayList<ArrayList<Integer>> bishopXandY,rookXandY,xAndY;
		mvmtX=new ArrayList<Integer>();
		mvmtY=new ArrayList<Integer>();
		bishopXandY=new ArrayList<ArrayList<Integer>>();
		rookXandY=new ArrayList<ArrayList<Integer>>();
		xAndY=new ArrayList<ArrayList<Integer>>();
		
		bishopXandY=possibleBishopMoves(piece);
	    mvmtX.addAll(bishopXandY.get(0));
	    mvmtY.addAll(bishopXandY.get(1));
		
		rookXandY=possibleRookMoves(piece);
		mvmtX.addAll(rookXandY.get(0));
		mvmtY.addAll(rookXandY.get(1));
		
		xAndY.add(mvmtX);
		xAndY.add(mvmtY);
		return xAndY;
		
	}

	public ArrayList<ArrayList<Integer>> possibleBishopMoves(Piece piece) {
		
		ArrayList<Integer> mvmtX = new ArrayList<Integer>();
		ArrayList<Integer> mvmtY = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> xAndY = new ArrayList<ArrayList<Integer>>();
		int x = piece.getRow();
		int y = piece.getCol();
		int i=x;
		int j=y;
		i--;
		j--;
		//up-left
		while(i>=0 && j>=0)
		{
			mvmtX.add(i);
			mvmtY.add(j);
			i--;
			j--;
			
		}
		
		//up-right
		int k=x;
		int l=y;
		k++;
		l--;
		while(k>=0 && l<8){
			mvmtX.add(k);
			mvmtY.add(l);
			k--;
			l++;
		}
		
		//down-left
		int m=x;
		int n=y;
		m++;
		n--;
		while(m<8 && n>=0)
		{
			mvmtX.add(m);
			mvmtY.add(n);
			m++;
			n--;
		}
		
		//down-right
		int o=x;
		int p=y;
		o++;
		p++;
		while(o<8 && p<8){
			mvmtX.add(o);
			mvmtY.add(p);
			o++;
			p++;
		}
		xAndY.add(mvmtX);
		xAndY.add(mvmtY);
		
		return xAndY;
		

		

	}

	public ArrayList<ArrayList<Integer>> possibleRookMoves(Piece piece) {
		ArrayList<Integer> mvmtX = new ArrayList<Integer>();
		ArrayList<Integer> mvmtY = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> xAndY = new ArrayList<ArrayList<Integer>>();
		int x = piece.getRow();
		int y = piece.getCol();
		int i=x;
		
		i--;
		//up
		while(i>=0)
		{
			mvmtX.add(i);
			mvmtY.add(y);
			i--;
			
			
		}
		
		//down
		int k=x;
		k++;
		
		while(k<8 ){
			mvmtX.add(k);
			mvmtY.add(y);
			k++;
			
		}
		
		//left
		
		int n=y;
		n--;
		while(n>=0)
		{
			mvmtX.add(x);
			mvmtY.add(n);
		     n--;
		}
		
		//right
		
		int p=y;
		p++;
		while( p<8){
			mvmtX.add(x);
			mvmtY.add(p);
			
			p++;
		}
		xAndY.add(mvmtX);
		xAndY.add(mvmtY);
		
		return xAndY;
		

		

	}

	public ArrayList<ArrayList<Integer>> possibleKnightMoves(Piece piece) {
		ArrayList<Integer> mvmtX = new ArrayList<Integer>();
		ArrayList<Integer> mvmtY = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> xAndY = new ArrayList<ArrayList<Integer>>();
		int x = piece.getRow();
		int y = piece.getCol();
		mvmtX.add(x-1);mvmtY.add(y-2);   //up 1 step left 2 steps
		mvmtX.add(x-1);mvmtY.add(y+2);   //up 1 step right 2 steps
		mvmtX.add(x-2);mvmtY.add(y-1);   //up 2 steps left 1 step
		mvmtX.add(x-2);mvmtY.add(y+1);   //up 2 steps right 1 step
		mvmtX.add(x+1);mvmtY.add(y-2);   //down 1 step left 2 steps
		mvmtX.add(x+1);mvmtY.add(y+2);   //down 1 step right 2 steps
		mvmtX.add(x+2);mvmtY.add(y-1);   //down 2 steps left 1 step
		mvmtX.add(x+2);mvmtY.add(y+1);   //down 2 steps right 1 step
		xAndY.add(mvmtX);
		xAndY.add(mvmtY);
		return xAndY;

	}

	public ArrayList<ArrayList<Integer>> possiblePawnMoves(Piece piece) 
	{
		

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
