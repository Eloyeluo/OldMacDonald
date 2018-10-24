public class Chick implements Animal 
{     
  protected String myType;     
  protected String mySound;
  protected int randNum;
  public Chick(){
    randNum = (int)(Math.random()*2)+1;
    myType = "Chick";
    mySound = "cheep";
  }
  public Chick(String type, String firstSound , String secondSound){
    randNum = (int)(Math.random()*2)+1;
  	myType = type;
    if(randNum == 1)
  	mySound = firstSound;
    else
  	mySound = secondSound;
  }
  public String getType(){
  	 return myType;
  }
  public String getSound(){
  	  return mySound;
  }
}
