package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.b2;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
public class s1 {
    private static volatile s1 b;
    static final s1 c = new s1(true);
    private final Map<a, b2.f<?, ?>> a;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
    /* loaded from: classes2.dex */
    private static final class a {
        private final Object a;
        private final int b;

        a(Object obj, int i) {
            this.a = obj;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a != aVar.a || this.b != aVar.b) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.a) * 65535) + this.b;
        }
    }

    s1() {
        this.a = new HashMap();
    }

    public static s1 a() {
        s1 s1Var = b;
        if (s1Var != null) {
            return s1Var;
        }
        synchronized (s1.class) {
            try {
                s1 s1Var2 = b;
                if (s1Var2 != null) {
                    return s1Var2;
                }
                s1 b2 = z1.b(s1.class);
                b = b2;
                return b2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <ContainingType extends h3d> b2.f<ContainingType, ?> b(ContainingType containingtype, int i) {
        return (b2.f<ContainingType, ?>) this.a.get(new a(containingtype, i));
    }

    private s1(boolean z) {
        this.a = Collections.emptyMap();
    }
}
