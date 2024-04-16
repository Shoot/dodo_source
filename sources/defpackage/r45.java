package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: InspectableValue.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a(\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0005\u001a\u00020\u0000H\u0001\"#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\"\"\u0010\u0011\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lsm6;", "Lkotlin/Function1;", "Lt45;", "", "inspectorInfo", "wrapped", "b", "a", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "NoInspectorInfo", "", "Z", c.a, "()Z", "setDebugInspectorInfoEnabled", "(Z)V", "isDebugInspectorInfoEnabled", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: r45  reason: default package */
/* loaded from: classes.dex */
public final class r45 {
    private static final Function1<t45, Unit> a = a.a;
    private static boolean b;

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lt45;", "", "a", "(Lt45;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: r45$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<t45, Unit> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final void a(t45 t45Var) {
            z65.h(t45Var, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(t45 t45Var) {
            a(t45Var);
            return Unit.a;
        }
    }

    public static final Function1<t45, Unit> a() {
        return a;
    }

    public static final sm6 b(sm6 sm6Var, Function1<? super t45, Unit> function1, sm6 sm6Var2) {
        z65.h(sm6Var, "<this>");
        z65.h(function1, "inspectorInfo");
        z65.h(sm6Var2, "wrapped");
        q45 q45Var = new q45(function1);
        return sm6Var.f(q45Var).f(sm6Var2).f(q45Var.o());
    }

    public static final boolean c() {
        return b;
    }
}
