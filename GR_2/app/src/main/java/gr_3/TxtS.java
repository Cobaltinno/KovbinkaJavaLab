package gr_3;

import javax.sound.midi.Patch;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TxtS implements Serializer{

    @Override
    public <T> void serialize(T entity, String filename) throws IOException {
        String data = entity.toString();
        Files.write(Paths.get(filename),data.getBytes());
    }

    @Override
    public <T> T deserialize(String filename, Class<T> entityType) throws IOException {
        String data = new String(Files.readAllBytes(Paths.get(filename)));
        return null;
    }
}