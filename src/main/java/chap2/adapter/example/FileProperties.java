package chap2.adapter.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 * FileProperties 클래스.
 * Adapter(개조하는 쪽)의 역할.
 */
public class FileProperties implements FileIO {

    private Properties properties;

    public FileProperties() {
        properties = new Properties();
    }

    @Override
    public void readFromFile(String filename) throws IOException {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(filename);
        properties.load(inputStream);
        properties.stringPropertyNames().stream()
                .forEach(key -> System.out.println(key + "=" + properties.getProperty(key)));
        inputStream.close();
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        OutputStream outputStream = new FileOutputStream("src/main/resources/" + filename);
        properties.store(outputStream, "written by FileProperties");
        outputStream.close();
    }

    @Override
    public void setValue(String key, String value) {
        properties.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return properties.getProperty(key);
    }
}
