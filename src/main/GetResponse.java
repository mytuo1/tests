package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import json.*;

// CASE 1 , GET PLAIN TEXT FROM URL

public class GetResponse
{
	public static void main(String[] args) throws IOException {
			GetResponse.getResponse();
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


// CASE 2 , GET JSON VALUES FROM A JSON


public class GetResponse
{
	public static void main(String[] args) throws IOException {
			GetResponse.getResponse();
	}

	private static int getResponse() 
	{	
		try {
				String myUrl = "http://api.plos.org/search?q=title:DNA";
				String url = (myUrl);
				URL obj = new URL(url);
				HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
				conn.setRequestMethod("GET");
				BufferedReader in = new BufferedReader( new InputStreamReader( conn.getInputStream() ));
				String InputLine;
				StringBuffer response = new StringBuffer();
				while ((InputLine = in.readLine()) != null) {
				response.append(InputLine);
				}    
				JsonObject jsonObj = JsonObject.readFrom(response.toString());
				int i = jsonObj.get("response").asObject().get("numFound").asInt();
				System.out.println(i);
				return i;
    }
		catch (IOException ex) 
		{
			ex.printStackTrace();
		}
		return -1;
    }
}


//CASE 3 , HTTPS CONNECTION RESULTS

public class GetResponse
{
	public static void main(String[] args) throws IOException {
		GetResponse.getResponse();
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


