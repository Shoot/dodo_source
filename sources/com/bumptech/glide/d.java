package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.bumptech.glide.b;
import com.bumptech.glide.load.engine.j;
import defpackage.eg4;
import java.util.List;
import java.util.Map;
/* compiled from: GlideContext.java */
/* loaded from: classes.dex */
public class d extends ContextWrapper {
    static final i<?, ?> k = new ld4();
    private final mr a;
    private final eg4.b<Registry> b;
    private final ew4 c;
    private final b.a d;
    private final List<vi9<Object>> e;
    private final Map<Class<?>, i<?, ?>> f;
    private final j g;
    private final e h;
    private final int i;
    private xi9 j;

    public d(@NonNull Context context, @NonNull mr mrVar, @NonNull eg4.b<Registry> bVar, @NonNull ew4 ew4Var, @NonNull b.a aVar, @NonNull Map<Class<?>, i<?, ?>> map, @NonNull List<vi9<Object>> list, @NonNull j jVar, @NonNull e eVar, int i) {
        super(context.getApplicationContext());
        this.a = mrVar;
        this.c = ew4Var;
        this.d = aVar;
        this.e = list;
        this.f = map;
        this.g = jVar;
        this.h = eVar;
        this.i = i;
        this.b = eg4.a(bVar);
    }

    @NonNull
    public <X> r0c<ImageView, X> a(@NonNull ImageView imageView, @NonNull Class<X> cls) {
        return this.c.a(imageView, cls);
    }

    @NonNull
    public mr b() {
        return this.a;
    }

    public List<vi9<Object>> c() {
        return this.e;
    }

    public synchronized xi9 d() {
        try {
            if (this.j == null) {
                this.j = this.d.a().R();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.j;
    }

    @NonNull
    public <T> i<?, T> e(@NonNull Class<T> cls) {
        i<?, T> iVar = (i<?, T>) this.f.get(cls);
        if (iVar == null) {
            for (Map.Entry<Class<?>, i<?, ?>> entry : this.f.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    iVar = (i<?, T>) entry.getValue();
                }
            }
        }
        return iVar == null ? (i<?, T>) k : iVar;
    }

    @NonNull
    public j f() {
        return this.g;
    }

    public e g() {
        return this.h;
    }

    public int h() {
        return this.i;
    }

    @NonNull
    public Registry i() {
        return this.b.get();
    }
}
