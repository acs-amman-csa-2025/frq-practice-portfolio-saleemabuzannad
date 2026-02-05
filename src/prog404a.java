import java.util.*;
import java.io.*;

public class prog404a {
    public static void main(String[] args) throws Exception{
        File dta = new File("data/prog.txt");
        Scanner scan = new Scanner(dta);
        String firstLine = scan.nextLine();
        System.out.println(firstLine);
        int Pos = 0;
        int Neg = 0;
        while(scan.hasNextInt()){
            int num = scan.nextInt();

            if(num > 0){
                Pos++;
            }
            else if(num < 0){
                Neg++;

            
            }
        }
        int[] posative = new int[Pos];
        int[] negative = new int[Neg];
        

        }
        
    }

    