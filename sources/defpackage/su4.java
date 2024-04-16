package defpackage;

import defpackage.gb8;
import defpackage.mn1;
import defpackage.sm6;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: Image.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aU\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lsp7;", "painter", "", "contentDescription", "Lsm6;", "modifier", "Lgb;", "alignment", "Lau1;", "contentScale", "", "alpha", "Lwc1;", "colorFilter", "", "a", "(Lsp7;Ljava/lang/String;Lsm6;Lgb;Lau1;FLwc1;Lqn1;II)V", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: su4  reason: default package */
/* loaded from: classes.dex */
public final class su4 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Image.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, d2 = {"Lvb6;", "", "Lmb6;", "<anonymous parameter 0>", "Lnr1;", "constraints", "Ltb6;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: su4$a */
    /* loaded from: classes.dex */
    public static final class a implements qb6 {
        public static final a a = new a();

        /* compiled from: Image.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lgb8$a;", "", "a", "(Lgb8$a;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: su4$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0668a extends ej5 implements Function1<gb8.a, Unit> {
            public static final C0668a a = new C0668a();

            C0668a() {
                super(1);
            }

            public final void a(gb8.a aVar) {
                z65.h(aVar, "$this$layout");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(gb8.a aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        a() {
        }

        @Override // defpackage.qb6
        public final tb6 a(vb6 vb6Var, List<? extends mb6> list, long j) {
            z65.h(vb6Var, "$this$Layout");
            z65.h(list, "<anonymous parameter 0>");
            return ub6.b(vb6Var, nr1.p(j), nr1.o(j), null, C0668a.a, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Image.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: su4$b */
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function2<qn1, Integer, Unit> {
        final /* synthetic */ sp7 a;
        final /* synthetic */ String b;
        final /* synthetic */ sm6 c;
        final /* synthetic */ gb d;
        final /* synthetic */ au1 e;
        final /* synthetic */ float f;
        final /* synthetic */ wc1 g;
        final /* synthetic */ int h;
        final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(sp7 sp7Var, String str, sm6 sm6Var, gb gbVar, au1 au1Var, float f, wc1 wc1Var, int i, int i2) {
            super(2);
            this.a = sp7Var;
            this.b = str;
            this.c = sm6Var;
            this.d = gbVar;
            this.e = au1Var;
            this.f = f;
            this.g = wc1Var;
            this.h = i;
            this.i = i2;
        }

        public final void a(qn1 qn1Var, int i) {
            su4.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, qn1Var, f99.a(this.h | 1), this.i);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(qn1 qn1Var, Integer num) {
            a(qn1Var, num.intValue());
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Image.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljba;", "", "a", "(Ljba;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: su4$c */
    /* loaded from: classes.dex */
    public static final class c extends ej5 implements Function1<jba, Unit> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(1);
            this.a = str;
        }

        public final void a(jba jbaVar) {
            z65.h(jbaVar, "$this$semantics");
            hba.h(jbaVar, this.a);
            hba.j(jbaVar, gn9.b.d());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(jba jbaVar) {
            a(jbaVar);
            return Unit.a;
        }
    }

    public static final void a(sp7 sp7Var, String str, sm6 sm6Var, gb gbVar, au1 au1Var, float f, wc1 wc1Var, qn1 qn1Var, int i, int i2) {
        sm6.a aVar;
        gb gbVar2;
        au1 au1Var2;
        float f2;
        wc1 wc1Var2;
        sm6 sm6Var2;
        z65.h(sp7Var, "painter");
        qn1 f3 = qn1Var.f(1142754848);
        if ((i2 & 4) != 0) {
            aVar = sm6.a;
        } else {
            aVar = sm6Var;
        }
        if ((i2 & 8) != 0) {
            gbVar2 = gb.a.a();
        } else {
            gbVar2 = gbVar;
        }
        if ((i2 & 16) != 0) {
            au1Var2 = au1.a.a();
        } else {
            au1Var2 = au1Var;
        }
        if ((i2 & 32) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i2 & 64) != 0) {
            wc1Var2 = null;
        } else {
            wc1Var2 = wc1Var;
        }
        if (tn1.K()) {
            tn1.V(1142754848, i, -1, "androidx.compose.foundation.Image (Image.kt:235)");
        }
        f3.w(-816794123);
        if (str != null) {
            sm6.a aVar2 = sm6.a;
            f3.w(1157296644);
            boolean K = f3.K(str);
            Object x = f3.x();
            if (K || x == qn1.a.a()) {
                x = new c(str);
                f3.p(x);
            }
            f3.J();
            sm6Var2 = waa.c(aVar2, false, (Function1) x, 1, null);
        } else {
            sm6Var2 = sm6.a;
        }
        f3.J();
        sm6 b2 = androidx.compose.ui.draw.a.b(o91.a(aVar.f(sm6Var2)), sp7Var, false, gbVar2, au1Var2, f2, wc1Var2, 2, null);
        a aVar3 = a.a;
        f3.w(-1323940314);
        int a2 = jn1.a(f3, 0);
        po1 n = f3.n();
        mn1.a aVar4 = mn1.G;
        Function0<mn1> a3 = aVar4.a();
        y84<sna<mn1>, qn1, Integer, Unit> a4 = xm5.a(b2);
        if (!(f3.h() instanceof wp)) {
            jn1.b();
        }
        f3.B();
        if (f3.e()) {
            f3.D(a3);
        } else {
            f3.o();
        }
        qn1 a5 = srb.a(f3);
        srb.b(a5, aVar3, aVar4.c());
        srb.b(a5, n, aVar4.e());
        Function2<mn1, Integer, Unit> b3 = aVar4.b();
        if (a5.e() || !z65.c(a5.x(), Integer.valueOf(a2))) {
            a5.p(Integer.valueOf(a2));
            a5.l(Integer.valueOf(a2), b3);
        }
        a4.invoke(sna.a(sna.b(f3)), f3, 0);
        f3.w(2058660585);
        f3.J();
        f3.r();
        f3.J();
        if (tn1.K()) {
            tn1.U();
        }
        xw9 i3 = f3.i();
        if (i3 != null) {
            i3.a(new b(sp7Var, str, aVar, gbVar2, au1Var2, f2, wc1Var2, i, i2));
        }
    }
}
