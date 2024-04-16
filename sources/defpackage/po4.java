package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.sm6;
import java.util.List;
import kotlin.Metadata;
/* compiled from: HitPathTracker.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\u0007J\u0006\u0010\u0010\u001a\u00020\u0007R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lpo4;", "", "Lvd8;", "pointerId", "", "Lsm6$c;", "pointerInputNodes", "", "a", "(JLjava/util/List;)V", "Lu65;", "internalPointerEvent", "", "isInBounds", "b", c.a, DateTokenConverter.CONVERTER_KEY, "Lom5;", "Lom5;", "rootCoordinates", "Ltz6;", "Ltz6;", "getRoot$ui_release", "()Ltz6;", "root", "<init>", "(Lom5;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: po4  reason: default package */
/* loaded from: classes.dex */
public final class po4 {
    private final om5 a;
    private final tz6 b;

    public po4(om5 om5Var) {
        z65.h(om5Var, "rootCoordinates");
        this.a = om5Var;
        this.b = new tz6();
    }

    public final void a(long j, List<? extends sm6.c> list) {
        lz6 lz6Var;
        z65.h(list, "pointerInputNodes");
        tz6 tz6Var = this.b;
        int size = list.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            sm6.c cVar = list.get(i);
            if (z) {
                gr6<lz6> g = tz6Var.g();
                int s = g.s();
                if (s > 0) {
                    lz6[] r = g.r();
                    int i2 = 0;
                    do {
                        lz6Var = r[i2];
                        if (z65.c(lz6Var.j(), cVar)) {
                            break;
                        }
                        i2++;
                    } while (i2 < s);
                    lz6Var = null;
                } else {
                    lz6Var = null;
                }
                lz6 lz6Var2 = lz6Var;
                if (lz6Var2 != null) {
                    lz6Var2.m();
                    if (!lz6Var2.k().n(vd8.a(j))) {
                        lz6Var2.k().b(vd8.a(j));
                    }
                    tz6Var = lz6Var2;
                } else {
                    z = false;
                }
            }
            lz6 lz6Var3 = new lz6(cVar);
            lz6Var3.k().b(vd8.a(j));
            tz6Var.g().b(lz6Var3);
            tz6Var = lz6Var3;
        }
    }

    public final boolean b(u65 u65Var, boolean z) {
        z65.h(u65Var, "internalPointerEvent");
        if (!this.b.a(u65Var.a(), this.a, u65Var, z)) {
            return false;
        }
        boolean f = this.b.f(u65Var.a(), this.a, u65Var, z);
        if (!this.b.e(u65Var) && !f) {
            return false;
        }
        return true;
    }

    public final void c() {
        this.b.d();
        this.b.c();
    }

    public final void d() {
        this.b.h();
    }
}
