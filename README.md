# Appendix: Reading and Wrting XML, JSON, and YAML

This repository contains the code from the book for the Appendix, Reading and Wrting XML, JSON, and YAML See the [main book page](https://github.com/realworldjava) for the list of all chapter specific repositories.

# How this repository is organized

In this repository, all code is in the main branch. There are three packages, one per format:
| Folder Name  | Contents |
| ------------- | ------------- |
| org.frb.wiley.realworldjava.json |JSON |
| org.frb.wiley.realworldjava.xml |XML |
| org.frb.wiley.realworldjava.yaml |YAML |

# How to run the examples in this chapter


If you want to use an IDE, import the repository as a Maven project so you have the proper  dependencies.

If you want to use the command line, cd to the directory for that example and run 
```
mvn verify
```

# Clickable Links from the Further References Section

XML
* [XML specification](https://www.w3.org/TR/xml)
* [Online validator](https://onlinexmltools.com/validate-xml)
* [Jackson Javadoc](https://javadoc.io/doc/com.fasterxml.jackson.core/jackson-databind/latest/index.html)
* [DOM4J](https://dom4j.github.io)
* [Xerces](https://xerces.apache.org)

JSON
* [JSON specification](https://datatracker.ietf.org/doc/html/rfc8259)
* [Online validator](https://jsonlint.com)
* [JSON schema](https://json-schema.org)
* [JSON query language and processor](https://jqlang.github.io/jq/)
* [Gson Javadoc](https://javadoc.io/doc/com.google.code.gson/gson/)
* [JSON.java: (also known as org.json)](https://github.com/stleary/JSON-java)
* [JSON-P](https://javaee.github.io/jsonp/)
* [JSON-B](https://javaee.github.io/jsonb-spec/)

YAML
* [YAML specification](https://yaml.org/spec/)
* [YAML validator](https://www.yamllint.com)
* [SnakeYAML](https://bitbucket.org/snakeyaml/snakeyaml/wiki/Documentation)
* [SnakeYAML Javadoc](https://javadoc.io/doc/org.yaml/snakeyaml/latest/index.html)
* [YAMLBeans](https://github.com/EsotericSoftware/yamlbeans)