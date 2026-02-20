import java.util.*;
import java.io.*;
import java.util.random.*;

public class problem6 {
    public static void main(String[] args) {
        int saver = 0;
        ArrayList<Integer> digits = new ArrayList<Integer>();// I made and array list and called it digits
        ArrayList<Integer> boom = new ArrayList<Integer>();
        ArrayList<Integer> hhh = new ArrayList<Integer>(); // the reason I did this is to keep everything organized because I needed to do step 4 before 5 this fixes the issue becuase (BOOM) stayes uneditded
        for (int i = 0; i < 19; i++) {// a loop that will make the randomizer go 19 times
            saver = (int) (Math.random() * 71) + 20;// the loop will go from 20-90,(90-20)=71 thats why starting number
                                                    // is 20
            digits.add(saver);// now my numbers that were randomly generated will go into the arraylist
            boom.add(saver);// the reason I did this is to keep everything organized because I needed to do
            hhh.add(saver);            // step 4 before 5 this fixes the issue becuase (BOOM) stayes uneditded
        }
        // STEP (1-2) completed
        System.out.println(digits);// prints the arraylist
        for (int bruh : digits) {
            System.out.println(bruh);// this print the digits but it does it verticly unlike arraylists
            // STEP (3) Complete
        }

        while (digits.size() > 1) {// while the digit size is greater than one keep ittrating
            digits.remove(digits.size() - 1);// removes the last index
            digits.remove(0);// will always remove the first and wont change becuase we will always have a 0
                             // indext and when we get the desired number it will stop because digitsize > 1;
        }
        System.out.println("The number in the middle of the list is " + digits);
        // step 4 complete we now have the middle of the array

        int avg = 0;
        avg = boom.get(0) + boom.get(18) + digits.get(0);
        System.out.println("the average of the first, last and center numbers is " + avg / 3);
        // Step 5 Complete

        int max = boom.get(0);//the reason I did it like this is so that if the list has negativs even tho it won it would still work 
        int min = boom.get(0);

        for (int i = 0; i < boom.size(); i++) {//simple 4 loop 
            int current = boom.get(i);//keep a current num
            if (current > max) {// compares the numbers to see wich one is greater and replaces if that the case
                max = current;
                
            }

            if (current < min) {// same compairson but to wich one is smaller 
                min = current;
            }
            
        }
        System.out.println("the largest number in the list is " + max + " and the smallest is " + min );
        //step 6 complete 
        
       
        int maxIndex = boom.indexOf(max);//I forgot you could do this it took me a while to get the indeicies 
        int minIndex = boom.indexOf(min);

        boom.set(maxIndex, min);//set min in the index of max
        boom.set(minIndex, max);//set max in the index of min
        System.out.println(boom + "min and max swapped");
        //Step 7 complete 
        int b = 0;
        b = (int) (Math.random() * 10) + 1;//random number from 1-10

        boom.add(10,b);//I litterly just took the random number and put it in the middle 
        System.out.println(boom + "random number from 1 to 10 and insert it in the center slot");
        //Step 8 complete 
        for (int m = 0; m < 40; m++){//I made this loop basicly add ten after every number 
            boom.add(m,10);
            m++;

        }
            System.out.println(boom);
            //step 9 complete 
            int sn = 0; //this is where i save the number so that I can print it agian 
            sn = hhh.get(2); // I get index 2 and save it so that I can use it 
            hhh.set(2,5);// I switch the 3rd postion wich is at index 2 for the number 5 
            System.out.println(hhh + " switched the number " + sn + " for the number 5 " );
            // Step 10 complete 
            for (int s = 0; s < hhh.size();s++){//I made a for loop for this 
            if (hhh.get(s) >= 50 && hhh.get(s) <= 59){// checks if it greater than 50 and less than 59
                System.out.println("number in thier 50's are " + hhh.get(s));
                //step 11 complete 
                
            }
            }

            for (int r : hhh) {// for each loop that goes threw the whole list 
                if (r % 4 == 0) { // checks what is a multiple of 4 
                System.out.println(r + "all numbers that are multiples of 4");
                }
            }

        

            
        }

    }


