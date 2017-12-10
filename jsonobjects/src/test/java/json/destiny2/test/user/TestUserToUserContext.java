package json.destiny2.test.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import json.destiny2.model.user.UserToUserContext;
import json.destiny2.test.utils.FileUtils;

public class TestUserToUserContext {

	private static ObjectMapper mapperJackson = null;
	private static Gson mapperGson = null;
	
	private static final String USER_TO_USER_CONTEXT_FILE_00 = "UserToUserContext_00.json";
	private static final String USER_TO_USER_CONTEXT_FILE_01 = "UserToUserContext_01.json";
	private static final String USER_TO_USER_CONTEXT_FILE_02 = "UserToUserContext_02.json";
	
	private static UserToUserContext userToUserContextFalseJackson = null;
	private static UserToUserContext userToUserContextTrueJackson = null;
	private static UserToUserContext userToUserContextNullIgnoreJackson = null;
	private static UserToUserContext userToUserContextFalseGson = null;
	private static UserToUserContext userToUserContextTrueGson = null;
	private static UserToUserContext userToUserContextNullIgnoreGson = null;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		mapperJackson = new ObjectMapper();
		mapperJackson.enable(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL);
		mapperGson = new Gson();
		
		userToUserContextFalseJackson = readJacksonJsonFile(USER_TO_USER_CONTEXT_FILE_00);
		userToUserContextTrueJackson = readJacksonJsonFile(USER_TO_USER_CONTEXT_FILE_01);
		userToUserContextNullIgnoreJackson = readJacksonJsonFile(USER_TO_USER_CONTEXT_FILE_02);
		userToUserContextFalseGson = readGsonJsonFile(USER_TO_USER_CONTEXT_FILE_00);
		userToUserContextTrueGson = readGsonJsonFile(USER_TO_USER_CONTEXT_FILE_01);
		userToUserContextNullIgnoreGson = readGsonJsonFile(USER_TO_USER_CONTEXT_FILE_02);
		
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
	public void testUserToUserContextJackson_NotNull_00() {
		
		assertNotNull(userToUserContextFalseJackson);
	}

	@Test
	public void testUserToUserContextJackson_NotNull_01() {
		
		assertNotNull(userToUserContextTrueJackson);
	}
	
	@Test
	public void testUserToUserContextJackson_NotNull_02() {
		
		assertNotNull(userToUserContextNullIgnoreJackson);
	}
	
	@Test
	public void testUserToUserContextGson_NotNull_00() {
		
		assertNotNull(userToUserContextFalseGson);
	}

	@Test
	public void testUserToUserContextGson_NotNull_01() {
		
		assertNotNull(userToUserContextTrueGson);
	}
	
	@Test
	public void testUserToUserContextGson_NotNull_02() {
		
		assertNotNull(userToUserContextFalseJackson);
	}
	
	
	@Test
	public void testUserToUserContext_JacksonEqualsGson_00() {
		assertEquals(userToUserContextFalseJackson, userToUserContextFalseJackson);
	}
	
	@Test
	public void testUserToUserContext_JacksonEqualsGson_01() {
		assertEquals(userToUserContextTrueJackson, userToUserContextTrueJackson);
	}
	
	@Test
	public void testUserToUserContext_JacksonEqualsGson_02() {
		assertEquals(userToUserContextNullIgnoreJackson, userToUserContextNullIgnoreGson);
	}
	
	@Test
	public void testUserToUserContextJackson_IsNotFollowing_00() {
		
		assertFalse(userToUserContextFalseJackson.getIsFollowing());
	}
	
	@Test
	public void testUserToUserContextJackson_IsFollowing_01() {
		
		assertTrue(userToUserContextTrueJackson.getIsFollowing());
	}
	
	@Test
	public void testUserToUserContextGson_IsNotFollowing_00() {
		
		assertFalse(userToUserContextFalseGson.getIsFollowing());
	}
	
	@Test
	public void testUserToUserContextGson_IsFollowing_01() {
		
		assertTrue(userToUserContextTrueGson.getIsFollowing());
	}
	
	
	private static UserToUserContext readJacksonJsonFile(String filename)
	{
		UserToUserContext result = null;
		try
		{
			String json = FileUtils.getFileContentAsBuffer(filename).toString();
			result = mapperJackson.readValue(json, UserToUserContext.class);
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("unexpected exception");
		}
		
		return result;
	}
	
	private static UserToUserContext readGsonJsonFile(String filename)
	{
		UserToUserContext result = null;
		try
		{
			String json = FileUtils.getFileContentAsBuffer(filename).toString();
			result = mapperGson.fromJson(json, UserToUserContext.class);
		} catch (Exception e) {
			e.printStackTrace();
			fail("unexpected exception");
		}
		
		return result;
	}
}
