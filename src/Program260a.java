import java.util.*;
import java.io.*;
public class Program260a {
     public static void main(String[] args) throws Exception {

        File scan = new File("data/Program260a.txt");
        Scanner in = new Scanner(scan);
        ArrayList<Integer> classes = new ArrayList<Integer>();
        ArrayList<Integer> grade = new ArrayList<Integer>();
        ArrayList<Integer> gender = new ArrayList<Integer>();
        
        while (in.hasNextInt()){
            classes.add(in.nextInt());
            grade.add(in.nextInt());
            gender.add(in.nextInt());
        }

        int count10 = 0; 
        int count11 = 0;
        int count12 = 0;
        for(int c : classes){
            if(c == 10){
                count10++;
            }
            if(c == 11){
                count11++;
            }
            if(c == 12){
                count12++;
            }
        }


        
System.out.println("grade 10 has " + count10 + " students");
System.out.println("grade 11 has " + count11 + " studants");
System.out.println("grade 12 has " + count12 + " studants");


    }

}