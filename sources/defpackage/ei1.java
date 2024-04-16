package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Iterator;
import kotlin.Metadata;
/* compiled from: ComboSlotProductSelector.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0016\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0012"}, d2 = {"Lei1;", "", "Lcj1;", "comboSlot", "Ldj1;", c.a, "Luna;", "slotProductSelectionSpec", "a", "b", e.a, DateTokenConverter.CONVERTER_KEY, "slotProduct", "", "g", "f", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ei1  reason: default package */
/* loaded from: classes4.dex */
public final class ei1 {
    private final dj1 a(cj1 cj1Var, una unaVar) {
        Object obj;
        Iterator<T> it = cj1Var.h().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (g((dj1) obj, unaVar)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (dj1) obj;
    }

    private final dj1 b(cj1 cj1Var, una unaVar) {
        Object obj;
        Iterator<T> it = cj1Var.h().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                dj1 dj1Var = (dj1) obj;
                if (z65.c(cj1Var.d(), dj1Var) && g(dj1Var, unaVar)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (dj1) obj;
    }

    private final dj1 c(cj1 cj1Var) {
        Object obj;
        Iterator<T> it = cj1Var.h().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (z65.c(((dj1) obj).g().getId(), cj1Var.c())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (dj1) obj;
    }

    private final dj1 d(cj1 cj1Var, una unaVar) {
        Object obj;
        Iterator<T> it = cj1Var.h().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                dj1 dj1Var = (dj1) obj;
                if (z65.c(dj1Var.g().getId(), unaVar.b()) && g(dj1Var, unaVar)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (dj1) obj;
    }

    private final dj1 e(cj1 cj1Var, una unaVar) {
        Object obj;
        Iterator<T> it = cj1Var.h().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                dj1 dj1Var = (dj1) obj;
                if (z65.c(dj1Var.g().getId(), unaVar.c()) && g(dj1Var, unaVar)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (dj1) obj;
    }

    private final boolean g(dj1 dj1Var, una unaVar) {
        if (!unaVar.d().contains(dj1Var.g().getId()) && bj1.a(dj1Var.g(), unaVar.a())) {
            return true;
        }
        return false;
    }

    public final dj1 f(cj1 cj1Var, una unaVar) {
        Object Z;
        z65.h(cj1Var, "comboSlot");
        z65.h(unaVar, "slotProductSelectionSpec");
        dj1 d = d(cj1Var, unaVar);
        if (d == null) {
            dj1 e = e(cj1Var, unaVar);
            if (e == null) {
                dj1 b = b(cj1Var, unaVar);
                if (b == null) {
                    dj1 a = a(cj1Var, unaVar);
                    if (a == null) {
                        dj1 c = c(cj1Var);
                        if (c == null) {
                            Z = sc1.Z(cj1Var.h());
                            return (dj1) Z;
                        }
                        return c;
                    }
                    return a;
                }
                return b;
            }
            return e;
        }
        return d;
    }
}
