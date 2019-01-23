import javax.xml.crypto.Data;
import java.util.Random;

public class DataProducer extends DataSource {

    private static Random random = new Random();

    @Override
    public int produceSomeData(){
        return random.nextInt();
    }
}
