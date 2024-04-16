package defpackage;

import androidx.annotation.NonNull;
/* compiled from: RoundedCornerTreatment.java */
/* renamed from: lo9  reason: default package */
/* loaded from: classes2.dex */
public class lo9 extends gx1 {
    float a = -1.0f;

    @Override // defpackage.gx1
    public void a(@NonNull hha hhaVar, float f, float f2, float f3) {
        hhaVar.o(0.0f, f3 * f2, 180.0f, 180.0f - f);
        float f4 = f3 * 2.0f * f2;
        hhaVar.a(0.0f, 0.0f, f4, f4, 180.0f, f);
    }
}
