public class Farm 
{     
   private Animal[] farmAnimal = new Animal[3];
   public Farm(){
   	farmAnimal[0] = new Pig("Pig","oink");
   	farmAnimal[1] = new NamedCow("Cow", "moo" , "John");
   	farmAnimal[2] = new Chick("Chick", "cluck","cheep");
   }
   public void animalSound(){
   		for(int i = 0; i < farmAnimal.length ; i++){
   			System.out.println(farmAnimal[i].getType() + " goes " + farmAnimal[i].getSound());
   		}
   		System.out.println(farmAnimal[1].getType()+ " named " + ((NamedCow)farmAnimal[1]).getName() + " goes " + farmAnimal[1].getSound());
   }
}
