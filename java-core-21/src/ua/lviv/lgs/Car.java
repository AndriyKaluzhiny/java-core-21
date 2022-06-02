package ua.lviv.lgs;

public class Car {
	@CarAnnotation("CAr looks great")
	String model = "Audi r8";
	@Override
	public String toString() {
		return "Car [model=" + model + ", power=" + power + "]";
	}
	@CarAnnotation("You have to be careful when drive this car")
	int power = 620;
}
