package defpackage;

import kotlin.Metadata;
/* compiled from: CompositionLocalConsumerModifierNode.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "Lmo1;", "Llo1;", "local", "a", "(Lmo1;Llo1;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: no1  reason: default package */
/* loaded from: classes.dex */
public final class no1 {
    public static final <T> T a(mo1 mo1Var, lo1<T> lo1Var) {
        z65.h(mo1Var, "<this>");
        z65.h(lo1Var, "local");
        if (mo1Var.I().M0()) {
            return (T) au2.i(mo1Var).G().b(lo1Var);
        }
        throw new IllegalStateException("Cannot read CompositionLocal because the Modifier node is not currently attached.".toString());
    }
}
