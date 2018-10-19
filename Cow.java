public class Cow implements Animal
{     
  protected String myType;     
  protected String mySound;
  protected String myName;
  public Cow(){
  	myType = "Cow";
  	mySound = "moo";
  }
  public Cow(String type, String sound, String name){
  	myType = type;
  	mySound = sound;
  	myName = name;
  }
  public void setAge(int age){ //in months
  	if(age < 2){
  		myType = "calf";
  		mySound = "mooh";
  	}
  	else if(age >= 2 && age <= 96){
  		myType = "cow";
  		mySound = "moo";
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
