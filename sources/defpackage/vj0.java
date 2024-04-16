package defpackage;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: ByteBufferEncoder.java */
/* renamed from: vj0  reason: default package */
/* loaded from: classes.dex */
public class vj0 implements bh3<ByteBuffer> {
    @Override // defpackage.bh3
    /* renamed from: c */
    public boolean a(@NonNull ByteBuffer byteBuffer, @NonNull File file, @NonNull ac7 ac7Var) {
        try {
            ck0.f(byteBuffer, file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e);
            }
            return false;
        }
    }
}
