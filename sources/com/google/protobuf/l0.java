package com.google.protobuf;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.google.protobuf.u;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MessageLiteToString.java */
/* loaded from: classes.dex */
public final class l0 {
    private static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    private static void a(int i, StringBuilder sb) {
        int i2;
        while (i > 0) {
            char[] cArr = a;
            if (i > cArr.length) {
                i2 = cArr.length;
            } else {
                i2 = i;
            }
            sb.append(cArr, 0, i2);
            i -= i2;
        }
    }

    private static boolean b(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            if (((Integer) obj).intValue() == 0) {
                return true;
            }
            return false;
        } else if (obj instanceof Float) {
            if (Float.floatToRawIntBits(((Float) obj).floatValue()) == 0) {
                return true;
            }
            return false;
        } else if (obj instanceof Double) {
            if (Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0) {
                return true;
            }
            return false;
        } else if (obj instanceof String) {
            return obj.equals("");
        } else {
            if (obj instanceof f) {
                return obj.equals(f.b);
            }
            if (obj instanceof k0) {
                if (obj == ((k0) obj).f()) {
                    return true;
                }
                return false;
            } else if ((obj instanceof Enum) && ((Enum) obj).ordinal() == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    private static String c(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toLowerCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                d(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                d(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            a(i, sb);
            sb.append(c(str));
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(b1.c((String) obj));
                sb.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            } else if (obj instanceof f) {
                sb.append(": \"");
                sb.append(b1.a((f) obj));
                sb.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            } else if (obj instanceof u) {
                sb.append(" {");
                e((u) obj, sb, i + 2);
                sb.append("\n");
                a(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i2 = i + 2;
                d(sb, i2, Action.KEY_ATTRIBUTE, entry2.getKey());
                d(sb, i2, "value", entry2.getValue());
                sb.append("\n");
                a(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    private static void e(k0 k0Var, StringBuilder sb, int i) {
        int i2;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = k0Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                d(sb, i, substring.substring(0, substring.length() - 4), u.L(method2, k0Var, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                d(sb, i, substring.substring(0, substring.length() - 3), u.L(method, k0Var, new Object[0]));
            } else {
                if (hashSet.contains("set" + substring)) {
                    if (substring.endsWith("Bytes")) {
                        if (treeMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                        }
                    }
                    Method method4 = (Method) entry.getValue();
                    Method method5 = (Method) hashMap.get("has" + substring);
                    if (method4 != null) {
                        Object L = u.L(method4, k0Var, new Object[0]);
                        if (method5 == null) {
                            if (b(L)) {
                            }
                            d(sb, i, substring, L);
                        } else {
                            if (!((Boolean) u.L(method5, k0Var, new Object[0])).booleanValue()) {
                            }
                            d(sb, i, substring, L);
                        }
                    }
                }
            }
            i2 = 3;
        }
        if (k0Var instanceof u.c) {
            Iterator<Map.Entry<u.d, Object>> t = ((u.c) k0Var).extensions.t();
            while (t.hasNext()) {
                Map.Entry<u.d, Object> next = t.next();
                d(sb, i, "[" + next.getKey().e() + "]", next.getValue());
            }
        }
        d1 d1Var = ((u) k0Var).unknownFields;
        if (d1Var != null) {
            d1Var.m(sb, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String f(k0 k0Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        e(k0Var, sb, 0);
        return sb.toString();
    }
}
