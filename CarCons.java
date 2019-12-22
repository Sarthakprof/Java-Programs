public class CarCons{

    public String color;
    public String type;

    CarCons(String c, String t){
        color = c;
        type = t;
    }

    public void start(){
        System.out.println("Get Started");
    }

    public String printDesc(){
       String desc = "The color of my Car is " + color + " and the type of my Car is " + type;
        return desc;
    }

    public static void main(String arg[]) {
        CarCons car = new CarCons("Blue", "Lamberghine Gallerado");
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