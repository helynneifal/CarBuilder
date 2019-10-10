package builder.i514;

import builder.CarBuilder;

public class SienaBuilder extends CarBuilder {

	@Override
	public void buildModel() {
		car.setModel("Siena");
	}

	@Override
	public void buildAutomaker() {
		car.setAutomaker("Fiat");
	}

	@Override
	public void buildType() {
		car.setType("Compact");
	}

	@Override
	public void buildFuelSource() {
		car.setFuelSource("Compressed Natural Gas");
	}

	@Override
	public void buildTransmission() {
		car.setTransmission("Automatic");
	}

	@Override
	public void buildColor() {
		car.setColor("Blue");
	}

	@Override
	public void buildYear() {
		car.setYear(2019);
	}

	@Override
	public void buildDoors() {
		car.setDoors(4);
	}

	@Override
	public void buildSeats() {
		car.setSeats(6);
	}

	@Override
	public void buildPrice() {
		car.setPrice(50490.00);
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
		car.setAbsBrake(false);
	}

	@Override
	public void buildOwners() {
		car.setOwners("514 class");
	}
	
}
