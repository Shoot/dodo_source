package defpackage;

import java.lang.annotation.Annotation;
import java.util.HashMap;
/* compiled from: AnnotationMap.java */
/* renamed from: rl  reason: default package */
/* loaded from: classes2.dex */
public final class rl implements tl {
    protected HashMap<Class<?>, Annotation> a;

    public rl() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public rl(HashMap<Class<?>, Annotation> hashMap) {
        this.a = hashMap;
    }

    public static rl f(rl rlVar, rl rlVar2) {
        HashMap<Class<?>, Annotation> hashMap;
        HashMap<Class<?>, Annotation> hashMap2;
        if (rlVar != null && (hashMap = rlVar.a) != null && !hashMap.isEmpty()) {
            if (rlVar2 != null && (hashMap2 = rlVar2.a) != null && !hashMap2.isEmpty()) {
                HashMap hashMap3 = new HashMap();
                for (Annotation annotation : rlVar2.a.values()) {
                    hashMap3.put(annotation.annotationType(), annotation);
                }
                for (Annotation annotation2 : rlVar.a.values()) {
                    hashMap3.put(annotation2.annotationType(), annotation2);
                }
                return new rl(hashMap3);
            }
            return rlVar;
        }
        return rlVar2;
    }

    public static rl g(Class<?> cls, Annotation annotation) {
        HashMap hashMap = new HashMap(4);
        hashMap.put(cls, annotation);
        return new rl(hashMap);
    }

    @Override // defpackage.tl
    public <A extends Annotation> A a(Class<A> cls) {
        HashMap<Class<?>, Annotation> hashMap = this.a;
        if (hashMap == null) {
            return null;
        }
        return (A) hashMap.get(cls);
    }

    @Override // defpackage.tl
    public boolean b(Class<?> cls) {
        HashMap<Class<?>, Annotation> hashMap = this.a;
        if (hashMap == null) {
            return false;
        }
        return hashMap.containsKey(cls);
    }

    @Override // defpackage.tl
    public boolean c(Class<? extends Annotation>[] clsArr) {
        if (this.a != null) {
            for (Class<? extends Annotation> cls : clsArr) {
                if (this.a.containsKey(cls)) {
                    return true;
                }
            }
        }
        return false;
    }

    protected final boolean d(Annotation annotation) {
        if (this.a == null) {
            this.a = new HashMap<>();
        }
        Annotation put = this.a.put(annotation.annotationType(), annotation);
        if (put != null && put.equals(annotation)) {
            return false;
        }
        return true;
    }

    public boolean e(Annotation annotation) {
        return d(annotation);
    }

    @Override // defpackage.tl
    public int size() {
        HashMap<Class<?>, Annotation> hashMap = this.a;
        if (hashMap == null) {
            return 0;
        }
        return hashMap.size();
    }

    public String toString() {
        HashMap<Class<?>, Annotation> hashMap = this.a;
        if (hashMap == null) {
            return "[null]";
        }
        return hashMap.toString();
    }
}
