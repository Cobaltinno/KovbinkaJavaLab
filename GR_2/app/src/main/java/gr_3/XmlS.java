package gr_3;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.IOException;
import java.nio.file.Paths;

public class XmlS implements Serializer {
    private XmlMapper xmlMapper;

    public XmlS(){
        xmlMapper = new XmlMapper();
        xmlMapper.registerModule(new JavaTimeModule());
    }

    @Override
    public <T> void serialize(T entity, String filename) throws IOException {
        xmlMapper.writeValue(Paths.get(filename).toFile(), entity);
    }

    @Override
    public <T> T deserialize(String filename, Class<T> entityType) throws IOException {
        return xmlMapper.readValue(Paths.get(filename).toFile(), entityType);
    }
}