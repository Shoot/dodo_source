package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: Composition.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: hn1  reason: default package */
/* loaded from: classes.dex */
public final class hn1 {
    public static final hn1 a = new hn1();
    public static Function2<qn1, Integer, Unit> b = gn1.c(954879418, false, a.a);
    public static Function2<qn1, Integer, Unit> c = gn1.c(1918065384, false, b.a);

    /* compiled from: Composition.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Lqn1;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: hn1$a */
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
                tn1.V(954879418, i, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda-1.<anonymous> (Composition.kt:506)");
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

    /* compiled from: Composition.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Lqn1;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: hn1$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function2<qn1, Integer, Unit> {
        public static final b a = new b();

        b() {
            super(2);
        }

        public final void a(qn1 qn1Var, int i) {
            if ((i & 11) == 2 && qn1Var.g()) {
                qn1Var.E();
                return;
            }
            if (tn1.K()) {
                tn1.V(1918065384, i, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda-2.<anonymous> (Composition.kt:597)");
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

    public final Function2<qn1, Integer, Unit> b() {
        return c;
    }
}
