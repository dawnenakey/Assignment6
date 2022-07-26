import java.io.IOException;
import java.time.Year;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;





public class Main {
	public static void main(String[] args) throws IOException {
		
		FileRead fileRead = new FileRead();
		PopulateSales populateSales = new PopulateSales();
		
		ArrayList<SalesData> modelSales = fileRead.readData("model3.csv");
		populateSales.populateModelData(modelSales, "3");
		System.out.println();
		
		modelSales = fileRead.readData("modelS.csv");
		populateSales.populateModelData(modelSales, "S");
		System.out.println();

		modelSales = fileRead.readData("modelX.csv");
		populateSales.populateModelData(modelSales, "X");
	}
}

