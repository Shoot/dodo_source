package defpackage;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;
/* compiled from: AdjustedCornerSize.java */
/* renamed from: k9  reason: default package */
/* loaded from: classes2.dex */
public final class k9 implements dx1 {
    private final dx1 a;
    private final float b;

    public k9(float f, @NonNull dx1 dx1Var) {
        while (dx1Var instanceof k9) {
            dx1Var = ((k9) dx1Var).a;
            f += ((k9) dx1Var).b;
        }
        this.a = dx1Var;
        this.b = f;
    }

    @Override // defpackage.dx1
    public float a(@NonNull RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9)) {
            return false;
        }
        k9 k9Var = (k9) obj;
        if (this.a.equals(k9Var.a) && this.b == k9Var.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
