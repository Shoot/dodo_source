package defpackage;

import defpackage.gb8;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: Spacer.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lrqa;", "Lqb6;", "Lvb6;", "", "Lmb6;", "measurables", "Lnr1;", "constraints", "Ltb6;", "a", "(Lvb6;Ljava/util/List;J)Ltb6;", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: rqa  reason: default package */
/* loaded from: classes.dex */
final class rqa implements qb6 {
    public static final rqa a = new rqa();

    /* compiled from: Spacer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lgb8$a;", "", "a", "(Lgb8$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: rqa$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<gb8.a, Unit> {
        public static final a a = new a();

        a() {
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

    private rqa() {
    }

    @Override // defpackage.qb6
    public tb6 a(vb6 vb6Var, List<? extends mb6> list, long j) {
        int i;
        int i2;
        z65.h(vb6Var, "$this$measure");
        z65.h(list, "measurables");
        if (nr1.l(j)) {
            i = nr1.n(j);
        } else {
            i = 0;
        }
        if (nr1.k(j)) {
            i2 = nr1.m(j);
        } else {
            i2 = 0;
        }
        return ub6.b(vb6Var, i, i2, null, a.a, 4, null);
    }
}
