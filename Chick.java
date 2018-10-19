public class Chick implements Animal 
{     
  protected String myType;     
  protected String mySound;
  protected String myName;
  public Chick(){
  	myType = "Chicks";
  	mySound = "cluck";
  }
  public Chick(String type, String sound , String name){
  	myType = type;
  	mySound = sound;
  	myName = name;
  }
  public void setAge(int age){ //in months
  	if(age < 2){
  		myType = "Chicks";
  		mySound = "cheep";
  	}
  	else if(age >= 2 && age <= 96){
  		myType = "chicken";
  		mySound = "cluck";
  	}
  	else{
  		myType = "error";
  		mySound = "error";
  	}
  }
  public String getName(){
  	return myName; 
  }
  public String getType(){
  	return myType;
  }
  public String getSound(){
  	return mySound;
  }
}
