import com.sun.jdi.Value;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        Locale inLocale = new Locale("en","IN");
        Locale hunLocale = new Locale("hun","HU");
        Locale argLocale = new Locale("en","Argentine");
        Locale turkLocale = new Locale("en","Turkmenistan");

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat in = NumberFormat.getCurrencyInstance(inLocale);
        NumberFormat hun = NumberFormat.getCurrencyInstance(hunLocale);
        NumberFormat argentina = NumberFormat.getCurrencyInstance(argLocale);
        NumberFormat turkmenistan = NumberFormat.getCurrencyInstance(turkLocale);
        //NumberFormat mittomen = NumberFormat.getCurrencyInstance(Locale.);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + in.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
        System.out.println("Hungary: " + hun.format(payment));
        System.out.println("Argentina: " + argentina.format(payment));
        System.out.println("Türkmenisztán: " + turkmenistan.format(payment));
        //System.out.println("Mittomen: " + mittomen.format(payment));
    }
}
