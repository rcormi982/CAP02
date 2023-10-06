package Capitulo2;
/*Escribe un programa que calcule el total de una factura a partir de la base
imponible (precio sin IVA). La base imponible estará almacenada en una
variable. */
public class EJ06 {
    public static void main(String[] args) {
        double base = 22.75;
        double iva = 21;
        double total = base * (1+iva/100);
        System.out.printf("%-14s\t%.2f €%n", "Base imponible:", base);
        System.out.printf("%-14s\t%.2f%%%n", "IVA", iva);
        System.out.println("=======================");
        System.out.printf("%-14s\t%.2f €", "Total", total);
    }
}
