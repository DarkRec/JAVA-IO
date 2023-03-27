package Instruction4.Problem14;

import java.util.Random;

public class Problem14 {
    /*
    The area of a circle is defined as r^2. Estimate \pi to 3 decimal places using a Monte Carlo method.
    Hint: The basic equation of a circle is x^2 + y^2 = r^2.
    */
    static public double P014(int tests){
        try{
            if (tests<=0)
                throw new ZeroSamplesException();
        }
        catch(ZeroSamplesException e){
            System.out.println(e.getMessage());
            return Math.PI;
        }
        int inCircle=0;
        Random rand = new Random();
        for (int i=0;i<tests;i++) {
            double r1 = rand.nextDouble();
            double r2 = rand.nextDouble();

            if (Math.pow(r1, 2) + Math.pow(r2, 2) < 1)
                inCircle++;
        }
        return (4*(double)inCircle/tests);
    }
}
