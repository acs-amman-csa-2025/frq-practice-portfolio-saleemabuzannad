public class Animal {
    private String name;
    private String zoo;
    private String sound;
    private String species;
// instance variables 

  public Animal(String _name , String _zoo , String _sound , String _species){ // constructer, that has each thing about the animal that I chose

        name = _name;// Initializing the features 
        zoo = _zoo;
        sound = _sound;
        species = _species;
  }
 public String getName () {//the getter for name 
  return name;
 }
 public String getSpecies(){//getter for Species 
  return species;
 }
 public void setZoo(String _zoo){//setter for the zoo so that I can change it in the constructer in the problem7 class 
    zoo = _zoo;
 }
  public String getzoo(){// getter for the zoo 
  return zoo;
 }

 public String getSound(){ // getter for the sound 
   return sound;
 }
}