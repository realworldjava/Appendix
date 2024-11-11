package com.wiley.realworldjava.yaml.snakeyaml;

import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WriteProgrammatically {

    public static void main(String[] args) throws IOException {

        Map<String, String> map = new HashMap<>();
        map.put("edition", "1");

        DumperOptions options = new DumperOptions();
        options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);

        Yaml yaml = new Yaml(options);

        String output = yaml.dump(map);
        System.out.println(output);


    }
}
