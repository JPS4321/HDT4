public class ListFactory <T>{
    public IList<T> getInstance(String type){

        IList<T> listInstance;
        switch (type.toLowerCase()){
            case "single":{
                listInstance = new SingleLinkedList<T>();
            }break;

            case "double":{
                listInstance = new DoubleLinkedList<T>();
            }break;

            default:{
                listInstance = null;
            }break;
        }
        return listInstance;
    }
}
