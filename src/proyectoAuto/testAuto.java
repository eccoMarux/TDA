package proyectoAuto;
import java.util.Scanner;
public class testAuto {
    public static void main(String[] args) {
        //
        Scanner sc = new Scanner(System.in);
        int cantAutos;

        cantAutos = verificarLongitudArreglo();
        Auto autos[] = new Auto[cantAutos];
        cargarArreglo(autos);
        serviciosContrato(autos, cantAutos);
    }

    public static int verificarLongitudArreglo() {
        // Verifica si el número ingresado por el usuario es un número válido para la
        // longitud de arreglo
        Scanner sc = new Scanner(System.in);
        int longitud;
        do {
            System.out.println("¿Cuantos autos desea cargar?");
            longitud = sc.nextInt();
            if (longitud <= 0) {
                System.out.println("El numero ingresado es incorrecto. Por favor, intentelo nuevamente. ");
            }
        } while (longitud <= 0);

        return longitud;
    }

    public static void cargarArreglo(Auto[] arregloAuto) {
        // Carga un arreglo de objeto Avion. Se estima que todos los datos ingresados
        // son correctos.
        Scanner sc = new Scanner(System.in);
        String laPatente, elPropietario, elTelefono, elServicio;
        int i;

        for (i = 0; i < arregloAuto.length; i++) {
            System.out.println((i + 1) + "° auto: ");
            System.out.println("Ingrese la patente: ");
            laPatente = sc.next();
            System.out.println("Ingrese el nombre del propietario: ");
            elPropietario = sc.next();
            System.out.println("Ingrese el telefono del propietario: ");
            elTelefono = sc.next();
            System.out.println("Ingrese el servicio contratado: ");
            elServicio = sc.next();
            elServicio = elServicio.toLowerCase();
            System.out.println("");
            arregloAuto[i] = new Auto(laPatente, elPropietario, elTelefono, elServicio);
        }
    }

    public static void serviciosContrato(Auto[] arregloAuto, int cantAutos) {
        int i, j = 0, k = 0, l = 0, longArr;
        longArr = arregloAuto.length;

        Auto autosFull[] = new Auto[cantAutos];
        Auto autosBasica[] = new Auto[cantAutos];
        Auto[] autosExterno = new Auto[cantAutos];

        for (i = 0; i < longArr; i++) {
            switch (arregloAuto[i].getServicioContrato()) {
                case "full":
                    autosFull[j] = arregloAuto[i];
                    j++;
                    break;
                case "basico":
                    autosBasica[k] = arregloAuto[i];
                    k++;
                    break;
                case "externo":
                    autosExterno[l] = arregloAuto[i];
                    l++;
                    break;
            }
        }
        j = 0;
        k = 0;
        l = 0;
        System.out.println("Los Autos con servicio full son: ");
        while (autosFull[j] != null && j < cantAutos) {
            System.out.println("Nombre del propietario: " + autosFull[j].getNombrePropietario() + "\nPatente: "
                    + autosFull[j].getPatente() + "\nTelefono: " + autosFull[j].getTelefono() + "\n");
            j++;
        }
        System.out.println("");
        System.out.println("Los autos con servicio basica son:");
        while (autosBasica[k] != null && k < cantAutos) {
            System.out.println("Nombre del propietario: " + autosBasica[k].getNombrePropietario() + "\nPatente: "
                    + autosBasica[k].getPatente() + "\nTelefono: " + autosBasica[k].getTelefono() + "\n");
            k++;
        }
        System.out.println("");
        System.out.println("Los autos con servicio externo");
        while (autosExterno[l] != null && l < cantAutos) {
            System.out.println("Nombre del propietario: " + autosExterno[l].getNombrePropietario() + "\nPatente: "
                    + autosExterno[l].getPatente() + "\nTelefono: " + autosExterno[l].getTelefono() + "\n");
            l++;
        }
    }

}
