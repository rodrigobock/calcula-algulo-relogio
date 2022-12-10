package Testes;

import Servicos.RelogioService;

public class TesteRelogio {

    public static void main(String[] args) {

        int hora = 0;
        int minuto = 0;

        int hora1 = 0;
        int minuto1 = 15;

        int hora2 = 0;
        int minuto2 = 30;

        int hora3 = 0;
        int minuto3 = 45;

        RelogioService relogio = new RelogioService();

        System.out.println(relogio.retornaHorarioTeste(hora, minuto));
        System.out.println(relogio.retornaHorarioTeste(hora1, minuto1));
        System.out.println(relogio.retornaHorarioTeste(hora2, minuto2));
        System.out.println(relogio.retornaHorarioTeste(hora3, minuto3));

    }

}
