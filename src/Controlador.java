import javax.sound.midi.MidiSystem;
import java.time.temporal.Temporal;
import java.util.*;
public class Controlador {
    Scanner sc = new Scanner(System.in);
    StackHandmade<String> Mystack = new StackHandmade<String>();
    ArrayList<String> ArrayCopia= new ArrayList<String>();
    ArrayList<Integer> Operaciones= new ArrayList<Integer>();
    ArrayList<String> temporal = new ArrayList<String>();
    int Resultados = 0;
    String Datos = "";
    String Palabra;
    String Guardado;
    IList<String> MiLista;
    IStack<String> MiStack;
    String[] arr;

    public void Inciar(){
        Obtenciondatos();
        calculador();

    }

    public void calculador(){
        Calculator calc = new Calculator();
        ArrayCopia = temporal;

        for(int i = ArrayCopia.size()-1; i >= 0 ;i--){
            Mystack.push(ArrayCopia.get(i));
        }
        try {
            for(int i = 0; i<= Mystack.count;i++){
                Operaciones.add(Integer.valueOf(Mystack.pull()));
            }
        }
        catch (Exception e){
        }

        int a = Operaciones.get(Operaciones.size()-1);
        int b = Operaciones.get(Operaciones.size()-2);
        Operaciones.remove(Operaciones.size()-1);
        Operaciones.remove(Operaciones.size()-1);
        Mates(a,b,calc);

        for(int i = Operaciones.size()-1; i >= 0; i--){
            Mates(Resultados,Operaciones.get(i),calc);
        }
        System.out.println("El resultado es: " + Resultados);

    }








    public void Obtenciondatos() {
        System.out.println("Escriba el nombre de la opcion que desea: ArrayList, Vector, Lists");
        Palabra = sc.next();
        Palabra = Palabra.toLowerCase();
        Guardado = Palabra;

        if (Palabra.equals("lists")) {
            System.out.println("Elija el tipo de lista que desea: Single o Double");
            Palabra = sc.next();
            Palabra = Palabra.toLowerCase();
            MiLista = (new ListFactory<String>().getInstance(Palabra));
        }
        if (Palabra.equals("arraylist") || Palabra.equals("vector")) {
            MiStack = (new StackFactory<String>().getInstance(Palabra));
        }

        Reader reade = new Reader();
        Datos = Reader.read();
        arr = Datos.split("");


        if (Guardado.equals("arraylist") || Guardado.equals("vector")) {
            MatesStack();
        }
        if (Guardado.equals("lists")) {
            MateLista();
        }
    }

    public void MatesStack(){
        for(int i = 0;i <= arr.length-1;i++){
            if((arr[i].equals("1")) || (arr[i].equals("2")) ||(arr[i].equals("3")) ||(arr[i].equals("5")) ||(arr[i].equals("6")) ||(arr[i].equals("7")) || (arr[i].equals("8")) ||(arr[i].equals("9")) ||(arr[i].equals("0") ||(arr[i].equals("4"))))
            {
                temporal.add(arr[i]);
            }
            else if((arr[i].equals("+")) || (arr[i].equals("-")) || (arr[i].equals("*")) ||(arr[i].equals("/"))){
                MiStack.push(arr[i]);
            }
            else if((arr[i].equals("("))){
                MiStack.push(arr[i]);
            }
            else if((arr[i].equals("^"))){
                MiStack.push(arr[i]);
            }
            else if((arr[i].equals(")"))){
                while (!MiStack.peek().equals("(")){
                    temporal.add(MiStack.pull());
                }
                MiStack.pull();
            }
        }
        while (!MiStack.isEmpty()){
            temporal.add(MiStack.pull());
        }
    }

    public void MateLista(){
        for(int i = 0;i <= arr.length-1;i++){
            if((arr[i].equals("1")) || (arr[i].equals("2")) ||(arr[i].equals("3")) ||(arr[i].equals("5")) ||(arr[i].equals("6")) ||(arr[i].equals("7")) || (arr[i].equals("8")) ||(arr[i].equals("9")) ||(arr[i].equals("0") ||(arr[i].equals("4"))))
            {
                temporal.add(arr[i]);
            }
            else if((arr[i].equals("+")) || (arr[i].equals("-")) || (arr[i].equals("*")) ||(arr[i].equals("/"))){
                MiLista.InsertAtStart(arr[i]);
            }
            else if((arr[i].equals("("))){
                MiLista.InsertAtStart(arr[i]);

            }
            else if((arr[i].equals("^"))){
                MiLista.InsertAtStart(arr[i]);
            }
            else if((arr[i].equals(")"))){
                while (!MiLista.Get(0).equals("(")){
                    temporal.add(MiLista.Get(0));
                }
                MiLista.Get(0);
            }
        }
        while (!MiLista.IsEmpty()){
            temporal.add(MiLista.Get(0));
            MiLista.DeleteAtStart();
        }
    }
    public void Mates(int a,int b,Calculator calc){
        String Variable = Mystack.pull();
        if(Variable.equals("+")){
            Resultados = calc.suma(a,b);

        }
        if(Variable.equals("-")){
            Resultados = calc.resta(a,b);

        }
        if(Variable.equals("*")){
            Resultados = calc.multiplicacion(a,b);

        }
        if(Variable.equals("/")){
            Resultados = calc.division(a,b);
        }
    }


}
