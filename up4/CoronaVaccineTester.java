class CoronaVaccineTester{
	public static void main(String[] args){
	
	String area="AGRAHARA";
	int mainWardNO=185;
	CoronaVaccine.findVaccineCenter(area);
      CoronaVaccine.findVaccineCenter(mainWardNO);
	  
	 String vaccine= CoronaVaccine.findVaccineCenter( area, mainWardNO);
	 System.out.println(vaccine);
	  
	  CoronaVaccine.findVaccineCenter(mainWardNO,area);
	  CoronaVaccine.dislayAll();
	 
	}

}
