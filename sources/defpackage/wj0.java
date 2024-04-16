package defpackage;

import android.util.Log;
import androidx.annotation.NonNull;
import defpackage.mm6;
import defpackage.uk2;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: ByteBufferFileLoader.java */
/* renamed from: wj0  reason: default package */
/* loaded from: classes.dex */
public class wj0 implements mm6<File, ByteBuffer> {

    /* compiled from: ByteBufferFileLoader.java */
    /* renamed from: wj0$b */
    /* loaded from: classes.dex */
    public static class b implements nm6<File, ByteBuffer> {
        @Override // defpackage.nm6
        @NonNull
        public mm6<File, ByteBuffer> d(@NonNull qp6 qp6Var) {
            return new wj0();
        }
    }

    @Override // defpackage.mm6
    /* renamed from: c */
    public mm6.a<ByteBuffer> b(@NonNull File file, int i, int i2, @NonNull ac7 ac7Var) {
        return new mm6.a<>(new e57(file), new a(file));
    }

    @Override // defpackage.mm6
    /* renamed from: d */
    public boolean a(@NonNull File file) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ByteBufferFileLoader.java */
    /* renamed from: wj0$a */
    /* loaded from: classes.dex */
    public static final class a implements uk2<ByteBuffer> {
        private final File a;

        a(File file) {
            this.a = file;
        }

        @Override // defpackage.uk2
        @NonNull
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // defpackage.uk2
        public void d(@NonNull yj8 yj8Var, @NonNull uk2.a<? super ByteBuffer> aVar) {
            try {
                aVar.f(ck0.a(this.a));
            } catch (IOException e) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
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
        public void b() {
        }

        @Override // defpackage.uk2
        public void cancel() {
        }
    }
}
