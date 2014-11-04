package com.sirma.itt.javacourse.inputoutput.inputfile;

import java.io.ByteArrayInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class WriteInFileTest {
	private WriteInFile writeInFile = new WriteInFile();

	/**
	 * Test write() method from WriteInFile class.
	 * 
	 * @throws IOException
	 */
	@Test
	public void testFileWrite() throws IOException {

		String testActualFile = "src\\test\\resources\\actualFile.txt";
		String testExpectedFile = "src\\test\\resources\\expectedFile.txt";

		String actualData = testActualFile + "\r\n tra la la \r\n tra \r\n.";
		String exprctedData = " tra la la  tra ";

		writeInFile.setSc(new ByteArrayInputStream(actualData.getBytes()));
		writeInFile.write();

		List<String> actual = null;
		actual = Files.readAllLines(Paths.get(testActualFile), StandardCharsets.UTF_8);

		FileWriter fw = new FileWriter(testExpectedFile);
		fw.append(exprctedData);
		fw.close();

		List<String> expected = null;
		expected = Files.readAllLines(Paths.get(testExpectedFile), StandardCharsets.UTF_8);

		Assert.assertEquals(expected, actual);
	}
}
