package com.wiley.realworldjava.yaml.snakeyaml;

import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

public class ReadToMap {

    public static void main(String[] args) throws FileNotFoundException {
        File file = Path.of("src/main/resources/book.yaml").toFile();
        Yaml yaml = new Yaml();
        Map<String, Object> map = yaml.load(new FileReader(file));

        System.out.println(map.get("title"));
        System.out.println(map.get("edition"));
        System.out.println("Paperback? " + map.get("paperback"));

        List<String> authors = (List<String>) map.get("authors");
        for (String author : authors) {
            System.out.println(author);
        }
    }
}
