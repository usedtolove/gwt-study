package com.mycompany.gwt.common.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GenericGwtRpcList_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.Integer getTotalRows(com.mycompany.gwt.common.shared.GenericGwtRpcList instance) /*-{
    return instance.@com.mycompany.gwt.common.shared.GenericGwtRpcList::totalRows;
  }-*/;
  
  private static native void  setTotalRows(com.mycompany.gwt.common.shared.GenericGwtRpcList instance, java.lang.Integer value) /*-{
    instance.@com.mycompany.gwt.common.shared.GenericGwtRpcList::totalRows = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.mycompany.gwt.common.shared.GenericGwtRpcList instance) throws SerializationException {
    setTotalRows(instance, (java.lang.Integer) streamReader.readObject());
    
    com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.mycompany.gwt.common.shared.GenericGwtRpcList instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.mycompany.gwt.common.shared.GenericGwtRpcList();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.mycompany.gwt.common.shared.GenericGwtRpcList instance) throws SerializationException {
    streamWriter.writeObject(getTotalRows(instance));
    
    com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.mycompany.gwt.common.shared.GenericGwtRpcList_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.mycompany.gwt.common.shared.GenericGwtRpcList_FieldSerializer.deserialize(reader, (com.mycompany.gwt.common.shared.GenericGwtRpcList)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.mycompany.gwt.common.shared.GenericGwtRpcList_FieldSerializer.serialize(writer, (com.mycompany.gwt.common.shared.GenericGwtRpcList)object);
  }
  
}
