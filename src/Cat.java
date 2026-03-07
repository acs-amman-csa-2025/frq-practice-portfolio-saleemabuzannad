public class Cat {
    private String name;
    private double Weight;
    private int age;
    private double cost; 

    public Cat() {//ths is the default constructer 
        name = "talking tom";
        Weight = 6.7;
        age = 41;
        cost = 300.234;
    }

    public Cat(String _name, double _Weight, int _age, double _cost){
        name = _name;
        Weight = _Weight;
        age = _age;
        cost = _cost;


    }

     public String getName() {
        return name;
    }

    public void setName(String _name) {
        name = _name;
    }


    public double getWeight() {
        return Weight;
    }

    public void setWeight(double _Weight) {
        Weight = _Weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int _age) {
        age = _age;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double _cost) {
        cost = _cost;
    }
}
    

