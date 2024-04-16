package defpackage;

import kotlin.Metadata;
/* compiled from: BuildInfo.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0004"}, d2 = {"Lmh0;", "", "b", "a", "general"}, k = 2, mv = {1, 9, 0})
/* renamed from: nh0  reason: default package */
/* loaded from: classes.dex */
public final class nh0 {
    public static final boolean a(mh0 mh0Var) {
        z65.h(mh0Var, "<this>");
        if (!z65.c(mh0Var.d(), "chuck_read") && !z65.c(mh0Var.d(), "chuck_write") && !z65.c(mh0Var.d(), "chuck_write_intg")) {
            return false;
        }
        return true;
    }

    public static final boolean b(mh0 mh0Var) {
        z65.h(mh0Var, "<this>");
        return z65.c(mh0Var.d(), "chuck_read");
    }
}
