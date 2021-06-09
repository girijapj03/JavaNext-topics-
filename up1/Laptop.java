class Laptop{

static String brand;
static float memory;
	
	public static void display(){
	System.out.println("Staring display() ");
		System.out.println(brand);
		System.out.println(memory);
		System.out.println();
		
	}
	 public static void changeMemory(){
		 System.out.println("allocating memory");
		 memory=8;
		System.out.println(memory);
	}
	public static String changeBrand(){
		 brand="Dell";
		System.out.println(brand);
		return brand;
		
	}
}