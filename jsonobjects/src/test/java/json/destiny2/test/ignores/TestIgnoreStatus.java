package json.destiny2.test.ignores;

import static org.junit.Assert.*;

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
import json.destiny2.model.ignores.IgnoreStatus;
import json.destiny2.test.exceptions.PlatformErrorCodesWrapper;
import json.destiny2.test.utils.FileUtils;

public class TestIgnoreStatus {

	private static ObjectMapper mapperJackson = null;
	private static Gson mapperGson = null;
	
	private static final String IGNORE_STATUS_FILE_00 = "IgnoreStatus_00.json";
	private static final String IGNORE_STATUS_FILE_01 = "IgnoreStatus_01.json";
	private static final String IGNORE_STATUS_FILE_02 = "IgnoreStatus_02.json";
	private static final String IGNORE_STATUS_FILE_04 = "IgnoreStatus_04.json";
	private static final String IGNORE_STATUS_FILE_08 = "IgnoreStatus_08.json";
	private static final String IGNORE_STATUS_FILE_16 = "IgnoreStatus_16.json";
	private static final String IGNORE_STATUS_FILE_32 = "IgnoreStatus_32.json";
	private static final String IGNORE_STATUS_FILE_INVALID = "IgnoreStatus_invalid.json";
	
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
	public void testIgnoreStatusJackson_00() {
		IgnoreStatus ignoreStatus = readJacksonJsonFile(IGNORE_STATUS_FILE_00);
		assertEquals(IgnoreStatus.NotIgnored, ignoreStatus);
	}
	
	@Test
	public void testIgnoreStatusJackson_01() {
		IgnoreStatus ignoreStatus = readJacksonJsonFile(IGNORE_STATUS_FILE_01);
		assertEquals(IgnoreStatus.IgnoredUser, ignoreStatus);
	}
	
	@Test
	public void testIgnoreStatusJackson_02() {
		IgnoreStatus ignoreStatus = readJacksonJsonFile(IGNORE_STATUS_FILE_02);
		assertEquals(IgnoreStatus.IgnoredGroup, ignoreStatus);
	}
	
	@Test
	public void testIgnoreStatusJackson_04() {
		IgnoreStatus ignoreStatus = readJacksonJsonFile(IGNORE_STATUS_FILE_04);
		assertEquals(IgnoreStatus.IgnoredByGroup, ignoreStatus);
	}
	
	@Test
	public void testIgnoreStatusJackson_08() {
		IgnoreStatus ignoreStatus = readJacksonJsonFile(IGNORE_STATUS_FILE_08);
		assertEquals(IgnoreStatus.IgnoredPost, ignoreStatus);
	}
	
	@Test
	public void testIgnoreStatusJackson_16() {
		IgnoreStatus ignoreStatus = readJacksonJsonFile(IGNORE_STATUS_FILE_16);
		assertEquals(IgnoreStatus.IgnoredTag, ignoreStatus);
	}
	
	@Test
	public void testIgnoreStatusJackson_32() {
		IgnoreStatus ignoreStatus = readJacksonJsonFile(IGNORE_STATUS_FILE_32);
		assertEquals(IgnoreStatus.IgnoredGlobal, ignoreStatus);
	}
	
	@Test
	public void testIgnoreStatusJackson_invalid() {
		IgnoreStatus ignoreStatus = readJacksonJsonFile(IGNORE_STATUS_FILE_INVALID);
		assertNull(ignoreStatus);
	}
	
	@Test
	public void testIgnoreStatusGson_00() {
		IgnoreStatus ignoreStatus = readGsonJsonFile(IGNORE_STATUS_FILE_00);
		assertEquals(IgnoreStatus.NotIgnored, ignoreStatus);
	}
	
	@Test
	public void testIgnoreStatusGson_01() {
		IgnoreStatus ignoreStatus = readGsonJsonFile(IGNORE_STATUS_FILE_01);
		assertEquals(IgnoreStatus.IgnoredUser, ignoreStatus);
	}
	
	@Test
	public void testIgnoreStatusGson_02() {
		IgnoreStatus ignoreStatus = readGsonJsonFile(IGNORE_STATUS_FILE_02);
		assertEquals(IgnoreStatus.IgnoredGroup, ignoreStatus);
	}
	
