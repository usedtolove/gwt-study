package com.mycompany.gwt.sales.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class UserDto_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.Date getCreateDate(com.mycompany.gwt.sales.client.dto.UserDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.UserDto::createDate;
  }-*/;
  
  private static native void  setCreateDate(com.mycompany.gwt.sales.client.dto.UserDto instance, java.util.Date value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.UserDto::createDate = value;
  }-*/;
  
  private static native java.lang.String getDepartment(com.mycompany.gwt.sales.client.dto.UserDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.UserDto::department;
  }-*/;
  
  private static native void  setDepartment(com.mycompany.gwt.sales.client.dto.UserDto instance, java.lang.String value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.UserDto::department = value;
  }-*/;
  
  private static native java.lang.String getEmail(com.mycompany.gwt.sales.client.dto.UserDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.UserDto::email;
  }-*/;
  
  private static native void  setEmail(com.mycompany.gwt.sales.client.dto.UserDto instance, java.lang.String value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.UserDto::email = value;
  }-*/;
  
  private static native java.lang.String getId(com.mycompany.gwt.sales.client.dto.UserDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.UserDto::id;
  }-*/;
  
  private static native void  setId(com.mycompany.gwt.sales.client.dto.UserDto instance, java.lang.String value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.UserDto::id = value;
  }-*/;
  
  private static native java.lang.Boolean getIsAccountEnabled(com.mycompany.gwt.sales.client.dto.UserDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.UserDto::isAccountEnabled;
  }-*/;
  
  private static native void  setIsAccountEnabled(com.mycompany.gwt.sales.client.dto.UserDto instance, java.lang.Boolean value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.UserDto::isAccountEnabled = value;
  }-*/;
  
  private static native java.lang.Boolean getIsAccountExpired(com.mycompany.gwt.sales.client.dto.UserDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.UserDto::isAccountExpired;
  }-*/;
  
  private static native void  setIsAccountExpired(com.mycompany.gwt.sales.client.dto.UserDto instance, java.lang.Boolean value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.UserDto::isAccountExpired = value;
  }-*/;
  
  private static native java.lang.Boolean getIsAccountLocked(com.mycompany.gwt.sales.client.dto.UserDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.UserDto::isAccountLocked;
  }-*/;
  
  private static native void  setIsAccountLocked(com.mycompany.gwt.sales.client.dto.UserDto instance, java.lang.Boolean value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.UserDto::isAccountLocked = value;
  }-*/;
  
  private static native java.lang.Boolean getIsCredentialsExpired(com.mycompany.gwt.sales.client.dto.UserDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.UserDto::isCredentialsExpired;
  }-*/;
  
  private static native void  setIsCredentialsExpired(com.mycompany.gwt.sales.client.dto.UserDto instance, java.lang.Boolean value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.UserDto::isCredentialsExpired = value;
  }-*/;
  
  private static native java.util.Date getLockedDate(com.mycompany.gwt.sales.client.dto.UserDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.UserDto::lockedDate;
  }-*/;
  
  private static native void  setLockedDate(com.mycompany.gwt.sales.client.dto.UserDto instance, java.util.Date value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.UserDto::lockedDate = value;
  }-*/;
  
  private static native java.util.Date getLoginDate(com.mycompany.gwt.sales.client.dto.UserDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.UserDto::loginDate;
  }-*/;
  
  private static native void  setLoginDate(com.mycompany.gwt.sales.client.dto.UserDto instance, java.util.Date value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.UserDto::loginDate = value;
  }-*/;
  
  private static native java.lang.Integer getLoginFailureCount(com.mycompany.gwt.sales.client.dto.UserDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.UserDto::loginFailureCount;
  }-*/;
  
  private static native void  setLoginFailureCount(com.mycompany.gwt.sales.client.dto.UserDto instance, java.lang.Integer value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.UserDto::loginFailureCount = value;
  }-*/;
  
  private static native java.lang.String getLoginIp(com.mycompany.gwt.sales.client.dto.UserDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.UserDto::loginIp;
  }-*/;
  
  private static native void  setLoginIp(com.mycompany.gwt.sales.client.dto.UserDto instance, java.lang.String value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.UserDto::loginIp = value;
  }-*/;
  
  private static native java.util.Date getModifyDate(com.mycompany.gwt.sales.client.dto.UserDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.UserDto::modifyDate;
  }-*/;
  
  private static native void  setModifyDate(com.mycompany.gwt.sales.client.dto.UserDto instance, java.util.Date value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.UserDto::modifyDate = value;
  }-*/;
  
  private static native java.lang.String getName(com.mycompany.gwt.sales.client.dto.UserDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.UserDto::name;
  }-*/;
  
  private static native void  setName(com.mycompany.gwt.sales.client.dto.UserDto instance, java.lang.String value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.UserDto::name = value;
  }-*/;
  
  private static native java.lang.String getPassword(com.mycompany.gwt.sales.client.dto.UserDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.UserDto::password;
  }-*/;
  
  private static native void  setPassword(com.mycompany.gwt.sales.client.dto.UserDto instance, java.lang.String value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.UserDto::password = value;
  }-*/;
  
  private static native java.lang.String getProjId(com.mycompany.gwt.sales.client.dto.UserDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.UserDto::projId;
  }-*/;
  
  private static native void  setProjId(com.mycompany.gwt.sales.client.dto.UserDto instance, java.lang.String value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.UserDto::projId = value;
  }-*/;
  
  private static native java.util.Set getRoleSet(com.mycompany.gwt.sales.client.dto.UserDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.UserDto::roleSet;
  }-*/;
  
  private static native void  setRoleSet(com.mycompany.gwt.sales.client.dto.UserDto instance, java.util.Set value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.UserDto::roleSet = value;
  }-*/;
  
  private static native java.lang.String getUsername(com.mycompany.gwt.sales.client.dto.UserDto instance) /*-{
    return instance.@com.mycompany.gwt.sales.client.dto.UserDto::username;
  }-*/;
  
  private static native void  setUsername(com.mycompany.gwt.sales.client.dto.UserDto instance, java.lang.String value) /*-{
    instance.@com.mycompany.gwt.sales.client.dto.UserDto::username = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.mycompany.gwt.sales.client.dto.UserDto instance) throws SerializationException {
    setCreateDate(instance, (java.util.Date) streamReader.readObject());
    setDepartment(instance, streamReader.readString());
    setEmail(instance, streamReader.readString());
    setId(instance, streamReader.readString());
    setIsAccountEnabled(instance, (java.lang.Boolean) streamReader.readObject());
    setIsAccountExpired(instance, (java.lang.Boolean) streamReader.readObject());
    setIsAccountLocked(instance, (java.lang.Boolean) streamReader.readObject());
    setIsCredentialsExpired(instance, (java.lang.Boolean) streamReader.readObject());
    setLockedDate(instance, (java.util.Date) streamReader.readObject());
    setLoginDate(instance, (java.util.Date) streamReader.readObject());
    setLoginFailureCount(instance, (java.lang.Integer) streamReader.readObject());
    setLoginIp(instance, streamReader.readString());
    setModifyDate(instance, (java.util.Date) streamReader.readObject());
    setName(instance, streamReader.readString());
    setPassword(instance, streamReader.readString());
    setProjId(instance, streamReader.readString());
    setRoleSet(instance, (java.util.Set) streamReader.readObject());
    setUsername(instance, streamReader.readString());
    
  }
  
  public static com.mycompany.gwt.sales.client.dto.UserDto instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.mycompany.gwt.sales.client.dto.UserDto();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.mycompany.gwt.sales.client.dto.UserDto instance) throws SerializationException {
    streamWriter.writeObject(getCreateDate(instance));
    streamWriter.writeString(getDepartment(instance));
    streamWriter.writeString(getEmail(instance));
    streamWriter.writeString(getId(instance));
    streamWriter.writeObject(getIsAccountEnabled(instance));
    streamWriter.writeObject(getIsAccountExpired(instance));
    streamWriter.writeObject(getIsAccountLocked(instance));
    streamWriter.writeObject(getIsCredentialsExpired(instance));
    streamWriter.writeObject(getLockedDate(instance));
    streamWriter.writeObject(getLoginDate(instance));
    streamWriter.writeObject(getLoginFailureCount(instance));
    streamWriter.writeString(getLoginIp(instance));
    streamWriter.writeObject(getModifyDate(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeString(getPassword(instance));
    streamWriter.writeString(getProjId(instance));
    streamWriter.writeObject(getRoleSet(instance));
    streamWriter.writeString(getUsername(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.mycompany.gwt.sales.client.dto.UserDto_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.mycompany.gwt.sales.client.dto.UserDto_FieldSerializer.deserialize(reader, (com.mycompany.gwt.sales.client.dto.UserDto)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.mycompany.gwt.sales.client.dto.UserDto_FieldSerializer.serialize(writer, (com.mycompany.gwt.sales.client.dto.UserDto)object);
  }
  
}
