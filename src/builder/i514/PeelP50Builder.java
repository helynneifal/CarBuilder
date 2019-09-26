package builder.i514;

import builder.CarBuilder;

public class PeelP50Builder extends CarBuilder{
	

	@Override
	public void buildModel() {
		car.setModel("Peel P50");
	}

	@Override
	public void buildAutomaker() {
		car.setAutomaker("Peel Engineering Company");
	}

	@Override
	public void buildType() {
		car.setType("Microcar");
	}

	@Override
	public void buildFuelSource() {
		car.setFuelSource("eletric");
	}

	@Override
	public void buildTransmission() {
		car.setTransmission("Automatic");
	}

	@Override
	public void buildColor() {
		car.setColor("red");
	}

	@Override
	public void buildYear() {
		car.setYear(1965);
	}

	@Override
	public void buildDoors() {
		car.setDoors(1);
	}

	@Override
	public void buildSeats() {
		car.setSeats(1);
	}

	@Override
	public void buildPrice() {
		car.setPrice(903.56);
	}

	@Override
	public void buildAirConditioning() {
		car.setAirConditioning(false);
	}

	@Override
	public void buildAirbag() {
		car.setAirbag(false);
	}

	@Override
	public void buildAbsBrake() {
		car.setAbsBrake(true);
	}

	@Override
	public void buildOwners() {
		car.setOwners("514 class");
	}

	
}
