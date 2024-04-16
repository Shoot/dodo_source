package defpackage;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TransportRuntimeComponent.java */
/* renamed from: mmb  reason: default package */
/* loaded from: classes2.dex */
public abstract class mmb implements Closeable {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TransportRuntimeComponent.java */
    /* renamed from: mmb$a */
    /* loaded from: classes2.dex */
    public interface a {
        mmb a();

        a b(Context context);
    }

    abstract el3 a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract lmb b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a().close();
    }
}
