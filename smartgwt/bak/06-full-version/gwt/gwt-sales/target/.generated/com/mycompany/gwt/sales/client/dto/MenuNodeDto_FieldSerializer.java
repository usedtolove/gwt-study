package com.mycompany.gwt.sales.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class MenuNodeDto_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getId(com.mycompany.gwt.sales.client.dto.MenuNodeDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.MenuNodeDto::Id;
  }-*/;
  
  private static native void  setId(com.mycompany.gwt.sales.client.dto.MenuNodeDto instance, java.lang.String value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.MenuNodeDto::Id = value;
  }-*/;
  
  private static native java.lang.String getCategory(com.mycompany.gwt.sales.client.dto.MenuNodeDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.MenuNodeDto::category;
  }-*/;
  
  private static native void  setCategory(com.mycompany.gwt.sales.client.dto.MenuNodeDto instance, java.lang.String value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.MenuNodeDto::category = value;
  }-*/;
  
  private static native java.util.Date getCreateDate(com.mycompany.gwt.sales.client.dto.MenuNodeDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.MenuNodeDto::createDate;
  }-*/;
  
  private static native void  setCreateDate(com.mycompany.gwt.sales.client.dto.MenuNodeDto instance, java.util.Date value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.MenuNodeDto::createDate = value;
  }-*/;
  
  private static native java.lang.String getIcon(com.mycompany.gwt.sales.client.dto.MenuNodeDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.MenuNodeDto::icon;
  }-*/;
  
  private static native void  setIcon(com.mycompany.gwt.sales.client.dto.MenuNodeDto instance, java.lang.String value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.MenuNodeDto::icon = value;
  }-*/;
  
  private static native boolean getIsFolder(com.mycompany.gwt.sales.client.dto.MenuNodeDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.MenuNodeDto::isFolder;
  }-*/;
  
  private static native void  setIsFolder(com.mycompany.gwt.sales.client.dto.MenuNodeDto instance, boolean value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.MenuNodeDto::isFolder = value;
  }-*/;
  
  private static native java.util.Date getModifyDate(com.mycompany.gwt.sales.client.dto.MenuNodeDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.MenuNodeDto::modifyDate;
  }-*/;
  
  private static native void  setModifyDate(com.mycompany.gwt.sales.client.dto.MenuNodeDto instance, java.util.Date value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.MenuNodeDto::modifyDate = value;
  }-*/;
  
  private static native java.lang.String getName(com.mycompany.gwt.sales.client.dto.MenuNodeDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.MenuNodeDto::name;
  }-*/;
  
  private static native void  setName(com.mycompany.gwt.sales.client.dto.MenuNodeDto instance, java.lang.String value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.MenuNodeDto::name = value;
  }-*/;
  
  private static native java.lang.String getParentId(com.mycompany.gwt.sales.client.dto.MenuNodeDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.MenuNodeDto::parentId;
  }-*/;
  
  private static native void  setParentId(com.mycompany.gwt.sales.client.dto.MenuNodeDto instance, java.lang.String value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.MenuNodeDto::parentId = value;
  }-*/;
  
  private static native java.lang.Integer getSeq(com.mycompany.gwt.sales.client.dto.MenuNodeDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.MenuNodeDto::seq;
  }-*/;
  
  private static native void  setSeq(com.mycompany.gwt.sales.client.dto.MenuNodeDto instance, java.lang.Integer value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.MenuNodeDto::seq = value;
  }-*/;
  
  private static native java.lang.String getViewId(com.mycompany.gwt.sales.client.dto.MenuNodeDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.MenuNodeDto::viewId;
  }-*/;
  
  private static native void  setViewId(com.mycompany.gwt.sales.client.dto.MenuNodeDto instance, java.lang.String value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.MenuNodeDto::viewId = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.mycompany.gwt.sales.client.dto.MenuNodeDto instance) throws SerializationException {
    setId(instance, streamReader.readString());
    setCategory(instance, streamReader.readString());
    setCreateDate(instance, (java.util.Date) streamReader.readObject());
    setIcon(instance, streamReader.readString());
    setIsFolder(instance, streamReader.readBoolean());
    setModifyDate(instance, (java.util.Date) streamReader.readObject());
    setName(instance, streamReader.readString());
    setParentId(instance, streamReader.readString());
    setSeq(instance, (java.lang.Integer) streamReader.readObject());
    setViewId(instance, streamReader.readString());
    
  }
  
  public static com.mycompany.gwt.sales.client.dto.MenuNodeDto instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.mycompany.gwt.sales.client.dto.MenuNodeDto();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.mycompany.gwt.sales.client.dto.MenuNodeDto instance) throws SerializationException {
    streamWriter.writeString(getId(instance));
    streamWriter.writeString(getCategory(instance));
    streamWriter.writeObject(getCreateDate(instance));
    streamWriter.writeString(getIcon(instance));
    streamWriter.writeBoolean(getIsFolder(instance));
    streamWriter.writeObject(getModifyDate(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeString(getParentId(instance));
    streamWriter.writeObject(getSeq(instance));
    streamWriter.writeString(getViewId(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.mycompany.gwt.sales.client.dto.MenuNodeDto_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.mycompany.gwt.sales.client.dto.MenuNodeDto_FieldSerializer.deserialize(reader, (com.mycompany.gwt.sales.client.dto.MenuNodeDto)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.mycompany.gwt.sales.client.dto.MenuNodeDto_FieldSerializer.serialize(writer, (com.mycompany.gwt.sales.client.dto.MenuNodeDto)object);
  }
  
}
