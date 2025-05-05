package candidatura;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"Thiago", "Felipe", "Garcia", "Luiz", "Pedro", "Joao", "Maria", "Henrique", "Gabriel", "Vinicius"};

        int candidatoAtual = 0;

        ArrayList<String> candidatosSelecionados = new ArrayList();
        double salarioBase = 2000.0;

        while (candidatosSelecionados.size() < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            String statusCandidato = analisarCandidato(salarioPretendido);

            if (salarioBase >= salarioPretendido){
                candidatosSelecionados.add(candidato);
            }
            candidatoAtual++;
        }

        ligaCandidatos(candidatosSelecionados);
        System.out.println(candidatosSelecionados);
    }

    static void ligaCandidatos(ArrayList<String> candidatosSelecionados){
        for(String candidato: candidatosSelecionados){
            for(int tentativa = 1; tentativa <= 3; tentativa++){
                boolean atendeu = simulaLigacao();
                if (!atendeu && tentativa == 3){
                    System.out.println("Não conseguimos entrar em contato com o candidato " + candidato + " após " + tentativa + " tentativas");
                }
                if (atendeu){
                    System.out.println("Conseguimos entrar em contato com o candidato " + candidato + " em " + tentativa + " tentativas");
                    break;
                }
            }
        }
    }

    static boolean simulaLigacao(){
        return ThreadLocalRandom.current().nextBoolean();
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static String analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase <= salarioPretendido) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
