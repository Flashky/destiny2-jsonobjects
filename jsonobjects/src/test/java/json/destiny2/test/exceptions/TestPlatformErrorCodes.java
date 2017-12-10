package json.destiny2.test.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.google.gson.Gson;

import json.destiny2.model.exceptions.PlatformErrorCodes;
import json.destiny2.test.utils.FileUtils;

public class TestPlatformErrorCodes {

	private static ObjectMapper mapperJackson = null;
	private static Gson mapperGson = null;
	
	private static final String PLATFORM_ERROR_CODES_FILE_00 = "PlatformErrorCodes_00.json";
	private static final String PLATFORM_ERROR_CODES_FILE_01 = "PlatformErrorCodes_01.json";
	private static final String PLATFORM_ERROR_CODES_FILE_02 = "PlatformErrorCodes_02.json";
	private static final String PLATFORM_ERROR_CODES_FILE_03 = "PlatformErrorCodes_03.json";
	private static final String PLATFORM_ERROR_CODES_FILE_04 = "PlatformErrorCodes_04.json";
	private static final String PLATFORM_ERROR_CODES_FILE_05 = "PlatformErrorCodes_05.json";
	private static final String PLATFORM_ERROR_CODES_FILE_06 = "PlatformErrorCodes_06.json";
	private static final String PLATFORM_ERROR_CODES_FILE_07 = "PlatformErrorCodes_07.json";
	private static final String PLATFORM_ERROR_CODES_FILE_08 = "PlatformErrorCodes_08.json";
	private static final String PLATFORM_ERROR_CODES_FILE_09 = "PlatformErrorCodes_09.json";
	private static final String PLATFORM_ERROR_CODES_FILE_10 = "PlatformErrorCodes_10.json";
	private static final String PLATFORM_ERROR_CODES_FILE_11 = "PlatformErrorCodes_11.json";
	private static final String PLATFORM_ERROR_CODES_FILE_12 = "PlatformErrorCodes_12.json";
	private static final String PLATFORM_ERROR_CODES_FILE_13 = "PlatformErrorCodes_13.json";
	private static final String PLATFORM_ERROR_CODES_FILE_14 = "PlatformErrorCodes_14.json";
	private static final String PLATFORM_ERROR_CODES_FILE_INVALID = "PlatformErrorCodes_invalid.json";
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		mapperJackson = new ObjectMapper();
		mapperJackson.enable(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL);
		mapperGson = new Gson();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPlatformErrorCodeJackson_00() {
		PlatformErrorCodes errorCode = readJacksonJsonFile(PLATFORM_ERROR_CODES_FILE_00);
		assertEquals(PlatformErrorCodes.None, errorCode);
	}
	
	@Test
	public void testPlatformErrorCodeJackson_01() {
		PlatformErrorCodes errorCode = readJacksonJsonFile(PLATFORM_ERROR_CODES_FILE_01);
		assertEquals(PlatformErrorCodes.Success, errorCode);
	}
	
	@Test
	public void testPlatformErrorCodeJackson_02() {
		PlatformErrorCodes errorCode = readJacksonJsonFile(PLATFORM_ERROR_CODES_FILE_02);
		assertEquals(PlatformErrorCodes.TransportException, errorCode);
	}
	
	@Test
	public void testPlatformErrorCodeJackson_03() {
		PlatformErrorCodes errorCode = readJacksonJsonFile(PLATFORM_ERROR_CODES_FILE_03);
		assertEquals(PlatformErrorCodes.UnhandledException, errorCode);
	}
	
	@Test
	public void testPlatformErrorCodeJackson_04() {
		PlatformErrorCodes errorCode = readJacksonJsonFile(PLATFORM_ERROR_CODES_FILE_04);
		assertEquals(PlatformErrorCodes.NotImplemented, errorCode);
	}
	
	@Test
	public void testPlatformErrorCodeJackson_05() {
		PlatformErrorCodes errorCode = readJacksonJsonFile(PLATFORM_ERROR_CODES_FILE_05);
		assertEquals(PlatformErrorCodes.SystemDisabled, errorCode);
	}
	
	@Test
	public void testPlatformErrorCodeJackson_06() {
		PlatformErrorCodes errorCode = readJacksonJsonFile(PLATFORM_ERROR_CODES_FILE_06);
		assertEquals(PlatformErrorCodes.FailedToLoadAvailableLocalesConfiguration, errorCode);
	}
	
