package defpackage;

import androidx.compose.foundation.layout.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: Spacers.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "value", "", "a", "(ILqn1;I)V", "compose_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: sqa  reason: default package */
/* loaded from: classes.dex */
public final class sqa {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Spacers.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sqa$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function2<qn1, Integer, Unit> {
        final /* synthetic */ int a;
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i, int i2) {
            super(2);
            this.a = i;
            this.b = i2;
        }

        public final void a(qn1 qn1Var, int i) {
            sqa.a(this.a, qn1Var, f99.a(this.b | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(qn1 qn1Var, Integer num) {
            a(qn1Var, num.intValue());
            return Unit.a;
        }
    }

    public static final void a(int i, qn1 qn1Var, int i2) {
        int i3;
        int i4;
        qn1 f = qn1Var.f(1083359713);
        if ((i2 & 14) == 0) {
            if (f.c(i)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && f.g()) {
            f.E();
        } else {
            if (tn1.K()) {
                tn1.V(1083359713, i3, -1, "com.dodopizza.components.HSpacer (Spacers.kt:17)");
            }
            qqa.a(d.e(sm6.a, i73.o(i)), f, 0);
            if (tn1.K()) {
                tn1.U();
            }
        }
        xw9 i5 = f.i();
        if (i5 != null) {
            i5.a(new a(i, i2));
        }
    }
}
