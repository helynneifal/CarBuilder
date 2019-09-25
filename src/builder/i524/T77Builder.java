package builder.i524;
import builder.CarBuilder;

public class T77Builder extends CarBuilder {
	@Override
	public void buildModel() {
		car.setModel("T77");
	}

	@Override
	public void buildAutomaker() {
		car.setAutomaker("Bestune");
	}

	@Override
	public void buildType() {
		car.setType("SUV");		
	}

	@Override
	public void buildFuelSource() {
		car.setFuelSource("Ethanol");
	}

	@Override
	public void buildTransmission() {
		car.setTransmission("Manual");		
	}

	@Override
	public void buildColor() {
		car.setColor("Yellow");	
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
		car.setSeats(5);
	}

	@Override
	public void buildPrice() {
		car.setPrice(52000.00);
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
		car.setOwners("524 class");		
	}
}
