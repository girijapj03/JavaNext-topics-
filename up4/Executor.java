class Executor{
static void execute(int percentage){
System.out.println("Invoked execute ");
System.out.println(percentage);
if(percentage>60){
//return;
System.out.println("First class");
return;
}
if(percentage>69){
System.out.println("Disctintion class");
return;
}


if(percentage<60){
System.out.println("Smart class");
return;
}
System.out.println("THE END");
}
}