package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class GetResponsepetar {


		public static void main(String[] args) throws IOException {
			GetResponsepetar.getResponse();
		}

		private static String getResponse() 
		{	
			try {
					String myUrl = "https://google.com";
					String url = (myUrl);
					URL obj = new URL(url);
					HttpsURLConnection conn = (HttpsURLConnection) obj.openConnection();
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
	}


