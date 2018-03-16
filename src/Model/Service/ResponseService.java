/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Service;

import java.io.File;

import Model.Core.Response;

/**
 *
 * @author user
 */
public class ResponseService {

	// NOTE:
	// If an exception is thrown, add a throws clause to the function

	// TODO [6]:
	// Creates an excel (.xlsx) file with the given file name from a given configuration (.arwq) file
	public static void createForm(File configFile, String fileNameOutput) {
	}

	// TODO [7]:
	// Updates an excel (.xlsx) file by changing the file's fields (columns)
	// Insert blank cells to existing rows should new fields be added
	// Do not delete existing response rows!
	// Read the fields from the output file
	public static void updateForm(File outputFile) {
	}

	// TODO [8]:
	// Add a response row to an excel (.xlsx) file
	public static void addResponse(File outputFile, Response response) {
	}
}
