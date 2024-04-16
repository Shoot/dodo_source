package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: HitPathTracker.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\f\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000J7\u0010\r\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0006\u0010\u0011\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u000fJ\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Ltz6;", "", "", "Lvd8;", "Lwd8;", "changes", "Lom5;", "parentCoordinates", "Lu65;", "internalPointerEvent", "", "isInBounds", "a", "f", e.a, "", DateTokenConverter.CONVERTER_KEY, c.a, Image.TYPE_HIGH, "b", "Lgr6;", "Llz6;", "Lgr6;", "g", "()Lgr6;", "children", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: tz6  reason: default package */
/* loaded from: classes.dex */
public class tz6 {
    private final gr6<lz6> a = new gr6<>(new lz6[16], 0);

    public boolean a(Map<vd8, wd8> map, om5 om5Var, u65 u65Var, boolean z) {
        z65.h(map, "changes");
        z65.h(om5Var, "parentCoordinates");
        z65.h(u65Var, "internalPointerEvent");
        gr6<lz6> gr6Var = this.a;
        int s = gr6Var.s();
        if (s <= 0) {
            return false;
        }
        lz6[] r = gr6Var.r();
        int i = 0;
        boolean z2 = false;
        do {
            if (!r[i].a(map, om5Var, u65Var, z) && !z2) {
                z2 = false;
            } else {
                z2 = true;
            }
            i++;
        } while (i < s);
        return z2;
    }

    public void b(u65 u65Var) {
        z65.h(u65Var, "internalPointerEvent");
        int s = this.a.s();
        while (true) {
            s--;
            if (-1 < s) {
                if (this.a.r()[s].k().u()) {
                    this.a.z(s);
                }
            } else {
                return;
            }
        }
    }

    public final void c() {
        this.a.k();
    }

    public void d() {
        gr6<lz6> gr6Var = this.a;
        int s = gr6Var.s();
        if (s > 0) {
            lz6[] r = gr6Var.r();
            int i = 0;
            do {
                r[i].d();
                i++;
            } while (i < s);
        }
    }

    public boolean e(u65 u65Var) {
        z65.h(u65Var, "internalPointerEvent");
        gr6<lz6> gr6Var = this.a;
        int s = gr6Var.s();
        boolean z = false;
        if (s > 0) {
            lz6[] r = gr6Var.r();
            int i = 0;
            boolean z2 = false;
            do {
                if (!r[i].e(u65Var) && !z2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                i++;
            } while (i < s);
            z = z2;
        }
        b(u65Var);
        return z;
    }

    public boolean f(Map<vd8, wd8> map, om5 om5Var, u65 u65Var, boolean z) {
        z65.h(map, "changes");
        z65.h(om5Var, "parentCoordinates");
        z65.h(u65Var, "internalPointerEvent");
        gr6<lz6> gr6Var = this.a;
        int s = gr6Var.s();
        if (s <= 0) {
            return false;
        }
        lz6[] r = gr6Var.r();
        int i = 0;
        boolean z2 = false;
        do {
            if (!r[i].f(map, om5Var, u65Var, z) && !z2) {
                z2 = false;
            } else {
                z2 = true;
            }
            i++;
        } while (i < s);
        return z2;
    }

    public final gr6<lz6> g() {
        return this.a;
    }

    public final void h() {
        int i = 0;
        while (i < this.a.s()) {
            lz6 lz6Var = this.a.r()[i];
            if (!lz6Var.j().M0()) {
                this.a.z(i);
                lz6Var.d();
            } else {
                i++;
                lz6Var.h();
            }
        }
    }
}
