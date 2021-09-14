package SimpleLinearRegression;

import java.util.Scanner;

public class SimpleLinearRegression implements ISimpleLinearRegression {

    private double[] x;
    private double[] y;
    private int n;

    public SimpleLinearRegression(int aux) {
        this.n = aux;
        this.x = new double[n];
        this.y = new double[n];
    }

    public SimpleLinearRegression() {}

    public int getN() { return n; }

    @Override
    public void SLR() {

        double sumax = 0, sumay = 0, sumaxy = 0, sumax2 = 0;
        double promediox = 0, promedioy = 0;
        double Beta0 = 0, Beta1 = 0;

        for (int i = 0; i < getN(); i++) {
            sumax += x[i];
            sumay += y[i];
            sumaxy += (x[i] * y[i]);
            sumax2 += (x[i] * x[i]);
        }
        promediox = sumax / getN();
        promedioy = sumay / getN();

        Beta1 = (((n * sumaxy) - (sumax * sumay)) / ((n * sumax2) - (sumax * sumax)));
        Beta0 = (promedioy - (Beta1 * promediox));

        System.out.println("y = " + Beta0 + " + " + Beta1 + "x");
    }

    @Override
    public void Ingreso() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese los valores independientes: \n");
        for (int i = 0; i < getN(); i++) {
            x[i] = sc.nextDouble();
        }
        System.out.print("Ingrese los valores dependientes: \n");
        for (int i = 0; i < getN(); i++) {
            y[i] = sc.nextDouble();
        }
        sc.close();
    }
}