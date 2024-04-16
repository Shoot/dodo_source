package defpackage;

import android.util.Log;
import androidx.annotation.NonNull;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
/* compiled from: GifHeaderParser.java */
/* renamed from: tf4  reason: default package */
/* loaded from: classes.dex */
public class tf4 {
    private ByteBuffer b;
    private sf4 c;
    private final byte[] a = new byte[256];
    private int d = 0;

    private boolean b() {
        if (this.c.b != 0) {
            return true;
        }
        return false;
    }

    private int d() {
        try {
            return this.b.get() & 255;
        } catch (Exception unused) {
            this.c.b = 1;
            return 0;
        }
    }

    private void e() {
        boolean z;
        this.c.d.a = n();
        this.c.d.b = n();
        this.c.d.c = n();
        this.c.d.d = n();
        int d = d();
        boolean z2 = false;
        if ((d & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        int pow = (int) Math.pow(2.0d, (d & 7) + 1);
        pf4 pf4Var = this.c.d;
        if ((d & 64) != 0) {
            z2 = true;
        }
        pf4Var.e = z2;
        if (z) {
            pf4Var.k = g(pow);
        } else {
            pf4Var.k = null;
        }
        this.c.d.j = this.b.position();
        r();
        if (b()) {
            return;
        }
        sf4 sf4Var = this.c;
        sf4Var.c++;
        sf4Var.e.add(sf4Var.d);
    }

    private void f() {
        int d = d();
        this.d = d;
        if (d > 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                try {
                    i2 = this.d;
                    if (i < i2) {
                        i2 -= i;
                        this.b.get(this.a, i, i2);
                        i += i2;
                    } else {
                        return;
                    }
                } catch (Exception e) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Error Reading Block n: " + i + " count: " + i2 + " blockSize: " + this.d, e);
                    }
                    this.c.b = 1;
                    return;
                }
            }
        }
    }

    private int[] g(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 2;
                i3 += 3;
                int i5 = i2 + 1;
                iArr[i2] = ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3] & 255) << 16) | (-16777216) | (bArr[i4] & 255);
                i2 = i5;
            }
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.c.b = 1;
        }
        return iArr;
    }

    private void h() {
        i(Integer.MAX_VALUE);
    }

    private void i(int i) {
        boolean z = false;
        while (!z && !b() && this.c.c <= i) {
            int d = d();
            if (d != 33) {
                if (d != 44) {
                    if (d != 59) {
                        this.c.b = 1;
                    } else {
                        z = true;
                    }
                } else {
                    sf4 sf4Var = this.c;
                    if (sf4Var.d == null) {
                        sf4Var.d = new pf4();
                    }
                    e();
                }
            } else {
                int d2 = d();
                if (d2 != 1) {
                    if (d2 != 249) {
                        if (d2 != 254) {
                            if (d2 != 255) {
                                q();
                            } else {
                                f();
                                StringBuilder sb = new StringBuilder();
                                for (int i2 = 0; i2 < 11; i2++) {
                                    sb.append((char) this.a[i2]);
                                }
                                if (sb.toString().equals("NETSCAPE2.0")) {
                                    m();
                                } else {
                                    q();
                                }
                            }
                        } else {
                            q();
                        }
                    } else {
                        this.c.d = new pf4();
                        j();
                    }
                } else {
                    q();
                }
            }
        }
    }

    private void j() {
        d();
        int d = d();
        pf4 pf4Var = this.c.d;
        int i = (d & 28) >> 2;
        pf4Var.g = i;
        boolean z = true;
        if (i == 0) {
            pf4Var.g = 1;
        }
        if ((d & 1) == 0) {
            z = false;
        }
        pf4Var.f = z;
        int n = n();
        if (n < 2) {
            n = 10;
        }
        pf4 pf4Var2 = this.c.d;
        pf4Var2.i = n * 10;
        pf4Var2.h = d();
        d();
    }

    private void k() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.c.b = 1;
            return;
        }
        l();
        if (this.c.h && !b()) {
            sf4 sf4Var = this.c;
            sf4Var.a = g(sf4Var.i);
            sf4 sf4Var2 = this.c;
            sf4Var2.l = sf4Var2.a[sf4Var2.j];
        }
    }

    private void l() {
        boolean z;
        this.c.f = n();
        this.c.g = n();
        int d = d();
        sf4 sf4Var = this.c;
        if ((d & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        sf4Var.h = z;
        sf4Var.i = (int) Math.pow(2.0d, (d & 7) + 1);
        this.c.j = d();
        this.c.k = d();
    }

    private void m() {
        do {
            f();
            byte[] bArr = this.a;
            if (bArr[0] == 1) {
                this.c.m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.d <= 0) {
                return;
            }
        } while (!b());
    }

    private int n() {
        return this.b.getShort();
    }

    private void o() {
        this.b = null;
        Arrays.fill(this.a, (byte) 0);
        this.c = new sf4();
        this.d = 0;
    }

    private void q() {
        int d;
        do {
            d = d();
            this.b.position(Math.min(this.b.position() + d, this.b.limit()));
        } while (d > 0);
    }

    private void r() {
        d();
        q();
    }

    public void a() {
        this.b = null;
        this.c = null;
    }

    @NonNull
    public sf4 c() {
        if (this.b != null) {
            if (b()) {
                return this.c;
            }
            k();
            if (!b()) {
                h();
                sf4 sf4Var = this.c;
                if (sf4Var.c < 0) {
                    sf4Var.b = 1;
                }
            }
            return this.c;
        }
        throw new IllegalStateException("You must call setData() before parseHeader()");
    }

    public tf4 p(@NonNull ByteBuffer byteBuffer) {
        o();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
