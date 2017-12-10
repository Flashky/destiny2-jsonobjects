package json.destiny2.test.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;



public class FileUtils {
	
	/**
	 * Obtains the content of a file as a List<String>, on which each element is a file line.
	 * The file must be located in a resources folder.
	 * @param The filename without path. Example: "my_file.txt"
	 * @return
	 * @throws IOException
	 */
	public static List<String> getFileContent(String filename) throws IOException
	{
		List<String> result = new ArrayList<String>();

		String line;
		InputStream is = FileUtils.class.getClassLoader().getResourceAsStream(filename);
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
	
		while ((line = br.readLine()) != null) 
		{
			result.add(line);
		}
		
		is.close();
		
		return result;
	}
	
	/**
	 * Devuelve un listado del contenido del fichero como un StringBuffer
	 * @return
	 * @throws IOException
	 */
	public static StringBuffer getFileContentAsBuffer(String filename) throws IOException
	{
		StringBuffer result = new StringBuffer();
		InputStream is = null;
		try
		{
			String line;
			is = FileUtils.class.getClassLoader().getResourceAsStream(filename);
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			while ((line = br.readLine()) != null) {
				result.append(line);
			}
		} 
		catch(IOException e) {
			throw e;
		}
		finally {
			if(is != null)
				is.close();
		}
		
		
		return result;
	}
}
