// lab task 03//
// Name: Sana Azeem
// Roll no: SE231078
// task to create a class without any constructor

public class CellPhone {
    String name;
    String processor;
    String memory;
    String os;

    String model;
    // method behaviour
    public void  display(){
        System.out.println("Display information :"+name);
        System.out.println("name of device :"+processor);
        System.out.println("processor :"+memory);
        System.out.println("what is the os of device :"+os);

    }
    public void reboot(){
        System.out.println("reboot");

   }

    //object creating
    public static void main(String[] args){
        CellPhone cell = new CellPhone();
    cell.memory="256GB";
        cell.os="ANDRIOD";
       cell.processor="FAST";
      cell.name="iphone";

       System.out.println(cell.name);
      System.out.println(cell.memory);
      System.out.println(cell.processor);
       System.out.println(cell.os);


        cell.display();
      cell.reboot();
    }



}

