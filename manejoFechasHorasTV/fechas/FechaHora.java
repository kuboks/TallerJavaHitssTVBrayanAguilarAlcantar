package fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class FechaHora {
    public void manejoFechaHora(){
        //Obtener fecha y hora actual
        LocalDateTime fechaHoraActual= LocalDateTime.now();
        System.out.println("Fecha y hora actual: "+ fechaHoraActual);

        //Fecha especifica
        LocalDateTime fechaEspecifica= LocalDateTime.of(2025, 8, 020, 12, 30);
        System.out.println("Fecha y hora especifica: "+ fechaEspecifica);

        System.out.println("Sumar dias: "+ fechaHoraActual.plusDays(5));
        System.out.println("Sumar horas: "+ fechaHoraActual.plusHours(30));

        LocalDate fecha= LocalDate.of(2025, 06, 23);
        LocalTime hora= LocalTime.of(10, 10);
        LocalDateTime localDateTime= LocalDateTime.of(fecha, hora);
        System.out.println("Fecha y hora: "+ localDateTime);
    }
}
