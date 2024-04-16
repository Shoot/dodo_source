package defpackage;

import defpackage.gb;
import defpackage.zq;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: Row.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\" \u0010\f\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0007\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lzq$d;", "horizontalArrangement", "Lgb$c;", "verticalAlignment", "Lqb6;", "a", "(Lzq$d;Lgb$c;Lqn1;I)Lqb6;", "Lqb6;", "getDefaultRowMeasurePolicy", "()Lqb6;", "getDefaultRowMeasurePolicy$annotations", "()V", "DefaultRowMeasurePolicy", "foundation-layout_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: kp9  reason: default package */
/* loaded from: classes.dex */
public final class kp9 {
    private static final qb6 a;

    /* compiled from: Row.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "totalSize", "", "size", "Lqm5;", "layoutDirection", "La03;", "density", "outPosition", "", "a", "(I[ILqm5;La03;[I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: kp9$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements c94<Integer, int[], qm5, a03, int[], Unit> {
        public static final a a = new a();

        a() {
            super(5);
        }

        public final void a(int i, int[] iArr, qm5 qm5Var, a03 a03Var, int[] iArr2) {
            z65.h(iArr, "size");
            z65.h(qm5Var, "layoutDirection");
            z65.h(a03Var, "density");
            z65.h(iArr2, "outPosition");
            zq.a.b().b(a03Var, i, iArr, qm5Var, iArr2);
        }

        @Override // defpackage.c94
        public /* bridge */ /* synthetic */ Unit f0(Integer num, int[] iArr, qm5 qm5Var, a03 a03Var, int[] iArr2) {
            a(num.intValue(), iArr, qm5Var, a03Var, iArr2);
            return Unit.a;
        }
    }

    /* compiled from: Row.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "totalSize", "", "size", "Lqm5;", "layoutDirection", "La03;", "density", "outPosition", "", "a", "(I[ILqm5;La03;[I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: kp9$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements c94<Integer, int[], qm5, a03, int[], Unit> {
        final /* synthetic */ zq.d a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(zq.d dVar) {
            super(5);
            this.a = dVar;
        }

        public final void a(int i, int[] iArr, qm5 qm5Var, a03 a03Var, int[] iArr2) {
            z65.h(iArr, "size");
            z65.h(qm5Var, "layoutDirection");
            z65.h(a03Var, "density");
            z65.h(iArr2, "outPosition");
            this.a.b(a03Var, i, iArr, qm5Var, iArr2);
        }

        @Override // defpackage.c94
        public /* bridge */ /* synthetic */ Unit f0(Integer num, int[] iArr, qm5 qm5Var, a03 a03Var, int[] iArr2) {
            a(num.intValue(), iArr, qm5Var, a03Var, iArr2);
            return Unit.a;
        }
    }

    static {
        kn5 kn5Var = kn5.Horizontal;
        float a2 = zq.a.b().a();
        v22 b2 = v22.a.b(gb.a.e());
        a = gp9.f(kn5Var, a.a, a2, jna.Wrap, b2);
    }

    public static final qb6 a(zq.d dVar, gb.c cVar, qn1 qn1Var, int i) {
        qb6 qb6Var;
        z65.h(dVar, "horizontalArrangement");
        z65.h(cVar, "verticalAlignment");
        qn1Var.w(-837807694);
        if (tn1.K()) {
            tn1.V(-837807694, i, -1, "androidx.compose.foundation.layout.rowMeasurePolicy (Row.kt:100)");
        }
        if (z65.c(dVar, zq.a.b()) && z65.c(cVar, gb.a.e())) {
            qb6Var = a;
        } else {
            qn1Var.w(511388516);
            boolean K = qn1Var.K(dVar) | qn1Var.K(cVar);
            Object x = qn1Var.x();
            if (K || x == qn1.a.a()) {
                kn5 kn5Var = kn5.Horizontal;
                float a2 = dVar.a();
                v22 b2 = v22.a.b(cVar);
                x = gp9.f(kn5Var, new b(dVar), a2, jna.Wrap, b2);
                qn1Var.p(x);
            }
            qn1Var.J();
            qb6Var = (qb6) x;
        }
        if (tn1.K()) {
            tn1.U();
        }
        qn1Var.J();
        return qb6Var;
    }
}
