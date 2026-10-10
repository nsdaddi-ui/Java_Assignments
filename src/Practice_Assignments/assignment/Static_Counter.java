package assignment;

public class Static_Counter {
    static int count =0;

    Static_Counter(){
        count ++;
    }

    static void main (String[] args){
        Static_Counter obj1 = new Static_Counter();
        Static_Counter obj2 = new Static_Counter();
        Static_Counter obj3 = new Static_Counter();
        System.out.println(count);
    }
    }

