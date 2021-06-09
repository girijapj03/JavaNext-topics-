class EarPhone{
	static String color;
	static boolean connected;
	static double price;
public static void sound(){
	System.out.println("invoked sound()");
	System.out.println(connected);
	if (connected){

 System.out.println(color);
 System.out.println(price);
 }else{
	 System.out.println("not playing");
}
System.out.println("exit sound()");

}
}