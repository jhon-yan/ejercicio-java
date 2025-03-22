public class licencia {
    public static void main(String[] args) {
        int edad = 28;
        boolean tienelicencia = true;

        if(edad>18 && tienelicencia == true) {
            System.out.println("puede conducir");
        }
        if(edad < 18 && tienelicencia == false) {
            System.out.println("no puede conducir");
        }
        if(edad < 18 && tienelicencia == true) {
            System.out.println("puedes conducir, pero no tienes suficiente edad para conducir");
        }
    }
}
