// lab task 03//
// Name: Sana Azeem
// Roll no: SE231078
// task to create a class with a non-parameterized constructor


public class CELLPHONE1 {
    //declaring instance variables
    String name;
    String processor;
    String memory;
    String os;

    // creating a non-parameterized constructor
    CELLPHONE1() {
        name = "Samsung Galaxy NOte 8";
        processor = "Octa-core";
        memory = "64 GB built-in, 6GB RAM";
        os = "Android v7.1.1 Nougat";
    }

    //declaring and defining member functions
    void display() {
        System.out.println("*****Display information of phone***** :");
        System.out.println("Name of device :" + name);
        System.out.println("Processor of device :" + processor);
        System.out.println("Memory :" + memory);
        System.out.println("OS :" + os);
    }

    public static void main(String[] args) {
        CELLPHONE1 myObj = new CELLPHONE1();
        //calling non-parameterized constructor
        myObj.display();
    }
}