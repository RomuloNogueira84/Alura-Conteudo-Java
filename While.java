import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Qual a sua nota para esse filme ou -1 para encerrar:  ");
            nota = leitura.nextDouble();
            mediaAvaliacao +=  nota;
            totalDeNotas++;

            if (nota != -1){
                mediaAvaliacao += nota;
                totalDeNotas++;
            }


        }
        System.out.println("Medias das avaliações dos filmes: " + mediaAvaliacao/totalDeNotas);
    }
}
