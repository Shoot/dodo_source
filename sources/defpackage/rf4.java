package defpackage;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
/* compiled from: GifFrameResourceDecoder.java */
/* renamed from: rf4  reason: default package */
/* loaded from: classes.dex */
public final class rf4 implements rj9<jf4, Bitmap> {
    private final gc0 a;

    public rf4(gc0 gc0Var) {
        this.a = gc0Var;
    }

    @Override // defpackage.rj9
    /* renamed from: c */
    public nj9<Bitmap> b(@NonNull jf4 jf4Var, int i, int i2, @NonNull ac7 ac7Var) {
        return ic0.e(jf4Var.a(), this.a);
    }

    @Override // defpackage.rj9
    /* renamed from: d */
    public boolean a(@NonNull jf4 jf4Var, @NonNull ac7 ac7Var) {
        return true;
    }
}
