package defpackage;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
/* compiled from: GifDrawableEncoder.java */
/* renamed from: mf4  reason: default package */
/* loaded from: classes.dex */
public class mf4 implements uj9<kf4> {
    @Override // defpackage.uj9
    @NonNull
    public xg3 b(@NonNull ac7 ac7Var) {
        return xg3.SOURCE;
    }

    @Override // defpackage.bh3
    /* renamed from: c */
    public boolean a(@NonNull nj9<kf4> nj9Var, @NonNull File file, @NonNull ac7 ac7Var) {
        try {
            ck0.f(nj9Var.get().c(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }
}
