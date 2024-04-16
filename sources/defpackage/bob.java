package defpackage;

import defpackage.c9c;
import defpackage.rc5;
import java.io.IOException;
/* compiled from: TypeSerializer.java */
/* renamed from: bob  reason: default package */
/* loaded from: classes2.dex */
public abstract class bob {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TypeSerializer.java */
    /* renamed from: bob$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[rc5.a.values().length];
            a = iArr;
            try {
                iArr[rc5.a.EXISTING_PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[rc5.a.EXTERNAL_PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[rc5.a.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[rc5.a.WRAPPER_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[rc5.a.WRAPPER_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public abstract bob a(ia0 ia0Var);

    public abstract String b();

    public abstract rc5.a c();

    public c9c d(Object obj, nc5 nc5Var) {
        c9c c9cVar = new c9c(obj, nc5Var);
        int i = a.a[c().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            byb.a();
                        } else {
                            c9cVar.e = c9c.a.WRAPPER_OBJECT;
                        }
                    } else {
                        c9cVar.e = c9c.a.WRAPPER_ARRAY;
                    }
                } else {
                    c9cVar.e = c9c.a.METADATA_PROPERTY;
                    c9cVar.d = b();
                }
            } else {
                c9cVar.e = c9c.a.PARENT_PROPERTY;
                c9cVar.d = b();
            }
        } else {
            c9cVar.e = c9c.a.PAYLOAD_PROPERTY;
            c9cVar.d = b();
        }
        return c9cVar;
    }

    public c9c e(Object obj, nc5 nc5Var, Object obj2) {
        c9c d = d(obj, nc5Var);
        d.c = obj2;
        return d;
    }

    public c9c f(Object obj, Class<?> cls, nc5 nc5Var) {
        c9c d = d(obj, nc5Var);
        d.b = cls;
        return d;
    }

    public abstract c9c g(ua5 ua5Var, c9c c9cVar) throws IOException;

    public abstract c9c h(ua5 ua5Var, c9c c9cVar) throws IOException;
}
