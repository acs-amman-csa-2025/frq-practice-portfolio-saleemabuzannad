import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args)throws Exception {
        
        File scan = new File("data/Problem8.txt");
        Scanner in = new Scanner(scan); 

        ArrayList<Person> poeples= new ArrayList<Person>();
       while(in.hasNextLine()){
        String first = in.next();// I could understand this part so I used chat to help me figuer it out, Like I completly had no idea what to do 
        String last = in.next();
        int age = in.nextInt();
        String occupation = in.next();
        String fullName = first + " " + last;
        poeples.add(new Person(fullName, age, occupation));
        }
        for (int i = 0; i < poeples.size(); i++){
        System.out.print(poeples.get(i).getName() + " ");// I added an extra " " to for a space bitween each peice of info
        System.out.print(poeples.get(i).getAge() + " ");
        System.out.print(poeples.get(i).getOccupation()+ " " );
        System.out.println("");// I added this so that each person is not infront of the next 

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
            System.out.println(poeples.get(i).getAge());
            }
        }
        Person a = new Person( "Saleem" , 17, "under wear tester"); // I made the new person 
        Person b = new Person( "eddy gordo", 27 , "brazilian street fighter" );

        poeples.add(a);
        poeples.add(b);

    }
}