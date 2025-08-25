package sintaxis;

public class OperadoresAritmeticos {
    
    public static void main(String[] args) {
        // Operadores Aritméticos
        // +, -, *, /, %
        System.out.println("---Operadores Aritméticos---");
        int a = 13, b = 5;
        double c=5.4;
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Módulo: " + (a % b));

        System.out.println("Expresion: " + (a + b * b / 2 % b -a));
        // Los operadores se leen de izquierda a derecha, pero tienen una precedencia.
        // Primero se evalúan los paréntesis, luego las multiplicaciones divisiones y modulos, y finalmente las sumas y restas.


        System.out.println("Suma con decimal: " + (a + c));
        System.out.println("Resta con decimal: " + (a - c));
        System.out.println("Multiplicación con decimal: " + (a * c));
        System.out.println("División con decimal: " + (a / c));
        System.out.println("Módulo con decimal: " + (a % c));

        //Limitar decimales
        String resultado = String.format("%.2f", c);
        System.out.println("Resultado de 2 decimales: " + resultado);

        // Operadores de asignación
        // =, +=, -=, *=, /=, %=
        System.out.println("\n ---Operadores de asignación---");

        a += b+2; // Es equivalente a = a + b + 2;
        System.out.println("Asignacion con suma: " + a);

        a -= 5; // Es equivalente a = a - 5;
        System.out.println("Asignacion con resta: " + a);

        a *= 2; // Es equivalente a = a * 2;
        System.out.println("Asignacion con multiplicación: " + a);

        a /= b; // Es equivalente a = a / b;
        System.out.println("Asignacion con división: " + a);

        a %= 4; // Es equivalente a = a % b;
        System.out.println("Asignacion con módulo: " + a);

        //Operadores relacionales o de comparación
        // ==, !=, >, <, >=, <=
        System.out.println("\n ---Operadores relacionales o de comparación---");

        System.out.println("a= " + a + " b= " + b);
        System.out.println("a es igual a b: " + (a == b));
        System.out.println("a es diferente a b: " + (a != b));
        System.out.println("a es mayor que b: " + (a > b));
        System.out.println("a es menor que b: " + (a < b));
        System.out.println("a es mayor o igual que b: " + (a >= b));
        System.out.println("a es menor o igual que b: " + (a <= b));

        //Operadores lógicos
        // &&, ||, !

        /*Los operadores lógicos se utilizan para combinar expresiones booleanas.
        
         * El operador AND (&&) devuelve true si ambas expresiones son verdaderas.
         * 0 respresenta false y 1 representa true
         * Tabla de verdad and
         * x y | x AND y
         * 0 0 | 0
         * 0 1 | 0
         * 1 0 | 0
         * 1 1 | 1
         * 
         * El operador OR (||) devuelve true si al menos una de las expresiones es verdadera.
         * Tabla de verdad or
         * x y | x OR y
         * 0 0 | 0
         * 0 1 | 1
         * 1 0 | 1
         * 1 1 | 1
         * 
         * El operador NOT (!) invierte el valor de verdad de la expresión.
         * Tabla de verdad not
         * x | NOT x
         * 0 | 1
         * 1 | 0
         * 
         * y | NOT y
         * 0 | 1
         * 1 | 0
         * 
         */

        System.out.println("\n ---Operadores lógicos---");
        boolean x=true, y=false;
        System.out.println("x= " + x + " y= " + y);
        System.out.println("x AND y: " + (x && y));
        System.out.println("x OR y: " + (x || y));
        System.out.println("NOT x: " + (!x));
        System.out.println("NOT y: " + (!y));

        //Operadores bit a bit
        // &, |, ^, ~, <<, >>
        System.out.println("\n ---Operadores bit a bit---");
        int m=5, n=3; // En binario: m=0101, n=0011
        System.out.println("m= " + m + " n= " + n);
        System.out.println("m AND n: " + (m & n));
        System.out.println("m OR n: " + (m | n));
        System.out.println("m XOR n: " + (m ^ n));
        System.out.println("NOT m: " + (~m));
        System.out.println("m desplazado a la izquierda 1 posición: " + (m << 1));
        System.out.println("m desplazado a la derecha 1 posición: " + (m >> 1));
        System.out.println("n desplazado a la derecha sin signo: " + (m >>> 1));

        //Operadores unarios
        // +, -, ++, --
        //Necesitan solo un operando
        System.out.println("\n ---Operadores unarios---");
        int k = 5, s= 5;
        System.out.println("k= " + k + " s= " + s);
        System.out.println("Pre incremento de k: " + (++k)); // Incrementa k antes de usarlo
        System.out.println("Post incremento de k: " + (k++)); // Primero usa k y luego lo incrementa
        System.out.println("K: " + k);

        System.out.println("Pre decremento de s: " + (--s)); // Decrementa s antes de usarlo
        System.out.println("Post decremento de s: " + (s--)); // Primero usa s y luego lo decrementa
        System.out.println("S: " + s);

        System.out.println("Negación de k: " + (-k)); // Negación unaria
        System.out.println("Positivo de s: " + (+s)); // Positivo unario, no cambia el valor
        System.out.println("Negación de s: " + (-s)); // Negación unaria, cambia el signo

        //Operador ternario
        // ? :
        System.out.println("\n ---Operador ternario---");
        int edad = 18;
        String resultadoTernario = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";
        System.out.println("Resultado del operador ternario: " + resultadoTernario);
    }
}