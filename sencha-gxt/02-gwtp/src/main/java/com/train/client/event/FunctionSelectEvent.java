package com.train.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;
import com.google.web.bindery.event.shared.HandlerRegistration;

/**
* User: Hu Jing Ling
* Date: 2013-06-04
*/
public class FunctionSelectEvent extends GwtEvent<FunctionSelectEvent.FunctionDataHandler> {

    private String data;

    protected FunctionSelectEvent() {
        //for serialization.
    }

    public FunctionSelectEvent(String data) {
        this.data = data;
    }

    public static void fire(HasHandlers source, String data) {
        FunctionSelectEvent eventInstance = new FunctionSelectEvent(data);
        source.fireEvent(eventInstance);
    }

    public static void fire(HasHandlers source, FunctionSelectEvent eventInstance) {
        source.fireEvent(eventInstance);
    }

    public interface HasGlobalDataHandlers extends HasHandlers {
        HandlerRegistration addGlobalHandler(FunctionDataHandler handler);
    }

    public interface FunctionDataHandler extends EventHandler {
        public void onFunctionEvent(FunctionSelectEvent event);
    }

    private static final Type<FunctionDataHandler> TYPE = new Type<FunctionDataHandler>();

    public static Type<FunctionDataHandler> getType() {
        return TYPE;
    }

    @Override
    public Type<FunctionDataHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(FunctionDataHandler handler) {
        handler.onFunctionEvent(this);
    }

    public String getData() {
        return this.data;
    }

}
