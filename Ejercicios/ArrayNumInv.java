public class Javaapplication3 {
    
    static int[] array(int n){
        /*Creamos una funcion donde recibimos el numero introducido por el usuario*/
        int tam = n;
        int TamArray = 0;
        /*Nos aseguramos que el numero introducido no sea 0*/
        if(n == 0)
            return new int [] {0};
        while(tam > 0){
            /*Si el numero es menos a 10 y mayor a 0 solo augmentamos en 1 el array*/
            if((tam < 10) && (tam > 0)){
                TamArray++;
            /*Si el numero es mayor a 10 se aumenta el array hasta cantidad total 
                de los caracteres introducidos*/
            }else if(tam >= 10){
                TamArray++;
                tam/=10;
            }    
        }
        /*Creamos el array con el tamaño de TamArray*/
        int[] resultado = new int[TamArray];
        
        /*Hacemos el for para ingresar los datos en el array*/
        for(int i = 0; i < resultado.length; i++){
            /*para separar los datos dividimos entre 10 y nos quedamos con el residuo*/
            resultado[i] = (n%10);
            /*Dicidimos entre 10 para acortar el número*/
            n/=10;
        }
        /*Devolvemos el array de nombre resultado*/
        return resultado;
    }
        
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon una cadena de números");
        int num = sc.nextInt();
        int[] dig = array(num);
        for(int i = 0; i < dig.length; i++)
            System.out.println(dig);
    }
        
}

