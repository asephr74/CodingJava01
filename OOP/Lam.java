public class Lam{

    // stores the value for light
    // true if light is on
    // false if light is off
    boolean isOn;

    // method to turn on the light
    void turnOn() {
        isOn = true;
        System.out.println("Light on? " + isOn);

    }

    public static void main(String[] args) {

        // create an object of Lamp
        Lam led = new Lam();

        // access method using object
        led.turnOn();
    }
}