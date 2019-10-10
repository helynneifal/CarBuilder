package builder.i524;

import builder.CarBuilder;
public class CinquecentoBuilder extends CarBuilder {

	@Override
	public void buildModel() {
		car.setModel("Fiat 500 L 2019");
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
		car.setFuelSource("Gasoline and Etanol.");
	}

	@Override
	public void buildTransmission() {
		car.setTransmission("Manual");		
	}

	@Override
	public void buildColor() {
		car.setColor("Bronze Namíbia");	
	}

	@Override
	public void buildYear() {
		car.setYear(2019);
	}

	@Override
	public void buildDoors() {
		car.setDoors(6);
	}

	@Override
	public void buildSeats() {
		car.setSeats(5);
	}

	@Override
	public void buildPrice() {
		car.setPrice(61900.00);
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
		car.setOwners("Amanda Barbosa & Letícia Gabriele");		
	}

}