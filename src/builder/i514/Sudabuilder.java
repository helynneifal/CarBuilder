package builder.i514;
import builder.CarBuilder;

public class Sudabuilder extends CarBuilder {

	@Override
	public void buildModel() {
		car.setModel("Sudã");
		
	}

	@Override
	public void buildAutomaker() {
		car.setAutomaker("Chevrolet Onix");
		
	}

	@Override
	public void buildType() {
		car.setAutomaker("Compact");
		
	}

	@Override
	public void buildFuelSource() {
		car.setFuelSource ("Gasoline");
		
	}

	@Override
	public void buildTransmission() {
		car.setTransmission("Automatico");
		
	}

	@Override
	public void buildColor() {
		car.setColor("red-violet");
		
	}

	@Override
	public void buildYear() {
		car.setYear(2018);
		
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
		car.setPrice(36403.000);
		
	}

	@Override
	public void buildAirConditioning() {
		car.setAirConditioning(true);
		
	}

	@Override
	public void buildAirbag() {
		car.setAirbag(false);
		
	}

	@Override
	public void buildAbsBrake() {
		car.setAbsBrake(true);
		
	}

	@Override
	public void buildOwners() {
		car.setOwners("Itala and Raires");
		
	}

}
