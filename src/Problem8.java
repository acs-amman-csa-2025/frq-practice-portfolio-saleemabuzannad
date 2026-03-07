import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args)throws Exception {
        
        File scan = new File("data/Problem8.txt");
        Scanner in = new Scanner(scan); 

        ArrayList<Person> poeples= new ArrayList<Person>();
       while(in.hasNextLine()){
        String first = in.next();//all of this was asstited by Mr.Griswold
        String last = in.next();
        int age = in.nextInt();
        String occupation = in.next();
        Person p = (new Person(first , last , age , occupation));
        poeples.add(p);
        }
        
        for (Person p : poeples){
            System.out.println(p.getFirst() + " " + p.getLast());
        }

        int avg = 0;
        int count = 0;
        for (int i = 0; i < poeples.size(); i++){//4 loop 
           count = count + poeples.get(i).getAge();// makes the all the ages added 
        }
        avg = count/poeples.size();//avrage equals the count(all the poeple added) divided by the amount of poeple
        System.out.println("the avrage of all people is " + avg);


        System.out.println("the poeple younger than 25 are");
        for (int i = 0; i < poeples.size();i++){
            
            if (poeples.get(i).getAge() < 25){ //the if statments says if the age is less(younger than) 25 print it 
            System.out.println(poeples.get(i).getFirst() + " " + poeples.get(i).getAge());
            }
        }
        poeples.add(new Person( "Saleem" , "sigma", 17, "under wear tester")); // I made the new person 
        poeples.add(new Person( "eddy","gordo", 27 , "brazilian street fighter" ));

            for (int i = 0; i < poeples.size();i++){
                System.out.println(poeples.get(i).getFirst() + " " + poeples.get(i).getLast());
            }
        }

    }
