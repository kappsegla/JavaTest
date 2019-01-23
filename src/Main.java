import java.util.Scanner;

public class Main {

    private Scanner scanner;

    //Dependency Injection via Constructor
    public Main(Scanner scanner){
        this.scanner = scanner;
    }

    //Dependency Injection via setter method.
    //Allows us to change scanner object reference under runtime.
    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * Reads a number from scanner object that is set in constructor or with setScanner
     * @return int value read from scanner
     */
    public int readInt(){
        return scanner.nextInt();
    }

    public static void main(String[] args) {

        Main main = new Main(new Scanner(System.in));
        int i = main.readInt();

        System.out.println(i);

    }
}
