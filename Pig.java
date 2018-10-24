public class Pig implements Animal{
	protected String myType;     
  	protected String mySound;
  	public Pig(){
  		myType = "Pigs";
  		mySound = "oink";
  	}
  	public Pig(String type, String sound){
  		myType = type;
  		mySound = sound;
  	}
  	public String getType(){
  		return myType;
  	}
  	public String getSound(){
  		return mySound;
  	}
}