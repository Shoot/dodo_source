package defpackage;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: ByteBufferAnimationDecoder.java */
/* renamed from: qj0  reason: default package */
/* loaded from: classes.dex */
public class qj0 implements rj9<ByteBuffer, h74> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ByteBufferAnimationDecoder.java */
    /* renamed from: qj0$a */
    /* loaded from: classes.dex */
    public class a extends yj0 {
        final /* synthetic */ ByteBuffer a;

        a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
        }

        @Override // defpackage.yj0
        public ByteBuffer b() {
            this.a.position(0);
            return this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ByteBufferAnimationDecoder.java */
    /* renamed from: qj0$b */
    /* loaded from: classes.dex */
    public static class b implements nj9<h74> {
        private final h74 a;
        private final int b;

        b(h74 h74Var, int i) {
            this.a = h74Var;
            this.b = i;
        }

        @Override // defpackage.nj9
        public int a() {
            return this.b;
        }

        @Override // defpackage.nj9
        public void b() {
            this.a.Q();
        }

        @Override // defpackage.nj9
        @NonNull
        public Class<h74> c() {
            return h74.class;
        }

        @Override // defpackage.nj9
        @NonNull
        /* renamed from: d */
        public h74 get() {
            return this.a;
        }
    }

    @Override // defpackage.rj9
    /* renamed from: c */
    public nj9<h74> b(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull ac7 ac7Var) throws IOException {
        a aVar = new a(byteBuffer);
        if (!q0.a(new zj0(byteBuffer))) {
            return null;
        }
        return new b(new n0(aVar, null), byteBuffer.limit());
    }

    @Override // defpackage.rj9
    /* renamed from: d */
    public boolean a(@NonNull ByteBuffer byteBuffer, @NonNull ac7 ac7Var) {
        if (!((Boolean) ac7Var.c(qk.b)).booleanValue() && q0.a(new zj0(byteBuffer))) {
            return true;
        }
        return false;
    }
}
