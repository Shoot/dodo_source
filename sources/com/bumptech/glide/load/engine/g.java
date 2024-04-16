package com.bumptech.glide.load.engine;

import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.h;
import defpackage.mm6;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DecodeHelper.java */
/* loaded from: classes.dex */
public final class g<Transcode> {
    private final List<mm6.a<?>> a = new ArrayList();
    private final List<se5> b = new ArrayList();
    private com.bumptech.glide.d c;
    private Object d;
    private int e;
    private int f;
    private Class<?> g;
    private h.e h;
    private ac7 i;
    private Map<Class<?>, tkb<?>> j;
    private Class<Transcode> k;
    private boolean l;
    private boolean m;
    private se5 n;
    private yj8 o;
    private d33 p;
    private boolean q;
    private boolean r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.c = null;
        this.d = null;
        this.n = null;
        this.g = null;
        this.k = null;
        this.i = null;
        this.o = null;
        this.j = null;
        this.p = null;
        this.a.clear();
        this.l = false;
        this.b.clear();
        this.m = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public mr b() {
        return this.c.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<se5> c() {
        if (!this.m) {
            this.m = true;
            this.b.clear();
            List<mm6.a<?>> g = g();
            int size = g.size();
            for (int i = 0; i < size; i++) {
                mm6.a<?> aVar = g.get(i);
                if (!this.b.contains(aVar.a)) {
                    this.b.add(aVar.a);
                }
                for (int i2 = 0; i2 < aVar.b.size(); i2++) {
                    if (!this.b.contains(aVar.b.get(i2))) {
                        this.b.add(aVar.b.get(i2));
                    }
                }
            }
        }
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b33 d() {
        return this.h.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d33 e() {
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<mm6.a<?>> g() {
        if (!this.l) {
            this.l = true;
            this.a.clear();
            List i = this.c.i().i(this.d);
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                mm6.a<?> b = ((mm6) i.get(i2)).b(this.d, this.e, this.f, this.i);
                if (b != null) {
                    this.a.add(b);
                }
            }
        }
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <Data> q<Data, ?, Transcode> h(Class<Data> cls) {
        return this.c.i().h(cls, this.g, this.k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Class<?> i() {
        return this.d.getClass();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<mm6<File, ?>> j(File file) throws Registry.NoModelLoaderAvailableException {
        return this.c.i().i(file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ac7 k() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public yj8 l() {
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Class<?>> m() {
        return this.c.i().j(this.d.getClass(), this.g, this.k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <Z> uj9<Z> n(nj9<Z> nj9Var) {
        return this.c.i().k(nj9Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> com.bumptech.glide.load.data.a<T> o(T t) {
        return this.c.i().l(t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public se5 p() {
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <X> bh3<X> q(X x) throws Registry.NoSourceEncoderAvailableException {
        return this.c.i().m(x);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Class<?> r() {
        return (Class<Transcode>) this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <Z> tkb<Z> s(Class<Z> cls) {
        tkb<Z> tkbVar = (tkb<Z>) this.j.get(cls);
        if (tkbVar == null) {
            Iterator<Map.Entry<Class<?>, tkb<?>>> it = this.j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, tkb<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    tkbVar = (tkb<Z>) next.getValue();
                    break;
                }
            }
        }
        if (tkbVar == null) {
            if (this.j.isEmpty() && this.q) {
                throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
            }
            return uqb.c();
        }
        return tkbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int t() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean u(Class<?> cls) {
        if (h(cls) != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public <R> void v(com.bumptech.glide.d dVar, Object obj, se5 se5Var, int i, int i2, d33 d33Var, Class<?> cls, Class<R> cls2, yj8 yj8Var, ac7 ac7Var, Map<Class<?>, tkb<?>> map, boolean z, boolean z2, h.e eVar) {
        this.c = dVar;
        this.d = obj;
        this.n = se5Var;
        this.e = i;
        this.f = i2;
        this.p = d33Var;
        this.g = cls;
        this.h = eVar;
        this.k = cls2;
        this.o = yj8Var;
        this.i = ac7Var;
        this.j = map;
        this.q = z;
        this.r = z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean w(nj9<?> nj9Var) {
        return this.c.i().n(nj9Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x() {
        return this.r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean y(se5 se5Var) {
        List<mm6.a<?>> g = g();
        int size = g.size();
        for (int i = 0; i < size; i++) {
            if (g.get(i).a.equals(se5Var)) {
                return true;
            }
        }
        return false;
    }
}
