import java.util.ArrayList;
public class problem7 {
    public static void main(String[] args) {
        
       Animal horse = new Animal("Horse","saleemNationalZoo", // this is using the constructer to create a new animal that has 4 objects and i did this 3 times 
       "heaeaeeae","arabian horse" );

       Animal hippo = new Animal("hippo","saleemNationalZoo",
       "khaaaaashhhh","African hippo" );
       
       Animal owl = new Animal("owl","saleemNationalZoo",
       "woooooowoooo","Night owl" );


        ArrayList<Animal> fanimal = new ArrayList<Animal>();// here I made the Arrat list fanimal and I added each animal to the list 
        fanimal.add(0,horse);//added the horse to indcie 0 
        fanimal.add(1,hippo);//added the horse to indcie 1
        fanimal.add(2,owl); //added the horse to indcie 2 

       
        for (Animal a : fanimal) {// for each loop that prints all animals and there spieces I used this instead of a for loop to skip the indcie issue and I also thought it would be esier
            System.out.println(a.getName() + " is a " + a.getSpecies()); 
        }
          
        fanimal.get(0).setZoo("san francisco");//I made a getter and a setter to be able to get the index and change the zoo 
        System.out.println(fanimal.get(0).getzoo());//used the get feature again here 


        int randomNum = (int)(Math.random() * fanimal.size());// I made the random 1-4 because thats the amount of objects there are and I saved it into randomnum
        System.out.println(fanimal.get(randomNum).getName()+ " is a " + //the way I used the random was the same as the GET but instead of putting and index I put randomnum and saved it and used it 4 times 
        fanimal.get(randomNum).getSpecies() + " that lives in " + fanimal.get(randomNum).getzoo() +
        " and says " + fanimal.get(randomNum).getSound());
        
    }
}

