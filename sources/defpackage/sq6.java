package defpackage;

import defpackage.yn6;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: MutableMonitoringRegistry.java */
/* renamed from: sq6  reason: default package */
/* loaded from: classes2.dex */
public final class sq6 {
    private static final sq6 b = new sq6();
    private static final b c = new b();
    private final AtomicReference<yn6> a = new AtomicReference<>();

    /* compiled from: MutableMonitoringRegistry.java */
    /* renamed from: sq6$b */
    /* loaded from: classes2.dex */
    private static class b implements yn6 {
        private b() {
        }

        @Override // defpackage.yn6
        public yn6.a a(eo6 eo6Var, String str, String str2) {
            return jo6.a;
        }
    }

    public static sq6 b() {
        return b;
    }

    public yn6 a() {
        yn6 yn6Var = this.a.get();
        if (yn6Var == null) {
            return c;
        }
        return yn6Var;
    }
}
