package HILOS_COMPLETANDO_SENTENCIAS_17;

public class Runner {
    public static void escribir(String palabra, int velocidad) {
        char[] caracteres = palabra.toCharArray();
        for (int i=0; i<caracteres.length; i++){
            System.out.print(caracteres[i]);
            try{
                Thread.sleep(velocidad);
            }
            catch (Exception e){
                System.out.println(e);
            }

        }
    }
}
