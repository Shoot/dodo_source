package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: BasicIntQueueSubscription.java */
/* renamed from: l90  reason: default package */
/* loaded from: classes3.dex */
public abstract class l90<T> extends AtomicInteger implements dv8<T> {
    @Override // defpackage.rla
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
