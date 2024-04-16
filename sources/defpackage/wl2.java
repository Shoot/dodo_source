package defpackage;

import android.util.Base64;
import androidx.annotation.NonNull;
import defpackage.mm6;
import defpackage.uk2;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: DataUrlLoader.java */
/* renamed from: wl2  reason: default package */
/* loaded from: classes.dex */
public final class wl2<Model, Data> implements mm6<Model, Data> {
    private final a<Data> a;

    /* compiled from: DataUrlLoader.java */
    /* renamed from: wl2$a */
    /* loaded from: classes.dex */
    public interface a<Data> {
        Class<Data> a();

        void b(Data data) throws IOException;

        Data c(String str) throws IllegalArgumentException;
    }

    /* compiled from: DataUrlLoader.java */
    /* renamed from: wl2$c */
    /* loaded from: classes.dex */
    public static final class c<Model> implements nm6<Model, InputStream> {
        private final a<InputStream> a = new a();

        /* compiled from: DataUrlLoader.java */
        /* renamed from: wl2$c$a */
        /* loaded from: classes.dex */
        class a implements a<InputStream> {
            a() {
            }

            @Override // defpackage.wl2.a
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // defpackage.wl2.a
            /* renamed from: d */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // defpackage.wl2.a
            /* renamed from: e */
            public InputStream c(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf != -1) {
                        if (str.substring(0, indexOf).endsWith(";base64")) {
                            return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                        }
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
        }

        @Override // defpackage.nm6
        @NonNull
        public mm6<Model, InputStream> d(@NonNull qp6 qp6Var) {
            return new wl2(this.a);
        }
    }

    public wl2(a<Data> aVar) {
        this.a = aVar;
    }

    @Override // defpackage.mm6
    public boolean a(@NonNull Model model) {
        return model.toString().startsWith("data:image");
    }

    @Override // defpackage.mm6
    public mm6.a<Data> b(@NonNull Model model, int i, int i2, @NonNull ac7 ac7Var) {
        return new mm6.a<>(new e57(model), new b(model.toString(), this.a));
    }

    /* compiled from: DataUrlLoader.java */
    /* renamed from: wl2$b */
    /* loaded from: classes.dex */
    private static final class b<Data> implements uk2<Data> {
        private final String a;
        private final a<Data> b;
        private Data c;

        b(String str, a<Data> aVar) {
            this.a = str;
            this.b = aVar;
        }

        @Override // defpackage.uk2
        @NonNull
        public Class<Data> a() {
            return this.b.a();
        }

        @Override // defpackage.uk2
        public void b() {
            try {
                this.b.b(this.c);
            } catch (IOException unused) {
            }
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, Data] */
        @Override // defpackage.uk2
        public void d(@NonNull yj8 yj8Var, @NonNull uk2.a<? super Data> aVar) {
            try {
                Data c = this.b.c(this.a);
                this.c = c;
                aVar.f(c);
            } catch (IllegalArgumentException e) {
                aVar.c(e);
            }
        }

        @Override // defpackage.uk2
        @NonNull
        public dl2 e() {
            return dl2.LOCAL;
        }

        @Override // defpackage.uk2
        public void cancel() {
        }
    }
}
