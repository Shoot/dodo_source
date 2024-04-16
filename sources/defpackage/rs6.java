package defpackage;

import androidx.annotation.NonNull;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: rs6  reason: default package */
/* loaded from: classes2.dex */
public class rs6 implements ThreadFactory {
    private final String a;
    private final ThreadFactory b = Executors.defaultThreadFactory();

    public rs6(@NonNull String str) {
        gh8.k(str, "Name must not be null");
        this.a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    @NonNull
    public final Thread newThread(@NonNull Runnable runnable) {
        Thread newThread = this.b.newThread(new cmc(runnable, 0));
        newThread.setName(this.a);
        return newThread;
    }
}
