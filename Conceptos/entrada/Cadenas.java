package entrada;

public class Cadenas {
    public static void main(String[] args) {
        String nombre1= "     Brayan Aguilar ALcantar    ";
        String nombre2= "Brayan Aguilar ALcantar mdsngjgjweknsnsbhjbfewjsf hjwef well well well";
        
        // Métodos de la clase String
        // Tamaño de la cadena
        System.out.println("length(): " + nombre1.length());
        // Comparar cadenas
        System.out.println("(==): " + (nombre1 == nombre2)); // No es recomendable en objetos
        // Comparar cadenas (contenido)
        System.out.println("equals(String b): " + nombre1.equals(nombre2));
        // Comparar cadenas (contenido) sin importar mayúsculas y minúsculas
        System.out.println("equalsIgnoreCase(String b): " + nombre1.equalsIgnoreCase(nombre2));
        // Eliminar espacios al inicio y al final
        System.out.println("Nombre1: " + nombre1);
        System.out.println("trim(): " + nombre1.trim());
        // Caracter en una posición
        System.out.println("charAt(int index): " + nombre2.charAt(nombre2.length()-1));
        // Subcadenas
        // Recibe un indice de inicio (incluido)
        System.out.println("substring(int beginIndex): " + nombre2.substring(7));
        // Recibe un indice de inicio (incluido) y un indice de fin (excluido)
        System.out.println("substring(int beginIndex, int endIndex): " + nombre2.substring(7, 13));
        // Indice de la primera coincidencia de inicio a fin
        System.out.println("IndexOf(String str): " + nombre2.indexOf("well"));
        // Indice de la última coincidencia de fin a inicio
        System.out.println("lastIndexOf(String str): " + nombre2.lastIndexOf("well"));
        // Si una cadena inicia con cierta cadena
        System.out.println("startsWith(String prefijo): " + nombre2.startsWith("Brayan"));
        // Si una cadena termina con cierta cadena
        System.out.println("endsWith(String sufijo): " + nombre2.endsWith("l"));
    }
}
