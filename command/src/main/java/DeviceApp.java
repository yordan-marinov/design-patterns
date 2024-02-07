import commands.*;
import invoker.Controller;
import invoker.LightController;
import invoker.MultipleController;
import invoker.RadioController;
import recivers.Device;
import recivers.Light;
import recivers.Radio;

import java.util.List;

import static java.lang.Thread.sleep;


public class DeviceApp {

    public static void main(String[] args) {
        System.out.println("\n================= Light Controller ==================================");
        final Device light = new Light();

        final Command lightOnCommand = new KitchenLightONCommand(light);
        final Command lightOffCommand = new KitchenLightOFFCommand(light);

        // controlling light device with
        final Controller lightOnController = new LightController(lightOnCommand);
        lightOnController.control();

        final LightController lightOffController = new LightController(lightOffCommand);
        lightOffController.control();

        System.out.println("\n================= Radio Controller ==================================");

        final Device radio = new Radio();
        final Command radioONCommand = new RadioONCommand(radio);
        final Command radioOFFCommand = new RadioOFFCommand(radio);

        final Controller radioONController = new RadioController(radioONCommand);
        final Controller radioOFFController = new RadioController(radioOFFCommand);
        radioONController.control();
        radioOFFController.control();

        System.out.println("\n================= Multiple Controller ==================================");

        final Command sleeper = () -> {
            try {
                System.out.println("\nSorry need to sleep now for a sec :)\n");
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        final Command goodBye = () -> System.out.println("GOOD BYE!!!\n");

        final Controller multipleController = new MultipleController(
                List.of(lightOnCommand, radioONCommand, sleeper, radioOFFCommand, lightOffCommand, goodBye)
        );
        multipleController.control();
    }
}
