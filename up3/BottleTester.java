class BottleTester{
	public  static void main(String[] args){
		WaterBottle.dispalyAll();
		System.out.println("  ");
		String brand="java";
WaterBottle.changeBrand (brand);
System.out.println("  ");
int quatity=2;
WaterBottle.changeQuatity (quatity);
System.out.println("  ");
boolean thermoflask=true;
WaterBottle.changeThermoFlask( thermoflask);
System.out.println("  ");
WaterBottle.dispalyAll();
}
}