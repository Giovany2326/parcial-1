public class actividad2 {

    public static void main(String[] args) {
        String texto = "Hola Mundo";
        boolean Palindromo = esPalindromo(texto);
        
        if (Palindromo) {
            System.out.println("Su texto ingresado es un palindromo");
        } else {
            System.out.println("Su texto ingresado no es un palindromo.");
        }
    }

    public static boolean esPalindromo(String cadena) {
  
        String textoLimpio = cadena.toLowerCase().replaceAll("\\s+", "");
        
    
        String textoReverso = new StringBuilder(textoLimpio).reverse().toString();
        

        return textoLimpio.equals(textoReverso);
    }
}
