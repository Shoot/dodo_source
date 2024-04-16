package defpackage;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: conversions.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lqd7;", "", "b", "", "a", "(Lqd7;)Ljava/lang/Boolean;", "controlling_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: kw1  reason: default package */
/* loaded from: classes.dex */
public final class kw1 {
    public static final Boolean a(qd7 qd7Var) {
        z65.h(qd7Var, "<this>");
        if (qd7Var instanceof hb0) {
            return ((hb0) qd7Var).a();
        }
        if (qd7Var instanceof g69) {
            int a = ((g69) qd7Var).a();
            if (a != 0) {
                if (a != 5) {
                    return Boolean.FALSE;
                }
                return Boolean.TRUE;
            }
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int b(qd7 qd7Var) {
        z65.h(qd7Var, "<this>");
        if (qd7Var instanceof g69) {
            return ((g69) qd7Var).a();
        }
        if (qd7Var instanceof hb0) {
            Boolean a = ((hb0) qd7Var).a();
            if (a == null) {
                return 0;
            }
            if (z65.c(a, Boolean.TRUE)) {
                return 5;
            }
            if (z65.c(a, Boolean.FALSE)) {
                return 1;
            }
            throw new NoWhenBranchMatchedException();
        }
        throw new NoWhenBranchMatchedException();
    }
}
