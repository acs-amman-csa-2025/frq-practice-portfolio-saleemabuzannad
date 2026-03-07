import java.util.*;
import java.io.*;
public class Program260h {
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
        double sum10 = 0; 
        double sum11 = 0;
        double sum12 = 0;
        for(int i = 0; i < grade.size();i++){
            if(classes.get(i) == 10){
                count10++;
                sum10 += grade.get(i);
            }
            if(classes.get(i) == 11){
                count11++;
                sum11 += grade.get(i);
            }
            if(classes.get(i)== 12){
                count12++;
                sum12 += grade.get(i);
            }
        }
       
        System.out.println("grade 10 has an avrage GPA of " + sum10/count10);
        System.out.println("grade 11 has an avrage GPA of " + sum11/count11);
        System.out.println("grade 12 has an avrage GPA of " + sum12/count12);
        


    }

}