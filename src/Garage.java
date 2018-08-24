import java.util.ArrayList;


public class Garage 
{
	// Create the list of vehicles
	ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	public Garage()
	{
		init();
		printVehicles();
		//RemoveVehicleTypes(Vehicle.VehicleType.CAR);
		printVehicles();
		//RemoveIndex(6);
		fixVehicles(10,20,30);
		emptyGarage();
		printVehicles();
		
	}
	
	private void init()
	{
		vehicles.add(new Car("Focus","Blue",4,10));
		vehicles.add(new Car("Car2","Red",4,3));
		vehicles.add(new Car("Car3","White",4,1));
		
		vehicles.add(new Bus("Bus1","Blue",6,200));
		vehicles.add(new Bus("Bus2","Red",6,20));
		vehicles.add(new Bus("Bus3","White",6,59));
		
		vehicles.add(new Motorcycle("Bike1","Blue",2,150));
		vehicles.add(new Motorcycle("Bike2","Red",2,60));
		vehicles.add(new Motorcycle("Bike3","White",2,100));
		
	}
	public void addVehicle(Vehicle v)
	{
		vehicles.add(v);
	}
	public void removeVehicleTypes(Vehicle.VehicleType type)
	{
		
		for(int i = vehicles.size() -1 ; i >= 0; i--)
		{
			if(type == vehicles.get(i).type)
			{
				vehicles.remove(i);
			}
		}
		
	}
	
	public void removeIndex(int index)
	{
		vehicles.remove(index);	
		
	}
	
	public void printVehicles()
	{
		for(Vehicle v: vehicles)
		{
			System.out.println(v.getName());
		}
	}
	
	public void fixVehicles(int carFixPrice, int busFixPrice, int motorcycleFixPrice)
	{
		/* Get the price for each Car type
		
		* Car = 10
		* Motorcycle = 20
		* Bus = 30
		*/
		
		int[] prices = {0,0,0};
		for(Vehicle v : vehicles)
		{
			if(v instanceof Car)
			{
				prices[0] += carFixPrice;
			}
			if (v instanceof Bus)
			{
				prices[1] += busFixPrice;
			}
			if (v instanceof Motorcycle)
			{
				prices[2] += motorcycleFixPrice;
			}
		}
		System.out.println("Price Fix for Car: £" + prices[0]);
		System.out.println("Price Fix for Bus: £" + prices[1]);
		System.out.println("Price Fix for Motorcycle: £" + prices[2]);
		System.out.println("Total Fix price: £" + (prices[0] + prices[1] + prices[2]));
		
		
	}
	
	public void emptyGarage()
	{
		vehicles.clear();
	}
	
	
	
	

}
