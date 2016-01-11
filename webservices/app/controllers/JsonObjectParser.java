package controllers;

import java.io.IOException;

import play.db.ebean.Model;
import model.vo.*;
import com.google.gson.*;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonObjectParser {
	public static JsonNode Serialize(Object object) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(object);
		return mapper.readTree(json);
	}

	public static <T extends Object> T Deserialize(JsonNode jsonNode, Class<T> type) {

		Gson gson = new GsonBuilder().setDateFormat("MM/dd/yyyy").create();
		System.out.println("@@@@" + jsonNode.toString());
		return gson.fromJson(jsonNode.toString(), type);

		}
}