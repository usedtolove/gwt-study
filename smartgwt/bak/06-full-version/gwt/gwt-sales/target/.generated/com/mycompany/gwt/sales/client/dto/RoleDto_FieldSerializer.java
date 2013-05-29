package com.mycompany.gwt.sales.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class RoleDto_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.Date getCreateDate(com.mycompany.gwt.sales.client.dto.RoleDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.RoleDto::createDate;
  }-*/;
  
  private static native void  setCreateDate(com.mycompany.gwt.sales.client.dto.RoleDto instance, java.util.Date value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.RoleDto::createDate = value;
  }-*/;
  
  private static native java.lang.String getDescription(com.mycompany.gwt.sales.client.dto.RoleDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.RoleDto::description;
  }-*/;
  
  private static native void  setDescription(com.mycompany.gwt.sales.client.dto.RoleDto instance, java.lang.String value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.RoleDto::description = value;
  }-*/;
  
  private static native java.lang.String getId(com.mycompany.gwt.sales.client.dto.RoleDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.RoleDto::id;
  }-*/;
  
  private static native void  setId(com.mycompany.gwt.sales.client.dto.RoleDto instance, java.lang.String value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.RoleDto::id = value;
  }-*/;
  
  private static native java.lang.Boolean getIsSystem(com.mycompany.gwt.sales.client.dto.RoleDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.RoleDto::isSystem;
  }-*/;
  
  private static native void  setIsSystem(com.mycompany.gwt.sales.client.dto.RoleDto instance, java.lang.Boolean value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.RoleDto::isSystem = value;
  }-*/;
  
  private static native java.util.Date getModifyDate(com.mycompany.gwt.sales.client.dto.RoleDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.RoleDto::modifyDate;
  }-*/;
  
  private static native void  setModifyDate(com.mycompany.gwt.sales.client.dto.RoleDto instance, java.util.Date value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.RoleDto::modifyDate = value;
  }-*/;
  
  private static native java.lang.String getName(com.mycompany.gwt.sales.client.dto.RoleDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.RoleDto::name;
  }-*/;
  
  private static native void  setName(com.mycompany.gwt.sales.client.dto.RoleDto instance, java.lang.String value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.RoleDto::name = value;
  }-*/;
  
  private static native java.lang.String getOuId(com.mycompany.gwt.sales.client.dto.RoleDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.RoleDto::ouId;
  }-*/;
  
  private static native void  setOuId(com.mycompany.gwt.sales.client.dto.RoleDto instance, java.lang.String value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.RoleDto::ouId = value;
  }-*/;
  
  private static native java.lang.String getProjectId(com.mycompany.gwt.sales.client.dto.RoleDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.RoleDto::projectId;
  }-*/;
  
  private static native void  setProjectId(com.mycompany.gwt.sales.client.dto.RoleDto instance, java.lang.String value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.RoleDto::projectId = value;
  }-*/;
  
  private static native java.util.Set getResourceSet(com.mycompany.gwt.sales.client.dto.RoleDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.RoleDto::resourceSet;
  }-*/;
  
  private static native void  setResourceSet(com.mycompany.gwt.sales.client.dto.RoleDto instance, java.util.Set value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.RoleDto::resourceSet = value;
  }-*/;
  
  private static native java.lang.String getValue(com.mycompany.gwt.sales.client.dto.RoleDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.RoleDto::value;
  }-*/;
  
  private static native void  setValue(com.mycompany.gwt.sales.client.dto.RoleDto instance, java.lang.String value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.RoleDto::value = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.mycompany.gwt.sales.client.dto.RoleDto instance) throws SerializationException {
    setCreateDate(instance, (java.util.Date) streamReader.readObject());
    setDescription(instance, streamReader.readString());
    setId(instance, streamReader.readString());
    setIsSystem(instance, (java.lang.Boolean) streamReader.readObject());
    setModifyDate(instance, (java.util.Date) streamReader.readObject());
    setName(instance, streamReader.readString());
    setOuId(instance, streamReader.readString());
    setProjectId(instance, streamReader.readString());
    setResourceSet(instance, (java.util.Set) streamReader.readObject());
    setValue(instance, streamReader.readString());
    
  }
  
  public static com.mycompany.gwt.sales.client.dto.RoleDto instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.mycompany.gwt.sales.client.dto.RoleDto();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.mycompany.gwt.sales.client.dto.RoleDto instance) throws SerializationException {
    streamWriter.writeObject(getCreateDate(instance));
    streamWriter.writeString(getDescription(instance));
    streamWriter.writeString(getId(instance));
    streamWriter.writeObject(getIsSystem(instance));
    streamWriter.writeObject(getModifyDate(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeString(getOuId(instance));
    streamWriter.writeString(getProjectId(instance));
    streamWriter.writeObject(getResourceSet(instance));
    streamWriter.writeString(getValue(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.mycompany.gwt.sales.client.dto.RoleDto_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.mycompany.gwt.sales.client.dto.RoleDto_FieldSerializer.deserialize(reader, (com.mycompany.gwt.sales.client.dto.RoleDto)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.mycompany.gwt.sales.client.dto.RoleDto_FieldSerializer.serialize(writer, (com.mycompany.gwt.sales.client.dto.RoleDto)object);
  }
  
}
