//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                System.out.println("Esse é o Screen Match ");
                System.out.println(" Filme: Top Gun: Maverick");

                int anoDeLancamento = 2022;
                System.out.println("O ano de lançamento: " + anoDeLancamento);
                boolean incluidoNoPlano = false;
                double notaDoFilme = 8.1;

                double media = (9.8 + 6.3 + 8.0) / 3;
                System.out.println(" A média das notas de avaliação: " + media);

                // Trabalhando com textos. Strings
                String sinopse;
                sinopse = " Filme de aventura com galã dos anos 80. ";
                System.out.println(sinopse);

                sinopse = """
                        Filme: Top Gun: Maverick.
                        Filme de aventura com galã dos anos 80.
                        Um bom filme!
                        O ano de lançamento:""" + anoDeLancamento;

                System.out.println(sinopse);

                //Casting convertendo valores
                int classificacao;
                classificacao = (int) (media / 2);
                System.out.println(classificacao);

                //Exercicitando

                //primeiro
                double temperaturaCelsius = 25;
                double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
                System.out.println("A temperatura em Fahrenheit no momento é: " + (int) temperaturaFahrenheit);

                //segundo
                double nota1 = 8.9;
                double nota2 = 7.5;
                double mediaTotal = (nota1 + nota2) / 2;

                System.out.println("Média: " + mediaTotal);

                //terceiro
                double numeroDouble = 15.7;
                int numeroInteiro = (int) numeroDouble;
                System.out.println("Casting de double para int: " + numeroInteiro);

        }
    }

