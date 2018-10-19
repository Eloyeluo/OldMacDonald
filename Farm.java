public class Farm 
{     
   private Animal[] farmAnimal = new Animal[3];
   public Farm(){
   	farmAnimal[0] = new Pig();
   	farmAnimal[1] = new NamedCow("cow", "moo" , "John");
   	farmAnimal[2] = new Chick();
   }
   public void animalSound(){
   		for(int i = 0; i < farmAnimal.length ; i++){
   			System.out.println(farmAnimal[i].getType() + " goes " + farmAnimal[i].getSound());
   		}
   		System.out.println(farmAnimal[1].getType()+ " named " + farmAnimal[1].getName() + " goes " + farmAnimal[1].getSound());
   }
}
