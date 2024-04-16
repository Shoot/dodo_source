package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: Focusable.kt */
@Metadata(d1 = {"\u0000!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\n\u001a \u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u001a\u001e\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0000\"\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b\"\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000b¨\u0006\r"}, d2 = {"Lsm6;", "", "enabled", "Loq6;", "interactionSource", "a", "b", "Lq45;", "Lq45;", "focusGroupInspectorInfo", "androidx/compose/foundation/FocusableKt$FocusableInNonTouchModeElement$1", "Landroidx/compose/foundation/FocusableKt$FocusableInNonTouchModeElement$1;", "FocusableInNonTouchModeElement", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FocusableKt {
    private static final q45 a;
    private static final FocusableKt$FocusableInNonTouchModeElement$1 b;

    /* compiled from: Focusable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lt45;", "", "a", "(Lt45;)V"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<t45, Unit> {
        final /* synthetic */ boolean a;
        final /* synthetic */ oq6 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z, oq6 oq6Var) {
            super(1);
            this.a = z;
            this.b = oq6Var;
        }

        public final void a(t45 t45Var) {
            z65.h(t45Var, "$this$inspectable");
            t45Var.b("focusableInNonTouchMode");
            t45Var.a().b("enabled", Boolean.valueOf(this.a));
            t45Var.a().b("interactionSource", this.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(t45 t45Var) {
            a(t45Var);
            return Unit.a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lt45;", "", "a", "(Lt45;)V"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function1<t45, Unit> {
        public b() {
            super(1);
        }

        public final void a(t45 t45Var) {
            z65.h(t45Var, "$this$null");
            t45Var.b("focusGroup");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(t45 t45Var) {
            a(t45Var);
            return Unit.a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1] */
    static {
        Function1 a2;
        if (r45.c()) {
            a2 = new b();
        } else {
            a2 = r45.a();
        }
        a = new q45(a2);
        b = new fn6<i>() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return System.identityHashCode(this);
            }

            @Override // defpackage.fn6
            /* renamed from: t */
            public i o() {
                return new i();
            }

            @Override // defpackage.fn6
            /* renamed from: u */
            public void s(i iVar) {
                z65.h(iVar, "node");
            }
        };
    }

    public static final sm6 a(sm6 sm6Var, boolean z, oq6 oq6Var) {
        sm6 sm6Var2;
        z65.h(sm6Var, "<this>");
        if (z) {
            sm6Var2 = androidx.compose.ui.focus.c.a(new FocusableElement(oq6Var));
        } else {
            sm6Var2 = sm6.a;
        }
        return sm6Var.f(sm6Var2);
    }

    public static final sm6 b(sm6 sm6Var, boolean z, oq6 oq6Var) {
        z65.h(sm6Var, "<this>");
        return r45.b(sm6Var, new a(z, oq6Var), a(sm6.a.f(b), z, oq6Var));
    }
}
