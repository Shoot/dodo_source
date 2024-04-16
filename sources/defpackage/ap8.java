package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: Program64Header.java */
/* renamed from: ap8  reason: default package */
/* loaded from: classes2.dex */
public class ap8 extends we3 {
    public ap8(af3 af3Var, ve3 ve3Var, long j) throws IOException {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (ve3Var.a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j2 = ve3Var.c + (j * ve3Var.e);
        this.a = af3Var.m(allocate, j2);
        this.b = af3Var.k(allocate, 8 + j2);
        this.c = af3Var.k(allocate, 16 + j2);
        this.d = af3Var.k(allocate, j2 + 40);
    }
}
