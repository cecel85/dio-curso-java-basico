package edu.marcel.segundasemana;
public class MinhaClasse {

    public static void main (String [] args) {

        String primeiroNome = "Marcel";
        String segundoNome = "Correa";
       
        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
