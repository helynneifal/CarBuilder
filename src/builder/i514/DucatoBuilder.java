package builder.i514;

import builder.CarBuilder;

public class DucatoBuilder extends CarBuilder {

	@Override
	public void buildModel() {
		car.setModel("Ducato 2.3");
	}

	@Override
	public void buildAutomaker() {
		car.setAutomaker("Fiat");
	}

	@Override
	public void buildType() {
		car.setType("Van");
	}

	@Override
	public void buildFuelSource() {
		car.setFuelSource("Diesel");
	}

	@Override
	public void buildTransmission() {
		car.setTransmission("Manual");
	}

	@Override
	public void buildColor() {
		car.setColor("White");
	}

	@Override
	public void buildYear() {
		car.setYear(2014);
	}

	@Override
	public void buildDoors() {
		car.setDoors(4);
	}

	@Override
	public void buildSeats() {
		car.setSeats(16);
	}

	@Override
	public void buildPrice() {
		car.setPrice(75.000);
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