package defpackage;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;
/* compiled from: RelativeCornerSize.java */
/* renamed from: sc9  reason: default package */
/* loaded from: classes2.dex */
public final class sc9 implements dx1 {
    private final float a;

    public sc9(float f) {
        this.a = f;
    }

    @Override // defpackage.dx1
    public float a(@NonNull RectF rectF) {
        return this.a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof sc9) && this.a == ((sc9) obj).a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
