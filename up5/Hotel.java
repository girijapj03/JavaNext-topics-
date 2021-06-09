class Hotel{
static String starterName;
static int foodId;
	static void orderFood(String newStarterName){
	System.out.println("Invoked OrderFood");
	System.out.println("newStarterName :" +newStarterName);
	starterName=newStarterName;
	}
		static void orderFood(int mainFoodId){
		System.out.println("Invoked OrderFood");
	    System.out.println("mainFoodId :" +mainFoodId);
	    foodId=mainFoodId;
		}
			static void orderFood(int newFoodId,String starter){
		    System.out.println("Invoked OrderFood");
			System.out.println("starter :"+ starter);
	        System.out.println("foodId :" +foodId);
			starterName=starter;
	         foodId=newFoodId;
		    }
				static void orderFood(String starter, int newFoodId){
		    System.out.println("Invoked OrderFood");
			System.out.println("starter :"+ starter);
	        System.out.println("foodId :" +foodId);
			starterName=starter;
	         foodId=newFoodId;
		    }
static void dislayAll(){
 System.out.println("starterName :"+starterName  );
	System.out.println("foodId :" +foodId);
}
}