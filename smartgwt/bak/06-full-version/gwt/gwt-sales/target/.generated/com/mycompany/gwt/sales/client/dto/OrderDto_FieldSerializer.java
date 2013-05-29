package com.mycompany.gwt.sales.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class OrderDto_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getId(com.mycompany.gwt.sales.client.dto.OrderDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.OrderDto::Id;
  }-*/;
  
  private static native void  setId(com.mycompany.gwt.sales.client.dto.OrderDto instance, java.lang.String value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.OrderDto::Id = value;
  }-*/;
  
  private static native java.lang.String getCode(com.mycompany.gwt.sales.client.dto.OrderDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.OrderDto::code;
  }-*/;
  
  private static native void  setCode(com.mycompany.gwt.sales.client.dto.OrderDto instance, java.lang.String value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.OrderDto::code = value;
  }-*/;
  
  private static native java.util.Date getCreateDate(com.mycompany.gwt.sales.client.dto.OrderDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.OrderDto::createDate;
  }-*/;
  
  private static native void  setCreateDate(com.mycompany.gwt.sales.client.dto.OrderDto instance, java.util.Date value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.OrderDto::createDate = value;
  }-*/;
  
  private static native java.util.Date getModifyDate(com.mycompany.gwt.sales.client.dto.OrderDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.OrderDto::modifyDate;
  }-*/;
  
  private static native void  setModifyDate(com.mycompany.gwt.sales.client.dto.OrderDto instance, java.util.Date value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.OrderDto::modifyDate = value;
  }-*/;
  
  private static native java.lang.String getRemark(com.mycompany.gwt.sales.client.dto.OrderDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.OrderDto::remark;
  }-*/;
  
  private static native void  setRemark(com.mycompany.gwt.sales.client.dto.OrderDto instance, java.lang.String value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.OrderDto::remark = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.mycompany.gwt.sales.client.dto.OrderDto instance) throws SerializationException {
    setId(instance, streamReader.readString());
    setCode(instance, streamReader.readString());
    setCreateDate(instance, (java.util.Date) streamReader.readObject());
    setModifyDate(instance, (java.util.Date) streamReader.readObject());
    setRemark(instance, streamReader.readString());
    
  }
  
  public static com.mycompany.gwt.sales.client.dto.OrderDto instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.mycompany.gwt.sales.client.dto.OrderDto();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.mycompany.gwt.sales.client.dto.OrderDto instance) throws SerializationException {
    streamWriter.writeString(getId(instance));
    streamWriter.writeString(getCode(instance));
    streamWriter.writeObject(getCreateDate(instance));
    streamWriter.writeObject(getModifyDate(instance));
    streamWriter.writeString(getRemark(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.mycompany.gwt.sales.client.dto.OrderDto_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.mycompany.gwt.sales.client.dto.OrderDto_FieldSerializer.deserialize(reader, (com.mycompany.gwt.sales.client.dto.OrderDto)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.mycompany.gwt.sales.client.dto.OrderDto_FieldSerializer.serialize(writer, (com.mycompany.gwt.sales.client.dto.OrderDto)object);
  }
  
}
