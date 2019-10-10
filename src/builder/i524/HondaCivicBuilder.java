package builder.i524;

import builder.CarBuilder;

public class HondaCivicBuilder extends CarBuilder {

	@Override
	public void buildModel() {
		car.setModel("HondaCivic");
	}

	@Override
	public void buildAutomaker() {
		car.setAutomaker("Honda");
	}

	@Override
	public void buildType() {
		car.setType("sportive");		
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
		car.setColor("Metallic Cosmic Blue");	
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
		car.setPrice(134900.00);
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
		car.setOwners("Everton Walix e Luan Marcos");		
	}

}

