package org.hibernate.bugs;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Status implements Serializable {

    private static final Map<Integer, Status> VALUES = new HashMap<>();

    public static Status ONE = new Status(1);
    public static Status TWO = new Status(2);

    private final int value;

    Status(int value) {
        this.value = value;
        VALUES.put(value, this);
    }

    public int getValue() {
        return value;
    }

    public static Status from(int value) {
        return VALUES.get(value);
    }

    @Override
    public String toString() {
        return "Status{" + "value=" + value + '}';
    }
}
