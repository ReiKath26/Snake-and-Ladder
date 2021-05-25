
public class Player {
	private String name;
	private int position;
	
	public Player(String name, int position) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.position = position;
	}

	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getPosition()
	{
		return position;
	}
	
	public void setPosition(int position)
	{		
		this.position = position ;
	}
	public void addPosition(int value)
	{
		position += value;
		if(position > 100) 
		{
			
			int n = position % 100;
			position = 100 - n;
		}
		
		else if(position == 13)
		{
			
			position = 7;
		}
		
		else if(position == 25)
		{
			
			position = 40;
		}
		else if(position == 50)
		{
			
			position = 38;
		}
		
		else if(position == 63)
		{
			
			position = 78;
		}
		else if(position == 83)
		{
			
			position = 97;
		}
		else if(position == 95)
		{
			
			position = 76;
		}
		
	}
}
