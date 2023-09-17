public class Car{
    public void fullThrottle(){
        System.out.println("Full Throttle Method");
    }
    public void Speed(){
        System.out.println("Car  Method");
    }
    public static void main(String[]args){
      Car myCar=new Car();
      myCar.fullThrottle();
      myCar.Speed();

    }
}