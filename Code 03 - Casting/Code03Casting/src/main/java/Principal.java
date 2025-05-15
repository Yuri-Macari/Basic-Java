public class Principal {
    public static void main(String[] args) {
        int idade = 10;
        long numeroGrande = (long) 987.25D;
        // Eu sei que o 987.25 vai ser interpretado como double por conta do "D"
        // como o (long) eu faço um double caber dentro do long
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = -128;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';

        System.out.println("A idade é "+idade+" anos");
        System.out.println("O número é "+ numeroGrande);

    }
}
