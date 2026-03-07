public class Person {
    private String first;
    private String last;
    private int age;
    private String occupation;

    public Person(String _first, String _last , int _age, String _occupation ){
        first = _first;
        last = _last;
        age = _age;
        occupation = _occupation;


    }

    public void setfirst(String _first) {
        first = _first;
    }

    
    public void setLast(String _last){

    last = _last;

    }
    

    public void setAge(int _age) {
        age = _age;
    }

    public void setOccupation(String _occupation) {
        occupation = _occupation;
    }

    public int getAge() {
        return age;
    }
    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }


    public String getOccupation() {
        return occupation;
    }

}
