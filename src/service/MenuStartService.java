package service;

import bean.Config;

import java.util.Random;
import java.util.Scanner;

public class MenuStartService extends MenuService{
    @Override
    public void process() {
        Random random = new Random();
        int number = random.nextInt(Config.registeredPeople) + 1;
        System.out.println("Who is the chosen partcipant?");

        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

        if (answer == number) {
            System.out.println("Congratulations you won!");
        } else {
            System.out.println("You failed");
        }
    }
}
