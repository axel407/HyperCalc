package com.company;

public class root_equation {
     public static void equation(int a, int b, int c){
         double x1;
         double x2;
         double D = (b*b)-(4*a*c);
         System.out.println("дескриминант равен " + D);
         if (D > 0){
             double sqrtD = Math.sqrt(D);
             System.out.println("корень дескриминанта равен " + sqrtD);
             x1 = (-b + sqrtD) / (2 * a);
             x2 = (-b - sqrtD) / (2 * a);
             System.out.println("первый корень " + x1 + " " + "второй корень " + x2);
         }
         else if (D == 0){
             x1 = -b / (2*a);
             System.out.println("корень " + x1);
         }
         else if (D < 0) {
             System.out.println("корней нет");
         }
     }
}
