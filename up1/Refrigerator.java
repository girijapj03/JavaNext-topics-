class Refrigerator{
	static float capacity;
	static boolean opened;
	static boolean closed;
		public static void open(){
		      opened=true;
			 System.out.println(opened);
		}
			  
		  public static void close() {
			  opened=false;
			System.out.println(opened);
		}
		 static void displayOpened(){

	System.out.println(" Door is opened");
		 
}
}