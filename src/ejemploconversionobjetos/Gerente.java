package ejemploconversionobjetos;
public class Gerente extends Empleado{
	
   private String departamento;
   
   public Gerente(String nombre, double sueldo, String departamento) {
      super(nombre, sueldo);
      this.departamento = departamento;
   }

   //Sobreescribimosel metodopadre heredado
   public String obtenerDetalles(){
      //Observamos que para no repetir codigo, podemos utilizar
      //el metododel padre y solo agregar a este metodode la clase hija
      //esto es invocar un metodosobreescrito
      return super.obtenerDetalles() +", departamento: "+departamento;
   }
   public String getDepartamento() {
      return departamento;
   }
   public void setDepartamento(String departamento) {
      this.departamento=departamento;
   }
}