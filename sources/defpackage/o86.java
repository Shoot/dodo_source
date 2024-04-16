package defpackage;

import androidx.annotation.NonNull;
/* compiled from: MarkerEdgeTreatment.java */
/* renamed from: o86  reason: default package */
/* loaded from: classes2.dex */
public final class o86 extends zc3 {
    private final float a;

    public o86(float f) {
        this.a = f - 0.001f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.zc3
    public boolean b() {
        return true;
    }

    @Override // defpackage.zc3
    public void c(float f, float f2, float f3, @NonNull hha hhaVar) {
        float sqrt = (float) ((this.a * Math.sqrt(2.0d)) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow(this.a, 2.0d) - Math.pow(sqrt, 2.0d));
        hhaVar.n(f2 - sqrt, ((float) (-((this.a * Math.sqrt(2.0d)) - this.a))) + sqrt2);
        hhaVar.m(f2, (float) (-((this.a * Math.sqrt(2.0d)) - this.a)));
        hhaVar.m(f2 + sqrt, ((float) (-((this.a * Math.sqrt(2.0d)) - this.a))) + sqrt2);
    }
}
