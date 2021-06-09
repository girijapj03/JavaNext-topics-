class AllinOne{
	public static void main(String arg[]){
//bulb
	int Watts=Bulb.light();
System.out.println("Watts :-" + Watts);

//Carpenter
	String finished=Carpenter.woodWorks();
	System.out.println("finishedWoodWork :-" + finished);

//DeliveryGuy
	String Flipkart=DeliveryGuy.delivery();
	System.out.println("Deliverguy delivers" + " " + Flipkart+ " " +"on time");

//Farmer
	String Crop=Farmer.farming();
	System.out.println(Crop);

//Gym
	float OpensAt=Gym.openTime();
	System.out.println(" Gym Opens@ :" +OpensAt );

}
}