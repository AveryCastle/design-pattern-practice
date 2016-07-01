package chap2.adapter.example;

import java.io.IOException;

/**
 * FileIO 인터페이스.
 * Target(대상)의 역할.
 */
public interface FileIO {

    void readFromFile(String filename) throws IOException;

    void writeToFile(String filename) throws IOException;

    void setValue(String key, String value);

    String getValue(String key);
}
