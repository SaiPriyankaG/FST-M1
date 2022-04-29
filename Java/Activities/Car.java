package activities;

public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;
     Car()
    {
        tyres=4;doors=4;
    }
    void displayCharacteristics(){
         System.out.println("color of the car" + color);
         System.out.println("transmission of the car" + transmission);
         System.out.println("make of the car" + make);
         System.out.println("no of tyres of the car" + tyres);
         System.out.println("no of doors of the car" + doors);
    }
    void accelerate(){
         System.out.println("Car is moving forward");
    }
    void brake(){
         System.out.println("Car is stopped");
    }


}
