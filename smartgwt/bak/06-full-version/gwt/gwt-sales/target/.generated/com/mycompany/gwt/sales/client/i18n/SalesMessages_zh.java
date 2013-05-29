package com.mycompany.gwt.sales.client.i18n;

public class SalesMessages_zh implements com.mycompany.gwt.sales.client.i18n.SalesMessages {
  
  public java.lang.String warning_not_delete_isSystem(java.lang.String arg0) {
    return new java.lang.StringBuffer().append("角色 : ").append(arg0).append(" 是系统内置角色，删除后可能导致系统无法正常使用!").toString();
  }
  
  public java.lang.String msgTime(java.lang.String arg0,java.lang.String arg1) {
    return new java.lang.StringBuffer().append("发送时间:").append(arg0).append(",来自").append(arg1).toString();
  }
  
  public java.lang.String msg_welcome_back(java.lang.String arg0) {
    return new java.lang.StringBuffer().append("欢迎 ").append(arg0).append(" 回来!").toString();
  }
  
  public java.lang.String msg_welcome(java.lang.String arg0) {
    return new java.lang.StringBuffer().append("欢迎 : ").append(arg0).toString();
  }
  
  public java.lang.String modPath(java.lang.String arg0) {
    return new java.lang.StringBuffer().append("当前位置:").append(arg0).toString();
  }
}
