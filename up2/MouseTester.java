class MouseTester{
	public static void main(String[] move){
	ComputerMouse.displayAll();
	System.out.println("  ");
	String wireless="wired";
	ComputerMouse.changeWireless(wireless);
	System.out.println("  ");
	String chargeable="Rechargeable";
	ComputerMouse.changeChargeable(chargeable);
	System.out.println("  ");
	float range=9;
	ComputerMouse.changeRange(range);
	
ComputerMouse.displayAll();
	}

}