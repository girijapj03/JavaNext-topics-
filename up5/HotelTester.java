class HotelTester{
public static void main(String[] hotels){
	Hotel.dislayAll();
	System.out.println("");
	String starterName="Masala pappad";
	int num=18;
	Hotel.orderFood(starterName);
	Hotel.dislayAll();
	System.out.println("");
	Hotel.orderFood(num);
	Hotel.orderFood(starterName,num=32);
	Hotel.orderFood(num,starterName="BaBycorn");
	Hotel.dislayAll();
}
}