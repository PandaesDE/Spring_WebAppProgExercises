package com.Spring.services;

import org.springframework.stereotype.Component;

import java.io.*;

@Component
public class FileReadingService {
    private final String packagePath = "src/main/java/com/";

    public String readFileContent(String filePath) {
        filePath = packagePath + filePath;
        try {
            File file = new File(filePath);
            InputStream inputStream = new FileInputStream(file);
            // Use BufferedReader for efficient line-by-line reading
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            return content.toString();
        }
        catch (FileNotFoundException e) {
            return "File not Found";
        }
        catch (IOException e) {
            return "IOException";
        }
    }
}
