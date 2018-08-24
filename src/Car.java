

public class Car extends Vehicle{

	private int age;
	
	public Car(String p_name,String p_colour,int p_tyres,int p_age)
	{
		super(p_name,p_colour);
		setTyres(p_tyres);
		age = p_age;
		type = VehicleType.CAR;
	}
	public int getAge()
	{
		return age;
	}
	
	
}
