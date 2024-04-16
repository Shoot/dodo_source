package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import defpackage.sm6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: KeyInputModifier.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B6\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\u0007R3\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t8\u0006@\u0006X\u0086\u000eø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR3\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t8\u0006@\u0006X\u0086\u000eø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/input/key/b;", "Lhf5;", "Lsm6$c;", "Lbf5;", "event", "", "f0", "(Landroid/view/KeyEvent;)Z", "W", "Lkotlin/Function1;", "n", "Lkotlin/jvm/functions/Function1;", "getOnEvent", "()Lkotlin/jvm/functions/Function1;", "f1", "(Lkotlin/jvm/functions/Function1;)V", "onEvent", "o", "getOnPreEvent", "g1", "onPreEvent", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class b extends sm6.c implements hf5 {
    private Function1<? super bf5, Boolean> n;
    private Function1<? super bf5, Boolean> o;

    public b(Function1<? super bf5, Boolean> function1, Function1<? super bf5, Boolean> function12) {
        this.n = function1;
        this.o = function12;
    }

    @Override // defpackage.hf5
    public boolean W(KeyEvent keyEvent) {
        z65.h(keyEvent, "event");
        Function1<? super bf5, Boolean> function1 = this.o;
        if (function1 != null) {
            return function1.invoke(bf5.a(keyEvent)).booleanValue();
        }
        return false;
    }

    @Override // defpackage.hf5
    public boolean f0(KeyEvent keyEvent) {
        z65.h(keyEvent, "event");
        Function1<? super bf5, Boolean> function1 = this.n;
        if (function1 != null) {
            return function1.invoke(bf5.a(keyEvent)).booleanValue();
        }
        return false;
    }

    public final void f1(Function1<? super bf5, Boolean> function1) {
        this.n = function1;
    }

    public final void g1(Function1<? super bf5, Boolean> function1) {
        this.o = function1;
    }
}
