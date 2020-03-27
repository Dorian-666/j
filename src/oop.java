import java.util.ArrayList;

public class oop {
    String name;
    String surname;
    int age;

    public void DynamicArray(){
       oop item = new oop();
        ArrayList<oop> myLibrary = new ArrayList<oop>();
        myLibrary.add(item);



        for(int i=0;i < myLibrary.size();i++) {
            System.out.println(myLibrary.get(i));
        }
    }


}

