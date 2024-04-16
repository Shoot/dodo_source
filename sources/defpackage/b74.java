package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.IOException;
/* compiled from: FrameBitmapTranscoder.java */
/* renamed from: b74  reason: default package */
/* loaded from: classes.dex */
class b74 implements ck9<h74, Bitmap> {
    private final gc0 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b74(gc0 gc0Var) {
        this.a = gc0Var;
    }

    @Override // defpackage.ck9
    public nj9<Bitmap> a(@NonNull nj9<h74> nj9Var, @NonNull ac7 ac7Var) {
        try {
            return ic0.e(nj9Var.get().u(0), this.a);
        } catch (IOException e) {
            Log.e("FrameBitmapTranscoder", "error in transcode", e);
            return null;
        }
    }
}
