package builder.i514;

import builder.CarBuilder;

public class A7SportbackBuilder extends CarBuilder{

	@Override
	public void buildModel() {
		car.setModel("A7 Sportback 3.0");
		
	}

	@Override
	public void buildAutomaker() {
		car.setAutomaker("Audi");
		
	}

	@Override
	public void buildType() {
		car.setType("Sport");
		
	}

	@Override
	public void buildFuelSource() {
		car.setFuelSource("Gasoline");
		
	}

	@Override
	public void buildTransmission() {
		car.setTransmission("Automatic");
		
	}

	@Override
	public void buildColor() {
		car.setColor("lighted green");
		
	}

	@Override
	public void buildYear() {
		car.setYear(2020);
		
	}

	@Override
	public void buildDoors() {
		car.setDoors(5);
		
	}

	@Override
	public void buildSeats() {
		car.setSeats(5);
		
	}

	@Override
	public void buildPrice() {
		car.setPrice(72616.07);
		
	}

	@Override
	public void buildAirConditioning() {
		car.setAirConditioning(true);
		
	}

	@Override
	public void buildAirbag() {
		car.setAirbag(true);
		
	}

	@Override
	public void buildAbsBrake() {
		car.setAbsBrake(true);
		
	}

	@Override
	public void buildOwners() {
		car.setOwners("Aline and Maysa");
		
	}
	
}
