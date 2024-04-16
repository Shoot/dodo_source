package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: Wrapper.android.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: in1  reason: default package */
/* loaded from: classes.dex */
public final class in1 {
    public static final in1 a = new in1();
    public static Function2<qn1, Integer, Unit> b = gn1.c(-1759434350, false, a.a);

    /* compiled from: Wrapper.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Lqn1;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: in1$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function2<qn1, Integer, Unit> {
        public static final a a = new a();

        a() {
            super(2);
        }

        public final void a(qn1 qn1Var, int i) {
            if ((i & 11) == 2 && qn1Var.g()) {
                qn1Var.E();
                return;
            }
            if (tn1.K()) {
                tn1.V(-1759434350, i, -1, "androidx.compose.ui.platform.ComposableSingletons$Wrapper_androidKt.lambda-1.<anonymous> (Wrapper.android.kt:129)");
            }
            if (tn1.K()) {
                tn1.U();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(qn1 qn1Var, Integer num) {
            a(qn1Var, num.intValue());
            return Unit.a;
        }
    }

    public final Function2<qn1, Integer, Unit> a() {
        return b;
    }
}
