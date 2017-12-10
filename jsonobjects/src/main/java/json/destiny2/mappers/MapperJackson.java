package json.destiny2.mappers;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import json.destiny2.model.response.ResponseList;
import json.destiny2.model.response.ResponseObject;

/**
 * Implementation of JsonMappeable interface.
 * <p>
 * Maps an input json string into a ResponseObject or a ResponseList.
 * </p>
 * <p>
 * The generic type indicates which object or object list will be contained at the ResponseObject/ResponseLists' response.
 * It must be constructed using the class of the generic type. 
 * </p>
 * <p>
 * <strong>Usage example:</strong>
 * </p>
 * <pre>
 * {@code Mapper<GeneralUser> mapper = new Mapper<GeneralUser>(GeneralUser.class);}
 * {@code ResponseObject <GeneralUser> result = mapper.getObjectFromJson(jsonString);}
 * </pre>
 *
 * @param <T>
 */
public class MapperJackson<T> extends Mapper<T> {

	public MapperJackson(Class<T> genericParameter) throws ClassNotFoundException
	{
		super(genericParameter);
	}
	
	public ResponseObject<T> getObjectFromJson(String json) throws Exception {
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL);
		JavaType type = mapper.getTypeFactory().constructParametricType(ResponseObject.class, genericClassType);	

		return mapper.readValue(json, type);
	}

	public ResponseList<T> getListFromJson(String json) throws Exception {
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL);
		JavaType type = mapper.getTypeFactory().constructParametricType(ResponseList.class, genericClassType);
		
		return mapper.readValue(json, type);
	}

}
