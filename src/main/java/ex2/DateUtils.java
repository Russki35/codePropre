/**
 * 
 */
package ex2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ETY8
 *
 */
public class DateUtils {

		public static String format (Date dateFinComptage){
			if(dateFinComptage==null){
				return null;
			}
			SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			return f.format(dateFinComptage);
		}
}
