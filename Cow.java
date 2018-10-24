public class Cow implements Animal
{     
  protected String myType;     
  protected String mySound;
  public Cow(){
  	myType = "Cow";
  	mySound = "moo";
  }
  public Cow(String type, String sound, String name){
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
