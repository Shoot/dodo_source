package com.google.android.gms.internal.measurement;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.internal.measurement.b2;
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
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
public final class a3 {
    private static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(h3d h3dVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(h3dVar, sb, 0);
        return sb.toString();
    }

    private static void b(int i, StringBuilder sb) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                c(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                c(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            b(i, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i2 = 1; i2 < str.length(); i2++) {
                    char charAt = str.charAt(i2);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(y3.a(d1.w((String) obj)));
                sb.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            } else if (obj instanceof d1) {
                sb.append(": \"");
                sb.append(y3.a((d1) obj));
                sb.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            } else if (obj instanceof b2) {
                sb.append(" {");
                d((b2) obj, sb, i + 2);
                sb.append("\n");
                b(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i3 = i + 2;
                c(sb, i3, Action.KEY_ATTRIBUTE, entry2.getKey());
                c(sb, i3, "value", entry2.getValue());
                sb.append("\n");
                b(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    private static void d(h3d h3dVar, StringBuilder sb, int i) {
        int i2;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = h3dVar.getClass().getDeclaredMethods();
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
                c(sb, i, substring.substring(0, substring.length() - 4), b2.p(method2, h3dVar, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                c(sb, i, substring.substring(0, substring.length() - 3), b2.p(method, h3dVar, new Object[0]));
            } else {
                if (hashSet.contains("set" + substring)) {
                    if (substring.endsWith("Bytes")) {
                        String substring2 = substring.substring(0, substring.length() - 5);
                        if (treeMap.containsKey("get" + substring2)) {
                        }
                    }
                    Method method4 = (Method) entry.getValue();
                    Method method5 = (Method) hashMap.get("has" + substring);
                    if (method4 != null) {
                        Object p = b2.p(method4, h3dVar, new Object[0]);
                        if (method5 == null) {
                            if (p instanceof Boolean) {
                                if (!((Boolean) p).booleanValue()) {
                                }
                                c(sb, i, substring, p);
                            } else if (p instanceof Integer) {
                                if (((Integer) p).intValue() == 0) {
                                }
                                c(sb, i, substring, p);
                            } else if (p instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) p).floatValue()) == 0) {
                                }
                                c(sb, i, substring, p);
                            } else if (p instanceof Double) {
                                if (Double.doubleToRawLongBits(((Double) p).doubleValue()) == 0) {
                                }
                                c(sb, i, substring, p);
                            } else {
                                if (p instanceof String) {
                                    equals = p.equals("");
                                } else if (p instanceof d1) {
                                    equals = p.equals(d1.b);
                                } else if (p instanceof h3d) {
                                    if (p == ((h3d) p).d()) {
                                    }
                                    c(sb, i, substring, p);
                                } else {
                                    if ((p instanceof Enum) && ((Enum) p).ordinal() == 0) {
                                    }
                                    c(sb, i, substring, p);
                                }
                                if (equals) {
                                }
                                c(sb, i, substring, p);
                            }
                        } else {
                            if (!((Boolean) b2.p(method5, h3dVar, new Object[0])).booleanValue()) {
                            }
                            c(sb, i, substring, p);
                        }
                    }
                }
            }
            i2 = 3;
        }
        if (h3dVar instanceof b2.d) {
            Iterator<Map.Entry<b2.c, Object>> p2 = ((b2.d) h3dVar).zzc.p();
            if (p2.hasNext()) {
                p2.next().getKey();
                throw new NoSuchMethodError();
            }
        }
        a4 a4Var = ((b2) h3dVar).zzb;
        if (a4Var != null) {
            a4Var.h(sb, i);
        }
    }
}
