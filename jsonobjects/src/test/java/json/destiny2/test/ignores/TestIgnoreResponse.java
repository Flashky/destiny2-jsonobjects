package json.destiny2.test.ignores;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import json.destiny2.model.ignores.IgnoreResponse;
import json.destiny2.model.ignores.IgnoreStatus;
import json.destiny2.test.utils.FileUtils;

public class TestIgnoreResponse {

	private static ObjectMapper mapperJackson = null;
	private static Gson mapperGson = null;
	
	private static final String IGNORE_RESPONSE_FILE_00 = "IgnoreResponse_00.json";
	private static final String IGNORE_RESPONSE_FILE_01 = "IgnoreResponse_01.json";
	
	private static IgnoreResponse ignoreResponseFalseJackson = null;
	private static IgnoreResponse ignoreResponseTrueJackson = null;
	private static IgnoreResponse ignoreResponseFalseGson = null;
	private static IgnoreResponse ignoreResponseTrueGson = null;
	
	// Specific test cases
	private static IgnoreResponse ignoreResponse1 = null;
	private static IgnoreResponse ignoreResponse2 = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		mapperJackson = new ObjectMapper();
		mapperJackson.enable(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL);
		mapperGson = new Gson();
		
		ignoreResponseFalseJackson = readJacksonJsonFile(IGNORE_RESPONSE_FILE_00);
		ignoreResponseTrueJackson = readJacksonJsonFile(IGNORE_RESPONSE_FILE_01);
		ignoreResponseFalseGson = readGsonJsonFile(IGNORE_RESPONSE_FILE_00);
		ignoreResponseTrueGson = readGsonJsonFile(IGNORE_RESPONSE_FILE_01);
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		// For specific test cases
		ignoreResponse1 = new IgnoreResponse();
		ignoreResponse2 = new IgnoreResponse();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIgnoreResponse_JacksonEqualsGson_00() {
	
		assertEquals(ignoreResponseFalseJackson,ignoreResponseFalseGson);
	}
	
	@Test
	public void testIgnoreResponse_JacksonEqualsGson_01() {
	
		assertEquals(ignoreResponseTrueJackson,ignoreResponseTrueGson);
	}
	
	@Test
	public void testIgnoreResponseJackson_NotNull_00() {
		
		assertNotNull(ignoreResponseFalseJackson);
	}
	
	@Test
	public void testIgnoreResponseJackson_NotNull_01() {
		
		assertNotNull(ignoreResponseTrueJackson);
	}

	@Test
	public void testIgnoreResponseGson_NotNull_00() {
		
		assertNotNull(ignoreResponseFalseGson);
	}
	
	
	@Test
	public void testIgnoreResponseJackson_IsNotIgnored_00() {
		
		assertFalse(ignoreResponseFalseJackson.getIsIgnored());
	}
	
	@Test
	public void testIgnoreResponseJackson_IgnoreFlag_00() {
		
		assertEquals(IgnoreStatus.NotIgnored,ignoreResponseFalseJackson.getIgnoreFlags());
	}
	
	@Test
	public void testIgnoreResponseGson_NotNull_01() {
		
		assertNotNull(ignoreResponseTrueGson);
	}
	
	
	@Test
	public void testIgnoreResponseJackson_IsNotIgnored_01() {
		
		
		assertTrue(ignoreResponseTrueJackson.getIsIgnored());
	}
	
	@Test
	public void testIgnoreResponseJackson_IgnoreFlag_01() {
		
		assertEquals(IgnoreStatus.NotIgnored,ignoreResponseTrueJackson.getIgnoreFlags());
	}
	
	//-------------
	

	@Test
	public void testIgnoreResponseGson_IsNotIgnored_00() {
		
		assertFalse(ignoreResponseFalseGson.getIsIgnored());
	}
	
	@Test
	public void testIgnoreResponseGson_IgnoreFlag_00() {
		
		assertEquals(IgnoreStatus.NotIgnored,ignoreResponseFalseJackson.getIgnoreFlags());
	}
	

	@Test
	public void testIgnoreResponseGson_IsNotIgnored_01() {

		assertTrue(ignoreResponseTrueGson.getIsIgnored());
	}
	
	@Test
	public void testIgnoreResponseGson_IgnoreFlag_01() {
		
		assertEquals(IgnoreStatus.NotIgnored,ignoreResponseTrueGson.getIgnoreFlags());
	}
	
	@Test
	public void testEquals_branch_01()
	{
		assertTrue(ignoreResponse1.equals(ignoreResponse1));
	}
	
	@Test
	public void testEquals_branch_02()
	{
		assertFalse(ignoreResponse1.equals(null));
	}
	
	@Test
	public void testJacksonEquals_branch_03()
	{
		assertFalse(ignoreResponse1.equals(""));
	}
	
	@Test
	public void testEquals_branch_04()
	{				
		ignoreResponse1.setIgnoreFlags(IgnoreStatus.IgnoredUser);
		ignoreResponse2.setIgnoreFlags(IgnoreStatus.NotIgnored);
		
		assertFalse(ignoreResponse1.equals(ignoreResponse2));
	}
	
	@Test
	public void testEquals_branch_05()
	{				
		ignoreResponse2.setIsIgnored(false);
		
		assertFalse(ignoreResponse1.equals(ignoreResponse2));
	}
	
	@Test
	public void testEquals_branch_06()
	{				
		ignoreResponse1.setIsIgnored(true);
		ignoreResponse2.setIsIgnored(false);
		
		assertFalse(ignoreResponse1.equals(ignoreResponse2));
	}
	
	@Test
	public void testHashCode_00()
	{
		assertEquals(961, ignoreResponse1.hashCode());
	}
	
	@Test
	public void testHashCode_01()
	{
		ignoreResponse1.setIsIgnored(true);
		ignoreResponse1.setIgnoreFlags(IgnoreStatus.NotIgnored);
		
		int hashIgnoreStatus = IgnoreStatus.NotIgnored.hashCode();
		int hashBoolean = Boolean.TRUE.hashCode();
		
		
		int firstValue = 31 + hashIgnoreStatus;
		int finalValue = 31*firstValue + hashBoolean;
		
		assertEquals(finalValue,ignoreResponse1.hashCode());
	}
	
	private static IgnoreResponse readJacksonJsonFile(String filename)
	{
		IgnoreResponse result = null;
		try
		{
			String json = FileUtils.getFileContentAsBuffer(filename).toString();
			result = mapperJackson.readValue(json, IgnoreResponse.class);
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("unexpected exception");
		}
		
		return result;
	}
	
	private static IgnoreResponse readGsonJsonFile(String filename)
	{
		IgnoreResponse result = null;
		try
		{
			String json = FileUtils.getFileContentAsBuffer(filename).toString();
			result = mapperGson.fromJson(json, IgnoreResponse.class);
		} catch (Exception e) {
			e.printStackTrace();
			fail("unexpected exception");
		}
		
		return result;
	}

}
