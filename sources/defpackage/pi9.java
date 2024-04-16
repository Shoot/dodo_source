package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import defpackage.gi9;
import defpackage.s58;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: RequestCreator.java */
/* renamed from: pi9  reason: default package */
/* loaded from: classes3.dex */
public class pi9 {
    private static final AtomicInteger m = new AtomicInteger();
    private final s58 a;
    private final gi9.b b;
    private boolean c;
    private boolean d;
    private boolean e;
    private int f;
    private int g;
    private int h;
    private int i;
    private Drawable j;
    private Drawable k;
    private Object l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public pi9(s58 s58Var, Uri uri, int i) {
        this.e = true;
        if (!s58Var.n) {
            this.a = s58Var;
            this.b = new gi9.b(uri, i, s58Var.k);
            return;
        }
        throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
    }

    private gi9 d(long j) {
        int andIncrement = m.getAndIncrement();
        gi9 a = this.b.a();
        a.a = andIncrement;
        a.b = j;
        boolean z = this.a.m;
        if (z) {
            evb.u("Main", "created", a.g(), a.toString());
        }
        gi9 p = this.a.p(a);
        if (p != a) {
            p.a = andIncrement;
            p.b = j;
            if (z) {
                String d = p.d();
                evb.u("Main", "changed", d, "into " + p);
            }
        }
        return p;
    }

    private Drawable h() {
        int i = this.f;
        if (i != 0) {
            return this.a.d.getDrawable(i);
        }
        return this.j;
    }

    public pi9 a() {
        this.b.b(17);
        return this;
    }

    public pi9 b() {
        this.b.c();
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public pi9 c() {
        this.l = null;
        return this;
    }

    public pi9 e(int i) {
        if (i != 0) {
            if (this.k == null) {
                this.g = i;
                return this;
            }
            throw new IllegalStateException("Error image already set.");
        }
        throw new IllegalArgumentException("Error image resource invalid.");
    }

    public pi9 f() {
        this.d = true;
        return this;
    }

    public Bitmap g() throws IOException {
        long nanoTime = System.nanoTime();
        evb.d();
        if (!this.d) {
            if (!this.b.d()) {
                return null;
            }
            gi9 d = d(nanoTime);
            bf4 bf4Var = new bf4(this.a, d, this.h, this.i, this.l, evb.h(d, new StringBuilder()));
            s58 s58Var = this.a;
            return zb0.g(s58Var, s58Var.e, s58Var.f, s58Var.g, bf4Var).t();
        }
        throw new IllegalStateException("Fit cannot be used with get.");
    }

    public void i(@NonNull o6b o6bVar) {
        Bitmap m2;
        long nanoTime = System.nanoTime();
        evb.c();
        if (o6bVar != null) {
            if (!this.d) {
                Drawable drawable = null;
                if (!this.b.d()) {
                    this.a.b(o6bVar);
                    if (this.e) {
                        drawable = h();
                    }
                    o6bVar.onPrepareLoad(drawable);
                    return;
                }
                gi9 d = d(nanoTime);
                String g = evb.g(d);
                if (zc6.a(this.h) && (m2 = this.a.m(g)) != null) {
                    this.a.b(o6bVar);
                    o6bVar.onBitmapLoaded(m2, s58.e.MEMORY);
                    return;
                }
                if (this.e) {
                    drawable = h();
                }
                o6bVar.onPrepareLoad(drawable);
                this.a.g(new q6b(this.a, o6bVar, d, this.h, this.i, this.k, g, this.l, this.g));
                return;
            }
            throw new IllegalStateException("Fit cannot be used with a Target.");
        }
        throw new IllegalArgumentException("Target must not be null.");
    }

    public void j(ImageView imageView) {
        k(imageView, null);
    }

    public void k(ImageView imageView, gm0 gm0Var) {
        Bitmap m2;
        long nanoTime = System.nanoTime();
        evb.c();
        if (imageView != null) {
            if (!this.b.d()) {
                this.a.c(imageView);
                if (this.e) {
                    t58.d(imageView, h());
                    return;
                }
                return;
            }
            if (this.d) {
                if (!this.b.e()) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width != 0 && height != 0) {
                        this.b.g(width, height);
                    } else {
                        if (this.e) {
                            t58.d(imageView, h());
                        }
                        this.a.e(imageView, new rs2(this, imageView, gm0Var));
                        return;
                    }
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            gi9 d = d(nanoTime);
            String g = evb.g(d);
            if (zc6.a(this.h) && (m2 = this.a.m(g)) != null) {
                this.a.c(imageView);
                s58 s58Var = this.a;
                Context context = s58Var.d;
                s58.e eVar = s58.e.MEMORY;
                t58.c(imageView, context, m2, eVar, this.c, s58Var.l);
                if (this.a.m) {
                    String g2 = d.g();
                    evb.u("Main", "completed", g2, "from " + eVar);
                }
                if (gm0Var != null) {
                    gm0Var.onSuccess();
                    return;
                }
                return;
            }
            if (this.e) {
                t58.d(imageView, h());
            }
            this.a.g(new bw4(this.a, imageView, d, this.h, this.i, this.g, this.k, g, this.l, gm0Var, this.c));
            return;
        }
        throw new IllegalArgumentException("Target must not be null.");
    }

    public pi9 l() {
        if (this.f == 0) {
            if (this.j == null) {
                this.e = false;
                return this;
            }
            throw new IllegalStateException("Placeholder image already set.");
        }
        throw new IllegalStateException("Placeholder resource already set.");
    }

    public pi9 m() {
        this.b.f();
        return this;
    }

    public pi9 n(int i, int i2) {
        this.b.g(i, i2);
        return this;
    }

    public pi9 o(int i, int i2) {
        Resources resources = this.a.d.getResources();
        return n(resources.getDimensionPixelSize(i), resources.getDimensionPixelSize(i2));
    }

    public pi9 p(float f) {
        this.b.h(f);
        return this;
    }

    public pi9 q(@NonNull List<? extends skb> list) {
        this.b.j(list);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public pi9 r() {
        this.d = false;
        return this;
    }

    pi9() {
        this.e = true;
        this.a = null;
        this.b = new gi9.b(null, 0, null);
    }
}
