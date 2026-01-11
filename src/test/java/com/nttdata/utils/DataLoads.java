package com.nttdata.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class DataLoads {
    public static List<Map<String, String>> data() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        InputStream is = DataLoads.class.getResourceAsStream("/data/data.json");

        if (is == null) {
            throw new IOException("No se pudo encontrar el archivo /data/data.json en resources");
        }

        return mapper.readValue(is, List.class);
    }
}