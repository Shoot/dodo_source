package defpackage;

import java.util.concurrent.atomic.AtomicLong;
/* compiled from: BasicQueueSubscription.java */
/* renamed from: o90  reason: default package */
/* loaded from: classes3.dex */
public abstract class o90<T> extends AtomicLong implements dv8<T> {
    @Override // defpackage.rla
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
