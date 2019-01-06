package com.kiririridev.rasprest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HitCounterEndpoint {
	@Autowired
	private HitCounter hitCounter;

	@GetMapping("/hit")
	public void hitTheCounterEndpoint() {
		hitCounter.hitTheCounter();
	}

	@RequestMapping("/count")
	public int getCountEndpoint() {
		return hitCounter.getHitCount();
	}
}
