import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void test1(){
        IList<String> MiLista = new DoubleLinkedList<>();
        assertEquals(true,MiLista.IsEmpty());

    }
    @Test
    public void test2(){
        IList<String> MiLista = new SingleLinkedList<>();
        assertEquals(true,MiLista.IsEmpty());
    }
    @Test
    public void test3(){
        IStack<String> MiStack = new StackVector<>();
        assertEquals(true,MiStack.isEmpty());

    }
    @Test
    public void test4(){
        IStack<String> MiStack = new StackUsingArrayList<>();
        assertEquals(true,MiStack.isEmpty());

    }
}