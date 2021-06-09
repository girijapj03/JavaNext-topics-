class WaterBottle{
static String brand;
static int quatity;
static boolean thermoflask;

static void changeBrand (String newBrand){
	System.out.println(newBrand);
	System.out.println("brand before change:" + brand);
	brand=newBrand;
	System.out.println("brand after change :" + brand);
}
	static void printBrand(){
	System.out.println(brand);
	}
	static void changeQuatity (int newQuatity){
	System.out.println(newQuatity);
	System.out.println("brand before change:" +quatity);
	quatity=newQuatity;
	System.out.println("brand after change :" +quatity);
}
		static void printQuatity(){
		System.out.println(quatity);
		}
		static void changeThermoFlask(boolean newThermoFlask){
	System.out.println(newThermoFlask);
	System.out.println("brand before change :" +thermoflask);
	thermoflask=newThermoFlask;
	System.out.println("brand after change :" +thermoflask);
}
		   static void printThermoFlask(){
		  System.out.println(thermoflask);
		 }
static void dispalyAll(){
printBrand();
printQuatity();
printThermoFlask();
}
}