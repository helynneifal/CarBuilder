package builder.i524;

import builder.CarBuilder;

public class PicapeBuilder extends CarBuilder {

	@Override
	public void buildModel() {
		car.setModel("Fiat Toro 1.8 Endurance 2020");
	}

	@Override
	public void buildAutomaker() {
		car.setAutomaker("Fiat");
	}

	@Override
	public void buildType() {
		car.setType("Sport");
	}

	@Override
	public void buildFuelSource() {
		car.setFuelSource("Gasoline and Etanol");
	}

	@Override
	public void buildTransmission() {
		car.setTransmission("Manual");
	}

	@Override
	public void buildColor() {
		car.setColor("Red");
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
		car.setPrice(92.990);
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
		car.setOwners("Heric Roberto da Silva Alves and Bárbara Juliana Barros dos Santos");
	}

}
