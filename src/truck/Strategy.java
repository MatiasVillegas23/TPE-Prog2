package truck;
import java.util.ArrayList;
import establishment.*;

public interface Strategy {
	ArrayList<Animal> eval(Establishment e);
}
