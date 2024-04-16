package defpackage;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: MapTilePreCache.java */
/* renamed from: n76  reason: default package */
/* loaded from: classes3.dex */
public class n76 {
    private Iterator<Long> c;
    private final e76 d;
    private final List<m76> a = new ArrayList();
    private final b76 b = new b76();
    private final rc4 e = new rc4(new a());

    /* compiled from: MapTilePreCache.java */
    /* renamed from: n76$a */
    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                long e = n76.this.e();
                if (e != -1) {
                    n76.this.g(e);
                } else {
                    return;
                }
            }
        }
    }

    public n76(e76 e76Var) {
        this.d = e76Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long e() {
        long longValue;
        do {
            synchronized (this.b) {
                try {
                    if (!this.c.hasNext()) {
                        return -1L;
                    }
                    longValue = this.c.next().longValue();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (this.d.e(longValue) != null);
        return longValue;
    }

    private void f() {
        y66 y66Var;
        synchronized (this.b) {
            try {
                int i = 0;
                for (y66 y66Var2 : this.d.d().f()) {
                    if (i < this.b.f().size()) {
                        y66Var = this.b.f().get(i);
                    } else {
                        y66Var = new y66();
                        this.b.f().add(y66Var);
                    }
                    y66Var.G(y66Var2);
                    i++;
                }
                while (i < this.b.f().size()) {
                    this.b.f().remove(this.b.f().size() - 1);
                }
                this.c = this.b.iterator();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(long j) {
        for (m76 m76Var : this.a) {
            if (m76Var instanceof g76) {
                org.osmdroid.tileprovider.tilesource.a t = ((g76) m76Var).t();
                if ((t instanceof da7) && !((da7) t).l().b()) {
                }
            }
            Drawable b = m76Var.h().b(j);
            if (b != null) {
                this.d.m(j, b);
                return;
            }
        }
    }

    public void c(m76 m76Var) {
        this.a.add(m76Var);
    }

    public void d() {
        if (this.e.d()) {
            return;
        }
        f();
        this.e.c();
    }
}
