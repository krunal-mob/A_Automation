package com.qa.client;

import java.util.HashMap;
import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {

	//1. Create GET method

	public void get(String url) throws  Throwable {



		//Create one client connection
		CloseableHttpClient httpClient =	HttpClients.createDefault(); 

		//http GET request
		HttpGet httpget = new HttpGet(url);

		CloseableHttpResponse closablehttpresponse =httpClient.execute(httpget);

		// Status Code
		int statusCode =	closablehttpresponse.getStatusLine().getStatusCode();


		System.out.println("The Status Code is -->"+statusCode);

		//JSON String -->Fetch the   Body of the response in String format
		String responseString = EntityUtils.toString(closablehttpresponse.getEntity(), "UTF-8");

		// BUt we need in JSON Format
		JSONObject responseJson = new JSONObject(responseString);

		System.out.println("responseJson ---->>>" + responseJson);

		//For Headers
		Header[] headerArray = 	closablehttpresponse.getAllHeaders();

		HashMap<String , String > allHeaders = new HashMap<String, String>();

		for (Header header :headerArray ) {

			allHeaders.put(header.getName(), header.getValue());
		}

		System.out.println("headers HasMAP---->"+allHeaders);


	}









}
