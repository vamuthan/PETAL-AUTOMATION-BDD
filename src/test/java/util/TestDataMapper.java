package util;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public class TestDataMapper {
    private static Map<String, Object> testData;

    public static Map<String, Object> getTestData() {
        return testData;
    }

    public static void setTestData(Map<String, Object> data) {
        testData = data;
    }

    public void mapTestData(){
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> data = null;
        try {
            data = mapper.readValue(new File("src/test/resources/testData/TestData.json"), Map.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        setTestData(data);
    }
}
