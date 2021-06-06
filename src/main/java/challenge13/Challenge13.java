package challenge13;

import java.util.Locale;
import java.util.Scanner;

public class Challenge13 {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);


        System.out.println("What is the principal amount?");
        String principalS = inputs.nextLine();
        double p = Double.parseDouble(principalS);

        System.out.println("What is the rate? (Enter a percentage!");
        String rateS = inputs.nextLine();
        double r = Double.parseDouble(rateS);

        System.out.println("What is the number of years?");
        String yearsS = inputs.nextLine();
        double t = Double.parseDouble(yearsS);
        //int yearsD = Integer.parseInt(yearsS);

        System.out.println("What is the number of times the interest is compounded per year?");
        String compoundS = inputs.nextLine();
        double n = Double.parseDouble(compoundS);
        r = r/100;
        double aPrelim = ((r/n)+1);
        double power = n*t;
        //System.out.println(aPrelim);
        //System.out.println(power);
        double aPrelimNext = Math.pow(aPrelim,power);
        //System.out.println(aPrelimNext);
        double a = p*aPrelimNext;
        //System.out.println(a);
        a= Math.round(a*100);
        //System.out.println(a);
        a=a/100;
        System.out.println(a);
        String aS = java.text.NumberFormat.getCurrencyInstance(Locale.US).format(a);
        String pS = java.text.NumberFormat.getCurrencyInstance(Locale.US).format(p);

        System.out.println(pS + " invested at " + rateS + "% for " + yearsS + " years compounded " + compoundS + " times per year is " + aS + ".");




    }
}
