package Capitulo2;
/*Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
convertir deberá estar almacenada en una variable.*/
public class EJ04 {
    public static void main(String[] args) {
        double euros = 7;
        int pesetas = (int)(euros*166.386);
        System.out.println(euros + " € es igual a " + pesetas + " pesetas");
    }
}
