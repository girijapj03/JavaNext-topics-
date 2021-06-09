class StateFinder{
static	String stateName;//non-static variable fullName cannot be referenced from a static context

static String getStateName(String cityName){
System.out.println(" invoked getStateName");
System.out.println("capital :" + cityName  );
//1
if(cityName.equals("Banglore")){
	return "StateName:Karnataka";
}
//2
if(cityName.equals("Kolkata")){
	return "StateName:West Bengal";
}
//3

if(cityName.equals("Dehradun")){
	return "StateName:Uttarakhand";
}
//4
if(cityName.equals("Lucknow")){
	return "StateName:Uttar Pradesh";
}
//5
if(cityName.equals("Agartala")){
	return "StateName:Tripur";
}
//6
if(cityName.equals("Hyderbad")){
	return "StateName:Telangana";
}
//7
if(cityName.equals("Chennai")){
	return "StateName:Tamil Nadu";
}
//8
if(cityName.equals("Gangtok")){
	return "StateName:Sikkim";
}
//9
if(cityName.equals("Jaipur")){
	return "StateName:Rajasthan";
}
//10
if(cityName.equals("Chandigarh")){
	return "StateName:Punjab";
}
//11
if(cityName.equals("Banglore")){
	return "StateName:Karnataka";
}
//12
if(cityName.equals("Banglore")){
	return "StateName:Karnataka";
}
//13
if(cityName.equals("Bhuaneswar")){
	return "StateName:Odisha";
}
//14
if(cityName.equals("Kohima")){
	return "StateName:Nagaland";
}
//15
if(cityName.equals("Shillong")){
	return "StateName:Meghalaya";
}
//16
if(cityName.equals("Imphal")){
	return "StateName:Manipur";
}
//17
if(cityName.equals("Mumbai")){
	return "StateName:Maharashtra";
}
//18
if(cityName.equals("Bhopal")){
	return "StateName:Madhya Pradesh";
}
//19
if(cityName.equals("Thiruvanantpuram")){
	return "StateName:Kerala";
}
//20
if(cityName.equals("Shimla")){
	return "StateName:Himachal Pradesh";
}
//21
if(cityName.equals("Chadigarh")){
	return "StateName:Haryana";
}
//22
if(cityName.equals("Gandhinagar")){
	return "StateName:Gujarat";
}
//23
if(cityName.equals("Panaji")){
	return "StateName:Goa";
}
//24
if(cityName.equals("Raipur")){
	return "StateName:Chhatisgarh";
}
//25
if(cityName.equals("Patna")){
	return "StateName:Bihar";
}
//26
if(cityName.equals("Dispur")){
	return "StateName:Assam";
}
//27
if(cityName.equals("Itanagar")){
	return "StateName:Arunachal Pradesh";
}
//28
if(cityName.equals("Amaravati")){
	return "StateName:Andra Pradesh";
}
return "fullName= NA";
}
} 