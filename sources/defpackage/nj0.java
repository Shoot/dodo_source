package defpackage;

import androidx.annotation.NonNull;
import defpackage.mm6;
import defpackage.uk2;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* compiled from: ByteArrayLoader.java */
/* renamed from: nj0  reason: default package */
/* loaded from: classes.dex */
public class nj0<Data> implements mm6<byte[], Data> {
    private final b<Data> a;

    /* compiled from: ByteArrayLoader.java */
    /* renamed from: nj0$a */
    /* loaded from: classes.dex */
    public static class a implements nm6<byte[], ByteBuffer> {

        /* compiled from: ByteArrayLoader.java */
        /* renamed from: nj0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0455a implements b<ByteBuffer> {
            C0455a() {
            }

            @Override // defpackage.nj0.b
            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // defpackage.nj0.b
            /* renamed from: c */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // defpackage.nm6
        @NonNull
        public mm6<byte[], ByteBuffer> d(@NonNull qp6 qp6Var) {
            return new nj0(new C0455a());
        }
    }

    /* compiled from: ByteArrayLoader.java */
    /* renamed from: nj0$b */
    /* loaded from: classes.dex */
    public interface b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    /* compiled from: ByteArrayLoader.java */
    /* renamed from: nj0$d */
    /* loaded from: classes.dex */
    public static class d implements nm6<byte[], InputStream> {

        /* compiled from: ByteArrayLoader.java */
        /* renamed from: nj0$d$a */
        /* loaded from: classes.dex */
        class a implements b<InputStream> {
            a() {
            }

            @Override // defpackage.nj0.b
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // defpackage.nj0.b
            /* renamed from: c */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // defpackage.nm6
        @NonNull
        public mm6<byte[], InputStream> d(@NonNull qp6 qp6Var) {
            return new nj0(new a());
        }
    }

    public nj0(b<Data> bVar) {
        this.a = bVar;
    }

    @Override // defpackage.mm6
    /* renamed from: c */
    public mm6.a<Data> b(@NonNull byte[] bArr, int i, int i2, @NonNull ac7 ac7Var) {
        return new mm6.a<>(new e57(bArr), new c(bArr, this.a));
    }

    @Override // defpackage.mm6
    /* renamed from: d */
    public boolean a(@NonNull byte[] bArr) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ByteArrayLoader.java */
    /* renamed from: nj0$c */
    /* loaded from: classes.dex */
    public static class c<Data> implements uk2<Data> {
        private final byte[] a;
        private final b<Data> b;

        c(byte[] bArr, b<Data> bVar) {
            this.a = bArr;
            this.b = bVar;
        }

        @Override // defpackage.uk2
        @NonNull
        public Class<Data> a() {
            return this.b.a();
        }

        @Override // defpackage.uk2
        public void d(@NonNull yj8 yj8Var, @NonNull uk2.a<? super Data> aVar) {
            aVar.f((Data) this.b.b(this.a));
        }

        @Override // defpackage.uk2
        @NonNull
        public dl2 e() {
            return dl2.LOCAL;
        }

        @Override // defpackage.uk2
        public void b() {
        }

        @Override // defpackage.uk2
        public void cancel() {
        }
    }
}
