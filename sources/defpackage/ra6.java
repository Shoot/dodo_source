package defpackage;

import kotlin.Metadata;
/* compiled from: Matrix.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0004"}, d2 = {"Loa6;", "", "a", "([F)Z", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: ra6  reason: default package */
/* loaded from: classes.dex */
public final class ra6 {
    public static final boolean a(float[] fArr) {
        float f;
        z65.h(fArr, "$this$isIdentity");
        for (int i = 0; i < 4; i++) {
            for (int i2 = 0; i2 < 4; i2++) {
                if (i == i2) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                if (fArr[(i * 4) + i2] != f) {
                    return false;
                }
            }
        }
        return true;
    }
}
