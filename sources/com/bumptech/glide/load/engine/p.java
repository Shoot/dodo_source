package com.bumptech.glide.load.engine;

import java.util.HashMap;
import java.util.Map;
/* compiled from: Jobs.java */
/* loaded from: classes.dex */
final class p {
    private final Map<se5, k<?>> a = new HashMap();
    private final Map<se5, k<?>> b = new HashMap();

    private Map<se5, k<?>> b(boolean z) {
        if (z) {
            return this.b;
        }
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k<?> a(se5 se5Var, boolean z) {
        return b(z).get(se5Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(se5 se5Var, k<?> kVar) {
        b(kVar.p()).put(se5Var, kVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(se5 se5Var, k<?> kVar) {
        Map<se5, k<?>> b = b(kVar.p());
        if (kVar.equals(b.get(se5Var))) {
            b.remove(se5Var);
        }
    }
}
