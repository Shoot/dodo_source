package androidx.compose.ui.input.rotary;

import defpackage.sm6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: RotaryInputModifier.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR0\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000e¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/input/rotary/b;", "Leo9;", "Lsm6$c;", "Lfo9;", "event", "", "V", "F", "Lkotlin/Function1;", "n", "Lkotlin/jvm/functions/Function1;", "getOnEvent", "()Lkotlin/jvm/functions/Function1;", "f1", "(Lkotlin/jvm/functions/Function1;)V", "onEvent", "o", "getOnPreEvent", "g1", "onPreEvent", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class b extends sm6.c implements eo9 {
    private Function1<? super fo9, Boolean> n;
    private Function1<? super fo9, Boolean> o;

    public b(Function1<? super fo9, Boolean> function1, Function1<? super fo9, Boolean> function12) {
        this.n = function1;
        this.o = function12;
    }

    @Override // defpackage.eo9
    public boolean F(fo9 fo9Var) {
        z65.h(fo9Var, "event");
        Function1<? super fo9, Boolean> function1 = this.o;
        if (function1 != null) {
            return function1.invoke(fo9Var).booleanValue();
        }
        return false;
    }

    @Override // defpackage.eo9
    public boolean V(fo9 fo9Var) {
        z65.h(fo9Var, "event");
        Function1<? super fo9, Boolean> function1 = this.n;
        if (function1 != null) {
            return function1.invoke(fo9Var).booleanValue();
        }
        return false;
    }

    public final void f1(Function1<? super fo9, Boolean> function1) {
        this.n = function1;
    }

    public final void g1(Function1<? super fo9, Boolean> function1) {
        this.o = function1;
    }
}
