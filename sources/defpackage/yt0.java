package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: MyersDiff.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0083@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0088\u0001\u000e\u0092\u0001\u00020\rø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lyt0;", "", "", "index", "b", "([II)I", "value", "", DateTokenConverter.CONVERTER_KEY, "([III)V", c.a, "([I)I", "mid", "", "data", "a", "([I)[I", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: yt0  reason: default package */
/* loaded from: classes.dex */
final class yt0 {
    public static int[] a(int[] iArr) {
        z65.h(iArr, "data");
        return iArr;
    }

    public static final int b(int[] iArr, int i) {
        return iArr[i + c(iArr)];
    }

    private static final int c(int[] iArr) {
        return iArr.length / 2;
    }

    public static final void d(int[] iArr, int i, int i2) {
        iArr[i + c(iArr)] = i2;
    }
}
