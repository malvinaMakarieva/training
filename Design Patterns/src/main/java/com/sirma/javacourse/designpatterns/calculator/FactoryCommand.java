package com.sirma.javacourse.designpatterns.calculator;

import java.util.HashMap;

/**
 * Class create for factory calculator command.
 * 
 * @author Malvina Makarieva
 */
public class FactoryCommand {
	private HashMap<Character, Command> commandList = new HashMap<Character, Command>();

	/**
	 * Default constructor of FactoryCommand.
	 */
	public FactoryCommand() {
		commandList.put('+', new AdditionCommand());
		commandList.put('-', new SubtractionCommand());
		commandList.put('*', new MultiplicationCommand());
		commandList.put('/', new DivisionCommand());
		commandList.put('^', new GradationCommand());
	}

	/**
	 * Gets the command to be passed to the calculator.
	 * 
	 * @param input
	 *            the input frome console.
	 * @return command.
	 */
	public Command getCommand(String input) {
		for (int i = 0; i < input.length(); i++) {
			if (commandList.containsKey(input.charAt(i))) {
				return commandList.get(input.charAt(i));
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
		return commandList;
	}

	/**
	 * Setter method for map.
	 *
	 * @param map
	 *            the map to set
	 */
	public void setMap(HashMap<Character, Command> map) {
		this.commandList = map;
	}

}
