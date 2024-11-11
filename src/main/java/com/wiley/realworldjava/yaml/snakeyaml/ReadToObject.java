package com.wiley.realworldjava.yaml.snakeyaml;

import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;

public class ReadToObject {

    public static void main(String[] args) throws FileNotFoundException {

        File file = Path.of("src/main/resources/book.yaml").toFile();
        Constructor constructor = new Constructor(Book.class, new LoaderOptions());
        Yaml yaml = new Yaml(constructor);

        Book book = yaml.load(new FileReader(file));

        System.out.println(book.getTitle());
        System.out.println(book.getEdition());
        System.out.println(book.isPaperback());
        System.out.println(book.getAuthors());
    }
}
