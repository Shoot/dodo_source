package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: MetadataList.java */
/* renamed from: ri6  reason: default package */
/* loaded from: classes.dex */
public final class ri6 extends t5b {
    public static ri6 h(ByteBuffer byteBuffer) {
        return i(byteBuffer, new ri6());
    }

    public static ri6 i(ByteBuffer byteBuffer, ri6 ri6Var) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return ri6Var.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public ri6 f(int i, ByteBuffer byteBuffer) {
        g(i, byteBuffer);
        return this;
    }

    public void g(int i, ByteBuffer byteBuffer) {
        c(i, byteBuffer);
    }

    public qi6 j(qi6 qi6Var, int i) {
        int b = b(6);
        if (b != 0) {
            return qi6Var.f(a(d(b) + (i * 4)), this.b);
        }
        return null;
    }

    public int k() {
        int b = b(6);
        if (b != 0) {
            return e(b);
        }
        return 0;
    }

    public int l() {
        int b = b(4);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
}
