package com.saigonbpo.model;


import java.io.Serializable;
import org.springframework.web.multipart.MultipartFile;

public class FileUploadUtil implements Serializable {
	private static final long serialVersionUID = 1L;
	public MultipartFile getMultipartFile() {
		return multipartFile;
	}
	public void setMultipartFile(MultipartFile multipartFile) {
		this.multipartFile = multipartFile;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private MultipartFile multipartFile;
	private String description;
	// getter - setter
}