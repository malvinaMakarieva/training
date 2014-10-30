package com.sirma.itt.javacourse.inputoutput.directory;

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class contains methods to check whether a submitted path points to a directory or file
 * 
 * @author Malvia Makarieva
 */
public class DirectoryBrowser {
	private String path;
	private File file;

	/**
	 * Default constructor.
	 */
	public DirectoryBrowser() {

	}

	/**
	 * Getter method for path.
	 *
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * Setter method for path.
	 *
	 * @param path
	 *            the path to set
	 */
	public void setPath(String path) {
		this.path = path;
		file = new File(path);
	}

	/**
	 * Getter method for file.
	 *
	 * @return the file
	 */
	public File getFile() {
		return file;
	}

	/**
	 * Setter method for file.
	 *
	 * @param file
	 *            the file to set
	 */
	public void setFile(File file) {
		this.file = file;
	}

	/**
	 * Method checks whether the submitted path points to a file or directory, if directory, a list
	 * of directories in it.
	 * 
	 * @param path
	 *            Describe the path to the directory or file.
	 * @return List of directories, or a message that this is a file.
	 * @throws FileNotFoundException
	 */
	protected List<String> chekDirectoryOrFile(String path) throws FileNotFoundException {
		List<String> resultList = new ArrayList<String>();
		File file = new File(path);
		File[] subDirs = file.listFiles(new FileFilter() {
			public boolean accept(File pathname) {
				return pathname.isDirectory();
			}
		});
		if (!file.exists()) {
			throw new FileNotFoundException("File not found");
		} else {
			if (file.isDirectory()) {
				for (File subDir : subDirs) {
					resultList.add(subDir.getName());
				}
			} else {
				resultList.add("This is file");
			}
		}
		return resultList;

	}

}
