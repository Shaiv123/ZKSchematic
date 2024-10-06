package main.gui.file;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class FileTypeFilter extends FileFilter{
	
	private final String extension;
	private final String description;
	
	public FileTypeFilter(String ext, String desc) {
		this.extension = ext;
		this.description = desc;
	}

	@Override
	public boolean accept(File arg0) {
		if(arg0.isDirectory()) {
			return true;
		}
		return arg0.getName().endsWith(extension);
	}

	@Override
	public String getDescription() {
		return description + String.format(" (*%s)", extension);
	}
	
	public String getExtension() {
		return extension;
	}

}