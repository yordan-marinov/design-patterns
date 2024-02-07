package recivers;

public class Radio implements Device{


    @Override
    public void on() {
        System.out.println("The Radio is ON");
    }

    @Override
    public void off() {
        System.out.println("The Radio is OFF");
    }
}
