package builder.i514;

import builder.CarBuilder;

public class TeslaModelSBuilder extends CarBuilder {

	@Override
	public void buildModel() {
		car.setModel("Tesla Model S");
	}

	@Override
	public void buildAutomaker() {
		car.setAutomaker("Tesla");
	}

	@Override
	public void buildType() {
		car.setType("Sport");
	}

	@Override
	public void buildFuelSource() {
		car.setFuelSource("eletrical");
	}

	@Override
	public void buildTransmission() {
		car.setTransmission("Automatic");
	}

	@Override
	public void buildColor() {
		car.setColor("Red");
	}

	@Override
	public void buildYear() {
		car.setYear(2013);
	}

	@Override
	public void buildDoors() {
		car.setDoors(4);
	}

	@Override
	public void buildSeats() {
		car.setSeats(5);
	}

	@Override
	public void buildPrice() {
		car.setPrice(74500.00);
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
		car.setOwners("Marcos Vinícius and Danielly Anjos");
	}

}