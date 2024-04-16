package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.gb8;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: RowColumnImpl.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u001aa\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002*\u0010\b\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\u00128@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u001a\u0010\u001a\u001a\u00020\u0017*\u0004\u0018\u00010\u00138@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u001a\u0010\u001e\u001a\u00020\u001b*\u0004\u0018\u00010\u00138@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\"\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010\u00138@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \"\u001a\u0010\"\u001a\u00020\u001b*\u0004\u0018\u00010\u00138@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lkn5;", "orientation", "Lkotlin/Function5;", "", "", "Lqm5;", "La03;", "", "arrangement", "Li73;", "arrangementSpacing", "Ljna;", "crossAxisSize", "Lv22;", "crossAxisAlignment", "Lqb6;", "f", "(Lkn5;Lc94;FLjna;Lv22;)Lqb6;", "Lx65;", "Ljp9;", c.a, "(Lx65;)Ljp9;", "rowColumnParentData", "", DateTokenConverter.CONVERTER_KEY, "(Ljp9;)F", "weight", "", "b", "(Ljp9;)Z", "fill", "a", "(Ljp9;)Lv22;", e.a, "isRelative", "foundation-layout_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: gp9  reason: default package */
/* loaded from: classes.dex */
public final class gp9 {

    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"gp9$a", "Lqb6;", "Lvb6;", "", "Lmb6;", "measurables", "Lnr1;", "constraints", "Ltb6;", "a", "(Lvb6;Ljava/util/List;J)Ltb6;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: gp9$a */
    /* loaded from: classes.dex */
    public static final class a implements qb6 {
        final /* synthetic */ kn5 a;
        final /* synthetic */ c94<Integer, int[], qm5, a03, int[], Unit> b;
        final /* synthetic */ float c;
        final /* synthetic */ jna d;
        final /* synthetic */ v22 e;

        /* compiled from: RowColumnImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lgb8$a;", "", "a", "(Lgb8$a;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: gp9$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0339a extends ej5 implements Function1<gb8.a, Unit> {
            final /* synthetic */ ip9 a;
            final /* synthetic */ hp9 b;
            final /* synthetic */ vb6 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0339a(ip9 ip9Var, hp9 hp9Var, vb6 vb6Var) {
                super(1);
                this.a = ip9Var;
                this.b = hp9Var;
                this.c = vb6Var;
            }

            public final void a(gb8.a aVar) {
                z65.h(aVar, "$this$layout");
                this.a.f(aVar, this.b, 0, this.c.getLayoutDirection());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(gb8.a aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(kn5 kn5Var, c94<? super Integer, ? super int[], ? super qm5, ? super a03, ? super int[], Unit> c94Var, float f, jna jnaVar, v22 v22Var) {
            this.a = kn5Var;
            this.b = c94Var;
            this.c = f;
            this.d = jnaVar;
            this.e = v22Var;
        }

        @Override // defpackage.qb6
        public tb6 a(vb6 vb6Var, List<? extends mb6> list, long j) {
            int b;
            int e;
            z65.h(vb6Var, "$this$measure");
            z65.h(list, "measurables");
            ip9 ip9Var = new ip9(this.a, this.b, this.c, this.d, this.e, list, new gb8[list.size()], null);
            hp9 e2 = ip9Var.e(vb6Var, j, 0, list.size());
            if (this.a == kn5.Horizontal) {
                b = e2.e();
                e = e2.b();
            } else {
                b = e2.b();
                e = e2.e();
            }
            return ub6.b(vb6Var, b, e, null, new C0339a(ip9Var, e2, vb6Var), 4, null);
        }
    }

    public static final v22 a(jp9 jp9Var) {
        if (jp9Var != null) {
            return jp9Var.a();
        }
        return null;
    }

    public static final boolean b(jp9 jp9Var) {
        if (jp9Var != null) {
            return jp9Var.b();
        }
        return true;
    }

    public static final jp9 c(x65 x65Var) {
        z65.h(x65Var, "<this>");
        Object r = x65Var.r();
        if (r instanceof jp9) {
            return (jp9) r;
        }
        return null;
    }

    public static final float d(jp9 jp9Var) {
        if (jp9Var != null) {
            return jp9Var.c();
        }
        return 0.0f;
    }

    public static final boolean e(jp9 jp9Var) {
        v22 a2 = a(jp9Var);
        if (a2 != null) {
            return a2.c();
        }
        return false;
    }

    public static final qb6 f(kn5 kn5Var, c94<? super Integer, ? super int[], ? super qm5, ? super a03, ? super int[], Unit> c94Var, float f, jna jnaVar, v22 v22Var) {
        z65.h(kn5Var, "orientation");
        z65.h(c94Var, "arrangement");
        z65.h(jnaVar, "crossAxisSize");
        z65.h(v22Var, "crossAxisAlignment");
        return new a(kn5Var, c94Var, f, jnaVar, v22Var);
    }
}
