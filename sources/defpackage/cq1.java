package defpackage;

import java.util.concurrent.ThreadFactory;
/* compiled from: ConfigurablePriorityThreadFactory.java */
/* renamed from: cq1  reason: default package */
/* loaded from: classes3.dex */
public class cq1 implements ThreadFactory {
    private final int a;
    private final String b;

    public cq1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(this.a);
        String str = this.b;
        if (str != null) {
            thread.setName(str);
        }
        return thread;
    }
}
