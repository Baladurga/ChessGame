package core;



public class Move {
	 public boolean doMove(Player player,String src,String dest){
		 if(checkSqValidity(src)){
			 if(checkSqValidity(dest)){
				
				
				  
			 }
		 }
		
		 
		 return true;
	 }
	 public void possibleKingMoves(Piece piece){
		 
		
	 }
	 public void possibleQueenMoves(Piece piece){
		
		 
	 }
	 public void possibleBishopMoves(Piece piece){
	
	 
	 }
	 public  void possibleRookMoves(Piece piece){
		 
		
     }
	 public void possibleKnightMoves(Piece piece){
		 
		
	 }
	 public void possiblePawnMoves(Piece piece){
		
	
	}
	 public boolean checkSqValidity(String src) {
			char[] validColumns = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
			char[] validRows = {'1', '2', '3', '4', '5', '6', '7', '8'};
			if (src.length()==2) {
				char letter = src.charAt(0); 
				char number = src.charAt(1); 
				for (char c=0;c<validColumns.length;c++) { 
					
					if (c==letter) {
						for (char r=0;r<validRows.length;r++) { 
							
							if (r==number) {
								return true;
							}
						}
					}
				}			
			}
			return false;
		}
}
   