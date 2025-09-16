package com.minidb.catalog;
public class Column {
    public enum Type { INT, TEXT }
    public final String name;
    public final Type type;
    public Column(String name, Type type){
        this.name = name;
        this.type = type;
    }
}
