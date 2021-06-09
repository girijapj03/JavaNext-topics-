class TravelAgency{
static String[] agencies= new String[4];
static int index=0;
	static void addAgency(String agencyName){
	System.out.println("agencyName :" +agencyName);
	if(index>3){
		System.out.println("ArrayIndexOutOfBoundsException,can't add more elements");
	return;	
	}
	//index++;
	agencies[index]=agencyName;
	index++;
	}

	static void displayAgencies(){
		for(short temp=0; temp<agencies.length; temp++){
			System.out.println(agencies[temp]);
		}
	}
		static void displayAtIndex(int newIndex){
			
			if(newIndex<=3){
				System.out.println("Index is avail");
				System.out.println("agency" +" "+ newIndex +":" +agencies[newIndex]);
				}else {
					System.out.println("Index not avail");
				}
			}
			static void printfoundagency(String agencyName){
				for(short temp=0; temp<agencies.length; temp++){
					String agency=agencies[temp];
					System.out.println(agency);
					if(agency.equals(agencyName)){
						System.out.println(" Agency Found");
						break;
					}
			}
					
			}
		}
	
