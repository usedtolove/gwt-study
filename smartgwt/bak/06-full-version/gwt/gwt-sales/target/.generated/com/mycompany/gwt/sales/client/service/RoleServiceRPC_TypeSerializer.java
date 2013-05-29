package com.mycompany.gwt.sales.client.service;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.impl.TypeHandler;
import java.util.HashMap;
import java.util.Map;
import com.google.gwt.core.client.GwtScriptOnly;

public class RoleServiceRPC_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
  private static final Map<String, String> methodMapJava;
  private static final MethodMap methodMapNative;
  private static final Map<String, String> signatureMapJava;
  private static final JsArrayString signatureMapNative;
  
  static {
    if (GWT.isScript()) {
      methodMapJava = null;
      methodMapNative = loadMethodsNative();
      signatureMapJava = null;
      signatureMapNative = loadSignaturesNative();
    } else {
      methodMapJava = loadMethodsJava();
      methodMapNative = null;
      signatureMapJava = loadSignaturesJava();
      signatureMapNative = null;
    }
  }
  
  @SuppressWarnings("deprecation")
  private static Map<String, String> loadMethodsJava() {
    Map<String, String> result = new HashMap<String, String>();
    result.put("com.google.gwt.i18n.client.impl.DateRecord/112389920", "com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533", "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer");
    result.put("com.mycompany.gwt.common.shared.GenericGwtRpcList/2019152012", "com.mycompany.gwt.common.shared.GenericGwtRpcList_FieldSerializer");
    result.put("com.mycompany.gwt.sales.client.dto.ResourceDto/3025868161", "com.mycompany.gwt.sales.client.dto.ResourceDto_FieldSerializer");
    result.put("com.mycompany.gwt.sales.client.dto.RoleDto/4194930710", "com.mycompany.gwt.sales.client.dto.RoleDto_FieldSerializer");
    result.put("[Lcom.mycompany.gwt.sales.client.dto.RoleDto;/835700987", "com.mycompany.gwt.sales.client.dto.RoleDto_Array_Rank_1_FieldSerializer");
    result.put("java.lang.Boolean/476441737", "com.google.gwt.user.client.rpc.core.java.lang.Boolean_FieldSerializer");
    result.put("java.lang.Integer/3438268394", "com.google.gwt.user.client.rpc.core.java.lang.Integer_FieldSerializer");
    result.put("java.lang.String/2004016611", "com.google.gwt.user.client.rpc.core.java.lang.String_FieldSerializer");
    result.put("java.sql.Date/3996530531", "com.google.gwt.user.client.rpc.core.java.sql.Date_FieldSerializer");
    result.put("java.sql.Time/831929183", "com.google.gwt.user.client.rpc.core.java.sql.Time_FieldSerializer");
    result.put("java.sql.Timestamp/1769758459", "com.google.gwt.user.client.rpc.core.java.sql.Timestamp_FieldSerializer");
    result.put("java.util.ArrayList/3821976829", "com.google.gwt.user.client.rpc.core.java.util.ArrayList_FieldSerializer");
    result.put("java.util.Arrays$ArrayList/1243019747", "com.google.gwt.user.client.rpc.core.java.util.Arrays_ArrayList_FieldSerializer");
    result.put("java.util.Collections$EmptyList/3012082351", "com.google.gwt.user.client.rpc.core.java.util.Collections_EmptyList_FieldSerializer");
    result.put("java.util.Collections$EmptyMap/2636129644", "com.google.gwt.user.client.rpc.core.java.util.Collections_EmptyMap_FieldSerializer");
    result.put("java.util.Collections$EmptySet/3150696644", "com.google.gwt.user.client.rpc.core.java.util.Collections_EmptySet_FieldSerializer");
    result.put("java.util.Collections$SingletonList/833432284", "com.google.gwt.user.client.rpc.core.java.util.Collections_SingletonList_FieldSerializer");
    result.put("java.util.Date/1659716317", "com.google.gwt.user.client.rpc.core.java.util.Date_FieldSerializer");
    result.put("java.util.HashMap/962170901", "com.google.gwt.user.client.rpc.core.java.util.HashMap_FieldSerializer");
    result.put("java.util.HashSet/1594477813", "com.google.gwt.user.client.rpc.core.java.util.HashSet_FieldSerializer");
    result.put("java.util.IdentityHashMap/3881143367", "com.google.gwt.user.client.rpc.core.java.util.IdentityHashMap_FieldSerializer");
    result.put("java.util.LinkedHashMap/1551059846", "com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_FieldSerializer");
    result.put("java.util.LinkedHashSet/3628722029", "com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer");
    result.put("java.util.LinkedList/1060625595", "com.google.gwt.user.client.rpc.core.java.util.LinkedList_FieldSerializer");
    result.put("java.util.Stack/1031431137", "com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer");
    result.put("java.util.TreeMap/1575826026", "com.google.gwt.user.client.rpc.core.java.util.TreeMap_FieldSerializer");
    result.put("java.util.TreeSet/1002270346", "com.google.gwt.user.client.rpc.core.java.util.TreeSet_FieldSerializer");
    result.put("java.util.Vector/3125574444", "com.google.gwt.user.client.rpc.core.java.util.Vector_FieldSerializer");
    return result;
  }
  
  @SuppressWarnings("deprecation")
  @GwtScriptOnly
  private static native MethodMap loadMethodsNative() /*-{
    var result = {};
    result["com.google.gwt.i18n.client.impl.DateRecord/112389920"] = [
        @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/i18n/client/impl/DateRecord;),
        @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/i18n/client/impl/DateRecord;)
      ];
    
    result["com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533"] = [
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;)
      ];
    
    result["com.mycompany.gwt.common.shared.GenericGwtRpcList/2019152012"] = [
        @com.mycompany.gwt.common.shared.GenericGwtRpcList_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.mycompany.gwt.common.shared.GenericGwtRpcList_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/mycompany/gwt/common/shared/GenericGwtRpcList;),
      ];
    
    result["com.mycompany.gwt.sales.client.dto.ResourceDto/3025868161"] = [
        @com.mycompany.gwt.sales.client.dto.ResourceDto_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.mycompany.gwt.sales.client.dto.ResourceDto_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/mycompany/gwt/sales/client/dto/ResourceDto;),
        @com.mycompany.gwt.sales.client.dto.ResourceDto_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/mycompany/gwt/sales/client/dto/ResourceDto;)
      ];
    
    result["com.mycompany.gwt.sales.client.dto.RoleDto/4194930710"] = [
        @com.mycompany.gwt.sales.client.dto.RoleDto_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.mycompany.gwt.sales.client.dto.RoleDto_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/mycompany/gwt/sales/client/dto/RoleDto;),
        @com.mycompany.gwt.sales.client.dto.RoleDto_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/mycompany/gwt/sales/client/dto/RoleDto;)
      ];
    
    result["[Lcom.mycompany.gwt.sales.client.dto.RoleDto;/835700987"] = [
        @com.mycompany.gwt.sales.client.dto.RoleDto_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.mycompany.gwt.sales.client.dto.RoleDto_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/mycompany/gwt/sales/client/dto/RoleDto;),
      ];
    
    result["java.lang.Boolean/476441737"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Boolean;),
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Boolean;)
      ];
    
    result["java.lang.Integer/3438268394"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Integer;),
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Integer;)
      ];
    
    result["java.lang.String/2004016611"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/String;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/String;)
      ];
    
    result["java.sql.Date/3996530531"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Date;),
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Date;)
      ];
    
    result["java.sql.Time/831929183"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Time;),
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Time;)
      ];
    
    result["java.sql.Timestamp/1769758459"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Timestamp;),
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Timestamp;)
      ];
    
    result["java.util.ArrayList/3821976829"] = [
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/ArrayList;),
      ];
    
    result["java.util.Arrays$ArrayList/1243019747"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
      ];
    
    result["java.util.Collections$EmptyList/3012082351"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
      ];
    
    result["java.util.Collections$EmptyMap/2636129644"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Map;)
      ];
    
    result["java.util.Collections$EmptySet/3150696644"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptySet_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptySet_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Set;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptySet_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Set;)
      ];
    
    result["java.util.Collections$SingletonList/833432284"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
      ];
    
    result["java.util.Date/1659716317"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Date;),
        @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Date;)
      ];
    
    result["java.util.HashMap/962170901"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/HashMap;)
      ];
    
    result["java.util.HashSet/1594477813"] = [
        @com.google.gwt.user.client.rpc.core.java.util.HashSet_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.HashSet_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/HashSet;),
        @com.google.gwt.user.client.rpc.core.java.util.HashSet_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/HashSet;)
      ];
    
    result["java.util.IdentityHashMap/3881143367"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.IdentityHashMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/IdentityHashMap;)
      ];
    
    result["java.util.LinkedHashMap/1551059846"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/LinkedHashMap;)
      ];
    
    result["java.util.LinkedHashSet/3628722029"] = [
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedHashSet;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/LinkedHashSet;)
      ];
    
    result["java.util.LinkedList/1060625595"] = [
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedList;),
      ];
    
    result["java.util.Stack/1031431137"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Stack;),
      ];
    
    result["java.util.TreeMap/1575826026"] = [
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/TreeMap;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/TreeMap;)
      ];
    
    result["java.util.TreeSet/1002270346"] = [
        @com.google.gwt.user.client.rpc.core.java.util.TreeSet_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeSet_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/TreeSet;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeSet_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/TreeSet;)
      ];
    
    result["java.util.Vector/3125574444"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Vector_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Vector_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Vector;),
      ];
    
    return result;
  }-*/;
  
  @SuppressWarnings("deprecation")
  private static Map<String, String> loadSignaturesJava() {
    Map<String, String> result = new HashMap<String, String>();
    result.put("com.google.gwt.i18n.client.impl.DateRecord", "com.google.gwt.i18n.client.impl.DateRecord/112389920");
    result.put("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException", "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533");
    result.put("com.mycompany.gwt.common.shared.GenericGwtRpcList", "com.mycompany.gwt.common.shared.GenericGwtRpcList/2019152012");
    result.put("com.mycompany.gwt.sales.client.dto.ResourceDto", "com.mycompany.gwt.sales.client.dto.ResourceDto/3025868161");
    result.put("com.mycompany.gwt.sales.client.dto.RoleDto", "com.mycompany.gwt.sales.client.dto.RoleDto/4194930710");
    result.put("[Lcom.mycompany.gwt.sales.client.dto.RoleDto;", "[Lcom.mycompany.gwt.sales.client.dto.RoleDto;/835700987");
    result.put("java.lang.Boolean", "java.lang.Boolean/476441737");
    result.put("java.lang.Integer", "java.lang.Integer/3438268394");
    result.put("java.lang.String", "java.lang.String/2004016611");
    result.put("java.sql.Date", "java.sql.Date/3996530531");
    result.put("java.sql.Time", "java.sql.Time/831929183");
    result.put("java.sql.Timestamp", "java.sql.Timestamp/1769758459");
    result.put("java.util.ArrayList", "java.util.ArrayList/3821976829");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer.concreteType(), "java.util.Arrays$ArrayList/1243019747");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer.concreteType(), "java.util.Collections$EmptyList/3012082351");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyMap_CustomFieldSerializer.concreteType(), "java.util.Collections$EmptyMap/2636129644");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.EmptySet_CustomFieldSerializer.concreteType(), "java.util.Collections$EmptySet/3150696644");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer.concreteType(), "java.util.Collections$SingletonList/833432284");
    result.put("java.util.Date", "java.util.Date/1659716317");
    result.put("java.util.HashMap", "java.util.HashMap/962170901");
    result.put("java.util.HashSet", "java.util.HashSet/1594477813");
    result.put("java.util.IdentityHashMap", "java.util.IdentityHashMap/3881143367");
    result.put("java.util.LinkedHashMap", "java.util.LinkedHashMap/1551059846");
    result.put("java.util.LinkedHashSet", "java.util.LinkedHashSet/3628722029");
    result.put("java.util.LinkedList", "java.util.LinkedList/1060625595");
    result.put("java.util.Stack", "java.util.Stack/1031431137");
    result.put("java.util.TreeMap", "java.util.TreeMap/1575826026");
    result.put("java.util.TreeSet", "java.util.TreeSet/1002270346");
    result.put("java.util.Vector", "java.util.Vector/3125574444");
    return result;
  }
  
  @SuppressWarnings("deprecation")
  @GwtScriptOnly
  private static native JsArrayString loadSignaturesNative() /*-{
    var result = [];
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.i18n.client.impl.DateRecord::class)] = "com.google.gwt.i18n.client.impl.DateRecord/112389920";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException::class)] = "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.mycompany.gwt.common.shared.GenericGwtRpcList::class)] = "com.mycompany.gwt.common.shared.GenericGwtRpcList/2019152012";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.mycompany.gwt.sales.client.dto.ResourceDto::class)] = "com.mycompany.gwt.sales.client.dto.ResourceDto/3025868161";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.mycompany.gwt.sales.client.dto.RoleDto::class)] = "com.mycompany.gwt.sales.client.dto.RoleDto/4194930710";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.mycompany.gwt.sales.client.dto.RoleDto[]::class)] = "[Lcom.mycompany.gwt.sales.client.dto.RoleDto;/835700987";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Boolean::class)] = "java.lang.Boolean/476441737";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Integer::class)] = "java.lang.Integer/3438268394";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.String::class)] = "java.lang.String/2004016611";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Date::class)] = "java.sql.Date/3996530531";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Time::class)] = "java.sql.Time/831929183";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Timestamp::class)] = "java.sql.Timestamp/1769758459";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.ArrayList::class)] = "java.util.ArrayList/3821976829";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Arrays$ArrayList::class)] = "java.util.Arrays$ArrayList/1243019747";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections$EmptyList::class)] = "java.util.Collections$EmptyList/3012082351";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections$EmptyMap::class)] = "java.util.Collections$EmptyMap/2636129644";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections$EmptySet::class)] = "java.util.Collections$EmptySet/3150696644";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections$SingletonList::class)] = "java.util.Collections$SingletonList/833432284";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Date::class)] = "java.util.Date/1659716317";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.HashMap::class)] = "java.util.HashMap/962170901";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.HashSet::class)] = "java.util.HashSet/1594477813";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.IdentityHashMap::class)] = "java.util.IdentityHashMap/3881143367";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.LinkedHashMap::class)] = "java.util.LinkedHashMap/1551059846";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.LinkedHashSet::class)] = "java.util.LinkedHashSet/3628722029";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.LinkedList::class)] = "java.util.LinkedList/1060625595";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Stack::class)] = "java.util.Stack/1031431137";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.TreeMap::class)] = "java.util.TreeMap/1575826026";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.TreeSet::class)] = "java.util.TreeSet/1002270346";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Vector::class)] = "java.util.Vector/3125574444";
    return result;
  }-*/;
  
  public RoleServiceRPC_TypeSerializer() {
    super(methodMapJava, methodMapNative, signatureMapJava, signatureMapNative);
  }
  
}
