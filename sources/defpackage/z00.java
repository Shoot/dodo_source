package defpackage;

import java.io.IOException;
/* compiled from: AutoRolloutAssignmentEncoder.java */
/* renamed from: z00  reason: default package */
/* loaded from: classes2.dex */
public final class z00 implements hq1 {
    public static final hq1 a = new z00();

    /* compiled from: AutoRolloutAssignmentEncoder.java */
    /* renamed from: z00$a */
    /* loaded from: classes2.dex */
    private static final class a implements v47<jn9> {
        static final a a = new a();
        private static final hs3 b = hs3.d("rolloutId");
        private static final hs3 c = hs3.d("parameterKey");
        private static final hs3 d = hs3.d("parameterValue");
        private static final hs3 e = hs3.d("variantId");
        private static final hs3 f = hs3.d("templateVersion");

        private a() {
        }

        @Override // defpackage.v47
        /* renamed from: b */
        public void a(jn9 jn9Var, w47 w47Var) throws IOException {
            w47Var.a(b, jn9Var.e());
            w47Var.a(c, jn9Var.c());
            w47Var.a(d, jn9Var.d());
            w47Var.a(e, jn9Var.g());
            w47Var.g(f, jn9Var.f());
        }
    }

    private z00() {
    }

    @Override // defpackage.hq1
    public void a(ch3<?> ch3Var) {
        a aVar = a.a;
        ch3Var.a(jn9.class, aVar);
        ch3Var.a(c30.class, aVar);
    }
}
