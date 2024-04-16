package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.annotation.NonNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CalendarStyle.java */
/* loaded from: classes2.dex */
public final class b {
    @NonNull
    final a a;
    @NonNull
    final a b;
    @NonNull
    final a c;
    @NonNull
    final a d;
    @NonNull
    final a e;
    @NonNull
    final a f;
    @NonNull
    final a g;
    @NonNull
    final Paint h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(@NonNull Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(x96.d(context, qv8.materialCalendarStyle, e.class.getCanonicalName()), b29.V3);
        this.a = a.a(context, obtainStyledAttributes.getResourceId(b29.Y3, 0));
        this.g = a.a(context, obtainStyledAttributes.getResourceId(b29.W3, 0));
        this.b = a.a(context, obtainStyledAttributes.getResourceId(b29.X3, 0));
        this.c = a.a(context, obtainStyledAttributes.getResourceId(b29.Z3, 0));
        ColorStateList a = ea6.a(context, obtainStyledAttributes, b29.a4);
        this.d = a.a(context, obtainStyledAttributes.getResourceId(b29.c4, 0));
        this.e = a.a(context, obtainStyledAttributes.getResourceId(b29.b4, 0));
        this.f = a.a(context, obtainStyledAttributes.getResourceId(b29.d4, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
