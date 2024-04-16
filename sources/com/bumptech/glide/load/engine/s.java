package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.f;
import defpackage.mm6;
import defpackage.uk2;
import java.io.File;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ResourceCacheGenerator.java */
/* loaded from: classes.dex */
public class s implements f, uk2.a<Object> {
    private final f.a a;
    private final g<?> b;
    private int c;
    private int d = -1;
    private se5 e;
    private List<mm6<File, ?>> f;
    private int g;
    private volatile mm6.a<?> h;
    private File i;
    private t j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(g<?> gVar, f.a aVar) {
        this.b = gVar;
        this.a = aVar;
    }

    private boolean a() {
        if (this.g < this.f.size()) {
            return true;
        }
        return false;
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean b() {
        fg4.a("ResourceCacheGenerator.startNext");
        try {
            List<se5> c = this.b.c();
            boolean z = false;
            if (c.isEmpty()) {
                fg4.e();
                return false;
            }
            List<Class<?>> m = this.b.m();
            if (m.isEmpty()) {
                if (File.class.equals(this.b.r())) {
                    fg4.e();
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.b.i() + " to " + this.b.r());
            }
            while (true) {
                if (this.f != null && a()) {
                    this.h = null;
                    while (!z && a()) {
                        List<mm6<File, ?>> list = this.f;
                        int i = this.g;
                        this.g = i + 1;
                        this.h = list.get(i).b(this.i, this.b.t(), this.b.f(), this.b.k());
                        if (this.h != null && this.b.u(this.h.c.a())) {
                            this.h.c.d(this.b.l(), this);
                            z = true;
                        }
                    }
                    fg4.e();
                    return z;
                }
                int i2 = this.d + 1;
                this.d = i2;
                if (i2 >= m.size()) {
                    int i3 = this.c + 1;
                    this.c = i3;
                    if (i3 >= c.size()) {
                        fg4.e();
                        return false;
                    }
                    this.d = 0;
                }
                se5 se5Var = c.get(this.c);
                Class<?> cls = m.get(this.d);
                this.j = new t(this.b.b(), se5Var, this.b.p(), this.b.t(), this.b.f(), this.b.s(cls), cls, this.b.k());
                File a = this.b.d().a(this.j);
                this.i = a;
                if (a != null) {
                    this.e = se5Var;
                    this.f = this.b.j(a);
                    this.g = 0;
                }
            }
        } catch (Throwable th) {
            fg4.e();
            throw th;
        }
    }

    @Override // defpackage.uk2.a
    public void c(@NonNull Exception exc) {
        this.a.a(this.j, exc, this.h.c, dl2.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        mm6.a<?> aVar = this.h;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    @Override // defpackage.uk2.a
    public void f(Object obj) {
        this.a.h(this.e, obj, this.h.c, dl2.RESOURCE_DISK_CACHE, this.j);
    }
}
