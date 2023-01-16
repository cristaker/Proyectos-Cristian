package com.liferay.bco.service;

import com.liferay.bco.api.api.BcoApi;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Base64;

import org.osgi.service.component.annotations.Component;

/**
 * @author christian.sanchez
 */
@Component(
	immediate = true,
	property = {
	},
	service = BcoApi.class
)
public class BcoService implements BcoApi {

	private static final Log LOGGER = LogFactoryUtil.getLog(BcoService.class);
	
	
	@Override
	public JSONArray getCustomerAccounts(Long customerId) {
		
		try {
			
			JSONObject customerData = JSONFactoryUtil.createJSONObject();
			 customerData.put("customerId", String.valueOf(customerId));
			 LOGGER.info(customerData.toJSONString());
			
			String encodedCustomerData = Base64.getEncoder().encodeToString(customerData.toJSONString().getBytes());
			 LOGGER.info(encodedCustomerData);
			
			HttpClient httpClient = HttpClient.newHttpClient();
			HttpRequest request = HttpRequest.newBuilder()
					.uri(URI.create("http://localhost:8000/accounts"))
					.GET()
					.header("filters", encodedCustomerData)
					.build();
			
			HttpResponse<String> respuesta = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
			LOGGER.info(respuesta.body());
			return JSONFactoryUtil.createJSONArray(respuesta.body());
		}
		catch (Exception e) {
			
		}
		return null;		

	}

	@Override
	public JSONObject setAccountStatus(Long customerId, Long accountId, String accountStatus) {
		// TODO Auto-generated method stub
		return null;
	}

}