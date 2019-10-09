package builder.i524;

import builder.CarBuilder;

public class BrasiliaBuilder extends CarBuilder {

	@Override
	public void buildModel() {
		car.setModel("Brasilia 2.0");
	}

	@Override
	public void buildAutomaker() {
		car.setAutomaker("Volkswagen");
	}

	@Override
	public void buildType() {
		car.setType("Sportive");		
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
		car.setColor("Shocking rose");	
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
		car.setPrice(500000.00);
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
		car.setOwners("Alisson das Mulheres, Kevin");		
	}

}
