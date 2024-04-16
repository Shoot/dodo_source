package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: Program32Header.java */
/* renamed from: zo8  reason: default package */
/* loaded from: classes2.dex */
public class zo8 extends we3 {
    public zo8(af3 af3Var, ve3 ve3Var, long j) throws IOException {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (ve3Var.a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j2 = ve3Var.c + (j * ve3Var.e);
        this.a = af3Var.m(allocate, j2);
        this.b = af3Var.m(allocate, 4 + j2);
        this.c = af3Var.m(allocate, 8 + j2);
        this.d = af3Var.m(allocate, j2 + 20);
    }
}
