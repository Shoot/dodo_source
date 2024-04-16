package androidx.compose.foundation;

import kotlin.Metadata;
/* compiled from: Hoverable.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001c\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¨\u0006\u0006"}, d2 = {"Lsm6;", "Loq6;", "interactionSource", "", "enabled", "a", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class n {
    public static final sm6 a(sm6 sm6Var, oq6 oq6Var, boolean z) {
        sm6 sm6Var2;
        z65.h(sm6Var, "<this>");
        z65.h(oq6Var, "interactionSource");
        if (z) {
            sm6Var2 = new HoverableElement(oq6Var);
        } else {
            sm6Var2 = sm6.a;
        }
        return sm6Var.f(sm6Var2);
    }
}
