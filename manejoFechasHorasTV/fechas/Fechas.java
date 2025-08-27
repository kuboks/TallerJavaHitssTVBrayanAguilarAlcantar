package fechas;

import java.time.LocalDate;

public class Fechas {
    
    public void manejoFechas(){
        //Manejo de fechas

        //Fecha actual
        LocalDate hoy;
        hoy = LocalDate.now();
        System.out.println("Hoy es: " + hoy);

        //Fecha especifica
        LocalDate fecha = LocalDate.of(2025, 7, 31);

        System.out.println("Fecha: "+ fecha);

        //Desde texto ISO ("yyyy"-MM-dd)
        LocalDate fechaParseada= LocalDate.parse("2025-08-29");
        System.out.println("Fecha parseada: " + fechaParseada);

        //Fecha por partes
        System.out.println("Año: " + hoy.getYear());
        System.out.println("Mes: "+ hoy.getMonth());
        System.out.println("Mes en numero: "+ hoy.getMonthValue());
        System.out.println("Dias del mes: "+ hoy.getDayOfMonth());
        System.out.println("Dias del año: "+ hoy.getDayOfYear());
        System.out.println("Dia de la semana: "+ hoy.getDayOfWeek());
        System.out.println();

        // Operaciones con fechas
        //Sumas
        System.out.println("Agregar dias "+ hoy.plusDays(7));
        System.out.println("Agregar meses "+hoy.plusMonths(2));
        System.out.println("Agregar años "+hoy.plusYears(1));
        System.out.println("Agregar semanas "+hoy.plusWeeks(2));
        System.out.println();

        System.out.println("Restar dias "+ hoy.minusDays(7));
        System.out.println("Restar meses "+ hoy.minusMonths(2));
        System.out.println("Restar años "+ hoy.minusYears(1));
        System.out.println("Restar semanas "+ hoy.minusWeeks(2));

        // Comparar fechas
        System.out.println("Fecha anterior es igual a fecha parseada?: " + fecha.isAfter(fechaParseada));
        System.out.println("Fecha actual es posterior a fecha: " + hoy.isBefore(fecha));
        System.out.println("Fecha actual es posterior a fecha parseada: " + hoy.equals(fechaParseada));
    }
}
