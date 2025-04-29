import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task1");
        System.out.println();
        int[] arr1 = new int[]{1, 2, 3};
        double[] arr2 = new double[]{1.57, 7.654, 9.986};
        String[] arr3 = new String[]{"privet", "poka"};
        System.out.println();
        System.out.println("Task2");
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            if (i == arr1.length - 1) {
                System.out.print(arr1[i]);
                break;
            }
            System.out.print(arr1[i] + ", ");

        }
        System.out.println();
        for (int j = 0; j < arr2.length; j++) {
            if (j == arr2.length - 1) {
                System.out.print(arr2[j]);
                break;
            }
            System.out.print(arr2[j] + ", ");
        }
        System.out.println();
        for (int f = 0; f < arr3.length; f++) {
            if (f == arr3.length - 1) {
                System.out.print(arr3[f]);
                break;
            }
            System.out.print(arr3[f] + ", ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Task3");
        System.out.println();
        for (int i = arr1.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr1[i]);
                break;
            }
            System.out.print(arr1[i] + ", ");

        }
        System.out.println();
        for (int j = arr2.length - 1; j >= 0; j--) {
            if (j == 0) {
                System.out.print(arr2[j]);
                break;
            }
            System.out.print(arr2[j] + ", ");
        }
        System.out.println();
        for (int f = arr3.length - 1; f >= 0; f--) {
            if (f == 0) {
                System.out.print(arr3[f]);
                break;
            }
            System.out.print(arr3[f] + ", ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Task4");
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                arr1[i] ++;
            }
            if (i == arr1.length - 1) {
                System.out.print(arr1[i]);
                break;
            }
            System.out.print(arr1[i] + ", ");
        }

    }
}