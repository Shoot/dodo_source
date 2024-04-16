package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
/* compiled from: ListenableFuture.java */
/* renamed from: kr5  reason: default package */
/* loaded from: classes2.dex */
public interface kr5<V> extends Future<V> {
    void k(Runnable runnable, Executor executor);
}
