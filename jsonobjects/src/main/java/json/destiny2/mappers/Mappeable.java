package json.destiny2.mappers;

import json.destiny2.model.response.ResponseList;
import json.destiny2.model.response.ResponseObject;

public interface Mappeable<T> {

	ResponseObject<T> getObjectFromJson(String json) throws Exception;
	ResponseList<T> getListFromJson(String json) throws Exception;
}
