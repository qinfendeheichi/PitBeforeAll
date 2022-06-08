package pkg;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class PersonTest {

    @BeforeAll
    public static void doBeforeAll(){

        //this method would fail when math mutator injected
        System.out.println("BeforeAll enter");
        Person p = new Person();
        int result = p.computeAge();
        //no mutation: result=8, with mutation: result = 2
        if(result==2){
            fail();
        }
        System.out.println("BeforeAll exit");
    }

    @Test
    public void test1() {
        //do nothing
        System.out.println("test1 enter");
        assertTrue(true);
        System.out.println("test1 exit");
    }

}
