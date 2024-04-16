package com.bumptech.glide;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.b;
import com.bumptech.glide.e;
import com.bumptech.glide.load.engine.j;
import com.bumptech.glide.manager.g;
import defpackage.ad6;
import defpackage.b33;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: GlideBuilder.java */
/* loaded from: classes.dex */
public final class c {
    private j c;
    private gc0 d;
    private mr e;
    private tc6 f;
    private yf4 g;
    private yf4 h;
    private b33.a i;
    private ad6 j;
    private xq1 k;
    private g.b n;
    private yf4 o;
    private boolean p;
    private List<vi9<Object>> q;
    private final Map<Class<?>, i<?, ?>> a = new lr();
    private final e.a b = new e.a();
    private int l = 4;
    private b.a m = new a();

    /* compiled from: GlideBuilder.java */
    /* loaded from: classes.dex */
    class a implements b.a {
        a() {
        }

        @Override // com.bumptech.glide.b.a
        @NonNull
        public xi9 a() {
            return new xi9();
        }
    }

    /* compiled from: GlideBuilder.java */
    /* loaded from: classes.dex */
    static final class b {
        b() {
        }
    }

    /* compiled from: GlideBuilder.java */
    /* renamed from: com.bumptech.glide.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0097c {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public com.bumptech.glide.b a(@NonNull Context context, List<ag4> list, zn znVar) {
        if (this.g == null) {
            this.g = yf4.h();
        }
        if (this.h == null) {
            this.h = yf4.f();
        }
        if (this.o == null) {
            this.o = yf4.d();
        }
        if (this.j == null) {
            this.j = new ad6.a(context).a();
        }
        if (this.k == null) {
            this.k = new np2();
        }
        if (this.d == null) {
            int b2 = this.j.b();
            if (b2 > 0) {
                this.d = new f36(b2);
            } else {
                this.d = new hc0();
            }
        }
        if (this.e == null) {
            this.e = new e36(this.j.a());
        }
        if (this.f == null) {
            this.f = new l36(this.j.d());
        }
        if (this.i == null) {
            this.i = new q65(context);
        }
        if (this.c == null) {
            this.c = new j(this.f, this.i, this.h, this.g, yf4.j(), this.o, this.p);
        }
        List<vi9<Object>> list2 = this.q;
        if (list2 == null) {
            this.q = Collections.emptyList();
        } else {
            this.q = Collections.unmodifiableList(list2);
        }
        e b3 = this.b.b();
        return new com.bumptech.glide.b(context, this.c, this.f, this.d, this.e, new com.bumptech.glide.manager.g(this.n), this.k, this.l, this.m, this.a, this.q, list, znVar, b3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(g.b bVar) {
        this.n = bVar;
    }
}
