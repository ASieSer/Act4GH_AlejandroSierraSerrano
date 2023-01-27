
public class EjemploArrayAleatorio {

  public static void main(String[] args) {
    
    final int LARGOARRAY = 30;
    final int INICIOINTERVALO = 1;
    final int FININTERVALO = 10;
    int[] numeros = new int[LARGOARRAY];
    int[] repeticiones = new int[20];
    int i = 0;
    
    for (i = 0; i < LARGOARRAY; i++) {
      numeros[i] = (int)(Math.random() * (FININTERVALO - INICIOINTERVALO + 1) + INICIOINTERVALO);
      if (numeros[i] > 0) {
        if (numeros[i] == numeros[i]) {
          repeticiones[numeros[i]]++;  
        }
      }
    }

    for(i = 0; i < LARGOARRAY; i++) {
      System.out.print(numeros[i] + " ");
    }
    
    System.out.println();
    
    for(i = 0; i < LARGOARRAY; i++) {
      System.out.println("El número " + numeros[i] + " se repite " + repeticiones[i] + " veces.");
    }
    
  }

}
