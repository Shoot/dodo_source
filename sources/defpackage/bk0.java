package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: ByteBufferSerializer.java */
/* renamed from: bk0  reason: default package */
/* loaded from: classes2.dex */
public class bk0 extends bxa<ByteBuffer> {
    public bk0() {
        super(ByteBuffer.class);
    }

    @Override // defpackage.cxa, defpackage.gc5
    /* renamed from: G */
    public void f(ByteBuffer byteBuffer, ua5 ua5Var, bda bdaVar) throws IOException {
        if (byteBuffer.hasArray()) {
            int position = byteBuffer.position();
            ua5Var.S(byteBuffer.array(), byteBuffer.arrayOffset() + position, byteBuffer.limit() - position);
            return;
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        if (asReadOnlyBuffer.position() > 0) {
            asReadOnlyBuffer.rewind();
        }
        rj0 rj0Var = new rj0(asReadOnlyBuffer);
        ua5Var.N(rj0Var, asReadOnlyBuffer.remaining());
        rj0Var.close();
    }
}
