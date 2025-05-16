public class Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;
        double numero03 = 10;
        double numero04 = 20;

        int resultadoAdicao = numero01 + numero02;
        System.out.println(resultadoAdicao);
        // Sem segredo, vai somar normal

        System.out.println("----------");

        System.out.println("Valor "+numero01+numero02);
        // Aqui vai ter uma concatenação por conta da String

        System.out.println("----------");

        System.out.println(numero01+numero02+" Valor "+numero02+numero01);
        // Mesma coisa! O que está depois da String vai concatenar

        System.out.println("----------");

        double resultado = numero03 / numero04;
        System.out.println(resultado);
        // Aqui vamos usar o double
        // Operações entre inteiros da resultado inteiro
        // Ou seja, apareceria zero
        // Sabemos que zero não é o resultado

        System.out.println("----------");

        System.out.println(numero01*numero02);
        // Sem segredo aqui
    }
}
