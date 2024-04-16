package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.bumptech.glide.g;
import com.bumptech.glide.h;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GifFrameLoader.java */
/* renamed from: qf4  reason: default package */
/* loaded from: classes.dex */
public class qf4 {
    private final jf4 a;
    private final Handler b;
    private final List<b> c;
    final h d;
    private final gc0 e;
    private boolean f;
    private boolean g;
    private boolean h;
    private g<Bitmap> i;
    private a j;
    private boolean k;
    private a l;
    private Bitmap m;
    private tkb<Bitmap> n;
    private a o;
    private int p;
    private int q;
    private int r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GifFrameLoader.java */
    /* renamed from: qf4$a */
    /* loaded from: classes.dex */
    public static class a extends k42<Bitmap> {
        private final Handler d;
        final int e;
        private final long f;
        private Bitmap g;

        a(Handler handler, int i, long j) {
            this.d = handler;
            this.e = i;
            this.f = j;
        }

        Bitmap e() {
            return this.g;
        }

        @Override // defpackage.n6b
        /* renamed from: f */
        public void d(@NonNull Bitmap bitmap, dlb<? super Bitmap> dlbVar) {
            this.g = bitmap;
            this.d.sendMessageAtTime(this.d.obtainMessage(1, this), this.f);
        }

        @Override // defpackage.n6b
        public void i(Drawable drawable) {
            this.g = null;
        }
    }

    /* compiled from: GifFrameLoader.java */
    /* renamed from: qf4$b */
    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* compiled from: GifFrameLoader.java */
    /* renamed from: qf4$c */
    /* loaded from: classes.dex */
    private class c implements Handler.Callback {
        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                qf4.this.m((a) message.obj);
                return true;
            } else if (i == 2) {
                qf4.this.d.m((a) message.obj);
                return false;
            } else {
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public qf4(com.bumptech.glide.b bVar, jf4 jf4Var, int i, int i2, tkb<Bitmap> tkbVar, Bitmap bitmap) {
        this(bVar.f(), com.bumptech.glide.b.t(bVar.h()), jf4Var, null, i(com.bumptech.glide.b.t(bVar.h()), i, i2), tkbVar, bitmap);
    }

    private static se5 g() {
        return new e57(Double.valueOf(Math.random()));
    }

    private static g<Bitmap> i(h hVar, int i, int i2) {
        return hVar.f().b(xi9.v0(d33.b).t0(true).j0(true).Z(i, i2));
    }

    private void l() {
        boolean z;
        if (this.f && !this.g) {
            if (this.h) {
                if (this.o == null) {
                    z = true;
                } else {
                    z = false;
                }
                eh8.a(z, "Pending target must be null when starting from the first frame");
                this.a.f();
                this.h = false;
            }
            a aVar = this.o;
            if (aVar != null) {
                this.o = null;
                m(aVar);
                return;
            }
            this.g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + this.a.e();
            this.a.b();
            this.l = new a(this.b, this.a.g(), uptimeMillis);
            this.i.b(xi9.w0(g())).L0(this.a).D0(this.l);
        }
    }

    private void n() {
        Bitmap bitmap = this.m;
        if (bitmap != null) {
            this.e.c(bitmap);
            this.m = null;
        }
    }

    private void p() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.k = false;
        l();
    }

    private void q() {
        this.f = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.c.clear();
        n();
        q();
        a aVar = this.j;
        if (aVar != null) {
            this.d.m(aVar);
            this.j = null;
        }
        a aVar2 = this.l;
        if (aVar2 != null) {
            this.d.m(aVar2);
            this.l = null;
        }
        a aVar3 = this.o;
        if (aVar3 != null) {
            this.d.m(aVar3);
            this.o = null;
        }
        this.a.clear();
        this.k = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ByteBuffer b() {
        return this.a.getData().asReadOnlyBuffer();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bitmap c() {
        a aVar = this.j;
        if (aVar != null) {
            return aVar.e();
        }
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        a aVar = this.j;
        if (aVar != null) {
            return aVar.e;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bitmap e() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.a.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h() {
        return this.r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return this.a.h() + this.p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        return this.q;
    }

    void m(a aVar) {
        this.g = false;
        if (this.k) {
            this.b.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f) {
            if (this.h) {
                this.b.obtainMessage(2, aVar).sendToTarget();
            } else {
                this.o = aVar;
            }
        } else {
            if (aVar.e() != null) {
                n();
                a aVar2 = this.j;
                this.j = aVar;
                for (int size = this.c.size() - 1; size >= 0; size--) {
                    this.c.get(size).a();
                }
                if (aVar2 != null) {
                    this.b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            l();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(tkb<Bitmap> tkbVar, Bitmap bitmap) {
        this.n = (tkb) eh8.d(tkbVar);
        this.m = (Bitmap) eh8.d(bitmap);
        this.i = this.i.b(new xi9().o0(tkbVar));
        this.p = vub.i(bitmap);
        this.q = bitmap.getWidth();
        this.r = bitmap.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(b bVar) {
        if (!this.k) {
            if (!this.c.contains(bVar)) {
                boolean isEmpty = this.c.isEmpty();
                this.c.add(bVar);
                if (isEmpty) {
                    p();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(b bVar) {
        this.c.remove(bVar);
        if (this.c.isEmpty()) {
            q();
        }
    }

    qf4(gc0 gc0Var, h hVar, jf4 jf4Var, Handler handler, g<Bitmap> gVar, tkb<Bitmap> tkbVar, Bitmap bitmap) {
        this.c = new ArrayList();
        this.d = hVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.e = gc0Var;
        this.b = handler;
        this.i = gVar;
        this.a = jf4Var;
        o(tkbVar, bitmap);
    }
}
