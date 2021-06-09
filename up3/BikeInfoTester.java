class BikeInfoTester{
public static void main(String  []roam){
	
BikeInfo.displayAll();
	String brand="RoyalEnfield";
	float price=172000.00f;
	double mileage=40;
	Model model=Model.ThunderBird;
	Engine engine=Engine.ThreeFiftycc;


	BikeInfo.setInfo(brand,price,model,engine,mileage);
	BikeInfo.displayAll();
}
}