	@Test
	public void testPlatformErrorCodeJackson_07() {
		PlatformErrorCodes errorCode = readJacksonJsonFile(PLATFORM_ERROR_CODES_FILE_07);
		assertEquals(PlatformErrorCodes.ParameterParseFailure, errorCode);
	}
	
	@Test
	public void testPlatformErrorCodeJackson_08() {
		PlatformErrorCodes errorCode = readJacksonJsonFile(PLATFORM_ERROR_CODES_FILE_08);
		assertEquals(PlatformErrorCodes.ParameterInvalidRange, errorCode);
	}
	
	@Test
	public void testPlatformErrorCodeJackson_09() {
		PlatformErrorCodes errorCode = readJacksonJsonFile(PLATFORM_ERROR_CODES_FILE_09);
		assertEquals(PlatformErrorCodes.BadRequest, errorCode);
	}
	
	@Test
	public void testPlatformErrorCodeJackson_10() {
		PlatformErrorCodes errorCode = readJacksonJsonFile(PLATFORM_ERROR_CODES_FILE_10);
		assertEquals(PlatformErrorCodes.AuthenticationInvalid, errorCode);
	}
	
	@Test
	public void testPlatformErrorCodeJackson_11() {
		PlatformErrorCodes errorCode = readJacksonJsonFile(PLATFORM_ERROR_CODES_FILE_11);
		assertEquals(PlatformErrorCodes.DataNotFound, errorCode);
	}
	
	@Test
	public void testPlatformErrorCodeJackson_12() {
		PlatformErrorCodes errorCode = readJacksonJsonFile(PLATFORM_ERROR_CODES_FILE_12);
		assertEquals(PlatformErrorCodes.InsufficientPrivileges, errorCode);
	}
	
	@Test
	public void testPlatformErrorCodeJackson_13() {
		PlatformErrorCodes errorCode = readJacksonJsonFile(PLATFORM_ERROR_CODES_FILE_13);
		assertEquals(PlatformErrorCodes.Duplicate, errorCode);
	}
	
	@Test
	public void testPlatformErrorCodeJackson_14() {
		PlatformErrorCodes errorCode = readJacksonJsonFile(PLATFORM_ERROR_CODES_FILE_14);
		assertEquals(PlatformErrorCodes.UnknownSqlResult, errorCode);
	}
	
	@Test
	public void testPlatformErrorCodeJackson_invalid() {
		try
		{
			String json = FileUtils.getFileContentAsBuffer(PLATFORM_ERROR_CODES_FILE_INVALID).toString();
			PlatformErrorCodesWrapper wrapper = mapperJackson.readValue(json, PlatformErrorCodesWrapper.class);
			assertNull(wrapper.getErrorCode());
		}
		catch(InvalidFormatException e)
		{ 
			fail("InvalidFormatException was throwed while expecting null enum value.");
		} catch (JsonParseException e) {
			fail("JsonParseException was throwed while expecting null enum value.");
		} catch (JsonMappingException e) {
			fail("JsonMappingException was throwed while expecting null enum value.");
		} catch (IOException e) {
			fail("IOException was throwed: Reading of file failed. Please check the code.");
		}
		
	}
	
	@Test
	public void testPlatformErrorCodeGson_00() {
		PlatformErrorCodes errorCode = readGsonJsonFile(PLATFORM_ERROR_CODES_FILE_00);
		assertEquals(PlatformErrorCodes.None, errorCode);
	}
	
	@Test
	public void testPlatformErrorCodeGson_01() {
		PlatformErrorCodes errorCode = readGsonJsonFile(PLATFORM_ERROR_CODES_FILE_01);
		assertEquals(PlatformErrorCodes.Success, errorCode);
	}
	
	@Test
	public void testPlatformErrorCodeGson_02() {
		PlatformErrorCodes errorCode = readGsonJsonFile(PLATFORM_ERROR_CODES_FILE_02);
		assertEquals(PlatformErrorCodes.TransportException, errorCode);
	}
	
	@Test
	public void testPlatformErrorCodeGson_03() {
		PlatformErrorCodes errorCode = readGsonJsonFile(PLATFORM_ERROR_CODES_FILE_03);
		assertEquals(PlatformErrorCodes.UnhandledException, errorCode);
	}
	
	@Test
	public void testPlatformErrorCodeGson_04() {
		PlatformErrorCodes errorCode = readGsonJsonFile(PLATFORM_ERROR_CODES_FILE_04);
		assertEquals(PlatformErrorCodes.NotImplemented, errorCode);
	}
	
