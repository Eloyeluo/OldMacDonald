public class Pig implements Animal{
	protected String myType;     
  	protected String mySound;
  	protected String myName;
  	public Pig(){
  		myType = "Pigs";
  		mySound = "oink";
  	}
  	public Pig(String type, String sound, String name){
  		myType = type;
  		mySound = sound;
  		myName = name;
  	}
  	public void setAge(int age){ //in months
  	if(age < 2){
  		myType = "Piglet";
  		mySound = "snort";
  	}
  	else if(age >= 2 && age <= 96){
  		myType = "Pig";
  		mySound = "oink";
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