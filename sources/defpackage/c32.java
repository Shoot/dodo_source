package defpackage;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import androidx.annotation.NonNull;
/* compiled from: CubicCurveData.java */
/* renamed from: c32  reason: default package */
/* loaded from: classes.dex */
public class c32 {
    private final PointF a;
    private final PointF b;
    private final PointF c;

    public c32() {
        this.a = new PointF();
        this.b = new PointF();
        this.c = new PointF();
    }

    public PointF a() {
        return this.a;
    }

    public PointF b() {
        return this.b;
    }

    public PointF c() {
        return this.c;
    }

    public void d(float f, float f2) {
        this.a.set(f, f2);
    }

    public void e(float f, float f2) {
        this.b.set(f, f2);
    }

    public void f(float f, float f2) {
        this.c.set(f, f2);
    }

    @NonNull
    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.c.x), Float.valueOf(this.c.y), Float.valueOf(this.a.x), Float.valueOf(this.a.y), Float.valueOf(this.b.x), Float.valueOf(this.b.y));
    }

    public c32(PointF pointF, PointF pointF2, PointF pointF3) {
        this.a = pointF;
        this.b = pointF2;
        this.c = pointF3;
    }
}
