package com.wiley.realworldjava.yaml.snakeyaml;

import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.nodes.Tag;
import org.yaml.snakeyaml.representer.Representer;

import java.io.IOException;
import java.util.List;

public class WriteFromObject {

    public static void main(String[] args) throws IOException {

        Book book = new Book();
        book.setAuthors(List.of("Victor & Jeanne"));

        DumperOptions options = new DumperOptions();
        options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);

        Representer representer = new Representer(options);
        representer.addClassTag(Book.class, Tag.MAP);

        Yaml yaml = new Yaml(representer, options);

        String output = yaml.dump(book);
        System.out.println(output);
    }
}
