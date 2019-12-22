public class Car{

    public String color;
    public String type;

    public void start(){
        System.out.println("Get Started");
    }

    public String printDesc(){
       String desc = "The color of my Car is " + color + " and the type of my Car is " + type;
        return desc;
    }

    public static void main(String arg[]) {
        Car car = new Car();
        car.color = "Blue";
        car.type = "Lambhorghini Gallerado";
        car.start();
        String carDesc = car.printDesc();
        System.out.println(carDesc);    
     }
}

//Expected Output: 
/*
Get Started
The color of my Car is Blue and the type of my Car is Lambhorghini Gallerado
*/