import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Figura> figuras = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n--- MENÚ FIGURAS ---");
            System.out.println("1. Círculo");
            System.out.println("2. Rectángulo");
            System.out.println("3. Triángulo");
            System.out.println("4. Cono");
            System.out.println("5. Cilindro");
            System.out.println("6. Paralelepípedo");
            System.out.println("7. Tetraedro");
            System.out.println("8. Mostrar todas las figuras");
            System.out.println("9. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();

            Figura f = null;
            switch (opcion) {
                case 1: f = new Circulo(); break;
                case 2: f = new Rectangulo(); break;
                case 3: f = new Triangulo(); break;
                case 4: f = new Cono(); break;
                case 5: f = new Cilindro(); break;
                case 6: f = new Paralelepipedo(); break;
                case 7: f = new Tetraedro(); break;
                case 8:
                    System.out.println("\n--- LISTA DE FIGURAS ---");
                    for (int i = 0; i < figuras.size(); i++) {
                        System.out.println("Figura #" + (i + 1) + " (" + figuras.get(i).getClass().getSimpleName() + ")");
                        figuras.get(i).imprimirAtributos();
                        System.out.println("--------------------\n");
                    }
                    continue;
                case 9:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

            if (f != null) {
                f.leerDatos(sc);
                figuras.add(f);
                System.out.println("¡Figura agregada con éxito!");
            }
        } while (opcion != 9);

        sc.close();
    }
}