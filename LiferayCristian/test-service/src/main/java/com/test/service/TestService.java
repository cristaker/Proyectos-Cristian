package com.test.service;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.test.api.api.TestApi;

import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.io.IOUtils;
import org.osgi.service.component.annotations.Component;

/**
 * @author christian.sanchez
 */
@Component(immediate = true, property = {

}, service = TestApi.class)
public class TestService implements TestApi {

	@Override
	public JSONObject callServiceByGet(String url, String Request) {
		
		JSONObject responseJson = JSONFactoryUtil.createJSONObject();
		
		try {
			String response;
			URL urlService = new URL(url);
			HttpURLConnection httpConnection = (HttpURLConnection) urlService.openConnection();
			httpConnection.setConnectTimeout(300000);
			httpConnection.setReadTimeout(300000);
			httpConnection.setRequestMethod("GET");

			if (httpConnection.getResponseCode() != HttpStatus.SC_OK) {
				if (httpConnection.getErrorStream() == null) {
					response = "";
				} else {
					response = IOUtils.toString(httpConnection.getErrorStream(), "UTF-8");
				}

			} else {
				response = IOUtils.toString(httpConnection.getInputStream(), "UTF-8");
				response = response.replace("\"{\"@nil\":\"true\"}\"", "null");
				response = response.replace("@null", "null");
			}
			
			responseJson.put("prueba", httpConnection.getResponseCode());
			responseJson.put("respuesta", response);
			
			httpConnection.disconnect();
			

		} catch (Exception e) {

		}
		return responseJson;
		
	}

}