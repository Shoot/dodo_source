package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: Section32Header.java */
/* renamed from: v2a  reason: default package */
/* loaded from: classes2.dex */
public class v2a extends xe3 {
    public v2a(af3 af3Var, ve3 ve3Var, int i) throws IOException {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (ve3Var.a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        this.a = af3Var.m(allocate, ve3Var.d + (i * ve3Var.g) + 28);
    }
}
