package defpackage;

import androidx.compose.foundation.c;
import androidx.compose.foundation.layout.d;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: Divider.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a3\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lsm6;", "modifier", "Li73;", "thickness", "Luc1;", RemoteMessageConst.Notification.COLOR, "", "a", "(Lsm6;FJLqn1;II)V", "material3_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: d53  reason: default package */
/* loaded from: classes.dex */
public final class d53 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Divider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: d53$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function2<qn1, Integer, Unit> {
        final /* synthetic */ sm6 a;
        final /* synthetic */ float b;
        final /* synthetic */ long c;
        final /* synthetic */ int d;
        final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(sm6 sm6Var, float f, long j, int i, int i2) {
            super(2);
            this.a = sm6Var;
            this.b = f;
            this.c = j;
            this.d = i;
            this.e = i2;
        }

        public final void a(qn1 qn1Var, int i) {
            d53.a(this.a, this.b, this.c, qn1Var, f99.a(this.d | 1), this.e);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(qn1 qn1Var, Integer num) {
            a(qn1Var, num.intValue());
            return Unit.a;
        }
    }

    public static final void a(sm6 sm6Var, float f, long j, qn1 qn1Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        float f2;
        int i6;
        qn1 f3 = qn1Var.f(1562471785);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (f3.K(sm6Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (f3.b(f)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0 && f3.d(j)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i3 & 731) == 146 && f3.g()) {
            f3.E();
        } else {
            f3.A();
            if ((i & 1) != 0 && !f3.G()) {
                f3.E();
            } else {
                if (i7 != 0) {
                    sm6Var = sm6.a;
                }
                if (i8 != 0) {
                    f = c53.a.b();
                }
                if ((i2 & 4) != 0) {
                    j = c53.a.a(f3, 6);
                }
            }
            f3.s();
            if (tn1.K()) {
                tn1.V(1562471785, i, -1, "androidx.compose.material3.Divider (Divider.kt:43)");
            }
            f3.w(1232935509);
            if (i73.q(f, i73.b.a())) {
                f2 = i73.o(1.0f / ((a03) f3.k(ro1.c())).getDensity());
            } else {
                f2 = f;
            }
            f3.J();
            lf0.a(c.b(d.c(d.b(sm6Var, 0.0f, 1, null), f2), j, null, 2, null), f3, 0);
            if (tn1.K()) {
                tn1.U();
            }
        }
        sm6 sm6Var2 = sm6Var;
        float f4 = f;
        long j2 = j;
        xw9 i9 = f3.i();
        if (i9 != null) {
            i9.a(new a(sm6Var2, f4, j2, i, i2));
        }
    }
}
