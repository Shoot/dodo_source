package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: PointerEvent.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0000\u001a\u0014\u0010\b\u001a\u00020\u0007*\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a \u0010\u000b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a!\u0010\u000f\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0013\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Lwd8;", "", "a", "b", c.a, DateTokenConverter.CONVERTER_KEY, "i", "Ls67;", "g", "(Lwd8;)J", "ignoreConsumed", Image.TYPE_HIGH, "(Lwd8;Z)J", "Lw55;", "size", e.a, "(Lwd8;J)Z", "Lcna;", "extendedTouchPadding", "f", "(Lwd8;JJ)Z", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: ld8  reason: default package */
/* loaded from: classes.dex */
public final class ld8 {
    public static final boolean a(wd8 wd8Var) {
        z65.h(wd8Var, "<this>");
        if (!wd8Var.n() && !wd8Var.k() && wd8Var.h()) {
            return true;
        }
        return false;
    }

    public static final boolean b(wd8 wd8Var) {
        z65.h(wd8Var, "<this>");
        if (!wd8Var.k() && wd8Var.h()) {
            return true;
        }
        return false;
    }

    public static final boolean c(wd8 wd8Var) {
        z65.h(wd8Var, "<this>");
        if (!wd8Var.n() && wd8Var.k() && !wd8Var.h()) {
            return true;
        }
        return false;
    }

    public static final boolean d(wd8 wd8Var) {
        z65.h(wd8Var, "<this>");
        if (wd8Var.k() && !wd8Var.h()) {
            return true;
        }
        return false;
    }

    public static final boolean e(wd8 wd8Var, long j) {
        z65.h(wd8Var, "$this$isOutOfBounds");
        long g = wd8Var.g();
        float l = s67.l(g);
        float m = s67.m(g);
        int g2 = w55.g(j);
        int f = w55.f(j);
        if (l >= 0.0f && l <= g2 && m >= 0.0f && m <= f) {
            return false;
        }
        return true;
    }

    public static final boolean f(wd8 wd8Var, long j, long j2) {
        z65.h(wd8Var, "$this$isOutOfBounds");
        if (!ke8.g(wd8Var.l(), ke8.a.d())) {
            return e(wd8Var, j);
        }
        long g = wd8Var.g();
        float l = s67.l(g);
        float m = s67.m(g);
        float g2 = w55.g(j) + cna.i(j2);
        float f = -cna.g(j2);
        float f2 = w55.f(j) + cna.g(j2);
        if (l >= (-cna.i(j2)) && l <= g2 && m >= f && m <= f2) {
            return false;
        }
        return true;
    }

    public static final long g(wd8 wd8Var) {
        z65.h(wd8Var, "<this>");
        return h(wd8Var, false);
    }

    private static final long h(wd8 wd8Var, boolean z) {
        long p = s67.p(wd8Var.g(), wd8Var.j());
        if (!z && wd8Var.n()) {
            return s67.b.c();
        }
        return p;
    }

    public static final boolean i(wd8 wd8Var) {
        z65.h(wd8Var, "<this>");
        return !s67.i(h(wd8Var, true), s67.b.c());
    }
}
