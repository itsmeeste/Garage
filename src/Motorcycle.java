

public class Motorcycle extends Vehicle
{
	private int maxSpeed;
	
	public Motorcycle(String p_name,String p_colour,int p_tyres,int p_speed)
	{
		super(p_name,p_colour);
		setTyres(p_tyres);
		maxSpeed = p_speed;
		type = VehicleType.MOTORCYCLE;
	}
	public int getMaxSpeed()
	{
		return maxSpeed;
	}
}
