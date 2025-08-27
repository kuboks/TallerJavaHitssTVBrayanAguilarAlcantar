package fechas;

import java.time.LocalTime;

public class Horas {
    public void manejoHoras(){
        LocalTime horaActual= LocalTime.now();
        System.out.println();
        System.out.println("Hora actual con horas minutos segundos y nanosegundos: " + horaActual);
        
        //
        LocalTime horaEspecifica= LocalTime.of(10, 30);
        System.out.println("Hora especifica: " + horaEspecifica);

        //Formateo de texto
        LocalTime horaParse= LocalTime.parse("12:15");
        System.out.println("Hora parseada: "+ horaParse);

        //Suma de horas
        System.out.println("Suma de horas y minutos " + horaActual.plusHours(1).plusMinutes(10));
        System.out.println("Restar de horas y minutos " + horaActual.minusMinutes(120));
    }
}
