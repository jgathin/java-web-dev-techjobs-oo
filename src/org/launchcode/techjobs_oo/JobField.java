package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {

    private int id;
    private static int nextId = 1;
    private String value;

    public JobField(){
        this.id = nextId;
        nextId++;
    }

    public JobField(String value){
        this();
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    //@Override
    public String toString() {
        if(this.value.equals("")){
            return "Data not available";
        } else {
            return value;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return id == jobField.id && value.equals(jobField.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value);
    }
}
