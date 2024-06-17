package trafficLights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        trafficLights.Color[] signals = Arrays.stream(scanner.nextLine().split(" "))
                .map(String::toUpperCase)
                .map(trafficLights.Color::valueOf).toArray(trafficLights.Color[]::new);

        List<trafficLights.TrafficLight> trafficLights = new ArrayList<>();

        for (trafficLights.Color color: signals) {
            trafficLights.TrafficLight trafficLight = new trafficLights.TrafficLight(color);
            trafficLights.add(trafficLight);
        }

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            for (trafficLights.TrafficLight trafficLight: trafficLights) {
                trafficLight.changeColor();
                System.out.print(trafficLight + " ");
            }
            System.out.println();
        }
    }

}
