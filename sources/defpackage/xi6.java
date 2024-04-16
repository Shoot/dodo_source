package defpackage;

import defpackage.znb;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Objects;
/* compiled from: MethodGenericTypeResolver.java */
/* renamed from: xi6  reason: default package */
/* loaded from: classes2.dex */
final class xi6 {
    static qnb a(Method method, y85 y85Var, znb znbVar) {
        y85 l;
        TypeVariable<?> b;
        TypeVariable<Method>[] typeParameters = method.getTypeParameters();
        if (typeParameters.length == 0 || y85Var.l().o()) {
            return null;
        }
        Type genericReturnType = method.getGenericReturnType();
        if (!(genericReturnType instanceof ParameterizedType)) {
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) genericReturnType;
        if (!Objects.equals(y85Var.u(), parameterizedType.getRawType())) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        ArrayList arrayList2 = new ArrayList(typeParameters.length);
        for (int i = 0; i < actualTypeArguments.length; i++) {
            TypeVariable<?> d = d(actualTypeArguments[i]);
            if (d != null) {
                String name = d.getName();
                if (name == null || (l = y85Var.l().l(i)) == null || (b = b(typeParameters, name)) == null) {
                    return null;
                }
                if (g(znbVar, l, b.getBounds())) {
                    int indexOf = arrayList.indexOf(name);
                    if (indexOf != -1) {
                        y85 y85Var2 = (y85) arrayList2.get(indexOf);
                        if (l.equals(y85Var2)) {
                            continue;
                        } else {
                            boolean f0 = y85Var2.f0(l.u());
                            boolean f02 = l.f0(y85Var2.u());
                            if (!f0 && !f02) {
                                return null;
                            }
                            if ((f0 ^ f02) && f02) {
                                arrayList2.set(indexOf, l);
                            }
                        }
                    } else {
                        arrayList.add(name);
                        arrayList2.add(l);
                    }
                } else {
                    continue;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return qnb.e(arrayList, arrayList2);
    }

    private static TypeVariable<?> b(TypeVariable<?>[] typeVariableArr, String str) {
        if (typeVariableArr != null && str != null) {
            for (TypeVariable<?> typeVariable : typeVariableArr) {
                if (str.equals(typeVariable.getName())) {
                    return typeVariable;
                }
            }
        }
        return null;
    }

    private static ParameterizedType c(Type type) {
        if (type instanceof ParameterizedType) {
            return (ParameterizedType) type;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length != 0) {
                return null;
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length == 1) {
                return c(upperBounds[0]);
            }
        }
        return null;
    }

    private static TypeVariable<?> d(Type type) {
        if (type instanceof TypeVariable) {
            return (TypeVariable) type;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length != 0) {
                return null;
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length == 1) {
                return d(upperBounds[0]);
            }
        }
        return null;
    }

    public static znb e(Method method, y85 y85Var, rnb rnbVar, znb znbVar) {
        qnb a = a(method, y85Var, znbVar);
        if (a != null) {
            return new znb.a(rnbVar, a);
        }
        return znbVar;
    }

    private static boolean f(znb znbVar, y85 y85Var, Type type) {
        if (!y85Var.f0(znbVar.a(type).u())) {
            return false;
        }
        ParameterizedType c = c(type);
        if (c != null && Objects.equals(y85Var.u(), c.getRawType())) {
            Type[] actualTypeArguments = c.getActualTypeArguments();
            qnb l = y85Var.l();
            if (l.q() != actualTypeArguments.length) {
                return false;
            }
            for (int i = 0; i < l.q(); i++) {
                if (!f(znbVar, l.l(i), actualTypeArguments[i])) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    private static boolean g(znb znbVar, y85 y85Var, Type[] typeArr) {
        for (Type type : typeArr) {
            if (!f(znbVar, y85Var, type)) {
                return false;
            }
        }
        return true;
    }
}
