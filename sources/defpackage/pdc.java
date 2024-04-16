package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: -ChallengeCommon.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0000\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0000¨\u0006\t"}, d2 = {"Lxu0;", "", "other", "", "a", "", "b", "", c.a, "okhttp"}, k = 2, mv = {1, 9, 0})
/* renamed from: pdc  reason: default package */
/* loaded from: classes3.dex */
public final class pdc {
    public static final boolean a(xu0 xu0Var, Object obj) {
        z65.h(xu0Var, "<this>");
        if (obj instanceof xu0) {
            xu0 xu0Var2 = (xu0) obj;
            if (z65.c(xu0Var2.d(), xu0Var.d()) && z65.c(xu0Var2.a(), xu0Var.a())) {
                return true;
            }
        }
        return false;
    }

    public static final int b(xu0 xu0Var) {
        z65.h(xu0Var, "<this>");
        return ((899 + xu0Var.d().hashCode()) * 31) + xu0Var.a().hashCode();
    }

    public static final String c(xu0 xu0Var) {
        z65.h(xu0Var, "<this>");
        return xu0Var.d() + " authParams=" + xu0Var.a();
    }
}
