package Model;

public class boardPoint {
	private double boardSize;
	private float x;
	private float y;
	public boardPoint(double boardSize)
	{
		this.boardSize = boardSize;
		
	}
	public float getx()
	{
		return x;
	}
	public float gety()
	{
		return y;
	}
	public void setx(float x)
	{
		if ((x<0) || (x> boardSize)){}
		else
		{
			this.x = x;
		}
	}
	public void sety(float y)
	{
		if ((y<0) || (y> boardSize)){}
		else
		{
			this.y = y;
		}
	}
}
