package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: NamedThreadFactory.java */
/* renamed from: qs6  reason: default package */
/* loaded from: classes3.dex */
public class qs6 implements ThreadFactory {
    private final ThreadFactory a = Executors.defaultThreadFactory();
    private final AtomicInteger b = new AtomicInteger(1);
    private final String c;

    public qs6(String str) {
        this.c = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread newThread = this.a.newThread(runnable);
        newThread.setName(this.c + "-" + this.b);
        return newThread;
    }
}
