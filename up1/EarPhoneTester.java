class EarPhoneTester{
	public static void main(String [ ]p){
	EarPhone.color="red";
	EarPhone.price=1799;
	EarPhone.connected=true;
	EarPhone.sound();
	System.out.println("");
	EarPhone.connected=false;
	EarPhone.sound();
	
	}

}