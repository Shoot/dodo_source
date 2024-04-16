package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.w;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ExtensionRegistryLite.java */
/* loaded from: classes2.dex */
public class o {
    private static boolean b = true;
    private static volatile o c;
    static final o d = new o(true);
    private final Map<a, w.e<?, ?>> a;

    /* compiled from: ExtensionRegistryLite.java */
    /* loaded from: classes2.dex */
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

    o() {
        this.a = new HashMap();
    }

    public static o b() {
        o oVar = c;
        if (oVar == null) {
            synchronized (o.class) {
                try {
                    oVar = c;
                    if (oVar == null) {
                        if (b) {
                            oVar = n.a();
                        } else {
                            oVar = d;
                        }
                        c = oVar;
                    }
                } finally {
                }
            }
        }
        return oVar;
    }

    public <ContainingType extends m0> w.e<ContainingType, ?> a(ContainingType containingtype, int i) {
        return (w.e<ContainingType, ?>) this.a.get(new a(containingtype, i));
    }

    o(boolean z) {
        this.a = Collections.emptyMap();
    }
}
