class ComputerMouse{
	static String   wireless;
	static  String chargeable;
	static float range;
     static void changeWireless(String  newWireless){
			System.out.println(newWireless);
			System.out.println("before change " +wireless);
			wireless=newWireless;
			System.out.println("after change " +wireless);
			
        }
		static void changeChargeable(String  newChargeable){
			System.out.println(newChargeable);
			System.out.println("before change " +chargeable);
			chargeable=newChargeable;
			System.out.println("after change " +chargeable);
			
        }
static void changeRange(float newRange){
			System.out.println(newRange);
			System.out.println("before change " +range);
			range=newRange;
			System.out.println("after change " +range);
			
        }
		
	static void displayAll(){
	System.out.println(wireless);
	System.out.println(chargeable);
	System.out.println(range);
	
	}
}

