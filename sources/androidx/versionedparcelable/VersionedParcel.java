package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public abstract class VersionedParcel {
    protected final lr<String, Method> a;
    protected final lr<String, Method> b;
    protected final lr<String, Class> c;

    /* loaded from: classes.dex */
    public static class ParcelException extends RuntimeException {
    }

    public VersionedParcel(lr<String, Method> lrVar, lr<String, Method> lrVar2, lr<String, Class> lrVar3) {
        this.a = lrVar;
        this.b = lrVar2;
        this.c = lrVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void N(cyb cybVar) {
        try {
            I(c(cybVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(cybVar.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    private Class c(Class<? extends cyb> cls) throws ClassNotFoundException {
        Class cls2 = this.c.get(cls.getName());
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            this.c.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    private Method d(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.a.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
            this.a.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    private Method e(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.b.get(cls.getName());
        if (method == null) {
            Class c = c(cls);
            System.currentTimeMillis();
            Method declaredMethod = c.getDeclaredMethod("write", cls, VersionedParcel.class);
            this.b.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    protected abstract void A(byte[] bArr);

    public void B(byte[] bArr, int i) {
        w(i);
        A(bArr);
    }

    protected abstract void C(CharSequence charSequence);

    public void D(CharSequence charSequence, int i) {
        w(i);
        C(charSequence);
    }

    protected abstract void E(int i);

    public void F(int i, int i2) {
        w(i2);
        E(i);
    }

    protected abstract void G(Parcelable parcelable);

    public void H(Parcelable parcelable, int i) {
        w(i);
        G(parcelable);
    }

    protected abstract void I(String str);

    public void J(String str, int i) {
        w(i);
        I(str);
    }

    protected <T extends cyb> void K(T t, VersionedParcel versionedParcel) {
        try {
            e(t.getClass()).invoke(null, t, versionedParcel);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void L(cyb cybVar) {
        if (cybVar == null) {
            I(null);
            return;
        }
        N(cybVar);
        VersionedParcel b = b();
        K(cybVar, b);
        b.a();
    }

    public void M(cyb cybVar, int i) {
        w(i);
        L(cybVar);
    }

    protected abstract void a();

    protected abstract VersionedParcel b();

    public boolean f() {
        return false;
    }

    protected abstract boolean g();

    public boolean h(boolean z, int i) {
        if (!m(i)) {
            return z;
        }
        return g();
    }

    protected abstract byte[] i();

    public byte[] j(byte[] bArr, int i) {
        if (!m(i)) {
            return bArr;
        }
        return i();
    }

    protected abstract CharSequence k();

    public CharSequence l(CharSequence charSequence, int i) {
        if (!m(i)) {
            return charSequence;
        }
        return k();
    }

    protected abstract boolean m(int i);

    protected <T extends cyb> T n(String str, VersionedParcel versionedParcel) {
        try {
            return (T) d(str).invoke(null, versionedParcel);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    protected abstract int o();

    public int p(int i, int i2) {
        if (!m(i2)) {
            return i;
        }
        return o();
    }

    protected abstract <T extends Parcelable> T q();

    public <T extends Parcelable> T r(T t, int i) {
        if (!m(i)) {
            return t;
        }
        return (T) q();
    }

    protected abstract String s();

    public String t(String str, int i) {
        if (!m(i)) {
            return str;
        }
        return s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public <T extends cyb> T u() {
        String s = s();
        if (s == null) {
            return null;
        }
        return (T) n(s, b());
    }

    public <T extends cyb> T v(T t, int i) {
        if (!m(i)) {
            return t;
        }
        return (T) u();
    }

    protected abstract void w(int i);

    protected abstract void y(boolean z);

    public void z(boolean z, int i) {
        w(i);
        y(z);
    }

    public void x(boolean z, boolean z2) {
    }
}
