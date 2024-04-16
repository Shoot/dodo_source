package androidx.compose.foundation;

import defpackage.sm6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Focusable.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0007\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/j;", "Lsm6$c;", "", "f1", "Loq6;", "Lh65;", "interaction", "g1", "", "isFocused", "h1", "interactionSource", "i1", "n", "Loq6;", "Lw14;", "o", "Lw14;", "focusedInteraction", "<init>", "(Loq6;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class j extends sm6.c {
    private oq6 n;
    private w14 o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Focusable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "androidx.compose.foundation.FocusableInteractionNode$emitWithFallback$1", f = "Focusable.kt", l = {310}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ oq6 b;
        final /* synthetic */ h65 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(oq6 oq6Var, h65 h65Var, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.b = oq6Var;
            this.c = h65Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(this.b, this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                oq6 oq6Var = this.b;
                h65 h65Var = this.c;
                this.a = 1;
                if (oq6Var.a(h65Var, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    public j(oq6 oq6Var) {
        this.n = oq6Var;
    }

    private final void f1() {
        w14 w14Var;
        oq6 oq6Var = this.n;
        if (oq6Var != null && (w14Var = this.o) != null) {
            oq6Var.c(new x14(w14Var));
        }
        this.o = null;
    }

    private final void g1(oq6 oq6Var, h65 h65Var) {
        if (M0()) {
            sh0.d(F0(), null, null, new a(oq6Var, h65Var, null), 3, null);
        } else {
            oq6Var.c(h65Var);
        }
    }

    public final void h1(boolean z) {
        oq6 oq6Var = this.n;
        if (oq6Var != null) {
            if (z) {
                w14 w14Var = this.o;
                if (w14Var != null) {
                    g1(oq6Var, new x14(w14Var));
                    this.o = null;
                }
                w14 w14Var2 = new w14();
                g1(oq6Var, w14Var2);
                this.o = w14Var2;
                return;
            }
            w14 w14Var3 = this.o;
            if (w14Var3 != null) {
                g1(oq6Var, new x14(w14Var3));
                this.o = null;
            }
        }
    }

    public final void i1(oq6 oq6Var) {
        if (!z65.c(this.n, oq6Var)) {
            f1();
            this.n = oq6Var;
        }
    }
}
