package com.mycompany.gwt.sales.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class ResourceDto_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.Date getCreateDate(com.mycompany.gwt.sales.client.dto.ResourceDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.ResourceDto::createDate;
  }-*/;
  
  private static native void  setCreateDate(com.mycompany.gwt.sales.client.dto.ResourceDto instance, java.util.Date value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.ResourceDto::createDate = value;
  }-*/;
  
  private static native java.lang.String getDescription(com.mycompany.gwt.sales.client.dto.ResourceDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.ResourceDto::description;
  }-*/;
  
  private static native void  setDescription(com.mycompany.gwt.sales.client.dto.ResourceDto instance, java.lang.String value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.ResourceDto::description = value;
  }-*/;
  
  private static native java.lang.String getId(com.mycompany.gwt.sales.client.dto.ResourceDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.ResourceDto::id;
  }-*/;
  
  private static native void  setId(com.mycompany.gwt.sales.client.dto.ResourceDto instance, java.lang.String value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.ResourceDto::id = value;
  }-*/;
  
  private static native java.lang.Boolean getIsSystem(com.mycompany.gwt.sales.client.dto.ResourceDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.ResourceDto::isSystem;
  }-*/;
  
  private static native void  setIsSystem(com.mycompany.gwt.sales.client.dto.ResourceDto instance, java.lang.Boolean value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.ResourceDto::isSystem = value;
  }-*/;
  
  private static native java.util.Date getModifyDate(com.mycompany.gwt.sales.client.dto.ResourceDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.ResourceDto::modifyDate;
  }-*/;
  
  private static native void  setModifyDate(com.mycompany.gwt.sales.client.dto.ResourceDto instance, java.util.Date value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.ResourceDto::modifyDate = value;
  }-*/;
  
  private static native java.lang.String getName(com.mycompany.gwt.sales.client.dto.ResourceDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.ResourceDto::name;
  }-*/;
  
  private static native void  setName(com.mycompany.gwt.sales.client.dto.ResourceDto instance, java.lang.String value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.ResourceDto::name = value;
  }-*/;
  
  private static native java.lang.Integer getSeq(com.mycompany.gwt.sales.client.dto.ResourceDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.ResourceDto::seq;
  }-*/;
  
  private static native void  setSeq(com.mycompany.gwt.sales.client.dto.ResourceDto instance, java.lang.Integer value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.ResourceDto::seq = value;
  }-*/;
  
  private static native java.lang.String getValue(com.mycompany.gwt.sales.client.dto.ResourceDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.ResourceDto::value;
  }-*/;
  
  private static native void  setValue(com.mycompany.gwt.sales.client.dto.ResourceDto instance, java.lang.String value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.ResourceDto::value = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.mycompany.gwt.sales.client.dto.ResourceDto instance) throws SerializationException {
    setCreateDate(instance, (java.util.Date) streamReader.readObject());
    setDescription(instance, streamReader.readString());
    setId(instance, streamReader.readString());
    setIsSystem(instance, (java.lang.Boolean) streamReader.readObject());
    setModifyDate(instance, (java.util.Date) streamReader.readObject());
    setName(instance, streamReader.readString());
    setSeq(instance, (java.lang.Integer) streamReader.readObject());
    setValue(instance, streamReader.readString());
    
  }
  
  public static com.mycompany.gwt.sales.client.dto.ResourceDto instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.mycompany.gwt.sales.client.dto.ResourceDto();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.mycompany.gwt.sales.client.dto.ResourceDto instance) throws SerializationException {
    streamWriter.writeObject(getCreateDate(instance));
    streamWriter.writeString(getDescription(instance));
    streamWriter.writeString(getId(instance));
    streamWriter.writeObject(getIsSystem(instance));
    streamWriter.writeObject(getModifyDate(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeObject(getSeq(instance));
    streamWriter.writeString(getValue(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.mycompany.gwt.sales.client.dto.ResourceDto_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.mycompany.gwt.sales.client.dto.ResourceDto_FieldSerializer.deserialize(reader, (com.mycompany.gwt.sales.client.dto.ResourceDto)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.mycompany.gwt.sales.client.dto.ResourceDto_FieldSerializer.serialize(writer, (com.mycompany.gwt.sales.client.dto.ResourceDto)object);
  }
  
}
