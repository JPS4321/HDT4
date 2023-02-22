import java.util.Vector;
//Juan Pablo Solis
//22102
//Hoja de Trabajo 4

public class StackVector<T> implements IStack<T> {

    private Vector<T> VectorInterno;

    public  StackVector(){VectorInterno = new Vector<T>();}

    @Override
    public int count() {
        return VectorInterno.size();
    }

    @Override
    public boolean isEmpty() {
        return VectorInterno.isEmpty();
    }

    @Override
    public void push(T value) {VectorInterno.add(0,value);}

    @Override
    public T pull() {
        return VectorInterno.remove(0);
    }

    @Override
    public T peek() {
        return VectorInterno.get(0);
    }
}
