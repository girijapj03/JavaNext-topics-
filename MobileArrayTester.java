class MobileArrayTester{
	public static void main(String[] come){
	String []phones={"Samsung J7","Redmi note 6 pro","NOKIA N95",null,"Samsung note 10 lite",null,"null"};
	System.out.println(phones.length);
	int index=0;
	while( index < phones.length){
		index++;
		String temp=phones[index];
		System.out.println(temp);
		if(temp != null && temp.equals("NOKIA N95")){
			System.out.println("Found Strongest phone");
		if(temp != null && temp.equals("Samsung J7")){	
			System.out.println("always need to charge");
		}
	}
	}
}
}