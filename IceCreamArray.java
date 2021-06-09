class IceCreamArray{
	public static void main(String []tasty){
	String[] cold={"Vanilla","Chocolate","Kulfi","Strawberry","Cocktail","Falooda","Butter scotch","tricone"} ;
	System.out.println(cold.length);
	for(int size=0; size<cold.length; size++){
		String temp =cold[size];
		System.out.println(temp);
		if(temp=="Kulfi")
			System.out.println("Favourite iceCream is Kulfi");
	}
	}
}