package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
/* compiled from: RoundRect.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a6\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000\u001a;\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aC\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u0018\u001a\u00020\u0015*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"", ElementGenerator.TEXT_ALIGN_LEFT, "top", ElementGenerator.TEXT_ALIGN_RIGHT, "bottom", "radiusX", "radiusY", "Lgo9;", "a", "Lbx1;", "cornerRadius", c.a, "(FFFFJ)Lgo9;", "Lk99;", "rect", "topLeft", "topRight", "bottomRight", "bottomLeft", "b", "(Lk99;JJJJ)Lgo9;", "", DateTokenConverter.CONVERTER_KEY, "(Lgo9;)Z", "isSimple", "ui-geometry_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: ho9  reason: default package */
/* loaded from: classes.dex */
public final class ho9 {
    public static final go9 a(float f, float f2, float f3, float f4, float f5, float f6) {
        long a = cx1.a(f5, f6);
        return new go9(f, f2, f3, f4, a, a, a, a, null);
    }

    public static final go9 b(k99 k99Var, long j, long j2, long j3, long j4) {
        z65.h(k99Var, "rect");
        return new go9(k99Var.f(), k99Var.i(), k99Var.g(), k99Var.c(), j, j2, j3, j4, null);
    }

    public static final go9 c(float f, float f2, float f3, float f4, long j) {
        return a(f, f2, f3, f4, bx1.d(j), bx1.e(j));
    }

    public static final boolean d(go9 go9Var) {
        z65.h(go9Var, "<this>");
        if (bx1.d(go9Var.h()) == bx1.e(go9Var.h()) && bx1.d(go9Var.h()) == bx1.d(go9Var.i()) && bx1.d(go9Var.h()) == bx1.e(go9Var.i()) && bx1.d(go9Var.h()) == bx1.d(go9Var.c()) && bx1.d(go9Var.h()) == bx1.e(go9Var.c()) && bx1.d(go9Var.h()) == bx1.d(go9Var.b()) && bx1.d(go9Var.h()) == bx1.e(go9Var.b())) {
            return true;
        }
        return false;
    }
}
