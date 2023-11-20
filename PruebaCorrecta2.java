public class PruebaCorrecta2 {
    public static void mostrartablashasta(int a){
        int valor;
        for (int i=1; i<=a; i++){
            for (int j=1; j<=a;j++){
                valor = i * j;
                System.out.println(i + " * " + j + " = "+ valor);
            }
        System.out.println("--------");
        }
    }
public static void main(String[] args) {
        int x = 2;
        mostrartablashasta(x);
    }
}
