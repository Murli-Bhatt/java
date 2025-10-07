
//we have a bag that have limited weight capacity and we have to put item in to bag so we can haave maximum value,fraction is allowed here 
import java.util.*;

class Item {
    int value;
    int weight;
    public Item(){

    }

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;

    }
}

public class Knapsnack {
    public static int getMaxValue(int capacity, Item[] items) {
        int totalVal = 0;

        // getting value /weight
        double[] ratio = new double[items.length];
        Integer[] order = new Integer[items.length];
        for (int i = 0; i < items.length; i++) {

            ratio[i] = (double) items[i].value / items[i].weight; // value/weight
            order[i] = i;
        }
        // sorting ratio array in decending order
        Arrays.sort(order, (a, b) -> Double.compare(ratio[b], ratio[a]));
        
        //grredily pick item
   
        for(int i =0;i<ratio.length;i++){
            Item itm = items[order[i]];
            if(itm.weight<= capacity){
                totalVal += itm.value;
                capacity -=itm.weight;
            }
            else{
                totalVal +=ratio[order[i]]*capacity;
                capacity=0;
            }
            
        }


        return totalVal;
    }

    public static void main(String[] args) {

        Item[] items = {
                new Item(2, 10),
                new Item(3, 5),
                new Item(5, 15),
                new Item(7, 7),
                new Item(1, 6),
                new Item(4, 18),
                new Item(1, 3)
        };
        int capacity = 15;
        System.out.println(getMaxValue(capacity, items));
    }
}
