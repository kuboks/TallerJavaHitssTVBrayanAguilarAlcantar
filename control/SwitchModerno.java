package control;

public class SwitchModerno {
    public static void main(String[] args) {

        int dia = 2; // 1: Lunes, 2: Martes, 3: Miércoles, etc.
        // Switch con expresión (Switch moderno)
        // Solo funciona en Java 12 y versiones posteriores.
        // A partir de Java 12, se introdujo el switch con expresión, que permite una sintaxis más concisa.
        String nombreDiaExpresion = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Día inválido";
        };
        System.out.println("El día de la semana (expresión) es: " + nombreDiaExpresion);
        // Nota: El switch con expresión es más limpio y evita la necesidad de usar break en cada caso.
        // Es especialmente útil cuando se necesita devolver un valor basado en la evaluación de una variable.
        // Además, el switch con expresión permite múltiples casos en una sola línea, lo que mejora la legibilidad.

        //Otra forma de escribir el mismo switch moderno
        System.out.print("El día de la semana (moderno) es: ");
        switch (dia) {
            case 1 -> System.out.println("Lunes");
            case 2 -> {
                //Si se necesita ejecutar más de una línea de código, se puede usar un bloque
                System.out.println("Martes");
                System.out.println("¡Día de trabajo!");
            }
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Día inválido");
        };
    }
}
