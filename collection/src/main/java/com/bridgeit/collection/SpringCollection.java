package com.bridgeit.collection;

import java.util.*;

public class SpringCollection {

	List list;
	Set set;
	Map map;
	public List getList() {
		System.out.println("List of List's Values "+list);
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public Set getSet() {
		System.out.println("List of Set values "+set);
		return set;
	}
	public void setSet(Set set) {
		this.set = set;
	}
	public Map getMap() {
		System.out.println("List of Map values "+map);
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	
}
