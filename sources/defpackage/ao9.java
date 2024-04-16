package defpackage;

import defpackage.en5;
import defpackage.gb8;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: RootMeasurePolicy.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lao9;", "Len5$f;", "Lvb6;", "", "Lmb6;", "measurables", "Lnr1;", "constraints", "Ltb6;", "a", "(Lvb6;Ljava/util/List;J)Ltb6;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ao9  reason: default package */
/* loaded from: classes.dex */
public final class ao9 extends en5.f {
    public static final ao9 b = new ao9();

    /* compiled from: RootMeasurePolicy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lgb8$a;", "", "a", "(Lgb8$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: ao9$a */
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

    /* compiled from: RootMeasurePolicy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lgb8$a;", "", "a", "(Lgb8$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: ao9$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function1<gb8.a, Unit> {
        final /* synthetic */ gb8 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(gb8 gb8Var) {
            super(1);
            this.a = gb8Var;
        }

        public final void a(gb8.a aVar) {
            z65.h(aVar, "$this$layout");
            gb8.a.t(aVar, this.a, 0, 0, 0.0f, null, 12, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(gb8.a aVar) {
            a(aVar);
            return Unit.a;
        }
    }

    /* compiled from: RootMeasurePolicy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lgb8$a;", "", "a", "(Lgb8$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: ao9$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function1<gb8.a, Unit> {
        final /* synthetic */ List<gb8> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(List<? extends gb8> list) {
            super(1);
            this.a = list;
        }

        public final void a(gb8.a aVar) {
            z65.h(aVar, "$this$layout");
            List<gb8> list = this.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                gb8.a.t(aVar, list.get(i), 0, 0, 0.0f, null, 12, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(gb8.a aVar) {
            a(aVar);
            return Unit.a;
        }
    }

    private ao9() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // defpackage.qb6
    public tb6 a(vb6 vb6Var, List<? extends mb6> list, long j) {
        z65.h(vb6Var, "$this$measure");
        z65.h(list, "measurables");
        if (list.isEmpty()) {
            return ub6.b(vb6Var, nr1.p(j), nr1.o(j), null, a.a, 4, null);
        }
        if (list.size() == 1) {
            gb8 E = list.get(0).E(j);
            return ub6.b(vb6Var, qr1.g(j, E.y0()), qr1.f(j, E.e0()), null, new b(E), 4, null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(list.get(i).E(j));
        }
        int size2 = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size2; i4++) {
            gb8 gb8Var = (gb8) arrayList.get(i4);
            i2 = Math.max(gb8Var.y0(), i2);
            i3 = Math.max(gb8Var.e0(), i3);
        }
        return ub6.b(vb6Var, qr1.g(j, i2), qr1.f(j, i3), null, new c(arrayList), 4, null);
    }
}
