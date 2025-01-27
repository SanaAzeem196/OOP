// lab task 03//
// Name: Sana Azeem
// Roll no: SE231078
// task to create a class with a non-parameterized and a parameterized constructor

public class CELLPHONE2 {
   //declaring instance variables
      String name;
      String processor;
      String memory;
        String os;

        // creating a parameterized constructor for  initializing
        CELLPHONE2(String n,String p, String m, String o) {
            name = n;
            processor = p;
            memory = m;
            os = o;
        }

    // creating a non-parameterized constructor for  initializing
    CELLPHONE2() {
        name = "Samsung Galaxy NOte 8";
        processor = "Octa-core";
        memory = "64 GB built-in, 6GB RAM";
        os = "Android v7.1.1 Nougat";
    }
    void display() {
        System.out.println("*****Display information of phone***** :");
        System.out.println("Name of device :" + name);
        System.out.println("Processor of device :" + processor);
        System.out.println("Memory :" + memory);
        System.out.println("OS :" + os);
        System.out.println();
    }

    public static void main(String[] args) {
        //creating an object by calling non-parameterized constructor
        CELLPHONE2 myObj1 = new CELLPHONE2();
        //creating an object by calling non-parameterized constructor
        CELLPHONE2 myObj2 = new CELLPHONE2("Nokia 6", "Octa-core", "64GB", "Andriod v7.1.1");
        myObj1.display();
        myObj2.display();
    }
    }


