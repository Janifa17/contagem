import java.sql.Statement;

public class contar {


    public static void main(String[] args) {
            System.out.println("Contando de 1 a 10");
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        public static void main(String[] args){
            int inicio = 3;
            System.out.println("Constant a part de " + inicio);
            for (int i = inicio; i <= 10; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        public static void main (String[] args){
            int inicio = 3;
            int fim = 6;
            System.out.println("Contando de " + inicio + " a " + fim);
            for (int i = inicio; i <= fim; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        public static void main (String[] args){
            int inicio = 2;
            int fim = 6;
            int pausa = 5000;
            System.out.println("Contando de " + inicio + " a " + fim + " com pausa de " + pausa +"milissegundos");
            for (int i = inicio; i < fim; i ++) {
                System.out.print(i + " ");
                try {
                    // Pausa por 2 segundo
                    Thread.sleep(pausa);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
        }
    }

