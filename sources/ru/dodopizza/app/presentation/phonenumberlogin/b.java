package ru.dodopizza.app.presentation.phonenumberlogin;

import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import ru.dodopizza.app.presentation.phonenumberlogin.c;
/* compiled from: LegalInfoBlockMapper.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lru/dodopizza/app/presentation/phonenumberlogin/b;", "", "Ljt5;", "localityInfo", "Lru/dodopizza/app/presentation/phonenumberlogin/c$b;", "a", "b", com.huawei.hms.opendevice.c.a, "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class b {
    public final c.b a(jt5 jt5Var) {
        wo5 wo5Var;
        boolean y;
        z65.h(jt5Var, "localityInfo");
        String a = jt5Var.a();
        List<wo5> d = jt5Var.d();
        ListIterator<wo5> listIterator = d.listIterator(d.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                wo5Var = listIterator.previous();
                if (wo5Var.c() == 10) {
                    break;
                }
            } else {
                wo5Var = null;
                break;
            }
        }
        wo5 wo5Var2 = wo5Var;
        y = l0b.y(a);
        if (y) {
            return c.b.C0581b.a;
        }
        if (wo5Var2 == null) {
            return new c.b.d(a);
        }
        return new c.b.a(a, wo5Var2.d());
    }

    public final c.b b(jt5 jt5Var) {
        z65.h(jt5Var, "localityInfo");
        List<wo5> d = jt5Var.d();
        if (!d.isEmpty()) {
            return new c.b.C0582c(d);
        }
        return c.b.C0581b.a;
    }

    public final c.b c(jt5 jt5Var) {
        boolean y;
        z65.h(jt5Var, "localityInfo");
        String a = jt5Var.a();
        y = l0b.y(a);
        if (!y) {
            return new c.b.d(a);
        }
        return c.b.C0581b.a;
    }
}
