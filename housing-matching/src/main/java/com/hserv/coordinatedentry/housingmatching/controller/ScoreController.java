
package com.hserv.coordinatedentry.housingmatching.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hserv.coordinatedentry.housingmatching.facade.SurveyScoreFacade;
import com.hserv.coordinatedentry.housingmatching.model.SurveyScoreModel;

@RestController
@ResponseBody
@RequestMapping(value = "/scores", produces = "application/json")
public class ScoreController {
	
	@Autowired
	SurveyScoreFacade surveyScoreFacade;

	/**
	 * Trigger score totalling via POST. An Empty body request would suffice.
	 * 
	 * 
	 */
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity createScore() {
		return null; // TODO Autogenerated Method Stub. Implement me please.
	}

	/**
	 * Get the list of clients and their survey scores.
	 * 
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<SurveyScoreModel> getScores() {
		return surveyScoreFacade.getScores();
	}

	/**
	 * Clear all the survey scores.
	 * 
	 * 
	 */
	@RequestMapping(value = "", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteScores() {
		ResponseEntity<String> responseEntity = null;
		try {
			surveyScoreFacade.deleteScores();
			responseEntity = ResponseEntity.ok("success");
		} catch (Exception ex) {
			responseEntity = new ResponseEntity<String>("Fail", HttpStatus.EXPECTATION_FAILED);
		}
		return responseEntity;
	}

	/**
	 * Get the survey score for a client_id.
	 * 
	 */
	@RequestMapping(value = "/client/{id}", method = RequestMethod.GET)
	public ResponseEntity<String> getClientById(@PathVariable String id) {
		ResponseEntity<String> responseEntity = null;
		try {
			int score = surveyScoreFacade.getScoreByClientId(id);
			responseEntity = ResponseEntity.ok("score :" + String.valueOf(score));
		} catch (Exception ex) {
			responseEntity = new ResponseEntity<String>("Fail", HttpStatus.EXPECTATION_FAILED);
		}
		return responseEntity;
	}

	/**
	 * Clears off the survey score for a particular client.
	 * 
	 * 
	 */
	@RequestMapping(value = "/client/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteClientById(@PathVariable String id) {
		ResponseEntity<String> responseEntity = null;
		try {
			surveyScoreFacade.deleteScoreByClientId(id);
			responseEntity = ResponseEntity.ok("Score Deleted");
		} catch (Exception ex) {
			responseEntity = new ResponseEntity<String>("Fail", HttpStatus.EXPECTATION_FAILED);
		}
		return responseEntity;
	}

	/**
	 * Used for updating survey score for a client id.
	 * 
	 * 
	 */
	@RequestMapping(value = "/client/{id}", method = RequestMethod.PUT)
	public ResponseEntity<String> updateClientById(@PathVariable String id, @RequestBody int score) {
		ResponseEntity<String> responseEntity = null;
		try {
			surveyScoreFacade.updateScoreByClientId(score, id);
			responseEntity = ResponseEntity.ok("Score Updated");
		} catch (Exception ex) {
			responseEntity = new ResponseEntity<String>("Fail", HttpStatus.EXPECTATION_FAILED);
		}
		return responseEntity;
	}

}