	@Test
	public void testIgnoreStatusGson_04() {
		IgnoreStatus ignoreStatus = readGsonJsonFile(IGNORE_STATUS_FILE_04);
		assertEquals(IgnoreStatus.IgnoredByGroup, ignoreStatus);
	}
	
	@Test
	public void testIgnoreStatusGson_08() {
		IgnoreStatus ignoreStatus = readGsonJsonFile(IGNORE_STATUS_FILE_08);
		assertEquals(IgnoreStatus.IgnoredPost, ignoreStatus);
	}
	
	@Test
	public void testIgnoreStatusGson_16() {
		IgnoreStatus ignoreStatus = readGsonJsonFile(IGNORE_STATUS_FILE_16);
		assertEquals(IgnoreStatus.IgnoredTag, ignoreStatus);
	}
	
	@Test
	public void testIgnoreStatusGson_32() {
		IgnoreStatus ignoreStatus = readGsonJsonFile(IGNORE_STATUS_FILE_32);
		assertEquals(IgnoreStatus.IgnoredGlobal, ignoreStatus);
	}
	
	@Test
	public void testIgnoreStatusGson_invalid() {
		IgnoreStatus ignoreStatus = readGsonJsonFile(IGNORE_STATUS_FILE_INVALID);
		assertNull(ignoreStatus);
		
	
	}
	
	@Test
	public void testIgnoreStatusNullValueOf()
	{
		IgnoreStatus ignoreStatus = IgnoreStatus.getEnumFor((Integer)null);
		assertNull(ignoreStatus);
	}
	
	@Test
	public void testIgnoreStatusValueOf_01()
	{
		IgnoreStatus ignoreStatus = IgnoreStatus.getEnumFor(1);
		assertEquals(IgnoreStatus.IgnoredUser, ignoreStatus);
	}
	
	@Test
	public void testIgnoreStatusValueOf_02()
	{
		IgnoreStatus ignoreStatus = IgnoreStatus.getEnumFor(2);
		assertEquals(IgnoreStatus.IgnoredGroup, ignoreStatus);
	}
	
	@Test
	public void testIgnoreStatusValueOf_04()
	{
		IgnoreStatus ignoreStatus = IgnoreStatus.getEnumFor(4);
		assertEquals(IgnoreStatus.IgnoredByGroup, ignoreStatus);
	}
	
	@Test
	public void testIgnoreStatusValueOf_08()
	{
		IgnoreStatus ignoreStatus = IgnoreStatus.getEnumFor(8);
		assertEquals(IgnoreStatus.IgnoredPost, ignoreStatus);
	}
	
	@Test
	public void testIgnoreStatusValueOf_16()
	{
		IgnoreStatus ignoreStatus = IgnoreStatus.getEnumFor(16);
		assertEquals(IgnoreStatus.IgnoredTag, ignoreStatus);
	}
	
	@Test
	public void testIgnoreStatusValueOf_32()
	{
		IgnoreStatus ignoreStatus = IgnoreStatus.getEnumFor(32);
		assertEquals(IgnoreStatus.IgnoredGlobal, ignoreStatus);
	}
	
	private IgnoreStatus readJacksonJsonFile(String filename)
	{
		IgnoreStatus result = null;
		try
		{
			String json = FileUtils.getFileContentAsBuffer(filename).toString();
			IgnoreStatusWrapper ignoreStatusWrapper = mapperJackson.readValue(json, IgnoreStatusWrapper.class);
			
			result = ignoreStatusWrapper.getIgnoreFlags();
		} catch (Exception e) {
			e.printStackTrace();
			fail("unexpected exception");
		}
		
		return result;
	}
	
	private IgnoreStatus readGsonJsonFile(String filename)
	{
		IgnoreStatus result = null;
		try
		{
			String json = FileUtils.getFileContentAsBuffer(filename).toString();
			IgnoreStatusWrapper ignoreStatusWrapper = mapperGson.fromJson(json, IgnoreStatusWrapper.class);
			
			result = ignoreStatusWrapper.getIgnoreFlags();
		} catch (Exception e) {
			e.printStackTrace();
			fail("unexpected exception");
		}
		
		return result;
	}

}
