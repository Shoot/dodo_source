package defpackage;

import androidx.annotation.NonNull;
/* compiled from: OffsetEdgeTreatment.java */
/* renamed from: w67  reason: default package */
/* loaded from: classes2.dex */
public final class w67 extends zc3 {
    private final zc3 a;
    private final float b;

    public w67(@NonNull zc3 zc3Var, float f) {
        this.a = zc3Var;
        this.b = f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.zc3
    public boolean b() {
        return this.a.b();
    }

    @Override // defpackage.zc3
    public void c(float f, float f2, float f3, @NonNull hha hhaVar) {
        this.a.c(f, f2 - this.b, f3, hhaVar);
    }
}
