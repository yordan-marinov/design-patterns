package recivers;

import lombok.Data;


@Data
public class Light implements Device{

    @Override
    public void on() {
        System.out.println("The light is ON.");

    }

    @Override
    public void off() {
        System.out.println("The light is OFF.");
    }
}
