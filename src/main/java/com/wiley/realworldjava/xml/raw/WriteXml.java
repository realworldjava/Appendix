package com.wiley.realworldjava.xml.raw;

public class WriteXml {

    public static void main(String[] args) {
        String xml = """
                <book>
                    <edition>%d</edition>
                </book>
                """;
        System.out.format(xml, 1);
    }
}
