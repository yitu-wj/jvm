package com.yitu.jvm.chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * VM Args:-Xms2m -Xmx2m -XX:+HeapDumpOnOutOfMemoryError
 */
public class HeapOOM {
    static class OOMObject{

    }

    public static void main(String[] args) {
        List<OOMObject> list=new ArrayList<>();
        while (true){
            list.add(new OOMObject());
        }
    }
}
