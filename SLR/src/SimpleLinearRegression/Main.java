/*
* AUTOR = Victor Manuel Iñiguez Mercado
* TRABAJO = Hands-on 3
*/
package SimpleLinearRegression;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de filas de la tabla: ");
        int num = sc.nextInt();

        SimpleLinearRegression prueba = new SimpleLinearRegression(num);
        prueba.Ingreso();
        prueba.SLR();

        sc.close();
    }
}
/*
 * x = [23, 26, 30, 34, 43, 48, 52, 57, 58] 
 * y = [651, 762, 856, 1063, 1190, 1298, 1421, 1440, 1518]
 */