	@Test
	public void testPlatformErrorCodeGson_05() {
		PlatformErrorCodes errorCode = readGsonJsonFile(PLATFORM_ERROR_CODES_FILE_05);
		assertEquals(PlatformErrorCodes.SystemDisabled, errorCode);
	}
	
	@Test
	public void testPlatformErrorCodeGson_06() {
		PlatformErrorCodes errorCode = readGsonJsonFile(PLATFORM_ERROR_CODES_FILE_06);
		assertEquals(PlatformErrorCodes.FailedToLoadAvailableLocalesConfiguration, errorCode);
	}
	
	@Test
	public void testPlatformErrorCodeGson_07() {
		PlatformErrorCodes errorCode = readGsonJsonFile(PLATFORM_ERROR_CODES_FILE_07);
		assertEquals(PlatformErrorCodes.ParameterParseFailure, errorCode);
	}
	
	@Test
	public void testPlatformErrorCodeGson_08() {
		PlatformErrorCodes errorCode = readGsonJsonFile(PLATFORM_ERROR_CODES_FILE_08);
		assertEquals(PlatformErrorCodes.ParameterInvalidRange, errorCode);
	}
	
	@Test
	public void testPlatformErrorCodeGson_09() {
		PlatformErrorCodes errorCode = readGsonJsonFile(PLATFORM_ERROR_CODES_FILE_09);
		assertEquals(PlatformErrorCodes.BadRequest, errorCode);
	}
	
	@Test
	public void testPlatformErrorCodeGson_10() {
		PlatformErrorCodes errorCode = readGsonJsonFile(PLATFORM_ERROR_CODES_FILE_10);
		assertEquals(PlatformErrorCodes.AuthenticationInvalid, errorCode);
	}
	
	@Test
	public void testPlatformErrorCodeGson_11() {
		PlatformErrorCodes errorCode = readGsonJsonFile(PLATFORM_ERROR_CODES_FILE_11);
		assertEquals(PlatformErrorCodes.DataNotFound, errorCode);
	}
	
	@Test
	public void testPlatformErrorCodeGson_12() {
		PlatformErrorCodes errorCode = readGsonJsonFile(PLATFORM_ERROR_CODES_FILE_12);
		assertEquals(PlatformErrorCodes.InsufficientPrivileges, errorCode);
	}
	
	@Test
	public void testPlatformErrorCodeGson_13() {
		PlatformErrorCodes errorCode = readGsonJsonFile(PLATFORM_ERROR_CODES_FILE_13);
		assertEquals(PlatformErrorCodes.Duplicate, errorCode);
	}
	
	@Test
	public void testPlatformErrorCodeGson_14() {
		PlatformErrorCodes errorCode = readGsonJsonFile(PLATFORM_ERROR_CODES_FILE_14);
		assertEquals(PlatformErrorCodes.UnknownSqlResult, errorCode);
	}
	
	@Test
	public void testPlatformErrorCodeGson_invalid() {
		try
		{
			String json = FileUtils.getFileContentAsBuffer(PLATFORM_ERROR_CODES_FILE_INVALID).toString();
			PlatformErrorCodesWrapper wrapper = mapperGson.fromJson(json, PlatformErrorCodesWrapper.class);

			assertNull(wrapper.getErrorCode());
		} catch (JsonParseException e) {
			fail("JsonParseException was throwed while expecting an InvalidFormatException");
		} catch (JsonMappingException e) {
			fail("JsonMappingException was throwed while expecting an InvalidFormatException");
		} catch (IOException e) {
			fail("IOException was throwed: Reading of file failed. Please check the code.");
		}
		
	}
	
	private PlatformErrorCodes readJacksonJsonFile(String filename)
	{
		PlatformErrorCodes result = null;
		try
		{
			String json = FileUtils.getFileContentAsBuffer(filename).toString();
			PlatformErrorCodesWrapper errorCodeWrapper = mapperJackson.readValue(json, PlatformErrorCodesWrapper.class);
			
			result = errorCodeWrapper.getErrorCode();
		} catch (Exception e) {
			e.printStackTrace();
			fail("unexpected exception");
		}
		
		return result;
	}
	
	private PlatformErrorCodes readGsonJsonFile(String filename)
	{
		PlatformErrorCodes result = null;
		try
		{
			String json = FileUtils.getFileContentAsBuffer(filename).toString();
			PlatformErrorCodesWrapper errorCodeWrapper = mapperGson.fromJson(json, PlatformErrorCodesWrapper.class);
			
			result = errorCodeWrapper.getErrorCode();
		} catch (Exception e) {
			e.printStackTrace();
			fail("unexpected exception");
		}
		
		return result;
	}

}
