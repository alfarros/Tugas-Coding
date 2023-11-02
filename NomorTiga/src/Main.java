import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("Masukkan tanggal lahir (contoh: 31): ");
                int tanggal = input.nextInt();

                System.out.print("Masukkan bulan lahir (contoh: 12): ");
                int bulan = input.nextInt();

                String zodiak = hitungZodiak(tanggal, bulan);
                System.out.println("Zodiak Anda adalah: " + zodiak);

                input.close();
            }

            public static String hitungZodiak(int tanggal, int bulan) {
                if ((bulan == 3 && tanggal >= 21) || (bulan == 4 && tanggal <= 19)) {
                    return "Aries";
                } else if (bulan == 4 || bulan == 5 && tanggal <= 20) {
                    return "Taurus";
                } else if (bulan == 5 || bulan == 6 && tanggal <= 20) {
                    return "Gemini";
                } else if (bulan == 6 || bulan == 7 && tanggal <= 22) {
                    return "Cancer";
                } else if (bulan == 7 || bulan == 8 && tanggal <= 22) {
                    return "Leo";
                } else if (bulan == 8 || bulan == 9 && tanggal <= 22) {
                    return "Virgo";
                } else if (bulan == 9 || bulan == 10 && tanggal <= 22) {
                    return "Libra";
                } else if (bulan == 10 || bulan == 11 && tanggal <= 21) {
                    return "Scorpio";
                } else if (bulan == 11 || bulan == 12 && tanggal <= 21) {
                    return "Sagittarius";
                } else if (bulan == 12 || bulan == 1 && tanggal <= 19) {
                    return "Capricorn";
                } else if (bulan == 1 || bulan == 2 && tanggal <= 18) {
                    return "Aquarius";
                } else {
                    return "Pisces";
                }
            }
        }