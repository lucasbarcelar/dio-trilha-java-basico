package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"Lucas", "Guilherme", "Juan", "Gabriel", "Lohan"};
        for(String candidato: candidatos) {
            entrandoEmContato(candidato);
        }
        
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"Lucas", "Guilherme", "Juan", "Gabriel", "Lohan"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int indice = 0;indice < candidatos.length;indice++) {
            System.out.println("O candidato de n*" + (indice+1) + "é o " + candidatos[indice]);
        }

        //System.out.println("Forma abreviada");

        //for(String candidato: candidatos) {
        //    System.out.println("o candidato selecionado foi " + candidato);
        //}
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando) {
                tentativasRealizadas++;
            }else {
                System.out.println("Contato realizado com sucesso.");
            }
        } while(continuarTentando && tentativasRealizadas < 3);
        if(atendeu) {
            System.out.println("conseguimos contato com o candidato: " + candidato + " na " + tentativasRealizadas + " tentativa.");
        }else {
            System.out.println("Não conseguimos contato com o candidato: " + candidato + ", numero maximo de tentativas realizadas: " + tentativasRealizadas);
        }
    }

    private static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"Lucas", "Guilherme", "Juan", "Gabriel", "Lohan", "Vinicius", "Eduardo"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " Solicitou: " + salarioPretendido + "R$.");
            if(salarioBase>salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado.");
                candidatosSelecionados += 1;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("Ligar para o Candidato");
        }else if(salarioBase == salarioPretendido) {
            System.out.println("Aguardando os demais candidatos");
        }else {
            System.out.println("Ligar para contra proposta.");
        }
    }

}
