package defpackage;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.Writer;
/* compiled from: DataEncoder.java */
/* renamed from: tk2  reason: default package */
/* loaded from: classes2.dex */
public interface tk2 {
    void a(@NonNull Object obj, @NonNull Writer writer) throws IOException;

    @NonNull
    String encode(@NonNull Object obj);
}
