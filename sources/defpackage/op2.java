package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: Indication.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lop2;", "Lp05;", "Li65;", "interactionSource", "Lq05;", "a", "(Li65;Lqn1;I)Lq05;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: op2  reason: default package */
/* loaded from: classes.dex */
final class op2 implements p05 {
    public static final op2 a = new op2();

    /* compiled from: Indication.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B1\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\r\u0010\u000eJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007¨\u0006\u000f"}, d2 = {"Lop2$a;", "Lq05;", "Lit1;", "", "a", "Lcua;", "", "Lcua;", "isPressed", "b", "isHovered", c.a, "isFocused", "<init>", "(Lcua;Lcua;Lcua;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: op2$a */
    /* loaded from: classes.dex */
    private static final class a implements q05 {
        private final cua<Boolean> a;
        private final cua<Boolean> b;
        private final cua<Boolean> c;

        public a(cua<Boolean> cuaVar, cua<Boolean> cuaVar2, cua<Boolean> cuaVar3) {
            z65.h(cuaVar, "isPressed");
            z65.h(cuaVar2, "isHovered");
            z65.h(cuaVar3, "isFocused");
            this.a = cuaVar;
            this.b = cuaVar2;
            this.c = cuaVar3;
        }

        @Override // defpackage.q05
        public void a(it1 it1Var) {
            z65.h(it1Var, "<this>");
            it1Var.B0();
            if (this.a.getValue().booleanValue()) {
                x73.g(it1Var, uc1.j(uc1.b.a(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, it1Var.s(), 0.0f, null, null, 0, 122, null);
            } else if (this.b.getValue().booleanValue() || this.c.getValue().booleanValue()) {
                x73.g(it1Var, uc1.j(uc1.b.a(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, it1Var.s(), 0.0f, null, null, 0, 122, null);
            }
        }
    }

    private op2() {
    }

    @Override // defpackage.p05
    public q05 a(i65 i65Var, qn1 qn1Var, int i) {
        z65.h(i65Var, "interactionSource");
        qn1Var.w(1683566979);
        if (tn1.K()) {
            tn1.V(1683566979, i, -1, "androidx.compose.foundation.DefaultDebugIndication.rememberUpdatedInstance (Indication.kt:166)");
        }
        int i2 = i & 14;
        cua<Boolean> a2 = ij8.a(i65Var, qn1Var, i2);
        cua<Boolean> a3 = qp4.a(i65Var, qn1Var, i2);
        cua<Boolean> a4 = y14.a(i65Var, qn1Var, i2);
        qn1Var.w(1157296644);
        boolean K = qn1Var.K(i65Var);
        Object x = qn1Var.x();
        if (K || x == qn1.a.a()) {
            x = new a(a2, a3, a4);
            qn1Var.p(x);
        }
        qn1Var.J();
        a aVar = (a) x;
        if (tn1.K()) {
            tn1.U();
        }
        qn1Var.J();
        return aVar;
    }
}
