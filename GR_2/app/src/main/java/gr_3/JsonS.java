package gr_3;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.IOException;
import java.nio.file.Paths;

public class JsonS implements Serializer {
    private ObjectMapper objectMapper;

    public JsonS(){
        objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
    }
    @Override
    public <T> void serialize(T entity, String filename) throws IOException {
        objectMapper.writeValue(Paths.get(filename).toFile(), entity);
    }

    @Override
    public <T> T deserialize(String filename, Class<T> entityType) throws IOException {
        return objectMapper.readValue(Paths.get(filename).toFile(), entityType);
    }
}