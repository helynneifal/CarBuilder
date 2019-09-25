package builder.i524;

import builder.CarBuilder;

public class AudiA8LBuilder extends CarBuilder {

	@Override
	public void buildModel() {
		car.setModel("Audi A8 L");	
	}

	@Override
	public void buildAutomaker() {
		car.setAutomaker("Audi AG");
	}

	@Override
	public void buildType() {
		car.setType("Sedan");		
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
		car.setColor("Mamba Black");	
	}

	@Override
	public void buildYear() {
		car.setYear(2015);
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
		car.setPrice(625000.00);
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
		car.setOwners("Fernanda");		
	}

}
