package com.test.api.api;
import com.liferay.portal.kernel.json.JSONObject;

/**
 * @author christian.sanchez
 */
public interface TestApi {
	
	public JSONObject callServiceByGet(String url, String Request); 
}