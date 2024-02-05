public class Javaapplication3 {
    
    static boolean Loggin(String U, String C){
        //Detectamos que el usuario y la contraseña son correctas
        if(U.equals("user1") && C.equals("asdfg")){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //creamos DCorrectos con valor false para poder evitar el breack
        boolean DCorrectos = false;
        //Llamamos la funcion en el For e implementamos los datos
        for(int i = 0; i<3 && !DCorrectos; i++){
            System.out.println("Pon el nombre de usuario");
            String usuario = "";
            System.out.println("Pon la contraseña");
            String contraseña = "";
            
            if(Loggin(usuario, contraseña)){
                //Al detectar que son correctas devolvemos un true
                DCorrectos=true;
                System.out.println("Acceso correcto");
            }else{
                //Si no es correcto se devuekve un false y denegamos el acceso
                System.out.println("Acceso denegado");
            }
            if( i>=2 && DCorrectos){
                //Si se superan los 3 intentos y todos los returns son false
                //se cierra el código
                System.out.println("No te quedan más intentos");
            }
        }
    }   
}