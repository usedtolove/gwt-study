package com.train.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;
import com.google.web.bindery.event.shared.HandlerRegistration;

/**
 * User: Hu Jing Ling
 * Date: 2013-06-04
 */
public class GlobalDataEvent extends GwtEvent<GlobalDataEvent.GlobalDataHandler> {

    private String data;

    protected GlobalDataEvent() {
        // Possibly for serialization.
    }

    public GlobalDataEvent(String data) {
        this.data = data;
    }

    public static void fire(HasHandlers source, String data) {
        GlobalDataEvent eventInstance = new GlobalDataEvent(data);
        source.fireEvent(eventInstance);
    }

    public static void fire(HasHandlers source, GlobalDataEvent eventInstance) {
        source.fireEvent(eventInstance);
    }

    public interface HasGlobalDataHandlers extends HasHandlers {
        HandlerRegistration addGlobalHandler(GlobalDataHandler handler);
    }

    public interface GlobalDataHandler extends EventHandler {
        public void onGlobalEvent(GlobalDataEvent event);
    }

    private static final Type<GlobalDataHandler> TYPE = new Type<GlobalDataHandler>();

    public static Type<GlobalDataHandler> getType() {
        return TYPE;
    }

    @Override
    public Type<GlobalDataHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(GlobalDataHandler handler) {
        handler.onGlobalEvent(this);
    }

    public String getData() {
        return this.data;
    }

}
