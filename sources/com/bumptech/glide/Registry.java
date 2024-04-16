package com.bumptech.glide;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.a;
import com.bumptech.glide.load.engine.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class Registry {
    private final om6 a;
    private final dh3 b;
    private final sj9 c;
    private final vj9 d;
    private final com.bumptech.glide.load.data.b e;
    private final mkb f;
    private final qu4 g;
    private final pm6 h = new pm6();
    private final ur5 i = new ur5();
    private final jf8<List<Throwable>> j;

    /* loaded from: classes.dex */
    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(@NonNull String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    /* loaded from: classes.dex */
    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(@NonNull Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> NoModelLoaderAvailableException(@NonNull M m, @NonNull List<mm6<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m);
        }

        public NoModelLoaderAvailableException(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    /* loaded from: classes.dex */
    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(@NonNull Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* loaded from: classes.dex */
    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(@NonNull Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        jf8<List<Throwable>> e = po3.e();
        this.j = e;
        this.a = new om6(e);
        this.b = new dh3();
        this.c = new sj9();
        this.d = new vj9();
        this.e = new com.bumptech.glide.load.data.b();
        this.f = new mkb();
        this.g = new qu4();
        t(Arrays.asList("Animation", "Bitmap", "BitmapDrawable"));
    }

    @NonNull
    private <Data, TResource, Transcode> List<com.bumptech.glide.load.engine.i<Data, TResource, Transcode>> f(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.c.d(cls, cls2)) {
            for (Class cls5 : this.f.b(cls4, cls3)) {
                arrayList.add(new com.bumptech.glide.load.engine.i(cls, cls4, cls5, this.c.b(cls, cls4), this.f.a(cls4, cls5), this.j));
            }
        }
        return arrayList;
    }

    @NonNull
    public <Data> Registry a(@NonNull Class<Data> cls, @NonNull bh3<Data> bh3Var) {
        this.b.a(cls, bh3Var);
        return this;
    }

    @NonNull
    public <TResource> Registry b(@NonNull Class<TResource> cls, @NonNull uj9<TResource> uj9Var) {
        this.d.a(cls, uj9Var);
        return this;
    }

    @NonNull
    public <Model, Data> Registry c(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull nm6<Model, Data> nm6Var) {
        this.a.a(cls, cls2, nm6Var);
        return this;
    }

    @NonNull
    public <Data, TResource> Registry d(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull rj9<Data, TResource> rj9Var) {
        e("legacy_append", cls, cls2, rj9Var);
        return this;
    }

    @NonNull
    public <Data, TResource> Registry e(@NonNull String str, @NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull rj9<Data, TResource> rj9Var) {
        this.c.a(str, rj9Var, cls, cls2);
        return this;
    }

    @NonNull
    public List<ImageHeaderParser> g() {
        List<ImageHeaderParser> b = this.g.b();
        if (!b.isEmpty()) {
            return b;
        }
        throw new NoImageHeaderParserException();
    }

    public <Data, TResource, Transcode> q<Data, TResource, Transcode> h(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        q<Data, TResource, Transcode> a = this.i.a(cls, cls2, cls3);
        if (this.i.c(a)) {
            return null;
        }
        if (a == null) {
            List<com.bumptech.glide.load.engine.i<Data, TResource, Transcode>> f = f(cls, cls2, cls3);
            if (f.isEmpty()) {
                a = null;
            } else {
                a = new q<>(cls, cls2, cls3, f, this.j);
            }
            this.i.d(cls, cls2, cls3, a);
        }
        return a;
    }

    @NonNull
    public <Model> List<mm6<Model, ?>> i(@NonNull Model model) {
        return this.a.d(model);
    }

    @NonNull
    public <Model, TResource, Transcode> List<Class<?>> j(@NonNull Class<Model> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        List<Class<?>> a = this.h.a(cls, cls2, cls3);
        if (a == null) {
            a = new ArrayList<>();
            for (Class<?> cls4 : this.a.c(cls)) {
                for (Class<?> cls5 : this.c.d(cls4, cls2)) {
                    if (!this.f.b(cls5, cls3).isEmpty() && !a.contains(cls5)) {
                        a.add(cls5);
                    }
                }
            }
            this.h.b(cls, cls2, cls3, Collections.unmodifiableList(a));
        }
        return a;
    }

    @NonNull
    public <X> uj9<X> k(@NonNull nj9<X> nj9Var) throws NoResultEncoderAvailableException {
        uj9<X> b = this.d.b(nj9Var.c());
        if (b != null) {
            return b;
        }
        throw new NoResultEncoderAvailableException(nj9Var.c());
    }

    @NonNull
    public <X> com.bumptech.glide.load.data.a<X> l(@NonNull X x) {
        return this.e.a(x);
    }

    @NonNull
    public <X> bh3<X> m(@NonNull X x) throws NoSourceEncoderAvailableException {
        bh3<X> b = this.b.b(x.getClass());
        if (b != null) {
            return b;
        }
        throw new NoSourceEncoderAvailableException(x.getClass());
    }

    public boolean n(@NonNull nj9<?> nj9Var) {
        if (this.d.b(nj9Var.c()) != null) {
            return true;
        }
        return false;
    }

    @NonNull
    public <Data, TResource> Registry o(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull rj9<Data, TResource> rj9Var) {
        p("legacy_prepend_all", cls, cls2, rj9Var);
        return this;
    }

    @NonNull
    public <Data, TResource> Registry p(@NonNull String str, @NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull rj9<Data, TResource> rj9Var) {
        this.c.e(str, rj9Var, cls, cls2);
        return this;
    }

    @NonNull
    public Registry q(@NonNull ImageHeaderParser imageHeaderParser) {
        this.g.a(imageHeaderParser);
        return this;
    }

    @NonNull
    public Registry r(@NonNull a.InterfaceC0099a<?> interfaceC0099a) {
        this.e.b(interfaceC0099a);
        return this;
    }

    @NonNull
    public <TResource, Transcode> Registry s(@NonNull Class<TResource> cls, @NonNull Class<Transcode> cls2, @NonNull ck9<TResource, Transcode> ck9Var) {
        this.f.c(cls, cls2, ck9Var);
        return this;
    }

    @NonNull
    public final Registry t(@NonNull List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        for (String str : list) {
            arrayList.add(str);
        }
        arrayList.add("legacy_append");
        this.c.f(arrayList);
        return this;
    }
}
