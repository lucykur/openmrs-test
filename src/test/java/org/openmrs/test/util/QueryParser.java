package org.openmrs.test.util;

import java.util.HashMap;
import java.util.Map;

public class QueryParser {
	private Map<String, String> queryMap;

	public QueryParser(String query) {
		queryMap = getQueryMap(query);
	}

	public String getParameter(String name) {
		return queryMap.get(name);
	}

	private Map<String, String> getQueryMap(String query) {
		String[] params = query.split("&");
		Map<String, String> map = new HashMap<String, String>();
		for (String param : params) {
			String name = param.split("=")[0];
			String value = param.split("=")[1];
			map.put(name, value);
		}
		return map;
	}
}