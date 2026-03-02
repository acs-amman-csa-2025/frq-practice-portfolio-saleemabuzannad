public class Person {
    private String name;
    private int age;
    private String occupation;

    public Person(String _name , int _age, String _occupation ){
        name = _name;
        age = _age;
        occupation = _occupation;

    }
    public void setName(String _name){
        name = _name;
    }

    public void setAge(int _age){
        age = _age;
    }

    public void setOccupation(String _occupation){
        occupation = _occupation;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    public String getOccupation(){
        return occupation;
    }

   
}

