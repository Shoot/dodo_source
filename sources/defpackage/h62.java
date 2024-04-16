package defpackage;

import androidx.annotation.NonNull;
/* compiled from: CutCornerTreatment.java */
/* renamed from: h62  reason: default package */
/* loaded from: classes2.dex */
public class h62 extends gx1 {
    float a = -1.0f;

    @Override // defpackage.gx1
    public void a(@NonNull hha hhaVar, float f, float f2, float f3) {
        hhaVar.o(0.0f, f3 * f2, 180.0f, 180.0f - f);
        double d = f3;
        double d2 = f2;
        hhaVar.m((float) (Math.sin(Math.toRadians(f)) * d * d2), (float) (Math.sin(Math.toRadians(90.0f - f)) * d * d2));
    }
}
