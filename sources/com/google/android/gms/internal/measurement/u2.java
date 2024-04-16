package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
final class u2 implements v2 {
    @Override // com.google.android.gms.internal.measurement.v2
    public final t2<?, ?> a(Object obj) {
        q2 q2Var = (q2) obj;
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.v2
    public final Map<?, ?> b(Object obj) {
        return (s2) obj;
    }

    @Override // com.google.android.gms.internal.measurement.v2
    public final Object c(Object obj) {
        ((s2) obj).i();
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.v2
    public final Object d(Object obj) {
        return s2.c().e();
    }

    @Override // com.google.android.gms.internal.measurement.v2
    public final Object e(Object obj, Object obj2) {
        s2 s2Var = (s2) obj;
        s2 s2Var2 = (s2) obj2;
        if (!s2Var2.isEmpty()) {
            if (!s2Var.j()) {
                s2Var = s2Var.e();
            }
            s2Var.d(s2Var2);
        }
        return s2Var;
    }

    @Override // com.google.android.gms.internal.measurement.v2
    public final boolean f(Object obj) {
        if (!((s2) obj).j()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.v2
    public final Map<?, ?> g(Object obj) {
        return (s2) obj;
    }

    @Override // com.google.android.gms.internal.measurement.v2
    public final int h(int i, Object obj, Object obj2) {
        s2 s2Var = (s2) obj;
        q2 q2Var = (q2) obj2;
        if (s2Var.isEmpty()) {
            return 0;
        }
        Iterator it = s2Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
