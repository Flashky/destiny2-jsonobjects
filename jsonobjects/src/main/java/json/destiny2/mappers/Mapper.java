package json.destiny2.mappers;

public abstract class Mapper<T> implements Mappeable<T> {
	
	@SuppressWarnings("rawtypes")
	protected Class genericClassType;
	
	protected Mapper(Class<T> genericParameter) throws ClassNotFoundException
	{
		String name = genericParameter.toString();
		String className = name.split(" ")[1];
		genericClassType = Class.forName(className);
	}
}
