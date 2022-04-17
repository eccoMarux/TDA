package proyectoAuto;

public class Auto {

    //Atributos
    String patente;
    String nombrePropietario;
    String telefono;
    String servicioContrato;

    //Constructor
    public Auto(String laPatente, String elNombrePropietario, String elTelefono, String elServicioContrato) {
        this.patente = laPatente;
        this.nombrePropietario = elNombrePropietario;
        this.telefono = elTelefono;
        this.servicioContrato = elServicioContrato;
    }

    public Auto(String laPatente) {
        this.patente = laPatente;
        this.nombrePropietario = " ";
        this.telefono = " ";
        this.servicioContrato = " ";
    }

    //Observadores
    public String getPatente() {
        return this.patente;
    }

    public String getNombrePropietario() {
        return this.nombrePropietario;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public String getServicioContrato() {
        return this.servicioContrato;
    }
    
    //Modificadores
    public void setTelefono(String elTelefono){
        this.telefono=elTelefono;
    }
    
    public void setServicio(String newServicio){
        this.servicioContrato=newServicio;
    }
    
    //Propias del tipo
   public boolean igualA(Auto objeto){
       return (this.patente.equalsIgnoreCase(objeto.getPatente()));
   }
   
   public static void toString(Auto objeto){
       System.out.println("Nombre del propietario: "+objeto.getNombrePropietario() +"\nPatente: "+ objeto.getPatente() + "\nTelefono: "+objeto.getTelefono() + "\nServicio: "+objeto.getServicioContrato());
   }
   
}
