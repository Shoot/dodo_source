package defpackage;

import defpackage.ja1;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: PreCachingAlgorithmDecorator.java */
/* renamed from: gg8  reason: default package */
/* loaded from: classes.dex */
public class gg8<T extends ja1> extends v0<T> {
    private final db<T> b;
    private final j36<Integer, Set<? extends ia1<T>>> c = new j36<>(5);
    private final ReadWriteLock d = new ReentrantReadWriteLock();

    /* compiled from: PreCachingAlgorithmDecorator.java */
    /* renamed from: gg8$a */
    /* loaded from: classes.dex */
    private class a implements Runnable {
        private final int a;

        public a(int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep((long) ((Math.random() * 500.0d) + 500.0d));
            } catch (InterruptedException unused) {
            }
            gg8.this.i(this.a);
        }
    }

    public gg8(db<T> dbVar) {
        this.b = dbVar;
    }

    private void h() {
        this.c.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Set<? extends ia1<T>> i(int i) {
        this.d.readLock().lock();
        Set<? extends ia1<T>> d = this.c.d(Integer.valueOf(i));
        this.d.readLock().unlock();
        if (d == null) {
            this.d.writeLock().lock();
            d = this.c.d(Integer.valueOf(i));
            if (d == null) {
                d = this.b.e(i);
                this.c.e(Integer.valueOf(i), d);
            }
            this.d.writeLock().unlock();
        }
        return d;
    }

    @Override // defpackage.db
    public boolean b(Collection<T> collection) {
        boolean b = this.b.b(collection);
        if (b) {
            h();
        }
        return b;
    }

    @Override // defpackage.db
    public void c() {
        this.b.c();
        h();
    }

    @Override // defpackage.db
    public Set<? extends ia1<T>> e(float f) {
        int i = (int) f;
        Set<? extends ia1<T>> i2 = i(i);
        int i3 = i + 1;
        if (this.c.d(Integer.valueOf(i3)) == null) {
            new Thread(new a(i3)).start();
        }
        int i4 = i - 1;
        if (this.c.d(Integer.valueOf(i4)) == null) {
            new Thread(new a(i4)).start();
        }
        return i2;
    }

    @Override // defpackage.db
    public int f() {
        return this.b.f();
    }
}
