package androidx.compose.ui.input.key;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: KeyInputModifier.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"Lsm6;", "Lkotlin/Function1;", "Lbf5;", "", "onKeyEvent", "a", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class a {
    public static final sm6 a(sm6 sm6Var, Function1<? super bf5, Boolean> function1) {
        z65.h(sm6Var, "<this>");
        z65.h(function1, "onKeyEvent");
        return sm6Var.f(new KeyInputElement(function1, null));
    }
}
