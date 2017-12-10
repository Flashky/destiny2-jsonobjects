package json.destiny2.mappers;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class CustomParameterizedType implements ParameterizedType {

	private Class<?> rawClass;
	private Class<?> parameter;
	
	public CustomParameterizedType(Class<?> rawClass, Class<?> parameter)
	{
		this.rawClass = rawClass;
		this.parameter = parameter;
	}
	
	public Type[] getActualTypeArguments() {
		return new Type[] {parameter};
	}

	public Type getOwnerType() {
		return null;
	}

	public Type getRawType() {
		return rawClass;
	}

}
