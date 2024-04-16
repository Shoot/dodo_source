package defpackage;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import defpackage.mm6;
import defpackage.uk2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: FileLoader.java */
/* renamed from: zt3  reason: default package */
/* loaded from: classes.dex */
public class zt3<Data> implements mm6<File, Data> {
    private final d<Data> a;

    /* compiled from: FileLoader.java */
    /* renamed from: zt3$a */
    /* loaded from: classes.dex */
    public static class a<Data> implements nm6<File, Data> {
        private final d<Data> a;

        public a(d<Data> dVar) {
            this.a = dVar;
        }

        @Override // defpackage.nm6
        @NonNull
        public final mm6<File, Data> d(@NonNull qp6 qp6Var) {
            return new zt3(this.a);
        }
    }

    /* compiled from: FileLoader.java */
    /* renamed from: zt3$b */
    /* loaded from: classes.dex */
    public static class b extends a<ParcelFileDescriptor> {

        /* compiled from: FileLoader.java */
        /* renamed from: zt3$b$a */
        /* loaded from: classes.dex */
        class a implements d<ParcelFileDescriptor> {
            a() {
            }

            @Override // defpackage.zt3.d
            public Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            @Override // defpackage.zt3.d
            /* renamed from: d */
            public void b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // defpackage.zt3.d
            /* renamed from: e */
            public ParcelFileDescriptor c(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    /* compiled from: FileLoader.java */
    /* renamed from: zt3$d */
    /* loaded from: classes.dex */
    public interface d<Data> {
        Class<Data> a();

        void b(Data data) throws IOException;

        Data c(File file) throws FileNotFoundException;
    }

    /* compiled from: FileLoader.java */
    /* renamed from: zt3$e */
    /* loaded from: classes.dex */
    public static class e extends a<InputStream> {

        /* compiled from: FileLoader.java */
        /* renamed from: zt3$e$a */
        /* loaded from: classes.dex */
        class a implements d<InputStream> {
            a() {
            }

            @Override // defpackage.zt3.d
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // defpackage.zt3.d
            /* renamed from: d */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // defpackage.zt3.d
            /* renamed from: e */
            public InputStream c(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public zt3(d<Data> dVar) {
        this.a = dVar;
    }

    @Override // defpackage.mm6
    /* renamed from: c */
    public mm6.a<Data> b(@NonNull File file, int i, int i2, @NonNull ac7 ac7Var) {
        return new mm6.a<>(new e57(file), new c(file, this.a));
    }

    @Override // defpackage.mm6
    /* renamed from: d */
    public boolean a(@NonNull File file) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FileLoader.java */
    /* renamed from: zt3$c */
    /* loaded from: classes.dex */
    public static final class c<Data> implements uk2<Data> {
        private final File a;
        private final d<Data> b;
        private Data c;

        c(File file, d<Data> dVar) {
            this.a = file;
            this.b = dVar;
        }

        @Override // defpackage.uk2
        @NonNull
        public Class<Data> a() {
            return this.b.a();
        }

        @Override // defpackage.uk2
        public void b() {
            Data data = this.c;
            if (data != null) {
                try {
                    this.b.b(data);
                } catch (IOException unused) {
                }
            }
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, Data] */
        @Override // defpackage.uk2
        public void d(@NonNull yj8 yj8Var, @NonNull uk2.a<? super Data> aVar) {
            try {
                Data c = this.b.c(this.a);
                this.c = c;
                aVar.f(c);
            } catch (FileNotFoundException e) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e);
                }
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
