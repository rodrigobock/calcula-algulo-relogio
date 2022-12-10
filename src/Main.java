import Servicos.RelogioService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int hora = 0;
        int minuto = 0;
        RelogioService relogio = new RelogioService();

        do {
            System.out.println("Por favor, insira um horário valido");
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite a hora:");
            hora = sc.nextInt();
            System.out.print("Digite o minuto:");
            minuto = sc.nextInt();

            if(relogio.validaHorario(hora, minuto)){
                System.out.println("O horário digitado é inválido, insira novamente!");
                System.out.println("");
            }

        }while(relogio.validaHorario(hora, minuto));

        if(hora >= 12){
            hora = relogio.mapeiaHorarioInserido(hora);
        }

        int angulo = relogio.retornaAnguloRelogio(hora, minuto);

        String horarioInformado = hora + "h " + minuto + "min";

        System.out.println(relogio.exibeResultado(angulo, horarioInformado));

    }


}