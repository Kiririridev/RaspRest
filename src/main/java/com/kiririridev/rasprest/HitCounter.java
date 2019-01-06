package com.kiririridev.rasprest;

import org.springframework.stereotype.Component;

@Component
public class HitCounter
{
	private int hitCount = 0;

	void hitTheCounter()
	{
		hitCount++;
	}

	int getHitCount()
	{
		return hitCount;
	}
}
