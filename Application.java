class Application{
	static String[] applications= new String[10];
	static int index=0;
		static void addApps(String name){
			System.out.println("appName :" +name);
	if(index>9){
		System.out.println("ArrayIndexOutOfBoundsException,can't add more elements");
	return;	
	}
	//index++;
	applications[index]=name;
	index++;
	}
	static void displayApp(){
		for(short temp=0; temp<applications.length; temp++){
			System.out.println(applications[temp]);
		}
	}
		static void displayAtIndex(int newIndex){
			if(newIndex<=3){
				System.out.println("Index is avail");
				System.out.println("app" +" "+ newIndex +":" +applications[newIndex]);
				}else {
					System.out.println("Index not avail");
				}
			}
			static void  printFoundApp(String appName){
			
		for(short temp=0; temp<applications.length; temp++){
				String appn=applications[temp];
				if(appn.equals(appName)){
						System.out.println(" Appliacation Found");
						break;
			}
		}
			}
	

}