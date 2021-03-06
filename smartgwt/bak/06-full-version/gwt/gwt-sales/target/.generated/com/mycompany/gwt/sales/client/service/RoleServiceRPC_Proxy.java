package com.mycompany.gwt.sales.client.service;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.RpcToken;
import com.google.gwt.user.client.rpc.RpcTokenException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class RoleServiceRPC_Proxy extends RemoteServiceProxy implements com.mycompany.gwt.sales.client.service.RoleServiceRPCAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "com.mycompany.gwt.sales.client.service.RoleServiceRPC";
  private static final String SERIALIZATION_POLICY ="A70EEB965112D26CE7C64877409B0BBF";
  private static final com.mycompany.gwt.sales.client.service.RoleServiceRPC_TypeSerializer SERIALIZER = new com.mycompany.gwt.sales.client.service.RoleServiceRPC_TypeSerializer();
  
  public RoleServiceRPC_Proxy() {
    super(GWT.getModuleBaseURL(),
      "springGwtServices/roleServiceRPCServlet", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void add(com.mycompany.gwt.sales.client.dto.RoleDto arg0, com.google.gwt.user.client.rpc.AsyncCallback arg1) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("RoleServiceRPC_Proxy.add", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("add");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.Object");
      streamWriter.writeObject(arg0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("RoleServiceRPC_Proxy.add",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "RoleServiceRPC_Proxy.add", statsContext, payload, arg1);
    } catch (SerializationException ex) {
      arg1.onFailure(ex);
    }
  }
  
  public void fetch(java.lang.Integer arg0, java.lang.Integer arg1, java.lang.String arg2, java.util.Map arg3, com.google.gwt.user.client.rpc.AsyncCallback arg4) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("RoleServiceRPC_Proxy.fetch", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("fetch");
      streamWriter.writeInt(4);
      streamWriter.writeString("java.lang.Integer/3438268394");
      streamWriter.writeString("java.lang.Integer/3438268394");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.util.Map");
      streamWriter.writeObject(arg0);
      streamWriter.writeObject(arg1);
      streamWriter.writeString(arg2);
      streamWriter.writeObject(arg3);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("RoleServiceRPC_Proxy.fetch",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "RoleServiceRPC_Proxy.fetch", statsContext, payload, arg4);
    } catch (SerializationException ex) {
      arg4.onFailure(ex);
    }
  }
  
  public void remove(com.mycompany.gwt.sales.client.dto.RoleDto arg0, com.google.gwt.user.client.rpc.AsyncCallback arg1) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("RoleServiceRPC_Proxy.remove", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("remove");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.Object");
      streamWriter.writeObject(arg0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("RoleServiceRPC_Proxy.remove",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "RoleServiceRPC_Proxy.remove", statsContext, payload, arg1);
    } catch (SerializationException ex) {
      arg1.onFailure(ex);
    }
  }
  
  public void update(com.mycompany.gwt.sales.client.dto.RoleDto arg0, com.google.gwt.user.client.rpc.AsyncCallback arg1) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("RoleServiceRPC_Proxy.update", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("update");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.Object");
      streamWriter.writeObject(arg0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("RoleServiceRPC_Proxy.update",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "RoleServiceRPC_Proxy.update", statsContext, payload, arg1);
    } catch (SerializationException ex) {
      arg1.onFailure(ex);
    }
  }
  @Override
  public SerializationStreamWriter createStreamWriter() {
    ClientSerializationStreamWriter toReturn =
      (ClientSerializationStreamWriter) super.createStreamWriter();
    if (getRpcToken() != null) {
      toReturn.addFlags(ClientSerializationStreamWriter.FLAG_RPC_TOKEN_INCLUDED);
    }
    return toReturn;
  }
}
