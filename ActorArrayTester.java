class ActorArrayTester{
	public static void main(String act[]){
	String act1="Shahid Kapoor";
	String act2="SRK";
	String act3="Genelia";
	String act4="Sudeep";
	String act5="Yash";
	String act6="AlluArjun";
	String act7="Prabhas";
	String act8="Sunny Leone";
	String act9=null;
	String actors[]={act1,act2,act3,act4,act5,act6,act7,act8,act9};
	System.out.println(actors.length);
	
	for(int temp=0; temp<actors.length; temp++ ){
		String reel=actors[temp];
		System.out.println("actor :" +reel);
		if(reel!=null && reel=="Sunny Leone"){
			System.out.println("Sachin favourite actor is Sunny Leone");
		}
		
	}
	}

}