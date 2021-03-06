package com.google.gwt.user.client.rpc.core.java.util;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class IdentityHashMap_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static java.util.IdentityHashMap instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new java.util.IdentityHashMap();
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.google.gwt.user.client.rpc.core.java.util.IdentityHashMap_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.util.IdentityHashMap_CustomFieldSerializer.deserialize(reader, (java.util.IdentityHashMap)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.util.IdentityHashMap_CustomFieldSerializer.serialize(writer, (java.util.IdentityHashMap)object);
  }
  
}
