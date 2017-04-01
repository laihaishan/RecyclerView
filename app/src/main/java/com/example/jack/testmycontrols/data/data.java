package com.example.jack.testmycontrols.data;

/**
 * Created by jack on 2017/1/11.
 */

public class data {

    private int id;
    private String name;

    public data(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public data() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
