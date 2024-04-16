package defpackage;

import defpackage.ja1;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: AbstractAlgorithm.java */
/* renamed from: v0  reason: default package */
/* loaded from: classes.dex */
public abstract class v0<T extends ja1> implements db<T> {
    private final ReadWriteLock a = new ReentrantReadWriteLock();

    @Override // defpackage.db
    public void lock() {
        this.a.writeLock().lock();
    }

    @Override // defpackage.db
    public void unlock() {
        this.a.writeLock().unlock();
    }
}
