package defpackage;

import androidx.annotation.NonNull;
import java.util.Queue;
/* compiled from: ModelCache.java */
/* renamed from: lm6  reason: default package */
/* loaded from: classes.dex */
public class lm6<A, B> {
    private final i36<b<A>, B> a;

    /* compiled from: ModelCache.java */
    /* renamed from: lm6$a */
    /* loaded from: classes.dex */
    class a extends i36<b<A>, B> {
        a(long j) {
            super(j);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.i36
        /* renamed from: n */
        public void j(@NonNull b<A> bVar, B b) {
            bVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ModelCache.java */
    /* renamed from: lm6$b */
    /* loaded from: classes.dex */
    public static final class b<A> {
        private static final Queue<b<?>> d = vub.g(0);
        private int a;
        private int b;
        private A c;

        private b() {
        }

        static <A> b<A> a(A a, int i, int i2) {
            b<A> bVar;
            Queue<b<?>> queue = d;
            synchronized (queue) {
                bVar = (b<A>) queue.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.b(a, i, i2);
            return bVar;
        }

        private void b(A a, int i, int i2) {
            this.c = a;
            this.b = i;
            this.a = i2;
        }

        public void c() {
            Queue<b<?>> queue = d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.b != bVar.b || this.a != bVar.a || !this.c.equals(bVar.c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.c.hashCode();
        }
    }

    public lm6(long j) {
        this.a = new a(j);
    }

    public B a(A a2, int i, int i2) {
        b<A> a3 = b.a(a2, i, i2);
        B g = this.a.g(a3);
        a3.c();
        return g;
    }

    public void b(A a2, int i, int i2, B b2) {
        this.a.k(b.a(a2, i, i2), b2);
    }
}
