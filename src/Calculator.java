import java.net.CacheRequest;
import java.util.ArrayList;

public class Calculator implements IPostFixCalculator {

    private ArrayList<Integer> Operaciones = new ArrayList<Integer>();
    StackHandmade<String> Mystack = new StackHandmade<String>();
    int Resultados = 0;
    String Datos = "";
    String[] spliting;
     private static boolean flag = false;
     private static Calculator Uni_calc;

    /**
     * @param
     * @param
     * @return
     */

    private Calculator(){
        flag = true;
    }

    public static Calculator getInstance(){
        if(flag){
            return  Uni_calc;
        } else {
            Uni_calc = new Calculator();
            return Uni_calc;
        }
    }





    @Override
    public  boolean isOneItem(IStack operandos) {
        if (operandos.count()==1) {
            return  true;
        }
        return false;
    }

    @Override
    public int suma(int a, int b) {
        int resultado;
        resultado = a+b;
        return resultado;
    }

    @Override
    public int resta(int a, int b) {
        int resultado;
        resultado= a-b;
        return resultado;
    }

    @Override
    public int multiplicacion(int a, int b) {
        int resultado;
        resultado = a*b;
        return resultado;
    }

    @Override
    public int division(int a, int b) {
        int resultado;
        resultado = a/b;
        return resultado;
    }

    @Override
    public boolean isOperator(String item) {
        if (item.equals("*")||item.equals("+")||item.equals("-")||item.equals("/")){
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<String> getItems(String _expresion) {
        ArrayList<String> Items = new ArrayList<String>();
        String[] ItemsDivididos = _expresion.split(" ");
        for (int i = 0;i<ItemsDivididos.length;i++){
            Items.add(ItemsDivididos[i]);
        }
        return Items;
    }

}
