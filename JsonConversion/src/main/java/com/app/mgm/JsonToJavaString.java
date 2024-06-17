package com.app.mgm;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJavaString {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();

		Event [] Event = mapper.readValue(new File("src/test/resources/ShowEventContentResponse_v2.json"), Event [].class);
		
		for(Event e: Event) {
		System.out.println(Arrays.toString(Event));
		}
	}

}
