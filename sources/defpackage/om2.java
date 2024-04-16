package defpackage;

import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.lw1;
import java.lang.reflect.Type;
/* compiled from: DatabindContext.java */
/* renamed from: om2  reason: default package */
/* loaded from: classes2.dex */
public abstract class om2 {
    /* JADX INFO: Access modifiers changed from: protected */
    public final String a(String str, Object... objArr) {
        if (objArr.length > 0) {
            return String.format(str, objArr);
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String b(String str) {
        if (str == null) {
            return "[N/A]";
        }
        return String.format("\"%s\"", c(str));
    }

    protected final String c(String str) {
        if (str == null) {
            return "";
        }
        if (str.length() <= 500) {
            return str;
        }
        return str.substring(0, 500) + "]...[" + str.substring(str.length() - 500);
    }

    public y85 d(Type type) {
        if (type == null) {
            return null;
        }
        return i().Q(type);
    }

    public lw1<Object, Object> e(al alVar, Object obj) throws JsonMappingException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof lw1) {
            return (lw1) obj;
        }
        if (obj instanceof Class) {
            Class cls = (Class) obj;
            if (cls == lw1.a.class || q81.G(cls)) {
                return null;
            }
            if (lw1.class.isAssignableFrom(cls)) {
                w76<?> f = f();
                f.E();
                return (lw1) q81.k(cls, f.b());
            }
            throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<Converter>");
        }
        throw new IllegalStateException("AnnotationIntrospector returned Converter definition of type " + obj.getClass().getName() + "; expected type Converter or Class<Converter> instead");
    }

    public abstract w76<?> f();

    public abstract rnb i();

    public y47<?> j(al alVar, c57 c57Var) throws JsonMappingException {
        Class<? extends y47<?>> c = c57Var.c();
        w76<?> f = f();
        f.E();
        return ((y47) q81.k(c, f.b())).b(c57Var.e());
    }

    public abstract <T> T k(y85 y85Var, String str) throws JsonMappingException;

    public <T> T l(Class<?> cls, String str) throws JsonMappingException {
        return (T) k(d(cls), str);
    }
}
