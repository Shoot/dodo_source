package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: Dynamic32Structure.java */
/* renamed from: m93  reason: default package */
/* loaded from: classes2.dex */
public class m93 extends ue3 {
    public m93(af3 af3Var, ve3 ve3Var, long j, int i) throws IOException {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (ve3Var.a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j2 = j + (i * 8);
        this.a = af3Var.m(allocate, j2);
        this.b = af3Var.m(allocate, j2 + 4);
    }
}
