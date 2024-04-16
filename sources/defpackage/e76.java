package defpackage;

import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: MapTileCache.java */
/* renamed from: e76  reason: default package */
/* loaded from: classes3.dex */
public class e76 {
    private final HashMap<Long, Drawable> a;
    private final y66 b;
    private final b76 c;
    private final l76 d;
    private final List<a76> e;
    private int f;
    private final n76 g;
    private final List<f76> h;
    private boolean i;
    private boolean j;

    /* compiled from: MapTileCache.java */
    /* renamed from: e76$a */
    /* loaded from: classes3.dex */
    public interface a {
    }

    public e76() {
        this(dq1.a().q());
    }

    private void l(l76 l76Var) {
        synchronized (this.a) {
            try {
                l76Var.b(this.a.size());
                l76Var.a();
                for (Long l : this.a.keySet()) {
                    l76Var.f(l.longValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void n() {
        y66 y66Var;
        int i = 0;
        for (a76 a76Var : this.e) {
            if (i < this.c.f().size()) {
                y66Var = this.c.f().get(i);
            } else {
                y66Var = new y66();
                this.c.f().add(y66Var);
            }
            a76Var.a(this.b, y66Var);
            i++;
        }
        while (i < this.c.f().size()) {
            this.c.f().remove(this.c.f().size() - 1);
        }
    }

    private boolean r(long j) {
        if (this.b.d(j) || this.c.d(j)) {
            return true;
        }
        for (f76 f76Var : this.h) {
            if (f76Var.d(j)) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        l76 l76Var = new l76();
        l(l76Var);
        for (int i = 0; i < l76Var.e(); i++) {
            o(l76Var.c(i));
        }
        this.a.clear();
    }

    public boolean b(int i) {
        if (this.f < i) {
            Log.i("OsmDroid", "Tile cache increased from " + this.f + " to " + i);
            this.f = i;
            return true;
        }
        return false;
    }

    public void c() {
        int i;
        int size = this.a.size();
        if (!this.j) {
            i = size - this.f;
            if (i <= 0) {
                return;
            }
        } else {
            i = Integer.MAX_VALUE;
        }
        n();
        if (this.i && b(this.b.size() + this.c.size()) && !this.j && (i = size - this.f) <= 0) {
            return;
        }
        l(this.d);
        for (int i2 = 0; i2 < this.d.e(); i2++) {
            long c = this.d.c(i2);
            if (!r(c)) {
                o(c);
                i--;
                if (i == 0) {
                    return;
                }
            }
        }
    }

    public b76 d() {
        return this.c;
    }

    public Drawable e(long j) {
        Drawable drawable;
        synchronized (this.a) {
            drawable = this.a.get(Long.valueOf(j));
        }
        return drawable;
    }

    public y66 f() {
        return this.b;
    }

    public n76 g() {
        return this.g;
    }

    public List<a76> h() {
        return this.e;
    }

    public List<f76> i() {
        return this.h;
    }

    public a j() {
        return null;
    }

    public void k() {
        c();
        this.g.d();
    }

    public void m(long j, Drawable drawable) {
        if (drawable != null) {
            synchronized (this.a) {
                this.a.put(Long.valueOf(j), drawable);
            }
        }
    }

    protected void o(long j) {
        Drawable remove;
        synchronized (this.a) {
            remove = this.a.remove(Long.valueOf(j));
        }
        j();
        fc0.d().c(remove);
    }

    public void p(boolean z) {
        this.i = z;
    }

    public void q(boolean z) {
        this.j = z;
    }

    public e76(int i) {
        this.a = new HashMap<>();
        this.b = new y66();
        this.c = new b76();
        this.d = new l76();
        this.e = new ArrayList();
        this.h = new ArrayList();
        b(i);
        this.g = new n76(this);
    }
}
