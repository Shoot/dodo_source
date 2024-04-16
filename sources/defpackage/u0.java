package defpackage;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;
/* compiled from: AbsoluteCornerSize.java */
/* renamed from: u0  reason: default package */
/* loaded from: classes2.dex */
public final class u0 implements dx1 {
    private final float a;

    public u0(float f) {
        this.a = f;
    }

    @Override // defpackage.dx1
    public float a(@NonNull RectF rectF) {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof u0) && this.a == ((u0) obj).a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
