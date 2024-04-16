package defpackage;

import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
/* compiled from: AnnotatedConstructor.java */
/* renamed from: dl  reason: default package */
/* loaded from: classes2.dex */
public final class dl extends ol {
    protected final Constructor<?> d;
    protected a e;

    /* compiled from: AnnotatedConstructor.java */
    /* renamed from: dl$a */
    /* loaded from: classes2.dex */
    private static final class a implements Serializable {
        protected Class<?> a;
        protected Class<?>[] b;

        public a(Constructor<?> constructor) {
            this.a = constructor.getDeclaringClass();
            this.b = constructor.getParameterTypes();
        }
    }

    public dl(znb znbVar, Constructor<?> constructor, rl rlVar, rl[] rlVarArr) {
        super(znbVar, rlVar, rlVarArr);
        if (constructor == null) {
            throw new IllegalArgumentException("Null constructor not allowed");
        }
        this.d = constructor;
    }

    @Override // defpackage.al
    public Class<?> c() {
        return this.d.getDeclaringClass();
    }

    @Override // defpackage.al
    public y85 d() {
        return this.a.a(c());
    }

    @Override // defpackage.al
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!q81.E(obj, dl.class)) {
            return false;
        }
        Constructor<?> constructor = ((dl) obj).d;
        if (constructor == null) {
            if (this.d == null) {
                return true;
            }
            return false;
        }
        return constructor.equals(this.d);
    }

    @Override // defpackage.al
    public String getName() {
        return this.d.getName();
    }

    @Override // defpackage.al
    public int hashCode() {
        return this.d.getName().hashCode();
    }

    @Override // defpackage.hl
    public Class<?> k() {
        return this.d.getDeclaringClass();
    }

    @Override // defpackage.hl
    public Member m() {
        return this.d;
    }

    @Override // defpackage.hl
    public Object n(Object obj) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor of " + k().getName());
    }

    Object readResolve() {
        a aVar = this.e;
        Class<?> cls = aVar.a;
        try {
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(aVar.b);
            if (!declaredConstructor.isAccessible()) {
                q81.g(declaredConstructor, false);
            }
            return new dl(null, declaredConstructor, null, null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not find constructor with " + this.e.b.length + " args from Class '" + cls.getName());
        }
    }

    @Override // defpackage.ol
    public y85 s(int i) {
        Type[] genericParameterTypes = this.d.getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return this.a.a(genericParameterTypes[i]);
    }

    public String toString() {
        String str;
        int length = this.d.getParameterTypes().length;
        Object[] objArr = new Object[4];
        objArr[0] = q81.R(this.d.getDeclaringClass());
        objArr[1] = Integer.valueOf(length);
        if (length == 1) {
            str = "";
        } else {
            str = Image.TYPE_SMALL;
        }
        objArr[2] = str;
        objArr[3] = this.b;
        return String.format("[constructor for %s (%d arg%s), annotations: %s", objArr);
    }

    public final Object w() throws Exception {
        return this.d.newInstance(null);
    }

    Object writeReplace() {
        return new dl(new a(this.d));
    }

    public int x() {
        return this.d.getParameterTypes().length;
    }

    @Override // defpackage.hl
    /* renamed from: y */
    public dl o(rl rlVar) {
        return new dl(this.a, this.d, rlVar, this.c);
    }

    protected dl(a aVar) {
        super(null, null, null);
        this.d = null;
        this.e = aVar;
    }
}
