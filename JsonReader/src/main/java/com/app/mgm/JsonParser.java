package com.app.mgm;

import java.io.FileReader;

import org.json.simple.parser.JSONParser;

import com.google.gson.*;


public class JsonParser {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Object obj = new JSONParser().parse(new FileReader("src/test/resources/ShowEventContentResponse_v2.json"));
		// Object obj = new JSONParser().parse(new
		// FileReader("src/test/resources/emp.json"));

		
		// JSONObject JsObj = (JSONObject) obj;
//        
		
		System.out.println(convertObjectToJsonString(obj));
//        ObjectMapper mapper=new ObjectMapper();

		/*
		 * "eventDate": "2023-01-04", "eventTz": "2023-01-04T18:00Z", "eventId":
		 * "694e0fd3-49fc-4413-aaf4-4b46b19f7277", "eventCode": "RCD0104E", "eventTime":
		 * "10:00 AM", "seasonId": "507f9d3c-863a-4bf5-a6bb-eaa40c9db9e6", "programId":
		 * "dd8946d2-ffe6-41d9-b7ed-547bd661fa3d", "offerAvailable": true
		 */

//		String eventDate = (String) JsObj.get("eventDate");
//		String eventTz = (String) JsObj.get("eventTz");
//		String eventId = (String) JsObj.get("eventId");
//		String eventCode = (String) JsObj.get("eventCode");
//		String eventTime = (String) JsObj.get("eventTime");
//		String seasonId = (String) JsObj.get("seasonId");
//		String programId = (String) JsObj.get("programId");
//		String offerAvailable = (String) JsObj.get("offerAvailable");

//		System.out.println(eventDate);
//		System.out.println(eventTz);
//		System.out.println(eventId);
//		System.out.println(eventCode);
//		System.out.println(eventTime);
//		System.out.println(seasonId);
//		System.out.println(programId);
//		System.out.println(offerAvailable);
		
	}

	public static String convertObjectToJsonString(Object source){
  Gson gson = new Gson();
     return gson.toJson(source);
     }

}
