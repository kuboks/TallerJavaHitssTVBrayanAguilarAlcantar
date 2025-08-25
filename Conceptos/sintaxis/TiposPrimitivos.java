package sintaxis;

public class TiposPrimitivos {
    
    public static void main(String[] args) {
        // Entero byte primitivo
        // No tiene metodos útiles para manipular valores byte
        byte numeroByte = -128; // Rango: -128 a 127
        System.out.println("Numero Byte: " + numeroByte);

        // Clase envolvente para el tipo primitivo byte
        // Tiene metodos útiles para manipular valores byte
        Byte enteroByte = 100; 
        System.out.println("Byte: " + enteroByte.byteValue());
        System.out.println("Valor minimo de byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo de byte: " + Byte.MAX_VALUE);


        // Entero short primitivo
        // No tiene metodos útiles para manipular valores short
        short numeroShort = 32767; // Rango: -32768 a 32767
        System.out.println("Numero Short: " + numeroShort);

        // Clase envolvente para el tipo primitivo short
        // Tiene metodos útiles para manipular valores short
        Short enteroShort = 2000;
        System.out.println("Short: " + enteroShort.shortValue());
        System.out.println("Valor minimo de short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo de short: " + Short.MAX_VALUE);

        // Entero int primitivo
        // No tiene metodos útiles para manipular valores int
        int numeroInt = 2147483647; // Rango: -2147483648 a 2147483647
        System.out.println("Numero Int: " + numeroInt);

        // Clase envolvente para el tipo primitivo int
        // Tiene metodos útiles para manipular valores int
        Integer enteroInt = 100000;
        System.out.println("Int: " + enteroInt.intValue());
        System.out.println("Valor minimo de int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo de int: " + Integer.MAX_VALUE);


        // Entero long primitivo
        // No tiene metodos útiles para manipular valores long
        long numeroLong = 9223372036854775807L; // Rango: -9223372036854775808 a 9223372036854775807
        System.out.println("Numero Long: " + numeroLong);

        // Clase envolvente para el tipo primitivo long
        // Tiene metodos útiles para manipular valores long
        Long enteroLong = 100000L;
        System.out.println("Long: " + enteroLong.longValue());
        System.out.println("Valor minimo de long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo de long: " + Long.MAX_VALUE);

        // Decimal float primitivo
        // No tiene metodos útiles para manipular valores float
        float numeroFloat = 3.4028235E38F;
        System.out.println("Numero Float: " + numeroFloat);


        // Clase envolvente para el tipo primitivo float
        // Tiene metodos útiles para manipular valores float
        Float decimalFloat = 10.5F;
        System.out.println("Float: " + decimalFloat.floatValue());
        System.out.println("Valor minimo de float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo de float: " + Float.MAX_VALUE);

        // Decimal double primitivo
        // No tiene metodos útiles para manipular valores double
        double numeroDouble = 1.7976931348623157E308;
        System.out.println("Numero Double: " + numeroDouble);
        
        // Clase envolvente para el tipo primitivo double
        // Tiene metodos útiles para manipular valores double
        Double decimalDouble = 20.99;
        System.out.println("Double: " + decimalDouble.doubleValue());
        System.out.println("Valor minimo de double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo de double: " + Double.MAX_VALUE);


        // Carácter char primitivo
        // No tiene metodos útiles para manipular valores char
        char caracter = '*';
        System.out.println("Caracter: " + caracter);

        // Clase envolvente para el tipo primitivo char
        // Tiene metodos útiles para manipular valores char
        Character caracterEnvolvente = 'B';
        System.out.println("Character: " + caracterEnvolvente.charValue());
        System.out.println("Valor minimo de char: " + (int) Character.MIN_VALUE);
        System.out.println("Valor maximo de char: " + (int) Character.MAX_VALUE);


        // Booleano boolean primitivo
        // No tiene metodos útiles para manipular valores boolean
        boolean esVerdadero = true;
        System.out.println("Boolean: " + esVerdadero);

        // Clase envolvente para el tipo primitivo boolean
        // Tiene metodos útiles para manipular valores boolean
        Boolean booleanEnvolvente = false;
        System.out.println("Boolean: " + booleanEnvolvente.booleanValue());
        System.out.println("Valor de TRUE: " + Boolean.TRUE);
        System.out.println("Valor de FALSE: " + Boolean.FALSE);

        // Tipo de referencia String
        // No es un tipo primitivo, pero es una clase envolvente
        String nombre = "Brayan";
        System.out.println("Nombre: " + nombre.toUpperCase());
        System.out.println("Nombre: " + nombre);

        int i= 100;
        System.out.println("Valor entero de i: " + i);
        double d= i; // Conversion implicita o directa
        //Esto solo por lls rangos que manejan los tipos primitivos
        //No se puede hacer lo contrario, de double a int, porque se pierde precision
        //d = 100.5; // Esto no es valido, porque d es un double y no un int
        System.out.println("Valor double de d: " + d);

        int x= (int) d; // Conversion explicita o indirecta
        System.out.println("Valor entero de x: " + x);
    }
}
