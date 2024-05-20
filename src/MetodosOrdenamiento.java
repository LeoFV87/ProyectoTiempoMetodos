public class MetodosOrdenamiento {
    
    //Metodo de ordenamiento de Burbuja con Ajuste
    public void burbujaMejorado(int[] arreglo) {

      int aux_temporal;
  
      for (int i=0; i<arreglo.length-1; i++){
  
          for(int j=0; j<arreglo.length-1 - i; j++){
  
              if (arreglo[j]>arreglo[j+1]){
                  aux_temporal= arreglo[j];
                  arreglo[j]= arreglo[j+1];
                  arreglo[j+1]= aux_temporal;
              } 
              
          }
      }
    
    }
  

   //Metodo de ordenamiento de Seleccion

   public void SelectionSort (int[] arreglo){
    int tamano = arreglo.length;

    for (int i = 0; i < tamano - 1; i++) {
    int index_menor = i;

    for (int j = i + 1; j < tamano; j++) {

        if (arreglo[j] < arreglo[index_menor]) {
            index_menor = j;
        }
    }

    int aux = arreglo[index_menor];
    arreglo[index_menor] = arreglo[i];
    arreglo[i] = aux;

} 


}


//Metodo de ordenamiento de Insercion

public void insertionSort(int[] arreglo) {
    for (int i = 1; i < arreglo.length; i++) {
      int actual = arreglo[i];
      int j = i - 1;
  
      while (j >= 0 && arreglo[j] > actual) {
        arreglo[j + 1] = arreglo[j];
        j--;
      }
      arreglo[j + 1] = actual;
    }
  
 
  }



  public String imprimir (int[] arreglo){

    for (int i=0; i<arreglo.length; i++){
         System.out.print(arreglo[i] + ",");

    }
    System.out.println("]");
    return ("");
}





}
