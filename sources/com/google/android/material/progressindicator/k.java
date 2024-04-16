package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
/* compiled from: LinearProgressIndicatorSpec.java */
/* loaded from: classes2.dex */
public final class k extends b {
    public int g;
    public int h;
    boolean i;

    public k(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, qv8.linearProgressIndicatorStyle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.b
    public void e() {
        if (this.g == 0) {
            if (this.b <= 0) {
                if (this.c.length < 3) {
                    throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
                }
                return;
            }
            throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
        }
    }

    public k(@NonNull Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, LinearProgressIndicator.p);
    }

    public k(@NonNull Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray h = sdb.h(context, attributeSet, b29.n3, qv8.linearProgressIndicatorStyle, LinearProgressIndicator.p, new int[0]);
        this.g = h.getInt(b29.o3, 1);
        this.h = h.getInt(b29.p3, 0);
        h.recycle();
        e();
        this.i = this.h == 1;
    }
}
