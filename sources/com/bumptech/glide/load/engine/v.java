package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.f;
import defpackage.mm6;
import defpackage.uk2;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SourceGenerator.java */
/* loaded from: classes.dex */
public class v implements f, f.a {
    private final g<?> a;
    private final f.a b;
    private volatile int c;
    private volatile c d;
    private volatile Object e;
    private volatile mm6.a<?> f;
    private volatile d g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SourceGenerator.java */
    /* loaded from: classes.dex */
    public class a implements uk2.a<Object> {
        final /* synthetic */ mm6.a a;

        a(mm6.a aVar) {
            this.a = aVar;
        }

        @Override // defpackage.uk2.a
        public void c(@NonNull Exception exc) {
            if (v.this.e(this.a)) {
                v.this.g(this.a, exc);
            }
        }

        @Override // defpackage.uk2.a
        public void f(Object obj) {
            if (v.this.e(this.a)) {
                v.this.f(this.a, obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(g<?> gVar, f.a aVar) {
        this.a = gVar;
        this.b = aVar;
    }

    private boolean c(Object obj) throws IOException {
        long b = hx5.b();
        boolean z = false;
        try {
            com.bumptech.glide.load.data.a<T> o = this.a.o(obj);
            Object a2 = o.a();
            bh3<X> q = this.a.q(a2);
            e eVar = new e(q, a2, this.a.k());
            d dVar = new d(this.f.a, this.a.p());
            b33 d = this.a.d();
            d.b(dVar, eVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + dVar + ", data: " + obj + ", encoder: " + q + ", duration: " + hx5.a(b));
            }
            if (d.a(dVar) != null) {
                this.g = dVar;
                this.d = new c(Collections.singletonList(this.f.a), this.a, this);
                this.f.c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.g + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.b.h(this.f.a, o.a(), this.f.c, this.f.c.e(), this.f.a);
                return false;
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    this.f.c.b();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean d() {
        if (this.c < this.a.g().size()) {
            return true;
        }
        return false;
    }

    private void j(mm6.a<?> aVar) {
        this.f.c.d(this.a.l(), new a(aVar));
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void a(se5 se5Var, Exception exc, uk2<?> uk2Var, dl2 dl2Var) {
        this.b.a(se5Var, exc, uk2Var, this.f.c.e());
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean b() {
        if (this.e != null) {
            Object obj = this.e;
            this.e = null;
            try {
                if (!c(obj)) {
                    return true;
                }
            } catch (IOException e) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e);
                }
            }
        }
        if (this.d != null && this.d.b()) {
            return true;
        }
        this.d = null;
        this.f = null;
        boolean z = false;
        while (!z && d()) {
            List<mm6.a<?>> g = this.a.g();
            int i = this.c;
            this.c = i + 1;
            this.f = g.get(i);
            if (this.f != null && (this.a.e().c(this.f.c.e()) || this.a.u(this.f.c.a()))) {
                j(this.f);
                z = true;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        mm6.a<?> aVar = this.f;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    boolean e(mm6.a<?> aVar) {
        mm6.a<?> aVar2 = this.f;
        if (aVar2 != null && aVar2 == aVar) {
            return true;
        }
        return false;
    }

    void f(mm6.a<?> aVar, Object obj) {
        d33 e = this.a.e();
        if (obj != null && e.c(aVar.c.e())) {
            this.e = obj;
            this.b.i();
            return;
        }
        f.a aVar2 = this.b;
        se5 se5Var = aVar.a;
        uk2<?> uk2Var = aVar.c;
        aVar2.h(se5Var, obj, uk2Var, uk2Var.e(), this.g);
    }

    void g(mm6.a<?> aVar, @NonNull Exception exc) {
        f.a aVar2 = this.b;
        d dVar = this.g;
        uk2<?> uk2Var = aVar.c;
        aVar2.a(dVar, exc, uk2Var, uk2Var.e());
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void h(se5 se5Var, Object obj, uk2<?> uk2Var, dl2 dl2Var, se5 se5Var2) {
        this.b.h(se5Var, obj, uk2Var, this.f.c.e(), se5Var);
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void i() {
        throw new UnsupportedOperationException();
    }
}
