class BikeInfo{
static String brand;
static float  price;
static Model model;
static Engine cc;
static double mileage;
static void setInfo(String newBrand,float newPrice,Model newModel,Engine newCc ,double newMileage ){
	System.out.println(newBrand);
	System.out.println(newPrice);
	System.out.println(newModel);
	System.out.println(newCc);
	System.out.println(newMileage);
	brand=newBrand;
	price=newPrice;
	model=newModel;
	cc=newCc;
	mileage=newMileage;
	return;
}
     static void displayAll(){
	System.out.println(brand);
	System.out.println(price);
	System.out.println(model);
	System.out.println(cc);
	System.out.println(mileage);
	
	
}
}