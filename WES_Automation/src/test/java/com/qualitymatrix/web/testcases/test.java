package com.qualitymatrix.web.testcases;

import java.io.File;

public class test {

	public static void main(String[] args) {
		//File directory = new File("‪C:\\Users\\user\\Downloads\\");
		
		
		File[] files = new File("‪C:\\Users\\user\\Downloads").listFiles((dir, name) -> name.endsWith(".html"));
		
		File folder = new File("‪C:\\Users\\user\\Downloads\\");
		File[] listOfFiles = folder.listFiles();
		System.out.println(files.length);
		for (int i = 0; i < files.length; i++) {
		  if (files[i].isFile()) {
		    System.out.println("File " + files[i].getName());
		  } else if (files[i].isDirectory()) {
		    System.out.println("Directory " + files[i].getName());
		  }
		}

		//File[] content = directory.listFiles();

		for (int i = 0; i < files.length; i++) {
			if (files[i].getName().equals("testseclore.txt.html"))
				System.out.println("File dowload successfully");
		}
	}
	
}
