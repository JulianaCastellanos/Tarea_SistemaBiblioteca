
public class Main {
    public static void main(String[] args) {

        //Desarrollado por: Juliana Castellanos Vanegas
        //Programación II, 302T SIS
        
        System.out.println("-----------------------------------");

        Libro l1 = new Libro ("El palacio de espejos", "Margaret Peterson", 3, "disponible");
        l1.mostrarinfo();
        l1.agregarCopia(2);
        l1.disponibilidad();
        System.out.println("");
        System.out.println(l1.prestar(3));

        System.out.println("-----------------------------------");

        Libro l2 = new Libro ("Al final mueren los dos", "Adam silvera", 1, "disponible");
        l2.mostrarinfo();
        l2.agregarCopia(1);
        l2.disponibilidad();
        System.out.println("");
        System.out.println(l2.prestar(4));

        System.out.println("-----------------------------------");

        Libro l3 = new Libro("La chica del tren", "Paula Hawkins", 0, "no disponible");
        l3.mostrarinfo();
        l3.agregarCopia(1);
        l3.disponibilidad();
        System.out.println("");
        System.out.println(l3.prestar(1));

        System.out.println("-----------------------------------");

    }
}
