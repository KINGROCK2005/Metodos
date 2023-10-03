import java.util.Scanner;
public class App {
    static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        //Metodos
        /*Que no requieren datos de entrada ni devuleven datos de salida
         * Que no requieren datos de entrtada pero devuelven datos de salida
         * Que requieren datos de entrada pero no devuelven datos de salida
         * Requieren dattos de entrada y devuelvem datos de salida
         * *********************************************************
         * Metodos sobrecargados(Sobrecarga de datos de entrada)
         * COnsiste en reutilizar el nombre de metodos pero con
         * distintos parametros de entradas
         */
        mostrarHora();
        mostrarHora(4, 30, 50);
        mostrarHora(5, 56);
    }

    //Declaracion de Metodos
    public static void mostrarHora(){ //Version sin parametros de entrada
        System.out.print("Horas: ");
        int hr = lector.nextInt();
        System.out.print("Minutos: ");
        int minut = lector.nextInt();
        System.out.print("Segundos: ");
        int seg = lector.nextInt();
        System.out.println("La hora es " + hr + ":" + minut + ":" + seg);

    }
    //Sobrecargar el metodo mostrarHora()
    public static void mostrarHora(int hr, int min, int seg){
        System.out.println("La hora es " + hr + ":" + min + ":" + seg);
    }
    public static void mostrarHora(int hr, int min){
        int seg= 15;
        System.out.println("La hora es " + hr + ":" + min + ":" + seg);
    }


}
