package defpackage;

import java.io.IOException;
/* compiled from: AutoRolloutAssignmentEncoder.java */
/* renamed from: a10  reason: default package */
/* loaded from: classes2.dex */
public final class a10 implements hq1 {
    public static final hq1 a = new a10();

    /* compiled from: AutoRolloutAssignmentEncoder.java */
    /* renamed from: a10$a */
    /* loaded from: classes2.dex */
    private static final class a implements v47<in9> {
        static final a a = new a();
        private static final hs3 b = hs3.d("rolloutId");
        private static final hs3 c = hs3.d("variantId");
        private static final hs3 d = hs3.d("parameterKey");
        private static final hs3 e = hs3.d("parameterValue");
        private static final hs3 f = hs3.d("templateVersion");

        private a() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(in9 in9Var, w47 w47Var) throws IOException {
            w47Var.a(b, in9Var.d());
            w47Var.a(c, in9Var.f());
            w47Var.a(d, in9Var.b());
            w47Var.a(e, in9Var.c());
            w47Var.g(f, in9Var.e());
        }
    }

    private a10() {
    }

    @Override // defpackage.hq1
    public void a(ch3<?> ch3Var) {
        a aVar = a.a;
        ch3Var.a(in9.class, aVar);
        ch3Var.a(b30.class, aVar);
    }
}
