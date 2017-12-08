package tp.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;

public class HttpUtil {

	
	
	public HttpUtil() {
		super();
	}

	public static void logParameters(HttpServletRequest req) {
		Map<String, String[]> parameters = req.getParameterMap();
		
		for (Entry<String,String[]> param : parameters.entrySet()) {
			System.out.println(param.getKey() + ": " + toString(param.getValue()));  //à refaire : réécrire la fonction toString pour un tableau
		}
	}
	
	private static StringBuffer toString(String[] tab) {
		StringBuffer result = new StringBuffer();
		result.append("[ ");
		String comma ="";
		for (String string : tab) {
			result.append(comma);
			result.append(string);
			comma = ", ";
		}
		result.append(" ]");
		return result;
	}
	
	public static void convertParameters(HttpServletRequest request) throws ParseException {
		Map<String, String[]> parameters = request.getParameterMap();
		
		boolean accepteCGV = "on".equals(parameters.get("cgv")[0]);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
		
		Date d = formatter.parse(parameters.get("delivdate")[0]);
		
		String dateStr = parameters.get("delivdate")[0];
		
		int quantity = Integer.parseInt(parameters.get("quantity")[0]);
		
		System.out.println("cgv : " + accepteCGV);
		System.out.println("date de livraison : " +d);
		System.out.println("quantité : " + quantity);
	}
}
