

public class Bus extends Vehicle 
{
	private int capacity;
	
	public Bus(String p_name,String p_colour,int p_tyres,int p_capacity)
	{
		super(p_name,p_colour);
		setTyres(p_tyres);
		capacity = p_capacity;
		type = VehicleType.BUS;
	}
	public int getCapacity()
	{
		return capacity;
	}

}
