package defpackage;

import androidx.annotation.NonNull;
import defpackage.gs2;
import defpackage.j12;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: CrashlyticsNativeComponentDeferredProxy.java */
/* renamed from: f12  reason: default package */
/* loaded from: classes2.dex */
public final class f12 implements c12 {
    private static final ou6 c = new b();
    private final gs2<c12> a;
    private final AtomicReference<c12> b = new AtomicReference<>(null);

    /* compiled from: CrashlyticsNativeComponentDeferredProxy.java */
    /* renamed from: f12$b */
    /* loaded from: classes2.dex */
    private static final class b implements ou6 {
        private b() {
        }

        @Override // defpackage.ou6
        public File a() {
            return null;
        }

        @Override // defpackage.ou6
        public j12.a b() {
            return null;
        }

        @Override // defpackage.ou6
        public File c() {
            return null;
        }

        @Override // defpackage.ou6
        public File d() {
            return null;
        }

        @Override // defpackage.ou6
        public File e() {
            return null;
        }

        @Override // defpackage.ou6
        public File f() {
            return null;
        }

        @Override // defpackage.ou6
        public File g() {
            return null;
        }
    }

    public f12(gs2<c12> gs2Var) {
        this.a = gs2Var;
        gs2Var.a(new gs2.a() { // from class: d12
            @Override // defpackage.gs2.a
            public final void a(bs8 bs8Var) {
                f12.this.g(bs8Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(bs8 bs8Var) {
        rx5.f().b("Crashlytics native component now available.");
        this.b.set((c12) bs8Var.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(String str, String str2, long j, mwa mwaVar, bs8 bs8Var) {
        ((c12) bs8Var.get()).d(str, str2, j, mwaVar);
    }

    @Override // defpackage.c12
    @NonNull
    public ou6 a(@NonNull String str) {
        c12 c12Var = this.b.get();
        if (c12Var == null) {
            return c;
        }
        return c12Var.a(str);
    }

    @Override // defpackage.c12
    public boolean b() {
        c12 c12Var = this.b.get();
        if (c12Var != null && c12Var.b()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.c12
    public boolean c(@NonNull String str) {
        c12 c12Var = this.b.get();
        if (c12Var != null && c12Var.c(str)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.c12
    public void d(@NonNull final String str, @NonNull final String str2, final long j, @NonNull final mwa mwaVar) {
        rx5 f = rx5.f();
        f.i("Deferring native open session: " + str);
        this.a.a(new gs2.a() { // from class: e12
            @Override // defpackage.gs2.a
            public final void a(bs8 bs8Var) {
                f12.h(str, str2, j, mwaVar, bs8Var);
            }
        });
    }
}
