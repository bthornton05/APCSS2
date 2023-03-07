import java.util.ArrayList;

/*
 * Activity 4.9.2
 */

public class ZooKeeperRunner
{
  public static void hearTheAnimal(Animal a){
    a.speak();
  }
  public static void main(String[] args)
  { 
       Animal deer = new Deer("beans", true, 20);
       Animal feline = new Feline("beans", true, 20);
       Animal giraffe = new Giraffe("beans", true, 20);
       Animal gorilla = new Gorilla("beans", true, 20);
       Animal hippo = new Hippo("beans", true, 20);
       Animal monkey = new Monkey("beans", true, 20);
       ArrayList<Animal> animals = new ArrayList<Animal>();
       animals.add(deer);
       animals.add(feline);
       animals.add(giraffe);
       animals.add(gorilla);
       animals.add(hippo);
       animals.add(monkey);

       //for(Animal a : animals){
        //a.speak();
       //}
       /*hearTheAnimal(deer);
       hearTheAnimal(feline);
       hearTheAnimal(giraffe);
       hearTheAnimal(gorilla);
       hearTheAnimal(hippo);
       hearTheAnimal(monkey);*/
       Object elephant = new Elephant("leaves, grasses, roots", false, 60.0);
       //((Elephant) elephant).trumpet(); Elephant is animal, does not have access to Elephant class methods, casting as elephant class works
       System.out.println(elephant.toString());

  }
}