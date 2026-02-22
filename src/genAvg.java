import java.util.random.*;

public class genAvg {
    public static void main(String[] args) {
        int[] nums = new int[50];//the list that the ints are gonna go in 
        int sum = 0;//the sum is each number added to make things easier when it comes to dividing 

        for (int i = 0; i < nums.length; i++) {//the loop goes 50 times as it is the length of the list 
            nums[i] = (int)(Math.random() * 67) + 1;//the ints are random from 1-67 
            sum += nums[i];//this adds each random int to the index of the list 
            System.out.println(nums[i]);//you dont have to do this but I wanted to see the numbers so I printed each of them out 
        }

        double average = sum / 50;//then we just divid the sum by 50 because thats the amount of ints we have 
        System.out.println("theeeee averaaaaaageeee iiiiiisssssss!!!!" + average);//prints out the avrage of all 50 nums 
        
    }
}

