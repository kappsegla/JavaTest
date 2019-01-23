import java.util.Scanner;

public class Main {

    private Scanner scanner;
    private DataSource dataProducer;

    //Dependency Injection via Constructor
    public Main(Scanner scanner, DataSource dataProducer) {
        this.scanner = scanner;
        this.dataProducer = dataProducer;
    }

    //Dependency Injection via setter method.
    //Allows us to change scanner object reference under runtime.
    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * Reads a number from scanner object that is set in constructor or with setScanner
     *
     * @return int value read from scanner
     */
    public int readInt() {
        return scanner.nextInt();
    }

    public int getInt() {
        return dataProducer.produceSomeData();
    }


    public static void main(String[] args) {

        Main main = new Main(new Scanner(System.in), new DataProducer());
        int i = main.readInt();

        System.out.println(i);
        System.out.println(main.getInt());
    }
}
