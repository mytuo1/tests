package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;

public class GetResponseAlexa
{
	public static void main(String[] args) throws IOException {
			GetResponseAlexa.getResponse();
			GetResponseAlexa.getCurrentTime();
			GetResponseAlexa.getNextSunday();
	}

	private static String getResponse() 
	{	
		String myurl = "http://google.com";
		try {
				String url = (myurl);
				URL obj = new URL(url);
				HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
				conn.setRequestMethod("GET");
				BufferedReader in = new BufferedReader( new InputStreamReader( conn.getInputStream() ));
				String InputLine;
				StringBuffer response = new StringBuffer();
				while ((InputLine = in.readLine()) != null) {
				response.append(InputLine);
				}
				System.out.println(response.toString());
				return response.toString();
			}
			catch (IOException ex) 
			{
				ex.printStackTrace();
			}
	return null;
    }
	
	private static int getCurrentTime() {		
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("The current date and time is: " + sdf.format(calendar.getTime()) );
		return 0;
	}
	
	public static int getNextSunday() {
	    LocalDate dateTime = LocalDate.now();
	    LocalDate getNextSunday = dateTime.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
	    LocalDate finalDate = getNextSunday.plusWeeks(1);
	    String formattedDate = finalDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	    System.out.println("The next Sunday is: " + formattedDate);
	    return 1;
	}
}