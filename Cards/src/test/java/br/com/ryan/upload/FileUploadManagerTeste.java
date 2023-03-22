package br.com.ryan.upload;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("File Upload Manager")
class FileUploadManagerTeste {
	
	private FileUploadManager manager;
	
	@BeforeEach
	void novo() {
		manager = new FileUploadManager();
	}
}