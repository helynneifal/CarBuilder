package builder.i514;

import builder.CarBuilder;

public class OnixBuilder extends CarBuilder {

	@Override
	public void buildModel() {
		car.setModel("LT");
		
	}

	@Override
	public void buildAutomaker() {
		car.setAutomaker("Chevrolet");
		
	}

	@Override
	public void buildType() {
		car.setType("Compact");
		
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
		car.setColor("Teal");
		
	}

	@Override
	public void buildYear() {
		
		car.setYear(2019);
	}

	@Override
	public void buildDoors() {
		car.setDoors(5);
		
	}

	@Override
	public void buildSeats() {
		car.setSeats(6);
		
	}

	@Override
	public void buildPrice() {
		car.setPrice(48690.00);
		
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
		car.setOwners("Jucimara and Laryssa");
		
	}

}
