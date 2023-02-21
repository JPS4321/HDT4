public class StackFactory <T>{
    public IStack<T> getInstance(String type){

        IStack<T> StackInstance;
        switch (type.toLowerCase()){
            case "arraylist":{
                StackInstance = new StackUsingArrayList<>();
            }break;

            case "vector":{
                StackInstance = new StackVector<>();
            }break;

            default:{
                StackInstance = null;
            }break;
        }
        return StackInstance;
    }
}


