public class Main {
  public static void main(String[] args) {

    /* Llamar a suma */
    suma(10,20,30);

    /* Crear coche y agregar puertas */
    Coche miCoche = new Coche();
    miCoche.AgregarPuerta();
    miCoche.AgregarPuerta();
    miCoche.AgregarPuerta();
  }

  /* Función suma */
  public static int suma(int a, int b, int c) {
    int resultado = a + b + c;
    System.out.println(resultado);
    return resultado;
  }

}

/* Clase coche */
class Coche {
  public int puertas = 4;

  public void AgregarPuerta() {
    this.puertas++;
    System.out.println(this.puertas);
  }
}
