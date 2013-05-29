package com.train.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Document;

public class Demo implements EntryPoint {

    @Override
    public void onModuleLoad() {
        HelloWorld helloWorld = new HelloWorld();
        // Don't forget, this is DOM only; will not work with GWT widgets
        Document.get().getBody().appendChild(helloWorld.getElement());
        helloWorld.setName("World");

    }
}
