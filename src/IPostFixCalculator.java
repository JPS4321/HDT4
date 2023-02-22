import java.util.Stack;
//Juan Pablo Solis
//22102
//Hoja de Trabajo 4
//Obtenid de hoja de trabajo 2
public interface IPostFixCalculator{

    boolean isOneItem(IStack  operandos);

    int suma(int a, int b);

    int resta(int a, int b);

    int multiplicacion(int a, int b);

    int division(int a, int b);

    boolean isOperator(String item);

    java.util.ArrayList<String> getItems(String _expresion);
}
