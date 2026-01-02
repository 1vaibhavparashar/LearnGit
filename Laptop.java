import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//used for custom sorting

public class Laptop implements Comparator<Laptop> {

    //states
    int price;
    int review;
    String brand;
    int rank;//rank is a useless state as being stored in int 5 > 1

    //behaviour
    void show(){
        System.out.println(rank + " "+ brand + " "+price);
    }
    @Override
        public int compare(Laptop o1, Laptop o2) {
            double val1 = 0.9*o1.rank + 0.1*o1.price + 0.1*o1.review;
            double val2 = 0.9*o2.rank + 0.1*o2.price + 0.1*o2.review;

            if(val1 < val2){
                return -1; // no swap

            }else{
                return 1; //swap
            }
        }

    //constructor
    Laptop(){

    }
    Laptop(int rank, int review,int price, String brand){
        this.rank = rank;
        this.price = price;
        this.review = review;
        this.brand = brand;
    }
    
    
        public static void main(String args[]){
            ArrayList<Laptop> a = new ArrayList<>();
            Laptop l1 = new Laptop(1, 5, 1000, "mango");
            Laptop l2 = new Laptop(2, 5, 1000, "orange");
            Laptop l3 = new Laptop(3, 5, 1000, "guava");
            Laptop l4 = new Laptop(4, 5, 1000, "grape");

            a.add(l2);
            a.add(l1);
            a.add(l4);
            a.add(l3);

            Collections.sort(a,new Laptop());
            for(int i = 0; i < a.size(); i++){
                a.get(i).show();
            }
        }
        
    
}
