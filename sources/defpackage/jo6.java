package defpackage;

import defpackage.eo6;
import defpackage.rj8;
import defpackage.yn6;
import java.security.GeneralSecurityException;
import java.util.List;
/* compiled from: MonitoringUtil.java */
/* renamed from: jo6  reason: default package */
/* loaded from: classes2.dex */
public final class jo6 {
    public static final yn6.a a = new b(null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MonitoringUtil.java */
    /* renamed from: jo6$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[tf5.values().length];
            a = iArr;
            try {
                iArr[tf5.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[tf5.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[tf5.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static <P> eo6 a(rj8<P> rj8Var) {
        eo6.b a2 = eo6.a();
        a2.d(rj8Var.d());
        for (List<rj8.c<P>> list : rj8Var.c()) {
            for (rj8.c<P> cVar : list) {
                a2.a(b(cVar.g()), cVar.c(), cVar.e());
            }
        }
        if (rj8Var.e() != null) {
            a2.e(rj8Var.e().c());
        }
        try {
            return a2.b();
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    private static sf5 b(tf5 tf5Var) {
        int i = a.a[tf5Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return sf5.d;
                }
                throw new IllegalStateException("Unknown key status");
            }
            return sf5.c;
        }
        return sf5.b;
    }

    /* compiled from: MonitoringUtil.java */
    /* renamed from: jo6$b */
    /* loaded from: classes2.dex */
    private static class b implements yn6.a {
        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // defpackage.yn6.a
        public void b() {
        }

        @Override // defpackage.yn6.a
        public void a(int i, long j) {
        }
    }
}
