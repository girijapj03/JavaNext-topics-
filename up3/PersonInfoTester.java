class PersonInfoTester{
	public static void main(String[] evening){
	PersonalInfo.displayAll();
	System.out.println(" ");
	
	String name="Sudeep";
	long contactNo=99945413703l;
	PersonalStatus status=PersonalStatus.Married;
	Gender gender=Gender.Male;
PersonalInfo.setInfo(name,contactNo,gender,status);
System.out.println(" ");
	PersonalInfo.displayAll();
	}

}