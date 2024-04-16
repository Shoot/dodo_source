package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: OnDemandCounter.java */
/* renamed from: w77  reason: default package */
/* loaded from: classes2.dex */
public final class w77 {
    private final AtomicInteger a = new AtomicInteger();
    private final AtomicInteger b = new AtomicInteger();

    public void a() {
        this.b.getAndIncrement();
    }

    public void b() {
        this.a.getAndIncrement();
    }

    public void c() {
        this.b.set(0);
    }
}
