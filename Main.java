package utp.mains;

/* Muhammad Alifian Khoiron - 245150707111042

    _    _     ___ _____ ___    _    _   _ 
   / \  | |   |_ _|  ___|_ _|  / \  | \ | |
  / _ \ | |    | || |_   | |  / _ \ |  \| |
 / ___ \| |___ | ||  _|  | | / ___ \| |\  |
/_/   \_\_____|___|_|   |___/_/   \_\_| \_|

*/

import java.util.Scanner;

import utp.shapes.LimasPersegi;
import utp.shapes.PrismaSegitigaSamaKaki;
import utp.shapes.Tabung;

public class Main {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println(ANSI_GREEN + "=============================================" + ANSI_RESET);
            System.out.println(ANSI_CYAN + "Kalkulator Bangun Ruang" + ANSI_RESET);
            System.out.println(ANSI_CYAN + "Muhammad Alifian Khoiron" + ANSI_RESET);
            System.out.println(ANSI_CYAN + "245150707111042" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "=============================================" + ANSI_RESET);
    
            System.out.println(ANSI_RED + "Prisma Segitiga Sama Kaki" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "=============================================" + ANSI_RESET);
            System.out.print("Isikan alas     : ");
            double alas = sc.nextDouble();
            System.out.print("Isikan kaki     : ");
            double kaki = sc.nextDouble();
            System.out.print("Isikan tinggi   : ");
            double tinggiPrisma = sc.nextDouble();
            PrismaSegitigaSamaKaki prisma = new PrismaSegitigaSamaKaki(alas, kaki, tinggiPrisma);
            System.out.println(ANSI_GREEN + "=============================================" + ANSI_RESET);
            prisma.printInfo();
            System.out.println(ANSI_GREEN + "=============================================" + ANSI_RESET);
    
            System.out.println(ANSI_RED + "Limas Persegi" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "=============================================" + ANSI_RESET);
            System.out.print("Isikan sisi     : ");
            double sisi = sc.nextDouble();
            System.out.print("Isikan tinggi   : ");
            double tinggiLimas = sc.nextDouble();
            LimasPersegi limas = new LimasPersegi(sisi, tinggiLimas);
            System.out.println(ANSI_GREEN + "=============================================" + ANSI_RESET);
            limas.printInfo();
            System.out.println(ANSI_GREEN + "=============================================" + ANSI_RESET);
    
            System.out.println(ANSI_RED + "Tabung" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "=============================================" + ANSI_RESET);
            System.out.print("Isikan radius   : ");
            double radius = sc.nextDouble();
            System.out.print("Isikan tinggi   : ");
            double tinggiTabung = sc.nextDouble();
            Tabung tabung = new Tabung();
            tabung.setRadius(radius);
            tabung.setTinggi(tinggiTabung);
            System.out.println(ANSI_GREEN + "=============================================" + ANSI_RESET);
            tabung.printInfo();
            System.out.println(ANSI_GREEN + "=============================================" + ANSI_RESET);
        }
}