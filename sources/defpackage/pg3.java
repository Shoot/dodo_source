package defpackage;

import defpackage.gb8;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: BasicText.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lpg3;", "Lqb6;", "Lvb6;", "", "Lmb6;", "measurables", "Lnr1;", "constraints", "Ltb6;", "a", "(Lvb6;Ljava/util/List;J)Ltb6;", "Lkotlin/Function1;", "Lgb8$a;", "", "b", "Lkotlin/jvm/functions/Function1;", "placementBlock", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: pg3  reason: default package */
/* loaded from: classes.dex */
final class pg3 implements qb6 {
    public static final pg3 a = new pg3();
    private static final Function1<gb8.a, Unit> b = a.a;

    /* compiled from: BasicText.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lgb8$a;", "", "a", "(Lgb8$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: pg3$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<gb8.a, Unit> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final void a(gb8.a aVar) {
            z65.h(aVar, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(gb8.a aVar) {
            a(aVar);
            return Unit.a;
        }
    }

    private pg3() {
    }

    @Override // defpackage.qb6
    public tb6 a(vb6 vb6Var, List<? extends mb6> list, long j) {
        z65.h(vb6Var, "$this$measure");
        z65.h(list, "measurables");
        return ub6.b(vb6Var, nr1.n(j), nr1.m(j), null, b, 4, null);
    }
}
