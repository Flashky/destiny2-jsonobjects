package json.destiny2.mappers;

import com.google.gson.Gson;

import json.destiny2.model.response.ResponseList;
import json.destiny2.model.response.ResponseObject;

public class MapperGson<T> extends Mapper<T> {

	public MapperGson(Class<T> genericParameter) throws ClassNotFoundException
	{
		super(genericParameter);
	}
	
	public ResponseObject<T> getObjectFromJson(String json) throws Exception {
		
		Gson mapper = new Gson();
		CustomParameterizedType type = new CustomParameterizedType(ResponseObject.class, genericClassType);
		
		return mapper.fromJson(json, type);
	}

	public ResponseList<T> getListFromJson(String json) throws Exception {
		
		Gson mapper = new Gson();
		CustomParameterizedType type = new CustomParameterizedType(ResponseList.class, genericClassType);
		
		return mapper.fromJson(json, type);
	}

	
}
