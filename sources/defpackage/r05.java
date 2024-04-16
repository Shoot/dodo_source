package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: Indication.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001c\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"Lsm6;", "Li65;", "interactionSource", "Lp05;", "indication", "b", "Lxr8;", "a", "Lxr8;", "()Lxr8;", "LocalIndication", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: r05  reason: default package */
/* loaded from: classes.dex */
public final class r05 {
    private static final xr8<p05> a = oo1.d(a.a);

    /* compiled from: Indication.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp05;", "a", "()Lp05;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: r05$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<p05> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final p05 invoke() {
            return op2.a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lt45;", "", "a", "(Lt45;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: r05$b */
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function1<t45, Unit> {
        final /* synthetic */ p05 a;
        final /* synthetic */ i65 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p05 p05Var, i65 i65Var) {
            super(1);
            this.a = p05Var;
            this.b = i65Var;
        }

        public final void a(t45 t45Var) {
            z65.h(t45Var, "$this$null");
            t45Var.b("indication");
            t45Var.a().b("indication", this.a);
            t45Var.a().b("interactionSource", this.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(t45 t45Var) {
            a(t45Var);
            return Unit.a;
        }
    }

    /* compiled from: Indication.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsm6;", "a", "(Lsm6;Lqn1;I)Lsm6;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: r05$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements y84<sm6, qn1, Integer, sm6> {
        final /* synthetic */ p05 a;
        final /* synthetic */ i65 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p05 p05Var, i65 i65Var) {
            super(3);
            this.a = p05Var;
            this.b = i65Var;
        }

        public final sm6 a(sm6 sm6Var, qn1 qn1Var, int i) {
            z65.h(sm6Var, "$this$composed");
            qn1Var.w(-353972293);
            if (tn1.K()) {
                tn1.V(-353972293, i, -1, "androidx.compose.foundation.indication.<anonymous> (Indication.kt:107)");
            }
            p05 p05Var = this.a;
            if (p05Var == null) {
                p05Var = ez6.a;
            }
            q05 a = p05Var.a(this.b, qn1Var, 0);
            qn1Var.w(1157296644);
            boolean K = qn1Var.K(a);
            Object x = qn1Var.x();
            if (K || x == qn1.a.a()) {
                x = new s05(a);
                qn1Var.p(x);
            }
            qn1Var.J();
            s05 s05Var = (s05) x;
            if (tn1.K()) {
                tn1.U();
            }
            qn1Var.J();
            return s05Var;
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ sm6 invoke(sm6 sm6Var, qn1 qn1Var, Integer num) {
            return a(sm6Var, qn1Var, num.intValue());
        }
    }

    public static final xr8<p05> a() {
        return a;
    }

    public static final sm6 b(sm6 sm6Var, i65 i65Var, p05 p05Var) {
        Function1 a2;
        z65.h(sm6Var, "<this>");
        z65.h(i65Var, "interactionSource");
        if (r45.c()) {
            a2 = new b(p05Var, i65Var);
        } else {
            a2 = r45.a();
        }
        return pn1.a(sm6Var, a2, new c(p05Var, i65Var));
    }
}
