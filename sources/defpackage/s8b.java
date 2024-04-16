package defpackage;
/* compiled from: TemporalAdjusters.java */
/* renamed from: s8b  reason: default package */
/* loaded from: classes3.dex */
public final class s8b {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TemporalAdjusters.java */
    /* renamed from: s8b$b */
    /* loaded from: classes3.dex */
    public static final class b implements r8b {
        private final int a;
        private final int b;

        @Override // defpackage.r8b
        public p8b o(p8b p8bVar) {
            int i;
            int i2;
            int w = p8bVar.w(h71.t);
            int i3 = this.a;
            if (i3 < 2 && w == this.b) {
                return p8bVar;
            }
            if ((i3 & 1) == 0) {
                int i4 = w - this.b;
                if (i4 >= 0) {
                    i2 = 7 - i4;
                } else {
                    i2 = -i4;
                }
                return p8bVar.L(i2, m71.DAYS);
            }
            int i5 = this.b - w;
            if (i5 >= 0) {
                i = 7 - i5;
            } else {
                i = -i5;
            }
            return p8bVar.i(i, m71.DAYS);
        }

        private b(int i, hn2 hn2Var) {
            g95.i(hn2Var, "dayOfWeek");
            this.a = i;
            this.b = hn2Var.getValue();
        }
    }

    public static r8b a(hn2 hn2Var) {
        return new b(0, hn2Var);
    }

    public static r8b b(hn2 hn2Var) {
        return new b(1, hn2Var);
    }
}
