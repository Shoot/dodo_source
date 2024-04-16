package defpackage;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.a;
import java.nio.ByteBuffer;
/* compiled from: ByteBufferRewinder.java */
/* renamed from: ak0  reason: default package */
/* loaded from: classes.dex */
public class ak0 implements com.bumptech.glide.load.data.a<ByteBuffer> {
    private final ByteBuffer a;

    /* compiled from: ByteBufferRewinder.java */
    /* renamed from: ak0$a */
    /* loaded from: classes.dex */
    public static class a implements a.InterfaceC0099a<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.a.InterfaceC0099a
        @NonNull
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0099a
        @NonNull
        /* renamed from: c */
        public com.bumptech.glide.load.data.a<ByteBuffer> b(ByteBuffer byteBuffer) {
            return new ak0(byteBuffer);
        }
    }

    public ak0(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.a
    @NonNull
    /* renamed from: c */
    public ByteBuffer a() {
        this.a.position(0);
        return this.a;
    }

    @Override // com.bumptech.glide.load.data.a
    public void b() {
    }
}
