package control;

public class SwitchClasico {
    public static void main(String[] args) {
        //Switch con structura clásica
        // Se utiliza para evaluar una variable y ejecutar diferentes bloques de código según su valor.
        int dia = 9; // 1: Lunes, 2: Martes, 3: Miércoles, etc.
        String nombreDia;
        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Día inválido";
                break;
        }
        System.out.println("El día de la semana es: " + nombreDia);

        // Nota: El switch clásico es útil cuando se tienen pocos casos específicos.
        // Sin embargo, si se tienen muchos casos o se necesita una lógica más compleja,
        // es recomendable usar otras estructuras de control como if-else.
    }
}
