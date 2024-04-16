package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: Elf32Header.java */
/* renamed from: ye3  reason: default package */
/* loaded from: classes2.dex */
public class ye3 extends ve3 {
    private final af3 j;

    public ye3(boolean z, af3 af3Var) throws IOException {
        ByteOrder byteOrder;
        this.a = z;
        this.j = af3Var;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (z) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        this.b = af3Var.j(allocate, 16L);
        this.c = af3Var.m(allocate, 28L);
        this.d = af3Var.m(allocate, 32L);
        this.e = af3Var.j(allocate, 42L);
        this.f = af3Var.j(allocate, 44L);
        this.g = af3Var.j(allocate, 46L);
        this.h = af3Var.j(allocate, 48L);
        this.i = af3Var.j(allocate, 50L);
    }

    @Override // defpackage.ve3
    public ue3 a(long j, int i) throws IOException {
        return new m93(this.j, this, j, i);
    }

    @Override // defpackage.ve3
    public we3 b(long j) throws IOException {
        return new zo8(this.j, this, j);
    }

    @Override // defpackage.ve3
    public xe3 c(int i) throws IOException {
        return new v2a(this.j, this, i);
    }
}
