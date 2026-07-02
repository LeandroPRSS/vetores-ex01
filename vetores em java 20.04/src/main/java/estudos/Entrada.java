/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudos;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Entrada {

    public static int inteiro(Scanner sc) {
        return Integer.parseInt(sc.nextLine());
    }

    public static double decimal(Scanner sc) {
        return Double.parseDouble(sc.nextLine());
    }

    public static String texto(Scanner sc) {
        return sc.nextLine();
    }
}
