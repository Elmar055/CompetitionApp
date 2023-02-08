package service;

import bean.Competitor;
import bean.Config;

import java.util.Scanner;

public class MenuRegisterService extends MenuService{

    public Competitor[] register(){
        System.out.println("How many people will take part in the competition. ");
        Scanner sc = new Scanner(System.in);
        Config.registeredPeople = sc.nextInt();

        Config.competitors = new Competitor[Config.registeredPeople];
        String name;
        String surname;

        for (int i = 0; i < Config.competitors.length; i++) {
            sc = new Scanner(System.in);
            System.out.println("Enter a name:");
            name = sc.nextLine();
            System.out.println("Enter a surname:");
            surname = sc.nextLine();

            Competitor c = new Competitor(name, surname);
            Config.competitors[i] = c;
        }
        System.out.println("Competitors have been registered successfully!");
        return Config.competitors;
    }
    @Override
    public void process() {
        Competitor[] arr = register();
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i+1)+"."+arr[i].toString());

        }

    }
}
