import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int min = 0;
        int max = 1000;
        int tamano1 = 10;
        int tamano2 = 20;
        int tamano3 = 100;
        int tamano4 = 1000;
        int tamano5 = 5000;
        int tamano6 = 10000;
        int tamano7 = 30000;
        int[] arreglo1 = null;
        int[] arreglo2 = null;
        int[] arreglo3 = null;
        int[] arreglo4 = null;
        int[] arreglo5 = null;
        int[] arreglo6 = null;
        int[] arreglo7 = null;

        do {
            System.out.println("\nHola, bienvenido al programa\n");
            System.out.println("Para empezar, selecciona una de las opciones:");
            System.out.println("Menu Principal\n");
            System.out.println("1. Generar números aleatorios en los arreglos de números y saber su tiempo");
            System.out.println("2. Seleccionar método de ordenamiento para saber el tiempo en que se ordena");
            System.out.println("3. Salir del programa");

            a = sc.nextInt();

            switch (a) {
                case 1:
                    MetodosOrdenamiento impresion = new MetodosOrdenamiento();
                    arreglo1 = new int[tamano1];
                    System.out.println("\nSe está generando el arreglo con valores aleatorios");

                    // ARREGLO DE 10

                    long tiempoInicial = System.nanoTime();

                    for (int i = 0; i < tamano1; i++) {
                        arreglo1[i] = (int) (Math.random() * (max - min + 1) + min);
                    }

                    System.out.print("\nEl arreglo de 10 numeros: [");
                    impresion.imprimir(arreglo1);

                    long tiempoFinal = System.nanoTime();
                    double tiempoEjecucion = ((tiempoFinal - tiempoInicial) / 1_000_000_000.0);
                    System.out.println("en: " + tiempoEjecucion + " segundos");

                    // ARREGLO DE 20 NUMEROS

                    long tiempoInicial2 = System.nanoTime();
                    arreglo2 = new int[tamano2];

                    for (int i = 0; i < tamano1; i++) {
                        arreglo2[i] = arreglo1[i];
                    }

                    for (int i = tamano1; i < tamano2; i++) {
                        arreglo2[i] = (int) (Math.random() * (max - min + 1) + min);
                    }

                    System.out.print("\nEl arreglo de 20 numeros: [");
                    impresion.imprimir(arreglo2);

                    long tiempoFinal2 = System.nanoTime();
                    double tiempoEjecucion2 = ((tiempoFinal2 - tiempoInicial2) / 1_000_000_000.0);
                    System.out.println("en: " + tiempoEjecucion2 + " segundos");

                    // ARREGLO DE 100 NUMEROS
                    long tiempoInicial3 = System.nanoTime();
                    arreglo3 = new int[tamano3];

                    for (int i = 0; i < tamano2; i++) {
                        arreglo3[i] = arreglo2[i];
                    }

                    for (int i = tamano2; i < tamano3; i++) {
                        arreglo3[i] = (int) (Math.random() * (max - min + 1) + min);
                    }

                    System.out.print("\nEl arreglo de 100 numeros: [");
                    impresion.imprimir(arreglo3);

                    long tiempoFinal3 = System.nanoTime();
                    double tiempoEjecucion3 = ((tiempoFinal3 - tiempoInicial3) / 1_000_000_000.0);
                    System.out.println("en: " + tiempoEjecucion3 + " segundos");

                    // ARREGLO DE 1000 NUMEROS //
                    long tiempoInicial4 = System.nanoTime();
                    arreglo4 = new int[tamano4];

                    for (int i = 0; i < tamano3; i++) {
                        arreglo4[i] = arreglo3[i];
                    }

                    for (int i = tamano3; i < tamano4; i++) {
                        arreglo4[i] = (int) (Math.random() * (max - min + 1) + min);
                    }

                    System.out.print("\nEl arreglo de 1000 numeros: [");
                    impresion.imprimir(arreglo4);

                    long tiempoFinal4 = System.nanoTime();
                    double tiempoEjecucion4 = ((tiempoFinal4 - tiempoInicial4) / 1_000_000_000.0);
                    System.out.println("en: " + tiempoEjecucion4 + " segundos");

                    // ARREGLO DE 5000 NUMEROS //
                    long tiempoInicial5 = System.nanoTime();
                    arreglo5 = new int[tamano5];

                    for (int i = 0; i < tamano4; i++) {
                        arreglo5[i] = arreglo4[i];
                    }

                    for (int i = tamano4; i < tamano5; i++) {
                        arreglo5[i] = (int) (Math.random() * (max - min + 1) + min);
                    }

                    System.out.print("\nEl arreglo de 5000 numeros: [");
                    impresion.imprimir(arreglo5); 

                    long tiempoFinal5 = System.nanoTime();
                    double tiempoEjecucion5 = ((tiempoFinal5 - tiempoInicial5) / 1_000_000_000.0);
                    System.out.println("en: " + tiempoEjecucion5 + " segundos");

                    // ARREGLO DE 10000 NUMEROS //
                    long tiempoInicial6 = System.nanoTime();
                    arreglo6 = new int[tamano6];

                    for (int i = 0; i < tamano5; i++) {
                        arreglo6[i] = arreglo5[i];
                    }

                    for (int i = tamano5; i < tamano6; i++) {
                        arreglo6[i] = (int) (Math.random() * (max - min + 1) + min);
                    }

                    System.out.print("\nEl arreglo de 10000 numeros: [");
                    impresion.imprimir(arreglo6); 
                    long tiempoFinal6 = System.nanoTime();
                    double tiempoEjecucion6 = ((tiempoFinal6 - tiempoInicial6) / 1_000_000_000.0);
                    System.out.println("en: " + tiempoEjecucion6 + " segundos");

                    // ARREGLO DE 30000 NUMEROS //
                    long tiempoInicial7 = System.nanoTime();
                    arreglo7 = new int[tamano7];

                    for (int i = 0; i < tamano6; i++) {
                        arreglo7[i] = arreglo6[i];
                    }

                    for (int i = tamano6; i < tamano7; i++) {
                        arreglo7[i] = (int) (Math.random() * (max - min + 1) + min);
                    }

                    System.out.print("\nEl arreglo de 30000 numeros: [");
                    impresion.imprimir(arreglo7); 

                    long tiempoFinal7 = System.nanoTime();
                    double tiempoEjecucion7 = ((tiempoFinal7 - tiempoInicial7) / 1_000_000_000.0);
                    System.out.println("en: " + tiempoEjecucion7 + " segundos");

                    System.out.println("//////////////////////////");
                    System.out.println("\n///////RESUMEN////////");
                    System.out.println("//////////////////////////");
                    System.out.println("ARREGLO DE 10 "+impresion.imprimir(arreglo1)+"GENERADO EN:"+tiempoEjecucion+ " segundos");
                    System.out.println("ARREGLO DE 20 "+impresion.imprimir(arreglo2)+  "GENERADO EN:"+tiempoEjecucion2+ " segundos");
                    System.out.println("ARREGLO DE 100 "+impresion.imprimir(arreglo3)+ "GENERADO EN:"+tiempoEjecucion3+ " segundos");
                    System.out.println("ARREGLO DE 1000 "+impresion.imprimir(arreglo4)+ "GENERADO EN:"+tiempoEjecucion4+ " segundos");
                    //NO MANDE A IMMPRIMIR LOS DEMAS PORQUE EL DE 30000 TAPA TODA LA TERMINAL POR ESO SE MANDARON A 
                    //IMPRIMIR ANTES PARA SABER SU TIEMPO DE EJECUCION Y SE MANDO A IMPRIMIR SOLO LOS PRIMEROS PARA QUE 
                    //SE VEA QUE SIGUEN EL PRINCIPIO DE QUE EMPIECEN
                    //COMO EL ARREGLO ANTERIOR
                    System.out.println("ARREGLO DE 5000 GENERADO EN:"+tiempoEjecucion5+ " segundos"); 
                    System.out.println("ARREGLO DE 10000 GENERADO EN:"+tiempoEjecucion6+ " segundos");
                    System.out.println("ARREGLO DE 30000 GENERADO EN:"+tiempoEjecucion7+ " segundos");



                    break;

                case 2:
                    if (arreglo7 != null && arreglo7.length == tamano7) {
                        MetodosOrdenamiento mtd = new MetodosOrdenamiento();
                        seleccionarMetodo(sc, mtd, arreglo1, arreglo2, arreglo3, arreglo4, arreglo5, arreglo6,
                                arreglo7);

                    } else {
                        System.out.println("\n/////////////////////////////////////////////////////////////");
                        System.out.println("\nPrimero debes generar los valores aleatorios de todos los arreglos");
                        System.out.println("\n/////////////////////////////////////////////////////////////");
                    }
                    break;

                case 3:
                    System.out.println("\nSaliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }

        } while (a != 3);

        System.out.println("¡Hasta luego!");
    }

    public static void seleccionarMetodo(Scanner sc, MetodosOrdenamiento metodos, int[] arreglo1, int[] arreglo2,
            int[] arreglo3, int[] arreglo4, int[] arreglo5, int[] arreglo6, int[] arreglo7) {

        int m;
        System.out.println("\n//////////////////////////////////////////////////////////////");
        System.out
                .println("Seleccione el método con el que desea ordenar su arreglo para saber su tiempo de ejecución:");
        System.out.println("1. Método de Burbuja Mejorado");
        System.out.println("2. Método de Selección");
        System.out.println("3. Método de Inserción");

        m = sc.nextInt();

        switch (m) {
            case 1:
                System.out.println("\nHa seleccionado el método de Burbuja mejorado");

                System.out.println("El arreglo de 10 ordenado por Burbuja mejorado en: [");
                long ti1 = System.nanoTime();
                metodos.burbujaMejorado(arreglo1);
                metodos.imprimir(arreglo1);
                long tf1 = System.nanoTime();
                double te1 = ((tf1 - ti1) / 1_000_000_000.0);
                System.out.println("en: " + te1 + " segundos");

                System.out.println("El arreglo de 20 por Burbuja mejorado ordenado: [");
                long ti2 = System.nanoTime();
                metodos.burbujaMejorado(arreglo2);
                metodos.imprimir(arreglo2);
                long tf2 = System.nanoTime();
                double te2 = ((tf2 - ti2) / 1_000_000_000.0);
                System.out.println("en: " + te2 + " segundos");

                System.out.println("El arreglo de 100 ordenado por Burbuja mejorado: [");
                long ti3 = System.nanoTime();
                metodos.burbujaMejorado(arreglo3);
                metodos.imprimir(arreglo3);
                long tf3 = System.nanoTime();
                double te3 = ((tf3 - ti3) / 1_000_000_000.0);
                System.out.println("en: " + te3 + " segundos");

                System.out.println("El arreglo de 1000 ordenado por Burbuja mejorado: [");
                long ti4 = System.nanoTime();
                metodos.burbujaMejorado(arreglo4);
                metodos.imprimir(arreglo4);
                long tf4 = System.nanoTime();
                double te4 = ((tf4 - ti4) / 1_000_000_000.0);
                System.out.println("en: " + te4 + " segundos");

                System.out.println("El arreglo de 5000 ordenado por Burbuja mejorado: [");
                long ti5 = System.nanoTime();
                metodos.burbujaMejorado(arreglo5);
                metodos.imprimir(arreglo5); 
                long tf5 = System.nanoTime();
                double te5 = ((tf5 - ti5) / 1_000_000_000.0);
                System.out.println("en: " + te5 + " segundos");

                System.out.println("El arreglo de 10000 ordenado por Burbuja mejorado: [");
                long ti6 = System.nanoTime();
                metodos.burbujaMejorado(arreglo6);
                metodos.imprimir(arreglo6); 
                long tf6 = System.nanoTime();
                double te6 = ((tf6 - ti6) / 1_000_000_000.0);
                System.out.println("en: " + te6 + " segundos");

                System.out.println("El arreglo de 30000 ordenado por Burbuja mejorado: [");
                long ti7 = System.nanoTime();
                metodos.burbujaMejorado(arreglo7);
                metodos.imprimir(arreglo7); 
                long tf7 = System.nanoTime();
                double te7 = ((tf7 - ti7) / 1_000_000_000.0);
                System.out.println("en: " + te7 + " segundos");

                System.out.println("//////////////////////////");
                System.out.println("\n///////RESUMEN////////");
                System.out.println("//////////////////////////");
                    System.out.println("BURBUJA MEJORADO: ARREGLO DE 10 "+metodos.imprimir(arreglo1)+"GENERADO EN:"+te1+ " segundos");
                    System.out.println("BURBUJA MEJORADO: ARREGLO DE 20 "+metodos.imprimir(arreglo2)+  "GENERADO EN:"+te2+ " segundos");
                    System.out.println("BURBUJA MEJORADO: ARREGLO DE 100 "+metodos.imprimir(arreglo3)+ "GENERADO EN:"+te3+ " segundos");
                    System.out.println("BURBUJA MEJORADO: ARREGLO DE 1000 "+metodos.imprimir(arreglo4)+ "GENERADO EN:"+te4+ " segundos");
                    //NO MANDE A IMMPRIMIR LOS DEMAS PORQUE EL DE 30000 TAPA TODA LA TERMINAL POR ESO SE MANDARON A 
                    //IMPRIMIR ANTES PARA SABER SU TIEMPO DE EJECUCION Y SE MANDO A IMPRIMIR SOLO LOS PRIMEROS PARA QUE 
                    //SE VEA QUE SIGUEN EL PRINCIPIO DE QUE EMPIECEN
                    //COMO EL ARREGLO ANTERIOR
                    System.out.println("BURBUJA MEJORADO: ARREGLO DE 5000 GENERADO EN:"+te5+ " segundos"); 
                    System.out.println("BURBUJA MEJORADO: ARREGLO DE 10000 GENERADO EN:"+te6+ " segundos");
                    System.out.println("BURBUJA MEJORADO: ARREGLO DE 30000 GENERADO EN:"+te7+ " segundos");

                break;

            case 2:
                System.out.println("\nHa seleccionado el método de Selección");

                System.out.println("El arreglo de 10 ordenado por Seleccion: [");
                long ti8 = System.nanoTime();
                metodos.SelectionSort(arreglo1);
                metodos.imprimir(arreglo1);
                long tf8 = System.nanoTime();
                double te8 = ((tf8 - ti8) / 1_000_000_000.0);
                System.out.println("en: " + te8 + " segundos");

                System.out.println("El arreglo de 20 ordenado por Seleccion: [");
                long ti9 = System.nanoTime();
                metodos.SelectionSort(arreglo2);
                metodos.imprimir(arreglo2);
                long tf9 = System.nanoTime();
                double te9 = ((tf9 - ti9) / 1_000_000_000.0);
                System.out.println("en: " + te9 + " segundos");

                System.out.println("El arreglo de 100 ordenado por Seleccion: [");
                long ti10 = System.nanoTime();
                metodos.SelectionSort(arreglo3);
                metodos.imprimir(arreglo3);
                long tf10 = System.nanoTime();
                double te10 = ((tf10 - ti10) / 1_000_000_000.0);
                System.out.println("en: " + te10 + " segundos");

                System.out.println("El arreglo de 1000 ordenado por Seleccion: [");
                long ti11 = System.nanoTime();
                metodos.SelectionSort(arreglo4);
                metodos.imprimir(arreglo4);
                long tf11 = System.nanoTime();
                double te11 = ((tf11 - ti11) / 1_000_000_000.0);
                System.out.println("en: " + te11 + " segundos");

                System.out.println("El arreglo de 5000 ordenado por Seleccion: [");
                long ti12 = System.nanoTime();
                metodos.SelectionSort(arreglo5);
                metodos.imprimir(arreglo5);
                long tf12 = System.nanoTime();
                double te12 = ((tf12 - ti12) / 1_000_000_000.0);
                System.out.println("en: " + te12 + " segundos");

                System.out.println("El arreglo de 10000 ordenado por Seleccion: [");
                long ti13 = System.nanoTime();
                metodos.SelectionSort(arreglo6);
                metodos.imprimir(arreglo6); 
                long tf13 = System.nanoTime();
                double te13 = ((tf13 - ti13) / 1_000_000_000.0);
                System.out.println("en: " + te13 + " segundos");

                System.out.println("El arreglo de 30000 ordenado por Seleccion: [");
                long ti14 = System.nanoTime();
                metodos.SelectionSort(arreglo7);
                metodos.imprimir(arreglo7); 
                long tf14 = System.nanoTime();
                double te14 = ((tf14 - ti14) / 1_000_000_000.0);
                System.out.println("en: " + te14 + " segundos");

                System.out.println("//////////////////////////");
                System.out.println("\n///////RESUMEN////////");
                System.out.println("//////////////////////////");
                    System.out.println("SELECCION: ARREGLO DE 10 "+metodos.imprimir(arreglo1)+"GENERADO EN:"+te8+ " segundos");
                    System.out.println("SELECCION: ARREGLO DE 20 "+metodos.imprimir(arreglo2)+  "GENERADO EN:"+te9+ " segundos");
                    System.out.println("SELECCION: ARREGLO DE 100 "+metodos.imprimir(arreglo3)+ "GENERADO EN:"+te10+ " segundos");
                    System.out.println("SELECCION: ARREGLO DE 1000 "+metodos.imprimir(arreglo4)+ "GENERADO EN:"+te11+ " segundos");
                    //NO MANDE A IMMPRIMIR LOS DEMAS PORQUE EL DE 30000 TAPA TODA LA TERMINAL POR ESO SE MANDARON A 
                    //IMPRIMIR ANTES PARA SABER SU TIEMPO DE EJECUCION Y SE MANDO A IMPRIMIR SOLO LOS PRIMEROS PARA QUE 
                    //SE VEA QUE SIGUEN EL PRINCIPIO DE QUE EMPIECEN
                    //COMO EL ARREGLO ANTERIOR
                    System.out.println("SELECCION: ARREGLO DE 5000 GENERADO EN:"+te12+ " segundos"); 
                    System.out.println("SELECCION: ARREGLO DE 10000 GENERADO EN:"+te13+ " segundos");
                    System.out.println("SELECCION: ARREGLO DE 30000 GENERADO EN:"+te14+ " segundos");

                break;

            case 3:
                System.out.println("\nHa seleccionado el método de Inserción");

                System.out.println("El arreglo de 10 ordenado por Insercion: [");
                long ti15 = System.nanoTime();
                metodos.insertionSort(arreglo1);
                metodos.imprimir(arreglo1);
                long tf15 = System.nanoTime();
                double te15 = ((tf15 - ti15) / 1_000_000_000.0);
                System.out.println("en: " + te15 + " segundos");

                System.out.println("El arreglo de 20 ordenado por Insercion: [");
                long ti16 = System.nanoTime();
                metodos.insertionSort(arreglo2);
                metodos.imprimir(arreglo2);
                long tf16 = System.nanoTime();
                double te16 = ((tf16 - ti16) / 1_000_000_000.0);
                System.out.println("en: " + te16 + " segundos");


                System.out.println("El arreglo de 100 ordenado por Insercion: [");
                long ti17 = System.nanoTime();
                metodos.insertionSort(arreglo3);
                metodos.imprimir(arreglo3);
                long tf17 = System.nanoTime();
                double te17 = ((tf17 - ti17) / 1_000_000_000.0);
                System.out.println("en: " + te17 + " segundos");

                System.out.println("El arreglo de 1000 ordenado por Insercion: [");
                long ti18 = System.nanoTime();
                metodos.insertionSort(arreglo4);
                metodos.imprimir(arreglo4);
                long tf18 = System.nanoTime();
                double te18 = ((tf18 - ti18) / 1_000_000_000.0);
                System.out.println("en: " + te18 + " segundos");

                System.out.println("El arreglo de 5000 ordenado por Insercion: [");
                long ti19 = System.nanoTime();
                metodos.insertionSort(arreglo5);
                metodos.imprimir(arreglo5);  
                long tf19 = System.nanoTime();
                double te19 = ((tf19 - ti19) / 1_000_000_000.0);
                System.out.println("en: " + te19 + " segundos");

                System.out.println("El arreglo de 10000 ordenado por Insercion: [");
                long ti20 = System.nanoTime();
                metodos.insertionSort(arreglo6);
                metodos.imprimir(arreglo6);  
                long tf20 = System.nanoTime();
                double te20 = ((tf20 - ti20) / 1_000_000_000.0);
                System.out.println("en: " + te20 + " segundos");

                System.out.println("El arreglo de 30000 ordenado por Insercion: [");
                long ti21 = System.nanoTime();
                metodos.insertionSort(arreglo7);
                metodos.imprimir(arreglo7); 
                long tf21 = System.nanoTime();
                double te21 = ((tf21 - ti21) / 1_000_000_000.0);
                System.out.println("en: " + te21 + " segundos");

                System.out.println("//////////////////////////");
                System.out.println("\n///////RESUMEN////////");
                System.out.println("//////////////////////////");
                
                System.out.println("INSERCION: ARREGLO DE 10 "+metodos.imprimir(arreglo1)+"GENERADO EN:"+te15+ " segundos");
                System.out.println("INSERCION: ARREGLO DE 20 "+metodos.imprimir(arreglo2)+  "GENERADO EN:"+te16+ " segundos");
                System.out.println("INSERCION: ARREGLO DE 100 "+metodos.imprimir(arreglo3)+ "GENERADO EN:"+te17+ " segundos");
                System.out.println("INSERCION: ARREGLO DE 1000 "+metodos.imprimir(arreglo4)+ "GENERADO EN:"+te18+ " segundos");
                //NO MANDE A IMMPRIMIR LOS DEMAS PORQUE EL DE 30000 TAPA TODA LA TERMINAL POR ESO SE MANDARON A 
                //IMPRIMIR ANTES PARA SABER SU TIEMPO DE EJECUCION Y SE MANDO A IMPRIMIR SOLO LOS PRIMEROS PARA QUE 
                //SE VEA QUE SIGUEN EL PRINCIPIO DE QUE EMPIECEN
                //COMO EL ARREGLO ANTERIOR
                System.out.println("INSERCION: ARREGLO DE 5000 GENERADO EN:"+te19+ " segundos"); 
                System.out.println("INSERCION: ARREGLO DE 10000 GENERADO EN:"+te20+ " segundos");
                System.out.println("INSERCION: ARREGLO DE 30000 GENERADO EN:"+te21+ " segundos");

                break;

            default:
                System.out.println("Ingrese la opción correcta e intente nuevamente");
                break;
        }
    }
}
