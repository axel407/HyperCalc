package com.company;

import java.util.Scanner;

public class Value {
    public static void value(){
        Scanner scanner = new Scanner(System.in);
        root_equation root = new root_equation();
        while (true) {

            System.out.println("напиши \"break\" если хочешь закончить или \"start\" чтобы продолжить");

            String breek = scanner.nextLine();
            if (breek.equals("break")){
                break;
            }
            else if (breek.equals("start")){
                System.out.println("первый коефициент");
                int a = scanner.nextInt();
                System.out.println("Второй коефициент");
                int b = scanner.nextInt();
                System.out.println("свободный кофициент");
                int c = scanner.nextInt();

                root.equation(a, b, c);
            }

        }
    }
}
