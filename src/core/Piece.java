package core;

public class Piece 
{
	public static final int KING = 1;
	public static final int QUEEN = 2;
	public static final int ROOK = 3;
	public static final int KNIGHT = 4;
	public static final int BISHOP = 5;
	public static final int PAWN = 6;
	
	private int color;
	private int type;
	private int row, col;
	
    public Piece(int color, int type, int row, int col) 
	{
		this.color = color;
		this.type = type;
		this.row = row;
		this.col = col;
	}
	public String getAcronym() 
	{
		String acro = "";
		if (getColor()==0 && getType()!=0) 
		{
			acro = "W"; 
		}
		if (getColor()==1) 
		{
			acro = "B"; 
		}
		switch (getType()) 
		{
		   case 1:
			    acro += "K";
			    break;
		   case 2:
			    acro += "Q";
			    break;
		   case 3:
			    acro += "R";
			    break;
		   case 4:
			    acro += "N";
			    break;
		   case 5:
			    acro += "B";
			    break;	
		   case 6:
			    acro += "P";
			    break;	
		   default:
			    break;	
		}
		return acro;
	}
	public void setType(int type) 
    {
		this.type = type;
	}
    public int getType() 
	{
		return type;
	}
    public void setColor(int color)
    {
		this.color = color;
	}
	public int getColor() 
	{
		return color;
	}
	public void setRow(int row)
    {
		this.row = row;
	}
    public int getRow() 
    {
		return row;
	}
    public void setCol(int col) 
    {
		this.col = col;
	}
    public int getCol()
    {
		return col;
	}
  
}
