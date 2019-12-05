package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

	public class GetResposneNayden
	{
		public static void main(String[] args) throws IOException {
				GetResposneNayden.getResponse();
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
	}