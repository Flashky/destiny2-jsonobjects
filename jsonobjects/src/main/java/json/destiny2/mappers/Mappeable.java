package json.destiny2.mappers;

import json.destiny2.model.response.ResponseList;
import json.destiny2.model.response.ResponseObject;

public interface Mappeable<T> {

	/**
	 * Generates a ResponseObject for the generic type T using data from the input json.
	 * @param json
	 * @return
	 * @throws Exception
	 */
	ResponseObject<T> getObjectFromJson(String json) throws Exception;
	
	/**
	 * Generates a ResponseList for the generic type T using data from the input json.
	 * @param json
	 * @return
	 * @throws Exception
	 */
	ResponseList<T> getListFromJson(String json) throws Exception;
}
