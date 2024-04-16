package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.a;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: InputStreamRewinder.java */
/* loaded from: classes.dex */
public final class c implements com.bumptech.glide.load.data.a<InputStream> {
    private final u99 a;

    /* compiled from: InputStreamRewinder.java */
    /* loaded from: classes.dex */
    public static final class a implements a.InterfaceC0099a<InputStream> {
        private final mr a;

        public a(mr mrVar) {
            this.a = mrVar;
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0099a
        @NonNull
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0099a
        @NonNull
        /* renamed from: c */
        public com.bumptech.glide.load.data.a<InputStream> b(InputStream inputStream) {
            return new c(inputStream, this.a);
        }
    }

    public c(InputStream inputStream, mr mrVar) {
        u99 u99Var = new u99(inputStream, mrVar);
        this.a = u99Var;
        u99Var.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.a
    public void b() {
        this.a.c();
    }

    public void c() {
        this.a.b();
    }

    @Override // com.bumptech.glide.load.data.a
    @NonNull
    /* renamed from: d */
    public InputStream a() throws IOException {
        this.a.reset();
        return this.a;
    }
}
