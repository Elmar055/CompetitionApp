package service;

import util.MenuUtil;

import java.util.Scanner;

public class MenuLoginService extends MenuService{

    @Override
    public void process() {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Please login ");
            System.out.println("Enter username");
            Scanner sc = new Scanner(System.in);
            String username = sc.nextLine();

            System.out.println("Enter password");
            sc = new Scanner(System.in);
            String password = sc.nextLine();

            if(!(username.equals("Elmar") && password.equals("12345"))){
                System.out.println("Wrong username or password");
                count++;
            }else {
                System.out.println("Succesfully Login");
                break;
            }

        }
        if (count == 3){
            System.out.println("You are banned!");
            System.exit(0);
        }
        while (true){
            MenuUtil.showMenu();
        }
    }
}
