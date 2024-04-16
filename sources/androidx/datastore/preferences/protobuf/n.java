package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.v;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ExtensionRegistryLite.java */
/* loaded from: classes.dex */
public class n {
    private static boolean b = true;
    private static volatile n d;
    private final Map<a, v.e<?, ?>> a;
    private static final Class<?> c = c();
    static final n e = new n(true);

    /* compiled from: ExtensionRegistryLite.java */
    /* loaded from: classes.dex */
    private static final class a {
        private final Object a;
        private final int b;

        a(Object obj, int i) {
            this.a = obj;
            this.b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a != aVar.a || this.b != aVar.b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (System.identityHashCode(this.a) * 65535) + this.b;
        }
    }

    n() {
        this.a = new HashMap();
    }

    public static n b() {
        n nVar = d;
        if (nVar == null) {
            synchronized (n.class) {
                try {
                    nVar = d;
                    if (nVar == null) {
                        if (b) {
                            nVar = m.a();
                        } else {
                            nVar = e;
                        }
                        d = nVar;
                    }
                } finally {
                }
            }
        }
        return nVar;
    }

    static Class<?> c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public <ContainingType extends l0> v.e<ContainingType, ?> a(ContainingType containingtype, int i) {
        return (v.e<ContainingType, ?>) this.a.get(new a(containingtype, i));
    }

    n(boolean z) {
        this.a = Collections.emptyMap();
    }
}
