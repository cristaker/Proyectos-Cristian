package com.liferay.bco.api.api;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONObject;

/**
 * @author christian.sanchez
 */
public interface BcoApi {
	
	public JSONArray getCustomerAccounts(Long customerId);
	
	public JSONObject setAccountStatus(Long customerId, Long accountId, String accountStatus);
	
}