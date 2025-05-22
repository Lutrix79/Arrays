import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача №1
        System.out.println("Задача №1");
        int [] intVars = new int[] {1, 2, 3};
        float [] floatVars = {1.57F, 7.654F, 9.986F};
        double [] doubleVars = new double[12];
        //С нулями неинтересно, поэтому циклом заполним нечетными числами первую половину и четными вторую
        for (int i = 0; i < doubleVars.length; i++) {
            if (i < doubleVars.length/2) {
                doubleVars[i] = 2*i + 1;
            } else {
                doubleVars[i] = 2*(i+1) - doubleVars.length;
            }
        }
        System.out.println();

        //Задача №2
        System.out.println("Задача №2");
        for (int i = 0; i < intVars.length; i++) {
            if (i == intVars.length-1) {
                System.out.println(intVars[i]);
                break;
            }
            System.out.print(intVars[i] + ", ");
        }
        for (int i = 0; i < floatVars.length; i++) {
            if (i == floatVars.length-1) {
                System.out.println(floatVars[i]);
                break;
            }
            System.out.print(floatVars[i] + ", ");
        }
        System.out.println(Arrays.toString(doubleVars));
        System.out.println();

        //Задача №3
        System.out.println("Задача №3");
        for (int i = intVars.length-1; i >=0; i--) {
            if (i == 0) {
                System.out.println(intVars[i]);
                break;
            }
            System.out.print(intVars[i] + ", ");
        }
        for (int i = floatVars.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(floatVars[i]);
                break;
            }
            System.out.print(floatVars[i] + ", ");
        }
        for (int i = doubleVars.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(doubleVars[i]);
                break;
            }
            System.out.print(doubleVars[i] + ", ");
        }
        System.out.println();

        //Задача №4
        System.out.println("Задача №4");
        for (int i = 0; i < intVars.length; i++) {
            if (intVars[i] % 2 == 1) {
                intVars[i] += 1;
            }
        }
        System.out.println(Arrays.toString(intVars));
    }
}