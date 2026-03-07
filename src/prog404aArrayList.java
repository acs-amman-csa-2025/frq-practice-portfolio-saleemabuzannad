public class prog404aArrayList {
    public static void main(String[] args) throws Exception {

        File f = new File("data/prog404a.txt");
        Scanner in = new Scanner(f);
        //contrusctor for making an arralist of integers
        ArrayList<Integer> positives = new ArrayList<Integer>();
        ArrayList<Integer> negatives = new ArrayList<Integer>();
        while(in.hasNextInt()){
            int next = in.nextInt();
            if (next > 0){
                positives.add(next);
                //add the next element to the end of positives list
            }
            else{
                negatives.add(next);
                //add the next element to the end of negatives list
            }

        }
        for (int i = 0; i < positives.size(); i++) {
            System.out.println(positives.get(i));
            //prints out positives
        }

    }
}