package com.spring.basic_of_spring.loggers;

import com.spring.basic_of_spring.beans.Event;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileEventLogger implements EventLogger {
    private String filename;
    private File file;

    public FileEventLogger(String filename) {
        this.filename = filename;
    }

    public void init() throws IOException {
        file = new File(filename);
        if (file.exists() && !file.canWrite()) {
            throw new IllegalArgumentException("Can't write to file " + filename);
        } else if (!file.exists()) {
            file.createNewFile();
        }
    }

    @Override
    public void logEvent(Event event)  {
        try {
            FileUtils.writeStringToFile(file, event.toString(), "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
