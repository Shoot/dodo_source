package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.ok9;
import defpackage.zo7;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: PackagingStateResolver.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0002*\u00020\u0004H\u0002J\u001c\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b¨\u0006\r"}, d2 = {"Lap7;", "", "Lzo7;", "packagingState", "Lok9;", "a", c.a, "originalPackagingState", "", "restaurantServiceTypes", "b", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ap7  reason: default package */
/* loaded from: classes2.dex */
public final class ap7 {
    private final ok9 a(zo7 zo7Var) {
        if ((zo7Var instanceof zo7.b) || (zo7Var instanceof zo7.c)) {
            return null;
        }
        if (zo7Var instanceof zo7.a) {
            return ok9.a.a;
        }
        if (zo7Var instanceof zo7.d) {
            zo7.d dVar = (zo7.d) zo7Var;
            if (dVar.R() != null) {
                if (dVar.R().booleanValue()) {
                    return ok9.c.a;
                }
                return ok9.b.a;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new NoWhenBranchMatchedException();
    }

    private final zo7 c(ok9 ok9Var) {
        if (z65.c(ok9Var, ok9.b.a)) {
            return new zo7.d(false);
        }
        if (z65.c(ok9Var, ok9.c.a)) {
            return new zo7.d(true);
        }
        if (z65.c(ok9Var, ok9.a.a)) {
            return zo7.c.a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final zo7 b(zo7 zo7Var, List<? extends ok9> list) {
        boolean Q;
        Object u0;
        z65.h(zo7Var, "originalPackagingState");
        z65.h(list, "restaurantServiceTypes");
        Q = sc1.Q(list, a(zo7Var));
        if (!Q && !(zo7Var instanceof zo7.b)) {
            if (list.size() <= 1) {
                u0 = sc1.u0(list);
                return c((ok9) u0);
            }
            return zo7.c.a;
        }
        return zo7Var;
    }
}
