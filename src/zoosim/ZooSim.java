/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoosim;
/**
 *
 * @author Mukarram
 */
// Main class for simulating a zoo.
public class ZooSim {
    // Static variables to hold the total number of animals and an array of animal objects.
    public static int numAnimals;
    public static Animal[] animals;
    
    // Start point of the program.
    public static void main(String[] args) {
        // Initializes the animal array with space for 11 animals and sets the initial count to 0.
        ZooSim.animals = new Animal[11];
        ZooSim.numAnimals = 0;
        
        // Makes several WaterAnimal objects, each representing a different aquatic species.
        WaterAnimal a = new WaterAnimal("Bob", "Goldfish", 'M', 2, 27, "Glub Glub");
        animals[0] = a; // Adds the goldfish to the array of animals.
        WaterAnimal b = new WaterAnimal("Mike", "Dolphin", 'M', 2, 27, "Whistle Click");
        animals[1] = b; // Adds the dolphin.
        WaterAnimal c = new WaterAnimal("Sam", "Shark", 'M', 2, 27, "Crunch Crunch");
        animals[2] = c; // Adds the shark.
        
        // Makes several BirdAnimal objects, representing different bird species.
        BirdAnimal d = new BirdAnimal("Sandra", "Eagle", 'F', 2, 27, "Flap Flap");
        animals[3] = d; // Adds the eagle.
        BirdAnimal e = new BirdAnimal("Alex", "Butterly", 'F', 2, 27, "Whir Whir");
        animals[4] = e; // Adds the butterfly.
        BirdAnimal f = new BirdAnimal("Michelle", "Pigeon", 'F', 2, 27, "Coo Coo");
        animals[5] = f; // Adds the pigeon.
        BirdAnimal g = new BirdAnimal("Audrey", "Crow", 'F', 2, 27,"Caw Caw");
        animals[6] = g; // Adds the crow
        
        // Makes several LandAnimal objects, representing different land species.
        LandAnimal h = new LandAnimal("Leo", "Lion", 'M', 2, 27,"Roar Roar");
        animals[7] = h; // Adds the lion
        LandAnimal i = new LandAnimal("Kinzie", "Cat", 'F', 2, 27,"Meow Meow");
        animals[8] = i; // Adds the cat
        LandAnimal j = new LandAnimal("Ivan", "Gorilla", 'M', 2, 27,"Grunt Rumble");
        animals[9] = j; // Adds the Gorilla
        LandAnimal k = new LandAnimal("Bucky", "Elephant", 'M', 2, 27,"Trumpet Rumble");
        animals[10] = k; // Adds the Elephant
    }
     // Adds an animal to the zoo if there's space
    public void addAnimal(Animal animal){
        if (numAnimals<animals.length){
               animals[numAnimals++] = animal; // Adds the animal and increments the counter.
            System.out.println(animal.name + " added to the zoo.");
        } else {
            System.out.println("Zoo is full. Cannot add more animals.");
        }
        }
     // Feeds all hungry animals
     public void feedHungryAnimals() {
        for (int i = 0; i < numAnimals; i++) {
            animals[i].eat();
        }
    }
     // Makes all tired animals sleep
     public void makeTiredAnimalsSleep() {
        for (int i = 0; i < numAnimals; i++) {
            animals[i].sleep();
        }
    }
     // Initiates movement for all animals
     public void moveAnimals() {
        for (int i = 0; i < numAnimals; i++) {
            animals[i].move();
        }
    }
     // Displays statistics about all animals in the zoo
        public void displayZooStats() {
        System.out.println("Total animals in the zoo: " + numAnimals);
        for (int i = 0; i < numAnimals; i++) {
            Animal animal = animals[i];
            System.out.println(animal.name + " Position: " + animal.xPos + " , " + animal.yPos + ", Speed: " + animal.speed +
                               ", Direction: " + animal.degrees + ", Hungry: " + animal.hunger +
                               ", Tired: " + animal.fatigue);
        }
    }
    }

/**
 * How would you modify this structure to allow for predator/prey interactions and Carnivores/Omnivores/Herbivores?
 * For the Predator and Prey interactions I would set it so that certain animals are preys and others are predators for example Shark would be predator and Goldfish would be prey.
 * Then I would use the locations to see if they interact and if they do then the predator kills the prey and the prey gets eaten which also fills up the predators hunger.
 * For the Carnivores/Omnivores/Herbivores I would set it form before that certain animals are herbivores carnivores or omnivores and then that animal can only eat that food.
 * For example a Butterfly can only eat plants are flowers and other things, but will not try to eat other animals because it is a herbivore.  
 **/