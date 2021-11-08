package com.udacity.timezones.service;

import com.udacity.timezones.client.WorldTime;

public class TimeZoneService {
	private final WorldTime worldTimeApiRestClient;

	public TimeZoneService(WorldTime worldTimeApiRestClient) {
		this.worldTimeApiRestClient = worldTimeApiRestClient;
	}

	public String getAvailableTimezoneText(String area) {
		return String.format(
			"Available timezones in %s are %s.",
			area,
			String.join(", ", worldTimeApiRestClient.getValidTimeZones(area))
		);
	}
}
