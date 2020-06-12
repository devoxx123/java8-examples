package com.java8.joeyajames.streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CompressZipFormat {

	public static void main(String[] args) throws IOException {
		String filePath ="C:\\Users\\HARI KISHORE\\Videos\\Generate-Script-JavaCode-Text files\\generate-delete\\generate-script\\domains-with-configured-wf-data.txt.rcom_urlfrecords.txt";
		zipFile(filePath);
	}

	private static void zipFile(String filePath) throws IOException {
		try {
			File file = new File(filePath);
			String zipFileName = file.getName().concat(".zip");

			FileOutputStream fos = new FileOutputStream(zipFileName);
			ZipOutputStream zos = new ZipOutputStream(fos);

			zos.putNextEntry(new ZipEntry(file.getName()));

			byte[] bytes = Files.readAllBytes(Paths.get(filePath));
			zos.write(bytes, 0, bytes.length);
			zos.closeEntry();
			zos.close();
		} catch (FileNotFoundException ffx) {
			System.err.format("The file %s does not exist", filePath);
		} catch (Exception ex) {
			System.err.println("I/O error: " + ex);
		}

	}

}
