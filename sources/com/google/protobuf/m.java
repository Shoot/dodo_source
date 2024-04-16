package com.google.protobuf;

import com.google.protobuf.u;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ExtensionRegistryLite.java */
/* loaded from: classes.dex */
public class m {
    private static boolean b = true;
    private static volatile m c;
    static final m d = new m(true);
    private final Map<a, u.e<?, ?>> a;

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

    m() {
        this.a = new HashMap();
    }

    public static m b() {
        m mVar = c;
        if (mVar == null) {
            synchronized (m.class) {
                try {
                    mVar = c;
                    if (mVar == null) {
                        if (b) {
                            mVar = l.a();
                        } else {
                            mVar = d;
                        }
                        c = mVar;
                    }
                } finally {
                }
            }
        }
        return mVar;
    }

    public <ContainingType extends k0> u.e<ContainingType, ?> a(ContainingType containingtype, int i) {
        return (u.e<ContainingType, ?>) this.a.get(new a(containingtype, i));
    }

    m(boolean z) {
        this.a = Collections.emptyMap();
    }
}
