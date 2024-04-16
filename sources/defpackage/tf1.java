package defpackage;

import defpackage.gb;
import defpackage.zq;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: Column.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\" \u0010\f\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0007\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lzq$l;", "verticalArrangement", "Lgb$b;", "horizontalAlignment", "Lqb6;", "a", "(Lzq$l;Lgb$b;Lqn1;I)Lqb6;", "Lqb6;", "getDefaultColumnMeasurePolicy", "()Lqb6;", "getDefaultColumnMeasurePolicy$annotations", "()V", "DefaultColumnMeasurePolicy", "foundation-layout_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: tf1  reason: default package */
/* loaded from: classes.dex */
public final class tf1 {
    private static final qb6 a;

    /* compiled from: Column.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "totalSize", "", "size", "Lqm5;", "<anonymous parameter 2>", "La03;", "density", "outPosition", "", "a", "(I[ILqm5;La03;[I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: tf1$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements c94<Integer, int[], qm5, a03, int[], Unit> {
        public static final a a = new a();

        a() {
            super(5);
        }

        public final void a(int i, int[] iArr, qm5 qm5Var, a03 a03Var, int[] iArr2) {
            z65.h(iArr, "size");
            z65.h(qm5Var, "<anonymous parameter 2>");
            z65.h(a03Var, "density");
            z65.h(iArr2, "outPosition");
            zq.a.c().c(a03Var, i, iArr, iArr2);
        }

        @Override // defpackage.c94
        public /* bridge */ /* synthetic */ Unit f0(Integer num, int[] iArr, qm5 qm5Var, a03 a03Var, int[] iArr2) {
            a(num.intValue(), iArr, qm5Var, a03Var, iArr2);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Column.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "totalSize", "", "size", "Lqm5;", "<anonymous parameter 2>", "La03;", "density", "outPosition", "", "a", "(I[ILqm5;La03;[I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: tf1$b */
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements c94<Integer, int[], qm5, a03, int[], Unit> {
        final /* synthetic */ zq.l a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(zq.l lVar) {
            super(5);
            this.a = lVar;
        }

        public final void a(int i, int[] iArr, qm5 qm5Var, a03 a03Var, int[] iArr2) {
            z65.h(iArr, "size");
            z65.h(qm5Var, "<anonymous parameter 2>");
            z65.h(a03Var, "density");
            z65.h(iArr2, "outPosition");
            this.a.c(a03Var, i, iArr, iArr2);
        }

        @Override // defpackage.c94
        public /* bridge */ /* synthetic */ Unit f0(Integer num, int[] iArr, qm5 qm5Var, a03 a03Var, int[] iArr2) {
            a(num.intValue(), iArr, qm5Var, a03Var, iArr2);
            return Unit.a;
        }
    }

    static {
        kn5 kn5Var = kn5.Vertical;
        float a2 = zq.a.c().a();
        v22 a3 = v22.a.a(gb.a.d());
        a = gp9.f(kn5Var, a.a, a2, jna.Wrap, a3);
    }

    public static final qb6 a(zq.l lVar, gb.b bVar, qn1 qn1Var, int i) {
        qb6 qb6Var;
        z65.h(lVar, "verticalArrangement");
        z65.h(bVar, "horizontalAlignment");
        qn1Var.w(1089876336);
        if (tn1.K()) {
            tn1.V(1089876336, i, -1, "androidx.compose.foundation.layout.columnMeasurePolicy (Column.kt:96)");
        }
        if (z65.c(lVar, zq.a.c()) && z65.c(bVar, gb.a.d())) {
            qb6Var = a;
        } else {
            qn1Var.w(511388516);
            boolean K = qn1Var.K(lVar) | qn1Var.K(bVar);
            Object x = qn1Var.x();
            if (K || x == qn1.a.a()) {
                kn5 kn5Var = kn5.Vertical;
                float a2 = lVar.a();
                v22 a3 = v22.a.a(bVar);
                x = gp9.f(kn5Var, new b(lVar), a2, jna.Wrap, a3);
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
