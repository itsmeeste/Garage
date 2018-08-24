

public class Vehicle 
{
	
	public enum VehicleType
	{
		CAR,
		BUS,
		MOTORCYCLE
	};
	
	private String name;
	private String colour;
	private int tyres;
	protected VehicleType type;
	public Vehicle(String p_name,String p_colour)
	{
		name = p_name;
		colour = p_colour;
	}
	public String getName()
	{
		return name;
	}
	public String getColour()
	{
		return colour;
	}
	
	public void setTyres(int p_tyres)
	{
		tyres = p_tyres;
	}
	public VehicleType getType()
	{
		return type;
	}

}
