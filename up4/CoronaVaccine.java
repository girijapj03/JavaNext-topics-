class CoronaVaccine{
	static String center;
	static int wardNO;
	static String   findVaccineCenter(String area){
   System.out.println(" invoked  findVaccineCenter");
   System.out.println("area :" +area);

if(area.equals("Andhra colony")){
String narayanpuraAddress="A NARAYANAPURA UPHC";
center=narayanpuraAddress;
return " Vaccination is Available in " +center ;
}

if(area.equals("N M S Layout ")){
String abbigereAddress="ABBIGERE PHC";
center=abbigereAddress;

return " Vaccination is Available in " +center ;
}
if(area.equals("Yelahanka")){
String agraharaaAddress="AGRAHARA";
center=agraharaaAddress;
System.out.println(" centerName :" +center);
return " Vaccination is Available in " +center ;
}
if(area.equals(" K R Puram Railway station ")){
String arakerAddress="ARAKERE UPHC";
center=arakerAddress;
//System.out.println(" centerName :" +centerName+ " "+ "wardNO  :" +wardNO );
return " Vaccination is Available in " +center ;
}
return "TRY SOMETIME LATER";
	}
	static String findVaccineCenter(int mainWardNO){
		System.out.println("Invoked findVaccineCenter");
		System.out.println("mainWardNO :" +mainWardNO);
		wardNO=mainWardNO;
	   if(mainWardNO==143){
		   String narayanpuraAddress="A NARAYANAPURA UPHC";
		   center=narayanpuraAddress;
		   System.out.println("center :" +center);
		 }
		 if(mainWardNO==199){
			 String abbigereAddress="ABBIGERE PHC";
              center=abbigereAddress;
			System.out.println("center :" +center);
		 }
		 if(mainWardNO==185){
			 String agraharaaAddress="AGRAHARA";
              center=agraharaaAddress;
			  System.out.println("center :" +center);
		 }
		 if(mainWardNO==108){
			 String arakerAddress="ARAKERE UPHC";
                  center=arakerAddress;
			 System.out.println("center :" +center);
		 }
		 return center;
		 }
			
			static String findVaccineCenter(int mainWardNO,String area){
		    System.out.println("Invoked findVaccineCenter");
			System.out.println("area :" +area);
			System.out.println("mainWardNO :" +mainWardNO);
				 if (area.equals(" Andhra colony") && (mainWardNO==143) || (mainWardNO==143)&& area.equals(" Andhra colony"))	 {
              String narayanpuraAddress="A NARAYANAPURA UPHC";
	              center=narayanpuraAddress;
				 }
               return center;
			
		    }
				static String findVaccineCenter(String newCenterName, int mainWardNO){
		    System.out.println("Invoked findVaccineCenter");
			System.out.println("newCenterName :" +newCenterName);
	        System.out.println("mainWardNO :" +mainWardNO);
		center=newCenterName;
	         wardNO=mainWardNO ;
			 return center;
		    }
static void dislayAll(){
 System.out.println("center :"+center  );
	System.out.println("wardNO :" +wardNO);
}
}
