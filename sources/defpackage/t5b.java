package defpackage;

import java.nio.ByteBuffer;
/* compiled from: Table.java */
/* renamed from: t5b  reason: default package */
/* loaded from: classes.dex */
public class t5b {
    protected int a;
    protected ByteBuffer b;
    private int c;
    private int d;
    sub e = sub.a();

    /* JADX INFO: Access modifiers changed from: protected */
    public int a(int i) {
        return i + this.b.getInt(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int b(int i) {
        if (i < this.d) {
            return this.b.getShort(this.c + i);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(int i, ByteBuffer byteBuffer) {
        this.b = byteBuffer;
        if (byteBuffer != null) {
            this.a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.c = i2;
            this.d = this.b.getShort(i2);
            return;
        }
        this.a = 0;
        this.c = 0;
        this.d = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int d(int i) {
        int i2 = i + this.a;
        return i2 + this.b.getInt(i2) + 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int e(int i) {
        int i2 = i + this.a;
        return this.b.getInt(i2 + this.b.getInt(i2));
    }
}
