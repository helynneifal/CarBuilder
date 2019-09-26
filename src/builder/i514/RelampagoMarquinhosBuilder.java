package builder.i514;

import builder.CarBuilder;

public class RelampagoMarquinhosBuilder extends CarBuilder{

	@Override
	public void buildModel() {
		car.setModel("RelampagoMarquinhos");	
	}

	@Override
	public void buildAutomaker() {
		car.setAutomaker("Mazda");
		
	}

	@Override
	public void buildType() {
		car.setType("Sport");
		
	}

	@Override
	public void buildFuelSource() {
		car.setFuelSource("Gasoline or Ethanol");
		
	}

	@Override
	public void buildTransmission() {
		car.setTransmission("Manual");
		
	}

	@Override
	public void buildColor() {
		car.setColor("lightning red");
		
	}

	@Override
	public void buildYear() {
		car.setYear(2003);
		
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
		car.setPrice(15000.00);
		
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
		car.setOwners("Sergio and Everton");
		
	}
	

}
