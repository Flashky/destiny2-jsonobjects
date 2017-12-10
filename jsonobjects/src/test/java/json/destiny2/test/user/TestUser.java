package json.destiny2.test.user;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.EnumSet;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import json.destiny2.mappers.Mapper;
import json.destiny2.mappers.MapperGson;
import json.destiny2.mappers.MapperJackson;
import json.destiny2.model.exceptions.PlatformErrorCodes;
import json.destiny2.model.response.ResponseList;
import json.destiny2.model.response.ResponseObject;
import json.destiny2.model.user.GeneralUser;
import json.destiny2.test.utils.FileUtils;

public class TestUser {

	private static ResponseObject<GeneralUser> responseObjectGson;
	private static ResponseObject<GeneralUser> responseObjectJackson;
	private static ResponseList<GeneralUser> responseListGson;
	private static ResponseList<GeneralUser> responseListJackson;
	
	private static final String GENERAL_USER_OBJECT_FILE = "Bungie_GetBungieNetUserById.json";
	private static final String GENERAL_USER_LIST_FILE = "Bungie_SearchUsers.json";
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		try
		{
			String jsonObject = FileUtils.getFileContentAsBuffer(GENERAL_USER_OBJECT_FILE).toString();
			String jsonList = FileUtils.getFileContentAsBuffer(GENERAL_USER_LIST_FILE).toString();
			
			// Obtain object and list using MapperJackson
			Mapper<GeneralUser> mapper = new MapperJackson<GeneralUser>(GeneralUser.class);
			
			responseObjectJackson = mapper.getObjectFromJson(jsonObject);
			responseListJackson = mapper.getListFromJson(jsonList);
			
			// Obtain object and list using MapperGson
			mapper = new MapperGson<GeneralUser>(GeneralUser.class);
			
			responseObjectGson = mapper.getObjectFromJson(jsonObject);
			responseListGson = mapper.getListFromJson(jsonList);
			
		} catch (Exception e) {
			fail("unexpected exception");
		}
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
	public void testJacksonResponseNotNull() {
		assertNotNull(responseObjectJackson);
	}
	
	@Test
	public void testJacksonObjectNotNull() {
		assertNotNull(responseObjectJackson.getResponse());
	}
	
	
}
