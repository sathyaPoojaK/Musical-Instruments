package com.example.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.example.demo.enums.GuitarType;

@Component
public class GuitarServiceSelector {
	private final ApplicationContext applicationContext;
	private final Map<String, String> guitarTypeGuitarServiceMap;

	public GuitarServiceSelector(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
		guitarTypeGuitarServiceMap = new HashMap<>();
		guitarTypeGuitarServiceMap.put(GuitarType.ROCKSTAR.name(), "rockStarGuitarImpl");
		guitarTypeGuitarServiceMap.put(GuitarType.ELECTRIC.name(), "electricGuitarImpl");
		guitarTypeGuitarServiceMap.put(GuitarType.BASS.name(), "bassGuitarImpl");
	}

	public GuitarService selectService(GuitarType guitarType){
		String beanName = guitarTypeGuitarServiceMap.get(guitarType.name());
		return (GuitarService) applicationContext.getBean(beanName);
	}
}
