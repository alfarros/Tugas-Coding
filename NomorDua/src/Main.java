public class Main {
    public static void main(String[] args) {
        int n = 10;
        int i = 1;
        int evenCount = 0;
        int oddCount = 0;

        while (i <= n) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            i++;
        }

        System.out.println("Jumlah bilangan genap dari 1 hingga " + n + " adalah: " + evenCount);
        System.out.println("Jumlah bilangan ganjil dari 1 hingga " + n + " adalah: " + oddCount);
    }
}