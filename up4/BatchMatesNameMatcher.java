class BatchMatesNameMatcher{
static	String fullName;//non-static variable fullName cannot be referenced from a static context

static String getFullName(String firstName){
System.out.println(" invoked getFullName");
System.out.println("arg :" + firstName );

if(firstName.equals("Aishwarya")){
String aishFullName="Aishwarya H Puttaswamy";
fullName=aishFullName;
System.out.println(" fullName :" +fullName);
return fullName;
}
//1
if(firstName.equals("Chandru")){

String chandruFullName="Chandrashekar V Mallapur";
fullName=chandruFullName;
System.out.println(" fullName :" +fullName);
return fullName;
}
//2
if(firstName.equals("Chaitrashri")){
/*Chandru Darshan Chaitrashri Mradala Harshita Pavitra Sunil Mahesh */
String chaitraFullName="Chaitrashri Gond";
fullName=chaitraFullName;
System.out.println(" fullName :" +fullName);
return fullName;
}
//3
if(firstName.equals("Mradala")){
String mradalaFullName="Mradala Shetty";
fullName=mradalaFullName;
System.out.println(" fullName :" +fullName);
return fullName;
}
//4
if(firstName.equals("Sunita")){
String sunitaFullName="Sunita Meti";
fullName=sunitaFullName;
System.out.println(" fullName :" +fullName);
return fullName;
}
//5
if(firstName.equals("Sunil")){
String sunilFullName="Sunil  Chowdry";
fullName=sunilFullName;
System.out.println(" fullName :" +fullName);
return fullName;
}
//6
if(firstName.equals("Vaishnavi")){
String vaishnaviFullName="Vaishnavi Jatti";
fullName=vaishnaviFullName;
System.out.println(" fullName :" +fullName);
return fullName;
}
//7
if(firstName.equals("Pavitra")){
String pavitraFullName="Pavitra Dalawai";
fullName=pavitraFullName;
System.out.println(" fullName :" +fullName);
return fullName;
}
//8
if(firstName.equals("Mahesh")){
String maheshFullName="Mahesh Reddy";
fullName= maheshFullName;
System.out.println(" fullName :" +fullName);
return fullName;
}
//9
if(firstName.equals("Darshan")){
String darshanFullName="Darshan HP";
fullName=  darshanFullName;
System.out.println(" fullName :" +fullName);
return fullName;
}
//10
if(firstName.equals("Harshita")){
String harshitaFullName="Harshita K";
fullName=  harshitaFullName;
System.out.println(" fullName :" +fullName);
return fullName;
}
return "fullName= NA";
}
}