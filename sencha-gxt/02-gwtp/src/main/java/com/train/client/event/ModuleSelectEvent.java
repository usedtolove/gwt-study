package com.train.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;
import com.google.web.bindery.event.shared.HandlerRegistration;

/**
 * User: Hu Jing Ling
 * Date: 2013-06-04
 */
public class ModuleSelectEvent extends GwtEvent<ModuleSelectEvent.ModuleDataHandler> {

    private String data;

    protected ModuleSelectEvent() {
        //for serialization.
    }

    public ModuleSelectEvent(String data) {
        this.data = data;
    }

    public static void fire(HasHandlers source, String data) {
        ModuleSelectEvent eventInstance = new ModuleSelectEvent(data);
        source.fireEvent(eventInstance);
    }

    public static void fire(HasHandlers source, ModuleSelectEvent eventInstance) {
        source.fireEvent(eventInstance);
    }

    public interface HasGlobalDataHandlers extends HasHandlers {
        HandlerRegistration addGlobalHandler(ModuleDataHandler handler);
    }

    public interface ModuleDataHandler extends EventHandler {
        public void onModuleEvent(ModuleSelectEvent event);
    }

    private static final Type<ModuleDataHandler> TYPE = new Type<ModuleDataHandler>();

    public static Type<ModuleDataHandler> getType() {
        return TYPE;
    }

    @Override
    public Type<ModuleDataHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(ModuleDataHandler handler) {
        handler.onModuleEvent(this);
    }

    public String getData() {
        return this.data;
    }

}
