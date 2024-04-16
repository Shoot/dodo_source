package io.realm.internal;

import java.lang.ref.ReferenceQueue;
/* compiled from: NativeContext.java */
/* loaded from: classes3.dex */
public class c {
    private static final ReferenceQueue<ku6> a;
    private static final Thread b;
    public static final c c;

    static {
        ReferenceQueue<ku6> referenceQueue = new ReferenceQueue<>();
        a = referenceQueue;
        Thread thread = new Thread(new b(referenceQueue));
        b = thread;
        c = new c();
        thread.setName("RealmFinalizingDaemon");
        thread.start();
    }

    public void a(ku6 ku6Var) {
        new NativeObjectReference(this, ku6Var, a);
    }
}
