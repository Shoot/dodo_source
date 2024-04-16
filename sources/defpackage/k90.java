package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: BasicIntQueueDisposable.java */
/* renamed from: k90  reason: default package */
/* loaded from: classes3.dex */
public abstract class k90<T> extends AtomicInteger implements yu8<T> {
    @Override // defpackage.rla
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
