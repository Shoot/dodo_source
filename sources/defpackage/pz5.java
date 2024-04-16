package defpackage;

import androidx.annotation.NonNull;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: LottieFetchResult.java */
/* renamed from: pz5  reason: default package */
/* loaded from: classes.dex */
public interface pz5 extends Closeable {
    String f();

    String g();

    @NonNull
    InputStream i0() throws IOException;

    boolean isSuccessful();
}
