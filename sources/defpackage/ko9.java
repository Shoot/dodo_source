package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: RoundedCornerShape.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u001b\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b\u001a;\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\"\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lex1;", "corner", "Ljo9;", "b", "Li73;", "size", c.a, "(F)Ljo9;", "", "percent", "a", "topStart", "topEnd", "bottomEnd", "bottomStart", DateTokenConverter.CONVERTER_KEY, "(FFFF)Ljo9;", "Ljo9;", "getCircleShape", "()Ljo9;", "CircleShape", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: ko9  reason: default package */
/* loaded from: classes.dex */
public final class ko9 {
    private static final jo9 a = a(50);

    public static final jo9 a(int i) {
        return b(fx1.a(i));
    }

    public static final jo9 b(ex1 ex1Var) {
        z65.h(ex1Var, "corner");
        return new jo9(ex1Var, ex1Var, ex1Var, ex1Var);
    }

    public static final jo9 c(float f) {
        return b(fx1.b(f));
    }

    public static final jo9 d(float f, float f2, float f3, float f4) {
        return new jo9(fx1.b(f), fx1.b(f2), fx1.b(f3), fx1.b(f4));
    }

    public static /* synthetic */ jo9 e(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = i73.o(0);
        }
        if ((i & 2) != 0) {
            f2 = i73.o(0);
        }
        if ((i & 4) != 0) {
            f3 = i73.o(0);
        }
        if ((i & 8) != 0) {
            f4 = i73.o(0);
        }
        return d(f, f2, f3, f4);
    }
}
