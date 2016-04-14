
package com.hserv.coordinatedentry.housingmatching.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
@RequestMapping(value = "/coordinatedentry/health", produces = "application/json")
public class HealthController {

	/**
	 * Returns the health status of the Micro Service.
	 * 
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity getHealth() {
		return null; // TODO Autogenerated Method Stub. Implement me please.
	}

}