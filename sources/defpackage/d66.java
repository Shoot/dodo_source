package defpackage;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: MapBounds.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0000*\u00020\u0000\u001a\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¨\u0006\t"}, d2 = {"Lc66;", "Lcom/google/android/gms/maps/model/LatLngBounds;", c.a, "b", "", "lonWest", "lonEast", "", "a", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: d66  reason: default package */
/* loaded from: classes4.dex */
public final class d66 {
    private static final boolean a(double d, double d2) {
        int i;
        int i2 = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
        if ((i2 >= 0 && d2 >= 0.0d && d < d2) || ((d < 0.0d && d2 < 0.0d && d < d2) || ((i < 0 && d2 > 0.0d && Math.abs(d) + Math.abs(d2) < 180.0d) || (i2 > 0 && d2 < 0.0d && Math.abs(d) + Math.abs(d2) >= 180.0d)))) {
            return true;
        }
        return false;
    }

    public static final c66 b(c66 c66Var) {
        z65.h(c66Var, "<this>");
        double b = c66Var.d().b();
        double b2 = c66Var.c().b();
        if (b == b2) {
            if (b2 - 1 > -90.0d) {
                b2 -= 1.0d;
            } else {
                b += 1.0d;
            }
        }
        if (b < b2) {
            double d = b;
            b = b2;
            b2 = d;
        }
        double c = c66Var.d().c();
        double c2 = c66Var.c().c();
        if (c == c2) {
            if (1 + c2 < 180.0d) {
                c2 += 1.0d;
            } else {
                c -= 1.0d;
            }
        }
        if (!a(c, c2)) {
            double d2 = c;
            c = c2;
            c2 = d2;
        }
        return c66Var.b(c66Var.d().a(b, c), c66Var.c().a(b2, c2));
    }

    public static final LatLngBounds c(c66 c66Var) {
        z65.h(c66Var, "<this>");
        return new LatLngBounds(new LatLng(c66Var.c().b(), c66Var.d().c()), new LatLng(c66Var.d().b(), c66Var.c().c()));
    }
}
