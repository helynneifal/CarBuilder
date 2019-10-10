package builder.i514;

import builder.CarBuilder;

public class PorscheBuilder extends CarBuilder {

	@Override
	public void buildModel() {
		car.setModel("Porsche 911");
	}

	@Override
	public void buildAutomaker() {
		car.setAutomaker("Porsche");
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
		car.setTransmission("Manual");
	}

	@Override
	public void buildColor() {
		car.setColor("Light White");
	}

	@Override
	public void buildYear() {
		car.setYear(2016);
	}

	@Override
	public void buildDoors() {
		car.setDoors(3);
	}

	@Override
	public void buildSeats() {
		car.setSeats(5);
	}

	@Override
	public void buildPrice() {
		car.setPrice(563099);
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
		car.setOwners("Greyson & Matheus");
	}

}