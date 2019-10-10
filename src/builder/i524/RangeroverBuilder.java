package builder.i524;

import builder.CarBuilder;

public class RangeroverBuilder extends CarBuilder{

	@Override
	public void buildModel() {
		car.setModel("Rangerover 2.0 TD4");
		
	}

	@Override
	public void buildAutomaker() {
		car.setAutomaker("LandRover");
		
	}

	@Override
	public void buildType() {
		car.setType("SUV");	
		
	}

	@Override
	public void buildFuelSource() {
		car.setFuelSource("Diesel");
		
	}

	@Override
	public void buildTransmission() {
		car.setTransmission("Automatic");
		
	}

	@Override
	public void buildColor() {
		car.setColor("Firenze Red");
		
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
		car.setSeats(5);
		
	}

	@Override
	public void buildPrice() {
		car.setPrice(249.500);
		
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
		car.setOwners("524 Cassia and Vanessa");	
		
	}

}
