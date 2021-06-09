class TravelAgencyArrayTester{
public static void main(String[] args){	
TravelAgency.displayAgencies();
	TravelAgency.addAgency("VRL");
	TravelAgency.addAgency("SRS");
	TravelAgency.addAgency("DREAM LINER");
	TravelAgency.addAgency("Orange");
	TravelAgency.addAgency("Macco Polo");

	TravelAgency.displayAgencies();
	TravelAgency.displayAtIndex(2);
	TravelAgency.printfoundagency("VRL");
}
}