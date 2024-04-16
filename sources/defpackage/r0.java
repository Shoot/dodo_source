package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: AVIFReader.java */
/* renamed from: r0  reason: default package */
/* loaded from: classes.dex */
public class r0 extends zu3 {
    private ByteBuffer b;

    public r0(m79 m79Var) {
        super(m79Var);
        this.b = null;
    }

    public ByteBuffer a() throws IOException {
        if (this.b == null) {
            int available = available();
            byte[] bArr = new byte[available];
            read(bArr, 0, available);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(available);
            this.b = allocateDirect;
            allocateDirect.put(bArr);
        }
        this.b.flip();
        return this.b;
    }
}
