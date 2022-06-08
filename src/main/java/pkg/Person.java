package pkg;

public class Person {
    public int computeAge(){
        int age = 4;
        //math mutator mutates * to /, thus return value would become 2 instead of 8
        age = age*2;
        return age;
    }

}
