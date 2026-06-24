package com.tnsif.collectionframework;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<>();

		map.put(1, 100);
		map.put(2, 200);
		map.put(3, 300);
		map.put(4, 400);
		map.put(5, 500);

		System.out.println(map);

		// retrieving value by key
		int valuekey = map.get(1);
		System.out.println("retrieving value by key   " + valuekey);

		// updating a value
		map.put(5, 450);
		System.out.println("updated!  " + map);

		map.remove(3);
		System.out.println("after removing third element:  " + map);

		// checking if the key exists
		boolean haskey = map.containsKey(6);
		System.out.println("does map contains key 6? " + haskey);

		// checking if the value exists
		boolean hasvalue = map.containsValue(450);
		System.out.println("does map contains value 450? " + hasvalue);

		System.out.println("iterating over keys and values");
		for (Map.Entry<Integer, Integer> entey : map.entrySet()) {
			System.out.println("Key :" + entey.getKey() + ",value: " + entey.getValue());
		}

		int size = map.size();
		System.out.println(size);

		map.clear();
		System.out.println("map after cleaning : " + map);

	}
}
