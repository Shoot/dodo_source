package defpackage;

import android.content.res.Configuration;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: AndroidComposeView.android.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a!\u0010\u0007\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a5\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\"\u0018\u0010\u0013\u001a\u00020\u0002*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"", "layoutDirection", "Lqm5;", e.a, "Loa6;", "other", "", "f", "([F[F)V", "m1", "row", "m2", "column", "", c.a, "([FI[FI)F", "Landroid/content/res/Configuration;", DateTokenConverter.CONVERTER_KEY, "(Landroid/content/res/Configuration;)Lqm5;", "localeLayoutDirection", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: og  reason: default package */
/* loaded from: classes.dex */
public final class og {
    private static final float c(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3] * fArr2[i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 3] * fArr2[12 + i2]);
    }

    public static final qm5 d(Configuration configuration) {
        z65.h(configuration, "<this>");
        return e(configuration.getLayoutDirection());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qm5 e(int i) {
        if (i != 0) {
            if (i != 1) {
                return qm5.Ltr;
            }
            return qm5.Rtl;
        }
        return qm5.Ltr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(float[] fArr, float[] fArr2) {
        float c = c(fArr2, 0, fArr, 0);
        float c2 = c(fArr2, 0, fArr, 1);
        float c3 = c(fArr2, 0, fArr, 2);
        float c4 = c(fArr2, 0, fArr, 3);
        float c5 = c(fArr2, 1, fArr, 0);
        float c6 = c(fArr2, 1, fArr, 1);
        float c7 = c(fArr2, 1, fArr, 2);
        float c8 = c(fArr2, 1, fArr, 3);
        float c9 = c(fArr2, 2, fArr, 0);
        float c10 = c(fArr2, 2, fArr, 1);
        float c11 = c(fArr2, 2, fArr, 2);
        float c12 = c(fArr2, 2, fArr, 3);
        float c13 = c(fArr2, 3, fArr, 0);
        float c14 = c(fArr2, 3, fArr, 1);
        float c15 = c(fArr2, 3, fArr, 2);
        float c16 = c(fArr2, 3, fArr, 3);
        fArr[0] = c;
        fArr[1] = c2;
        fArr[2] = c3;
        fArr[3] = c4;
        fArr[4] = c5;
        fArr[5] = c6;
        fArr[6] = c7;
        fArr[7] = c8;
        fArr[8] = c9;
        fArr[9] = c10;
        fArr[10] = c11;
        fArr[11] = c12;
        fArr[12] = c13;
        fArr[13] = c14;
        fArr[14] = c15;
        fArr[15] = c16;
    }
}
