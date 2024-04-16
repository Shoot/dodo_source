package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyersDiff.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0083@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u001bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u000e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0011\u0010\u0010\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\tR\u0014\u0010\u0018\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013\u0088\u0001\u001c\u0092\u0001\u00020\u001bø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lwoa;", "", "Ly55;", "diagonals", "", "a", "([ILy55;)V", "", Image.TYPE_HIGH, "([I)I", "startX", "i", "startY", DateTokenConverter.CONVERTER_KEY, "endX", e.a, "endY", "", "g", "([I)Z", "reverse", c.a, "diagonalSize", "f", "hasAdditionOrRemoval", "j", "isAddition", "", "data", "b", "([I)[I", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: woa  reason: default package */
/* loaded from: classes.dex */
public final class woa {
    public static final void a(int[] iArr, y55 y55Var) {
        z65.h(y55Var, "diagonals");
        if (f(iArr)) {
            if (g(iArr)) {
                y55Var.g(h(iArr), i(iArr), c(iArr));
                return;
            } else if (j(iArr)) {
                y55Var.g(h(iArr), i(iArr) + 1, c(iArr));
                return;
            } else {
                y55Var.g(h(iArr) + 1, i(iArr), c(iArr));
                return;
            }
        }
        y55Var.g(h(iArr), i(iArr), d(iArr) - h(iArr));
    }

    public static int[] b(int[] iArr) {
        z65.h(iArr, "data");
        return iArr;
    }

    public static final int c(int[] iArr) {
        return Math.min(d(iArr) - h(iArr), e(iArr) - i(iArr));
    }

    public static final int d(int[] iArr) {
        return iArr[2];
    }

    public static final int e(int[] iArr) {
        return iArr[3];
    }

    private static final boolean f(int[] iArr) {
        if (e(iArr) - i(iArr) != d(iArr) - h(iArr)) {
            return true;
        }
        return false;
    }

    public static final boolean g(int[] iArr) {
        if (iArr[4] != 0) {
            return true;
        }
        return false;
    }

    public static final int h(int[] iArr) {
        return iArr[0];
    }

    public static final int i(int[] iArr) {
        return iArr[1];
    }

    private static final boolean j(int[] iArr) {
        if (e(iArr) - i(iArr) > d(iArr) - h(iArr)) {
            return true;
        }
        return false;
    }
}
