package defpackage;

import im.threads.ui.core.ThreadsLib;
/* compiled from: ThreadsLibDomainModule_ProvideThreadsLib$chat_releaseFactory.java */
/* renamed from: seb  reason: default package */
/* loaded from: classes.dex */
public final class seb implements no3<ThreadsLib> {

    /* compiled from: ThreadsLibDomainModule_ProvideThreadsLib$chat_releaseFactory.java */
    /* renamed from: seb$a */
    /* loaded from: classes.dex */
    private static final class a {
        private static final seb a = new seb();
    }

    public static seb a() {
        return a.a;
    }

    public static ThreadsLib c() {
        return (ThreadsLib) jh8.e(peb.a.c());
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ThreadsLib get() {
        return c();
    }
}
