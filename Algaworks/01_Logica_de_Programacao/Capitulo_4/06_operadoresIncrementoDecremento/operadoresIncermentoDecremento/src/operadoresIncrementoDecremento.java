public class operadoresIncrementoDecremento {
    public static void main(String[] args) {
        int numero = 10;
        System.out.println(numero);

        ++numero;
        System.out.println(numero);

        numero++;
        System.out.println(numero);

        int numero02 = ++numero; //Priemrio o valor de numero é incrementada e depois passa para a varíavel 02

        System.out.println("Número: " + numero + "\n" + "Número02: " + numero02);

        int numero03 = numero++;
        System.out.println("\nNúmero: " + numero + "\n" + "Número03: " + numero03);

    }
}
