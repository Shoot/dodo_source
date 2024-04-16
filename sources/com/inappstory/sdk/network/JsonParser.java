package com.inappstory.sdk.network;

import android.util.Pair;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
/* loaded from: classes3.dex */
public class JsonParser {
    private static boolean containsInterface(Class[] clsArr, Class cls) {
        for (Class cls2 : clsArr) {
            if (cls.equals(cls2)) {
                return true;
            }
        }
        return false;
    }

    private static <T> T fromJson(JSONObject jSONObject, Class<T> cls) throws Exception {
        java.lang.reflect.Field[] fieldArr;
        int i;
        int i2;
        T newInstance = cls.newInstance();
        java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        int i3 = 0;
        while (i3 < length) {
            java.lang.reflect.Field field = declaredFields[i3];
            if (!Modifier.isStatic(field.getModifiers())) {
                field.setAccessible(true);
                if (field.getAnnotation(Ignore.class) == null) {
                    String name = field.getName();
                    if (field.getAnnotation(SerializedName.class) != null) {
                        name = ((SerializedName) field.getAnnotation(SerializedName.class)).value();
                    }
                    if (jSONObject.has(name) && jSONObject.get(name) != null && !jSONObject.get(name).toString().equals("null")) {
                        if (!field.getType().equals(Integer.TYPE) && !field.getType().equals(Integer.class)) {
                            if (!field.getType().equals(Long.TYPE) && !field.getType().equals(Long.class)) {
                                if (!field.getType().equals(Character.TYPE) && !field.getType().equals(Character.class)) {
                                    if (!field.getType().equals(Boolean.TYPE) && !field.getType().equals(Boolean.class)) {
                                        if (!field.getType().equals(Byte.TYPE) && !field.getType().equals(Byte.class)) {
                                            if (!field.getType().equals(Short.TYPE) && !field.getType().equals(Short.class)) {
                                                if (!field.getType().equals(Float.TYPE) && !field.getType().equals(Float.class)) {
                                                    if (!field.getType().equals(Double.TYPE) && !field.getType().equals(Double.class)) {
                                                        fieldArr = declaredFields;
                                                        if (field.getType().equals(String.class)) {
                                                            field.set(newInstance, jSONObject.getString(name));
                                                            i = length;
                                                            i2 = i3;
                                                        } else {
                                                            i = length;
                                                            if (!field.getType().equals(List.class) && !field.getType().equals(ArrayList.class)) {
                                                                if (!field.getType().equals(Map.class) && !containsInterface(field.getType().getInterfaces(), Map.class)) {
                                                                    field.set(newInstance, fromJson(jSONObject.getJSONObject(name), (Class) field.getGenericType()));
                                                                } else {
                                                                    field.set(newInstance, toObjectMap(jSONObject.getJSONObject(name)));
                                                                }
                                                                i2 = i3;
                                                            } else {
                                                                ParameterizedType parameterizedType = (ParameterizedType) field.getGenericType();
                                                                ArrayList arrayList = new ArrayList();
                                                                i2 = i3;
                                                                if (parameterizedType.getActualTypeArguments()[0] instanceof ParameterizedType) {
                                                                    Class cls2 = (Class) ((ParameterizedType) parameterizedType.getActualTypeArguments()[0]).getActualTypeArguments()[0];
                                                                    JSONArray jSONArray = jSONObject.getJSONArray(name);
                                                                    if (!cls2.isPrimitive() && !cls2.equals(Integer.class) && !cls2.equals(Boolean.class) && !cls2.equals(Character.class) && !cls2.equals(Short.class) && !cls2.equals(Long.class) && !cls2.equals(Byte.class) && !cls2.equals(Float.class) && !cls2.equals(Double.class) && !cls2.equals(String.class)) {
                                                                        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                                                                            JSONArray jSONArray2 = (JSONArray) jSONArray.get(i4);
                                                                            ArrayList arrayList2 = new ArrayList();
                                                                            for (int i5 = 0; i5 < jSONArray2.length(); i5++) {
                                                                                arrayList2.add(fromJson((JSONObject) jSONArray.get(i4), cls2));
                                                                            }
                                                                            arrayList.add(arrayList2);
                                                                        }
                                                                    } else {
                                                                        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                                                                            JSONArray jSONArray3 = (JSONArray) jSONArray.get(i6);
                                                                            ArrayList arrayList3 = new ArrayList();
                                                                            for (int i7 = 0; i7 < jSONArray3.length(); i7++) {
                                                                                arrayList3.add(jSONArray3.get(i7));
                                                                            }
                                                                            arrayList.add(arrayList3);
                                                                        }
                                                                    }
                                                                } else {
                                                                    Class cls3 = (Class) parameterizedType.getActualTypeArguments()[0];
                                                                    JSONArray jSONArray4 = jSONObject.getJSONArray(name);
                                                                    if (!cls3.isPrimitive() && !cls3.equals(Integer.class) && !cls3.equals(Boolean.class) && !cls3.equals(Character.class) && !cls3.equals(Short.class) && !cls3.equals(Long.class) && !cls3.equals(Byte.class) && !cls3.equals(Float.class) && !cls3.equals(Double.class) && !cls3.equals(String.class)) {
                                                                        for (int i8 = 0; i8 < jSONArray4.length(); i8++) {
                                                                            if (jSONArray4.get(i8) instanceof JSONObject) {
                                                                                arrayList.add(fromJson((JSONObject) jSONArray4.get(i8), cls3));
                                                                            }
                                                                        }
                                                                    } else {
                                                                        for (int i9 = 0; i9 < jSONArray4.length(); i9++) {
                                                                            arrayList.add(jSONArray4.get(i9));
                                                                        }
                                                                    }
                                                                }
                                                                field.set(newInstance, arrayList);
                                                            }
                                                        }
                                                    } else {
                                                        fieldArr = declaredFields;
                                                        i = length;
                                                        i2 = i3;
                                                        field.set(newInstance, new Double(jSONObject.getDouble(name)));
                                                    }
                                                } else {
                                                    fieldArr = declaredFields;
                                                    i = length;
                                                    i2 = i3;
                                                    field.set(newInstance, new Float((float) jSONObject.getDouble(name)));
                                                }
                                            } else {
                                                fieldArr = declaredFields;
                                                i = length;
                                                i2 = i3;
                                                field.set(newInstance, new Short((short) jSONObject.getInt(name)));
                                            }
                                        } else {
                                            fieldArr = declaredFields;
                                            i = length;
                                            i2 = i3;
                                            field.set(newInstance, new Byte((byte) jSONObject.getInt(name)));
                                        }
                                    } else {
                                        fieldArr = declaredFields;
                                        i = length;
                                        i2 = i3;
                                        field.set(newInstance, new Boolean(jSONObject.getBoolean(name)));
                                    }
                                } else {
                                    fieldArr = declaredFields;
                                    i = length;
                                    i2 = i3;
                                    field.set(newInstance, new Character((char) jSONObject.getInt(name)));
                                }
                            } else {
                                fieldArr = declaredFields;
                                i = length;
                                i2 = i3;
                                field.set(newInstance, new Long(jSONObject.getLong(name)));
                            }
                        } else {
                            fieldArr = declaredFields;
                            i = length;
                            i2 = i3;
                            field.set(newInstance, new Integer(jSONObject.getInt(name)));
                        }
                    } else {
                        fieldArr = declaredFields;
                        i = length;
                        i2 = i3;
                        if (field.getAnnotation(Required.class) != null) {
                            throw new JSONException("Required field " + field.getName() + " is empty or in wrong format");
                        }
                    }
                    i3 = i2 + 1;
                    declaredFields = fieldArr;
                    length = i;
                }
            }
            fieldArr = declaredFields;
            i = length;
            i2 = i3;
            i3 = i2 + 1;
            declaredFields = fieldArr;
            length = i;
        }
        return newInstance;
    }

    public static String getJson(Object obj) throws Exception {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof List) && !(obj instanceof ArrayList)) {
            return ((JSONObject) getJsonObject(obj)).toString();
        }
        JSONArray jSONArray = new JSONArray();
        int i = 0;
        while (true) {
            List list = (List) obj;
            if (i < list.size()) {
                jSONArray.put(getJsonObject(list.get(i)));
                i++;
            } else {
                return jSONArray.toString();
            }
        }
    }

    private static Object getJsonObject(Object obj) throws Exception {
        java.lang.reflect.Field[] fieldArr;
        int i;
        int i2;
        Class<Integer> cls;
        Class<Short> cls2;
        Class<Long> cls3;
        Class<Character> cls4;
        Class<Boolean> cls5;
        JSONObject jSONObject;
        Object obj2 = obj;
        if (obj2 == null) {
            return null;
        }
        Class<?> cls6 = obj.getClass();
        if (!cls6.isPrimitive()) {
            Class<Integer> cls7 = Integer.class;
            if (!cls6.equals(cls7)) {
                Class<Boolean> cls8 = Boolean.class;
                if (!cls6.equals(cls8)) {
                    Class<Character> cls9 = Character.class;
                    if (!cls6.equals(cls9)) {
                        Class<Short> cls10 = Short.class;
                        if (!cls6.equals(cls10)) {
                            Class<Long> cls11 = Long.class;
                            if (!cls6.equals(cls11) && !cls6.equals(Byte.class) && !cls6.equals(Float.class) && !cls6.equals(Double.class) && !cls6.equals(String.class)) {
                                JSONObject jSONObject2 = new JSONObject();
                                if (obj2 instanceof Map) {
                                    Map map = (Map) obj2;
                                    for (Object obj3 : map.keySet()) {
                                        jSONObject2.put(obj3.toString(), getJsonObject(map.get(obj3)));
                                    }
                                    return jSONObject2;
                                }
                                java.lang.reflect.Field[] declaredFields = obj.getClass().getDeclaredFields();
                                int length = declaredFields.length;
                                int i3 = 0;
                                while (i3 < length) {
                                    java.lang.reflect.Field field = declaredFields[i3];
                                    if (Modifier.isStatic(field.getModifiers())) {
                                        jSONObject = jSONObject2;
                                        cls = cls7;
                                        cls5 = cls8;
                                        cls4 = cls9;
                                        cls2 = cls10;
                                        cls3 = cls11;
                                        fieldArr = declaredFields;
                                    } else {
                                        field.setAccessible(true);
                                        String name = field.getName();
                                        fieldArr = declaredFields;
                                        if (field.getAnnotation(Ignore.class) != null) {
                                            jSONObject = jSONObject2;
                                            cls = cls7;
                                            cls5 = cls8;
                                            cls4 = cls9;
                                            cls2 = cls10;
                                            cls3 = cls11;
                                        } else {
                                            if (field.getAnnotation(SerializedName.class) != null) {
                                                name = ((SerializedName) field.getAnnotation(SerializedName.class)).value();
                                            }
                                            JSONArray jSONArray = field.get(obj2);
                                            i = length;
                                            i2 = i3;
                                            if (jSONArray == null) {
                                                if (field.getAnnotation(Required.class) == null) {
                                                    jSONObject = jSONObject2;
                                                    cls = cls7;
                                                    cls5 = cls8;
                                                    cls4 = cls9;
                                                    cls2 = cls10;
                                                    cls3 = cls11;
                                                    i3 = i2 + 1;
                                                    jSONObject2 = jSONObject;
                                                    declaredFields = fieldArr;
                                                    length = i;
                                                    cls7 = cls;
                                                    cls8 = cls5;
                                                    cls9 = cls4;
                                                    cls11 = cls3;
                                                    cls10 = cls2;
                                                    obj2 = obj;
                                                } else {
                                                    throw new JSONException("Required field " + field.getName() + " is empty or in wrong format");
                                                }
                                            } else {
                                                JSONObject jSONObject3 = jSONObject2;
                                                Class<?> type = field.getType();
                                                if (type.isPrimitive() || type.equals(cls7) || type.equals(cls8) || type.equals(cls9) || type.equals(cls10) || type.equals(cls11) || type.equals(Byte.class) || type.equals(Float.class) || type.equals(Double.class) || type.equals(String.class)) {
                                                    cls = cls7;
                                                } else {
                                                    cls = cls7;
                                                    if (!field.getType().equals(List.class) && !containsInterface(field.getType().getInterfaces(), List.class)) {
                                                        if (!field.getType().equals(Map.class) && !containsInterface(field.getType().getInterfaces(), Map.class)) {
                                                            jSONArray = getJsonObject(jSONArray);
                                                        } else {
                                                            jSONArray = new JSONObject((Map) jSONArray);
                                                        }
                                                    } else {
                                                        JSONArray jSONArray2 = new JSONArray();
                                                        List list = (List) jSONArray;
                                                        cls5 = cls8;
                                                        int size = list.size();
                                                        if (((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0] instanceof ParameterizedType) {
                                                            int i4 = 0;
                                                            while (true) {
                                                                cls4 = cls9;
                                                                if (i4 >= size) {
                                                                    break;
                                                                }
                                                                JSONArray jSONArray3 = new JSONArray();
                                                                Class<Short> cls12 = cls10;
                                                                Class<Long> cls13 = cls11;
                                                                int i5 = 0;
                                                                for (int size2 = ((List) list.get(i4)).size(); i5 < size2; size2 = size2) {
                                                                    jSONArray3.put(getJsonObject(((List) list.get(i4)).get(i5)));
                                                                    i5++;
                                                                }
                                                                jSONArray2.put(jSONArray3);
                                                                i4++;
                                                                cls9 = cls4;
                                                                cls11 = cls13;
                                                                cls10 = cls12;
                                                            }
                                                            cls2 = cls10;
                                                            cls3 = cls11;
                                                        } else {
                                                            cls4 = cls9;
                                                            cls2 = cls10;
                                                            cls3 = cls11;
                                                            for (int i6 = 0; i6 < size; i6++) {
                                                                jSONArray2.put(getJsonObject(list.get(i6)));
                                                            }
                                                        }
                                                        jSONArray = jSONArray2;
                                                        if (jSONArray == null || field.getAnnotation(Required.class) == null) {
                                                            jSONObject = jSONObject3;
                                                            jSONObject.put(name, jSONArray);
                                                            i3 = i2 + 1;
                                                            jSONObject2 = jSONObject;
                                                            declaredFields = fieldArr;
                                                            length = i;
                                                            cls7 = cls;
                                                            cls8 = cls5;
                                                            cls9 = cls4;
                                                            cls11 = cls3;
                                                            cls10 = cls2;
                                                            obj2 = obj;
                                                        } else {
                                                            throw new JSONException("Required field " + field.getName() + " is empty or in wrong format");
                                                        }
                                                    }
                                                }
                                                cls5 = cls8;
                                                cls4 = cls9;
                                                cls2 = cls10;
                                                cls3 = cls11;
                                                if (jSONArray == null) {
                                                }
                                                jSONObject = jSONObject3;
                                                jSONObject.put(name, jSONArray);
                                                i3 = i2 + 1;
                                                jSONObject2 = jSONObject;
                                                declaredFields = fieldArr;
                                                length = i;
                                                cls7 = cls;
                                                cls8 = cls5;
                                                cls9 = cls4;
                                                cls11 = cls3;
                                                cls10 = cls2;
                                                obj2 = obj;
                                            }
                                        }
                                    }
                                    i = length;
                                    i2 = i3;
                                    i3 = i2 + 1;
                                    jSONObject2 = jSONObject;
                                    declaredFields = fieldArr;
                                    length = i;
                                    cls7 = cls;
                                    cls8 = cls5;
                                    cls9 = cls4;
                                    cls11 = cls3;
                                    cls10 = cls2;
                                    obj2 = obj;
                                }
                                return jSONObject2;
                            }
                        }
                    }
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> ArrayList<T> listFromJson(String str, Class<T> cls) {
        Object nextValue;
        ArrayList<T> arrayList = (ArrayList<T>) new ArrayList();
        try {
            nextValue = new JSONTokener(str).nextValue();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (nextValue != null && (nextValue instanceof JSONArray)) {
            for (int i = 0; i < ((JSONArray) nextValue).length(); i++) {
                Object obj = ((JSONArray) nextValue).get(i);
                if (!cls.isPrimitive() && !cls.equals(Integer.class) && !cls.equals(Boolean.class) && !cls.equals(Character.class) && !cls.equals(Short.class) && !cls.equals(Long.class) && !cls.equals(Byte.class) && !cls.equals(Float.class) && !cls.equals(Double.class) && !cls.equals(String.class)) {
                    arrayList.add(fromJson((JSONObject) obj, cls));
                }
                arrayList.add(obj);
            }
            return arrayList;
        }
        throw new Exception();
    }

    private static List<Pair<String, String>> listToQueryParams(String str, List<Object> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj instanceof List) {
                arrayList.addAll(listToQueryParams(str + "[" + i + "]", (List) obj));
            } else if (obj instanceof Map) {
                arrayList.addAll(mapToQueryParams(str + "[" + i + "]", (Map) obj));
            } else {
                arrayList.add(new Pair(str + "[]", obj.toString()));
            }
        }
        return arrayList;
    }

    public static String mapToJsonString(Map<String, Object> map) {
        return new JSONObject(map).toString();
    }

    private static List<Pair<String, String>> mapToQueryParams(String str, Map<String, Object> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String str2 = str + "[" + entry.getKey() + "]";
            if (entry.getValue() instanceof List) {
                arrayList.addAll(listToQueryParams(str2, (List) entry.getValue()));
            } else if (entry.getValue() instanceof Map) {
                arrayList.addAll(mapToQueryParams(str2, (Map) entry.getValue()));
            } else {
                arrayList.add(new Pair(str2, entry.getValue().toString()));
            }
        }
        return arrayList;
    }

    public static List<Object> toList(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = toList((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = toMap((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static Map<String, String> toMap(String str) {
        try {
            return toMap(new JSONObject(str));
        } catch (Exception unused) {
            return null;
        }
    }

    static List<Object> toObjectList(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = toObjectList((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = toObjectMap((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static Map<String, Object> toObjectMap(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = toObjectList((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = toObjectMap((JSONObject) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }

    public static List<Pair<String, String>> toQueryParams(String str, String str2) {
        try {
            return mapToQueryParams(str, toObjectMap(new JSONObject(str2)));
        } catch (Exception unused) {
            return null;
        }
    }

    static Map<String, String> toMap(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = toList((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = toMap((JSONObject) obj);
            }
            hashMap.put(next, obj.toString());
        }
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0023, code lost:
        if ((r1 instanceof org.json.JSONObject) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
        return (T) fromJson(new org.json.JSONObject(r3), r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> T fromJson(java.lang.String r3, java.lang.Class<T> r4) {
        /*
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            if (r4 != 0) goto L7
            return r0
        L7:
            org.json.JSONTokener r1 = new org.json.JSONTokener     // Catch: java.lang.Exception -> L1d
            r1.<init>(r3)     // Catch: java.lang.Exception -> L1d
            java.lang.Object r1 = r1.nextValue()     // Catch: java.lang.Exception -> L1d
            if (r1 == 0) goto L1f
            boolean r2 = r1 instanceof org.json.JSONArray     // Catch: java.lang.Exception -> L1d
            if (r2 != 0) goto L17
            goto L1f
        L17:
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Exception -> L1d
            r3.<init>()     // Catch: java.lang.Exception -> L1d
            throw r3     // Catch: java.lang.Exception -> L1d
        L1d:
            r3 = move-exception
            goto L7e
        L1f:
            if (r1 == 0) goto L2f
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L1d
            if (r2 == 0) goto L2f
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1d
            r1.<init>(r3)     // Catch: java.lang.Exception -> L1d
            java.lang.Object r0 = fromJson(r1, r4)     // Catch: java.lang.Exception -> L1d
            goto L81
        L2f:
            boolean r3 = r4.isPrimitive()     // Catch: java.lang.Exception -> L1d
            if (r3 != 0) goto L7d
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Exception -> L1d
            if (r3 != 0) goto L7d
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Exception -> L1d
            if (r3 != 0) goto L7d
            java.lang.Class<java.lang.Character> r3 = java.lang.Character.class
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Exception -> L1d
            if (r3 != 0) goto L7d
            java.lang.Class<java.lang.Short> r3 = java.lang.Short.class
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Exception -> L1d
            if (r3 != 0) goto L7d
            java.lang.Class<java.lang.Long> r3 = java.lang.Long.class
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Exception -> L1d
            if (r3 != 0) goto L7d
            java.lang.Class<java.lang.Byte> r3 = java.lang.Byte.class
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Exception -> L1d
            if (r3 != 0) goto L7d
            java.lang.Class<java.lang.Float> r3 = java.lang.Float.class
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Exception -> L1d
            if (r3 != 0) goto L7d
            java.lang.Class<java.lang.Double> r3 = java.lang.Double.class
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Exception -> L1d
            if (r3 != 0) goto L7d
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Exception -> L1d
            if (r3 == 0) goto L81
        L7d:
            return r1
        L7e:
            r3.printStackTrace()
        L81:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inappstory.sdk.network.JsonParser.fromJson(java.lang.String, java.lang.Class):java.lang.Object");
    }
}
