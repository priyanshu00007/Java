public class averageofarray {
    public static void main(String args[]) {
        int n = 6;
        int[] a = {1, 2, 3, 4, 5, 6};
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
            double rem =(double) sum / n;

        System.out.println("The average of the array is: " + rem);
    }
}
