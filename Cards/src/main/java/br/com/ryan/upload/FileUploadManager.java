package br.com.ryan.upload;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.file.UploadedFile;

@ManagedBean @ViewScoped
public class FileUploadManager implements Serializable {
	private static final long serialVersionUID = -7723799535810251374L;
	
	private UploadedFile file;
	
	public UploadedFile getFile() {
		return file;
	}

	public void setFile(UploadedFile file) {
		this.file = file;
	}
}