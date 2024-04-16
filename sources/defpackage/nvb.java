package defpackage;

import kotlin.Metadata;
/* compiled from: utils.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0007\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\b"}, d2 = {"Lf28;", "Lh48;", "phoneParser", "", "b", "Lj28;", "format", "a", "phonenumber"}, k = 2, mv = {1, 9, 0})
/* renamed from: nvb  reason: default package */
/* loaded from: classes2.dex */
public final class nvb {
    public static final String a(String str, j28 j28Var) {
        String T0;
        CharSequence R0;
        z65.h(str, "<this>");
        z65.h(j28Var, "format");
        T0 = o0b.T0(str, j28Var.b().length());
        R0 = m0b.R0(T0);
        return R0.toString();
    }

    public static final String b(f28 f28Var, h48 h48Var) {
        z65.h(f28Var, "<this>");
        z65.h(h48Var, "phoneParser");
        return h48Var.b(f28Var);
    }
}
