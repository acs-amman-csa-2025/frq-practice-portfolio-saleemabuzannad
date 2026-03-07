import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class problem9 {
    
    public static void main(String[] args)throws Exception {
        File scan = new File("data/Problem9.txt");
        Scanner in = new Scanner(scan); 

        ArrayList<Cat> a = new ArrayList<Cat>();

     
    while(in.hasNextLine()){
        String line = in.nextLine();
        String[] parts = line.split(",");
        double weight = Double.parseDouble(parts[1]);
        int age = Integer.parseInt(parts[2]);
        double cost = Double.parseDouble(parts[3]);
        Cat bCat = new Cat(parts[0], weight, age ,cost);
        a.add(bCat);
        }
            
        for (Cat c : a) {
            System.out.println(c.getName() + " " + c.getWeight() + " " + c.getAge() + " " + c.getCost());
        }

        for (int i = 0 ; i < a.size(); i++){
            if (i == 2){
        
            System.out.println("The thirds cat name is " + a.get(i).getName());
            }
    }

        Cat lastCat = a.get(a.size() - 1);
        lastCat.setWeight(lastCat.getWeight() + 5);
        System.out.println(lastCat.getWeight());


        a.remove(4);
        for (Cat f: a){
            System.out.println(f.getName() + " " + f.getWeight() + " " + f.getAge() + " " + f.getCost());
        }
        //Angel, 3.6, 12, 25.990
        a.add(1,new Cat("angel", 3.6 , 12, 25.990));
        System.out.println(" ");
   
     a.add(new Cat("Gimpy", 8.3 , 120, 24.990)); //Gimpy, 8.3, 120,  24.990)
     System.out.println( );

      for (Cat b: a){
        System.out.println(b.getName() + " " + b.getWeight() + " " + b.getAge() + " " + b.getCost());
    }
    //Replace the 3rd cat with (Sugar, 11.6, 84, 33.25). Put the removed cat at the end of the list.


    a.set(2, new Cat("Sugar", 11.6, 84, 33.25));

    Cat holder = a.get(1);
    a.set(1, a.get(3));
    a.set(3, holder);   //for this the idea was that I would do the switcharoo thing they taught us in Csp 

        for (int i = a.size() - 1; i >= 0; i--) {
            if (a.get(i).getCost() < 40) {
            a.remove(i);
        }
    }
        System.out.println();
        for (Cat c : a) {
            System.out.println(c.getCost());
        }
        System.out.println();
        for (Cat c : a) {
            if (c.getWeight() > 8) {
            System.out.println(c.getName());//since we removed MR.samson no one prints 
            }
        }
    }
}   
