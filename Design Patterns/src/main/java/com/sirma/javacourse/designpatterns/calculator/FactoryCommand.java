package com.sirma.javacourse.designpatterns.calculator;

import java.util.HashMap;

public class FactoryCommand {
	private HashMap<Character, Command> map = new HashMap<Character, Command>();

	public FactoryCommand() {
		map.put('+', new MultiplicationCommand());
		map.put('-', new SubtractionCommand());
		map.put('*', new MultiplicationCommand());
		map.put('/', new DivisionCommand());
		map.put('^', new GradationCommand());
	}

	public Command getCommand(String input) {
		for (int i = 0; i < input.length(); i++) {
			if (map.containsKey(input.charAt(i))) {
				return map.get(input.charAt(i));
			}
		}
		throw new IllegalArgumentException();

	}

	/**
	 * Getter method for map.
	 *
	 * @return the map
	 */
	public HashMap<Character, Command> getMap() {
		return map;
	}

	/**
	 * Setter method for map.
	 *
	 * @param map
	 *            the map to set
	 */
	public void setMap(HashMap<Character, Command> map) {
		this.map = map;
	}

}
