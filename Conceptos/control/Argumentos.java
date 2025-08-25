package control;

public class Argumentos {
    public static void main(String[] args) {
        // Se ejecuta primero javac Argumentos.java
        // Ojo javac necesita que el archivo use la extensión .java

        // Luego se ejecuta java Argumentos erxss 12345
        // Java ya no necesita la extensión .java, solo el nombre de la clase

        // El programa recibe dos argumentos desde la línea de comandos
        // Los argumentos se pasan como un arreglo de String separados por espacios
        // En este caso, args[0] es "erxss" y args[1] es "12345"
        // Si no se pasan argumentos, el programa fallará al intentar acceder a args[0] y args[1]
        
        String username, password;
        username = args[0];
        password = args[1];
        if( username.equals("erxss") && password.equals("12345")) {
            System.out.println("Bienvenido al sistema " + username);
        } else {
            System.out.println("Usuario o contraseña incorrectos");
        }
    }
}
