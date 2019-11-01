package filter;

import java.util.ArrayList;
import establishment.*;

public interface Filter {
	
	public abstract ArrayList eval(AgroBusiness e);
}