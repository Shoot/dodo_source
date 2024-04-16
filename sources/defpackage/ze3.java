package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: Elf64Header.java */
/* renamed from: ze3  reason: default package */
/* loaded from: classes2.dex */
public class ze3 extends ve3 {
    private final af3 j;

    public ze3(boolean z, af3 af3Var) throws IOException {
        ByteOrder byteOrder;
        this.a = z;
        this.j = af3Var;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (z) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        this.b = af3Var.j(allocate, 16L);
        this.c = af3Var.k(allocate, 32L);
        this.d = af3Var.k(allocate, 40L);
        this.e = af3Var.j(allocate, 54L);
        this.f = af3Var.j(allocate, 56L);
        this.g = af3Var.j(allocate, 58L);
        this.h = af3Var.j(allocate, 60L);
        this.i = af3Var.j(allocate, 62L);
    }

    @Override // defpackage.ve3
    public ue3 a(long j, int i) throws IOException {
        return new n93(this.j, this, j, i);
    }

    @Override // defpackage.ve3
    public we3 b(long j) throws IOException {
        return new ap8(this.j, this, j);
    }

    @Override // defpackage.ve3
    public xe3 c(int i) throws IOException {
        return new w2a(this.j, this, i);
    }
}
