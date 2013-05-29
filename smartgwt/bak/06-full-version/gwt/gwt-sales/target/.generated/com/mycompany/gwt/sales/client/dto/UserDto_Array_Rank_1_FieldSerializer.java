package com.mycompany.gwt.sales.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class UserDto_Array_Rank_1_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.mycompany.gwt.sales.client.dto.UserDto[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.mycompany.gwt.sales.client.dto.UserDto[] instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int size = streamReader.readInt();
    return new com.mycompany.gwt.sales.client.dto.UserDto[size];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.mycompany.gwt.sales.client.dto.UserDto[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.mycompany.gwt.sales.client.dto.UserDto_Array_Rank_1_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.mycompany.gwt.sales.client.dto.UserDto_Array_Rank_1_FieldSerializer.deserialize(reader, (com.mycompany.gwt.sales.client.dto.UserDto[])object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.mycompany.gwt.sales.client.dto.UserDto_Array_Rank_1_FieldSerializer.serialize(writer, (com.mycompany.gwt.sales.client.dto.UserDto[])object);
  }
  
}
