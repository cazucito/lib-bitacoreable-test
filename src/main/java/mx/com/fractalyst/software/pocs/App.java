package mx.com.fractalyst.software.pocs;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public boolean imprimeEnConsola() {
        Dato d = new Dato(876, "prop1Value");
        d.toDefaultOutput();
        return true;
    }
}
