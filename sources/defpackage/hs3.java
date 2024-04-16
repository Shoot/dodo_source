package defpackage;

import androidx.annotation.NonNull;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: FieldDescriptor.java */
/* renamed from: hs3  reason: default package */
/* loaded from: classes2.dex */
public final class hs3 {
    private final String a;
    private final Map<Class<?>, Object> b;

    /* compiled from: FieldDescriptor.java */
    /* renamed from: hs3$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private final String a;
        private Map<Class<?>, Object> b = null;

        b(String str) {
            this.a = str;
        }

        @NonNull
        public hs3 a() {
            Map unmodifiableMap;
            String str = this.a;
            if (this.b == null) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(new HashMap(this.b));
            }
            return new hs3(str, unmodifiableMap);
        }

        @NonNull
        public <T extends Annotation> b b(@NonNull T t) {
            if (this.b == null) {
                this.b = new HashMap();
            }
            this.b.put(t.annotationType(), t);
            return this;
        }
    }

    @NonNull
    public static b a(@NonNull String str) {
        return new b(str);
    }

    @NonNull
    public static hs3 d(@NonNull String str) {
        return new hs3(str, Collections.emptyMap());
    }

    @NonNull
    public String b() {
        return this.a;
    }

    public <T extends Annotation> T c(@NonNull Class<T> cls) {
        return (T) this.b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs3)) {
            return false;
        }
        hs3 hs3Var = (hs3) obj;
        if (this.a.equals(hs3Var.a) && this.b.equals(hs3Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    @NonNull
    public String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }

    private hs3(String str, Map<Class<?>, Object> map) {
        this.a = str;
        this.b = map;
    }
}
