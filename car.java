public class car {
        // static fields
        static int topSpeed = 100;
        static int maxCapacity = 4;  
    }
    
    class Demo {
        public static void main(String args[]){
        // Static fields are accessible in the main
        System.out.println(car.topSpeed);
        System.out.println(car.maxCapacity);   
      }
    }
    

