class PersonalInfo{
	static String name;
	static long contactNo;
	static Gender gender;
	static PersonalStatus status;
	
	static void setInfo(String newName,long newContactNo, Gender newGender, PersonalStatus newStatus){
		System.out.println(newName);
		System.out.println(newContactNo);
		System.out.println(newGender);
		System.out.println(newStatus);
		name=newName;
		status= newStatus;
		contactNo=newContactNo;
		gender=newGender;
		return;
	}
public static void displayAll(){
	System.out.println("invoked displayAll()");
	System.out.println(name);
	System.out.println(contactNo);
	System.out.println(gender);
	System.out.println(status);
}
}