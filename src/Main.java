import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("ok");
        ArrayList<Integer> array = new ArrayList<Integer>();
        Integer []a= {1,2,3,4,5};
        for(int i=0;i<a.length;i++){
            array.add(a[i]);
        }
        for (Integer arr : array){
            System.out.println(arr);
        }
    }
}