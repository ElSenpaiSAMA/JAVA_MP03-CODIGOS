import java.util.Scanner;
public class Prediccion{
    private Scanner scan = new Scanner(System.in);
    public static void main (String[] args){
        Prediccion prediccion = new Prediccion ();
        prediccion.inicio();
    }
    public void inicio(){
        meses();
        comprobar();
    }
    public void meses (){
        System.out.println("Escriba el mes en el que nacio ");
        System.out.print("\n");
        System.out.print("ENERO\tFEBRERO\tMARZO\n");
        System.out.print("ABRIL\tMAYO\tJUNIO\n");
        System.out.print("JULIO\tAGOSTO\tSEPTIEMBRE\n");
        System.out.print("OCTUBRE\tNOVIEMBRE\tDICIEMBRE");
        System.out.print("\n\n");
        System.out.println("Ingrese 'fin' para terminar el programa ");
    }
    public void comprobar(){
        if(scan.hasNextLine()){
            String opcion =scan.nextLine();
            opcion.toLowerCase();
            opciones(opcion);
        }
        else{
            System.out.println("Ingrese un valor valido");
        }
    }
    public void opciones(String opcion){
        String equipoFutbol = "";
        String lenguaje = "";
        int numSuerte = 0;
        System.out.println("Ingrese su nombre");
        String nombre = scan.nextLine();
        System.out.println("Ingrese su edad");
        int edad = scan.nextInt();
        if(opcion.equals("enero")){
            equipoFutbol = "Bayern de Munich";
            lenguaje = "C++";
            numSuerte = edad * 3/2;
        }
        else if(opcion.equals("febrero")){
            equipoFutbol = "Atletico Madrid";
            lenguaje = "Python";
            numSuerte = edad - 4;
        }
        else if(opcion.equals("marzo")){
            equipoFutbol = "Chelsea";
            lenguaje = "Java Script";
            numSuerte = edad/2;
        }
        else if(opcion.equals("abril")){
            equipoFutbol = "Manchester Citu";
            lenguaje = "Node.JS";
            numSuerte = edad % 4;
        }
        else if(opcion.equals("mayo")){
            equipoFutbol = "Liverpool";
            lenguaje = "React";
            numSuerte = edad * 3/6;
        }
        else if(opcion.equals("junio")){
            equipoFutbol = "Real Madrir";
            lenguaje = "C#";
            numSuerte = edad + edad;
        }
        else if(opcion.equals("julio")){
            equipoFutbol = "River Plate";
            lenguaje = "Swift";
            numSuerte = edad * edad / 5;
        }
        else if(opcion.equals("agosto")){
            equipoFutbol = "FCB";
            lenguaje = "JAVA";
            numSuerte = edad *1/2 * edad;
        }
        else if(opcion.equals("septiembre")){
            equipoFutbol = "JUVENTUS";
            lenguaje = "PHP";
            numSuerte = edad/edad;
        }
        else if(opcion.equals("octubre")){
            equipoFutbol = "PSG";
            lenguaje = "R";
            numSuerte = edad * 4/3;
        }
        else if(opcion.equals("noviembre")){
            equipoFutbol = "Sevilla CF";
            lenguaje = "Go";
            numSuerte = edad % 2 + 23;
        }
        else if (opcion.equals("diciembre")){
            equipoFutbol = "Manchester United";
            lenguaje = "Ruby";
            numSuerte = (edad + edad)/2;
        }
        else{
            equipoFutbol = "USTED NO POSEE EQUIPO DE FUTBOL, USTED ES UN BOT";
            lenguaje = "USTE HABLA AFGANO";
            numSuerte = 666;
        }
        imprimir(equipoFutbol, lenguaje, numSuerte, nombre);
    }
    public void imprimir(String equipoFutbol, String lenguaje, int numSuerte, String nombre){
        System.out.println("Hola de nuevo, " + nombre);
        System.out.println("Su equipo es: " + equipoFutbol);
        System.out.println("Su lenguaje es: " + lenguaje);
        System.out.println("Su numero de la suerte es: " + numSuerte);
    }
}