package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
/* compiled from: BaseProgressIndicatorSpec.java */
/* loaded from: classes2.dex */
public abstract class b {
    public int a;
    public int b;
    @NonNull
    public int[] c = new int[0];
    public int d;
    public int e;
    public int f;

    /* JADX INFO: Access modifiers changed from: protected */
    public b(@NonNull Context context, AttributeSet attributeSet, int i, int i2) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(ww8.mtrl_progress_track_thickness);
        TypedArray h = sdb.h(context, attributeSet, b29.Q, i, i2, new int[0]);
        this.a = ea6.d(context, h, b29.Y, dimensionPixelSize);
        this.b = Math.min(ea6.d(context, h, b29.X, 0), this.a / 2);
        this.e = h.getInt(b29.U, 0);
        this.f = h.getInt(b29.R, 0);
        c(context, h);
        d(context, h);
        h.recycle();
    }

    private void c(@NonNull Context context, @NonNull TypedArray typedArray) {
        int i = b29.S;
        if (!typedArray.hasValue(i)) {
            this.c = new int[]{ba6.b(context, qv8.o, -1)};
        } else if (typedArray.peekValue(i).type != 1) {
            this.c = new int[]{typedArray.getColor(i, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i, -1));
            this.c = intArray;
            if (intArray.length != 0) {
                return;
            }
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    private void d(@NonNull Context context, @NonNull TypedArray typedArray) {
        int i = b29.W;
        if (typedArray.hasValue(i)) {
            this.d = typedArray.getColor(i, -1);
            return;
        }
        this.d = this.c[0];
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16842803});
        float f = obtainStyledAttributes.getFloat(0, 0.2f);
        obtainStyledAttributes.recycle();
        this.d = ba6.a(this.d, (int) (f * 255.0f));
    }

    public boolean a() {
        if (this.f != 0) {
            return true;
        }
        return false;
    }

    public boolean b() {
        if (this.e != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void e();
}
