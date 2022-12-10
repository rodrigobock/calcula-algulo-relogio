package Servicos;

import java.util.HashMap;

public class RelogioService {

    public int retornaAnguloRelogio(int hora, int minuto) {
        return Math.abs( (30 * hora) - (6 * minuto));
    }

    public boolean validaHorario(int hora, int minuto){
        return hora > 24 || hora < 0 || minuto >= 60 || minuto < 0;
    }

    public Integer mapeiaHorarioInserido(int hora){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(12, 0);
        map.put(13, 1);
        map.put(14, 2);
        map.put(15, 3);
        map.put(16, 4);
        map.put(17, 5);
        map.put(18, 6);
        map.put(19, 7);
        map.put(20, 8);
        map.put(21, 9);
        map.put(22, 10);
        map.put(23, 11);
        map.put(24, 0);

        return map.get(hora);
    }

    public String retornaHorarioTeste(int hora, int minuto) {

        do {

            if (validaHorario(hora, minuto)) {
                System.out.println("O horário digitado é inválido, insira novamente!");
                System.out.println("");
            }

        } while (validaHorario(hora, minuto));

        if (hora >= 12) {
            hora = mapeiaHorarioInserido(hora);
        }

        int angulo = retornaAnguloRelogio(hora, minuto);

        String horarioInformado = hora + "h " + minuto + "min";

        return exibeResultado(angulo, horarioInformado);

    }

    public String exibeResultado(int angulo, String horarioInformado){
        if(angulo == 180){
            return "O ângulo formado pelos ponteiros no horário " + horarioInformado + " é = " + angulo + "°.";
        }else{
            if(angulo > 180){
                int menorAngulo = 360 - angulo;
                return "O maior ângulo formado pelos ponteiros no horário " + horarioInformado + " é = " + angulo + "°. Já o menor ângulo é " + menorAngulo + "°";
            }else{
                int maiorAngulo = Math.abs(360 - angulo);
                return "O menor ângulo formado pelos ponteiros no horário " + horarioInformado + " é = " + angulo + "°. Já o maior ângulo é " + maiorAngulo + "°";
            }
        }
    }

}
