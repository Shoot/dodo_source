package defpackage;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import defpackage.jf4;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
/* compiled from: StandardGifDecoder.java */
/* renamed from: nta  reason: default package */
/* loaded from: classes.dex */
public class nta implements jf4 {
    private static final String u = "nta";
    private int[] a;
    private final int[] b;
    private final jf4.a c;
    private ByteBuffer d;
    private byte[] e;
    private short[] f;
    private byte[] g;
    private byte[] h;
    private byte[] i;
    private int[] j;
    private int k;
    private sf4 l;
    private Bitmap m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private int r;
    private Boolean s;
    @NonNull
    private Bitmap.Config t;

    public nta(@NonNull jf4.a aVar, sf4 sf4Var, ByteBuffer byteBuffer, int i) {
        this(aVar);
        q(sf4Var, byteBuffer, i);
    }

    private int i(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.p + i; i9++) {
            byte[] bArr = this.i;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.a[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.p + i11; i12++) {
            byte[] bArr2 = this.i;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.a[bArr2[i12] & 255];
            if (i13 != 0) {
                i4 += (i13 >> 24) & 255;
                i5 += (i13 >> 16) & 255;
                i6 += (i13 >> 8) & 255;
                i7 += i13 & 255;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
    }

    private void j(pf4 pf4Var) {
        boolean z;
        boolean booleanValue;
        int i;
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int[] iArr = this.j;
        int i6 = pf4Var.d;
        int i7 = this.p;
        int i8 = i6 / i7;
        int i9 = pf4Var.b / i7;
        int i10 = pf4Var.c / i7;
        int i11 = pf4Var.a / i7;
        if (this.k == 0) {
            z = true;
        } else {
            z = false;
        }
        int i12 = this.r;
        int i13 = this.q;
        byte[] bArr = this.i;
        int[] iArr2 = this.a;
        Boolean bool = this.s;
        int i14 = 8;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1;
        while (i16 < i8) {
            Boolean bool2 = bool;
            if (pf4Var.e) {
                if (i15 >= i8) {
                    int i18 = i17 + 1;
                    i = i8;
                    if (i18 != 2) {
                        if (i18 != 3) {
                            if (i18 != 4) {
                                i17 = i18;
                            } else {
                                i17 = i18;
                                i15 = 1;
                                i14 = 2;
                            }
                        } else {
                            i17 = i18;
                            i15 = 2;
                            i14 = 4;
                        }
                    } else {
                        i17 = i18;
                        i15 = 4;
                    }
                } else {
                    i = i8;
                }
                i2 = i15 + i14;
            } else {
                i = i8;
                i2 = i15;
                i15 = i16;
            }
            int i19 = i15 + i9;
            if (i7 == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i19 < i13) {
                int i20 = i19 * i12;
                int i21 = i20 + i11;
                int i22 = i21 + i10;
                int i23 = i20 + i12;
                if (i23 < i22) {
                    i22 = i23;
                }
                i3 = i2;
                int i24 = i16 * i7 * pf4Var.c;
                if (z2) {
                    int i25 = i21;
                    while (i25 < i22) {
                        int i26 = i9;
                        int i27 = iArr2[bArr[i24] & 255];
                        if (i27 != 0) {
                            iArr[i25] = i27;
                        } else if (z && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i24 += i7;
                        i25++;
                        i9 = i26;
                    }
                } else {
                    i5 = i9;
                    int i28 = ((i22 - i21) * i7) + i24;
                    int i29 = i21;
                    while (true) {
                        i4 = i10;
                        if (i29 >= i22) {
                            break;
                        }
                        int i30 = i(i24, i28, pf4Var.c);
                        if (i30 != 0) {
                            iArr[i29] = i30;
                        } else if (z && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i24 += i7;
                        i29++;
                        i10 = i4;
                    }
                    bool = bool2;
                    i16++;
                    i9 = i5;
                    i8 = i;
                    i10 = i4;
                    i15 = i3;
                }
            } else {
                i3 = i2;
            }
            i5 = i9;
            i4 = i10;
            bool = bool2;
            i16++;
            i9 = i5;
            i8 = i;
            i10 = i4;
            i15 = i3;
        }
        Boolean bool3 = bool;
        if (this.s == null) {
            if (bool3 == null) {
                booleanValue = false;
            } else {
                booleanValue = bool3.booleanValue();
            }
            this.s = Boolean.valueOf(booleanValue);
        }
    }

    private void k(pf4 pf4Var) {
        boolean z;
        boolean z2;
        pf4 pf4Var2 = pf4Var;
        int[] iArr = this.j;
        int i = pf4Var2.d;
        int i2 = pf4Var2.b;
        int i3 = pf4Var2.c;
        int i4 = pf4Var2.a;
        if (this.k == 0) {
            z = true;
        } else {
            z = false;
        }
        int i5 = this.r;
        byte[] bArr = this.i;
        int[] iArr2 = this.a;
        int i6 = 0;
        byte b = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i10 = i7 + i5;
            if (i10 < i9) {
                i9 = i10;
            }
            int i11 = pf4Var2.c * i6;
            int i12 = i8;
            while (i12 < i9) {
                byte b2 = bArr[i11];
                int i13 = i;
                int i14 = b2 & 255;
                if (i14 != b) {
                    int i15 = iArr2[i14];
                    if (i15 != 0) {
                        iArr[i12] = i15;
                    } else {
                        b = b2;
                    }
                }
                i11++;
                i12++;
                i = i13;
            }
            i6++;
            pf4Var2 = pf4Var;
        }
        Boolean bool = this.s;
        if ((bool != null && bool.booleanValue()) || (this.s == null && z && b != -1)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.s = Boolean.valueOf(z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void l(pf4 pf4Var) {
        int i;
        int i2;
        short s;
        nta ntaVar = this;
        if (pf4Var != null) {
            ntaVar.d.position(pf4Var.j);
        }
        if (pf4Var == null) {
            sf4 sf4Var = ntaVar.l;
            i = sf4Var.f;
            i2 = sf4Var.g;
        } else {
            i = pf4Var.c;
            i2 = pf4Var.d;
        }
        int i3 = i * i2;
        byte[] bArr = ntaVar.i;
        if (bArr == null || bArr.length < i3) {
            ntaVar.i = ntaVar.c.b(i3);
        }
        byte[] bArr2 = ntaVar.i;
        if (ntaVar.f == null) {
            ntaVar.f = new short[4096];
        }
        short[] sArr = ntaVar.f;
        if (ntaVar.g == null) {
            ntaVar.g = new byte[4096];
        }
        byte[] bArr3 = ntaVar.g;
        if (ntaVar.h == null) {
            ntaVar.h = new byte[4097];
        }
        byte[] bArr4 = ntaVar.h;
        int p = p();
        int i4 = 1 << p;
        int i5 = i4 + 1;
        int i6 = i4 + 2;
        int i7 = p + 1;
        int i8 = (1 << i7) - 1;
        int i9 = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            sArr[i10] = 0;
            bArr3[i10] = (byte) i10;
        }
        byte[] bArr5 = ntaVar.e;
        int i11 = i7;
        int i12 = i6;
        int i13 = i8;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = -1;
        int i20 = 0;
        int i21 = 0;
        while (true) {
            if (i9 >= i3) {
                break;
            }
            if (i14 == 0) {
                i14 = o();
                if (i14 <= 0) {
                    ntaVar.o = 3;
                    break;
                }
                i15 = 0;
            }
            i17 += (bArr5[i15] & 255) << i16;
            i15++;
            i14--;
            int i22 = i16 + 8;
            int i23 = i12;
            int i24 = i19;
            int i25 = i11;
            int i26 = i7;
            int i27 = i21;
            while (true) {
                if (i22 >= i25) {
                    int i28 = i6;
                    int i29 = i17 & i13;
                    i17 >>= i25;
                    i22 -= i25;
                    if (i29 == i4) {
                        i13 = i8;
                        i25 = i26;
                        i23 = i28;
                        i6 = i23;
                        i24 = -1;
                    } else if (i29 == i5) {
                        i16 = i22;
                        i21 = i27;
                        i12 = i23;
                        i7 = i26;
                        i6 = i28;
                        i19 = i24;
                        i11 = i25;
                        break;
                    } else if (i24 == -1) {
                        bArr2[i18] = bArr3[i29];
                        i18++;
                        i9++;
                        i24 = i29;
                        i27 = i24;
                        i6 = i28;
                        i22 = i22;
                    } else {
                        if (i29 >= i23) {
                            bArr4[i20] = (byte) i27;
                            i20++;
                            s = i24;
                        } else {
                            s = i29;
                        }
                        while (s >= i4) {
                            bArr4[i20] = bArr3[s];
                            i20++;
                            s = sArr[s];
                        }
                        i27 = bArr3[s] & 255;
                        byte b = (byte) i27;
                        bArr2[i18] = b;
                        while (true) {
                            i18++;
                            i9++;
                            if (i20 <= 0) {
                                break;
                            }
                            i20--;
                            bArr2[i18] = bArr4[i20];
                        }
                        byte[] bArr6 = bArr4;
                        if (i23 < 4096) {
                            sArr[i23] = (short) i24;
                            bArr3[i23] = b;
                            i23++;
                            if ((i23 & i13) == 0 && i23 < 4096) {
                                i25++;
                                i13 += i23;
                            }
                        }
                        i24 = i29;
                        i6 = i28;
                        i22 = i22;
                        bArr4 = bArr6;
                    }
                } else {
                    i12 = i23;
                    i11 = i25;
                    i16 = i22;
                    i21 = i27;
                    i7 = i26;
                    i19 = i24;
                    break;
                }
            }
            ntaVar = this;
        }
        Arrays.fill(bArr2, i18, i3, (byte) 0);
    }

    private Bitmap n() {
        Bitmap.Config config;
        Boolean bool = this.s;
        if (bool != null && !bool.booleanValue()) {
            config = this.t;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap c = this.c.c(this.r, this.q, config);
        c.setHasAlpha(true);
        return c;
    }

    private int o() {
        int p = p();
        if (p <= 0) {
            return p;
        }
        ByteBuffer byteBuffer = this.d;
        byteBuffer.get(this.e, 0, Math.min(p, byteBuffer.remaining()));
        return p;
    }

    private int p() {
        return this.d.get() & 255;
    }

    private Bitmap r(pf4 pf4Var, pf4 pf4Var2) {
        int i;
        int i2;
        Bitmap bitmap;
        int[] iArr = this.j;
        int i3 = 0;
        if (pf4Var2 == null) {
            Bitmap bitmap2 = this.m;
            if (bitmap2 != null) {
                this.c.a(bitmap2);
            }
            this.m = null;
            Arrays.fill(iArr, 0);
        }
        if (pf4Var2 != null && pf4Var2.g == 3 && this.m == null) {
            Arrays.fill(iArr, 0);
        }
        if (pf4Var2 != null && (i2 = pf4Var2.g) > 0) {
            if (i2 == 2) {
                if (!pf4Var.f) {
                    sf4 sf4Var = this.l;
                    int i4 = sf4Var.l;
                    if (pf4Var.k == null || sf4Var.j != pf4Var.h) {
                        i3 = i4;
                    }
                }
                int i5 = pf4Var2.d;
                int i6 = this.p;
                int i7 = i5 / i6;
                int i8 = pf4Var2.b / i6;
                int i9 = pf4Var2.c / i6;
                int i10 = pf4Var2.a / i6;
                int i11 = this.r;
                int i12 = (i8 * i11) + i10;
                int i13 = (i7 * i11) + i12;
                while (i12 < i13) {
                    int i14 = i12 + i9;
                    for (int i15 = i12; i15 < i14; i15++) {
                        iArr[i15] = i3;
                    }
                    i12 += this.r;
                }
            } else if (i2 == 3 && (bitmap = this.m) != null) {
                int i16 = this.r;
                bitmap.getPixels(iArr, 0, i16, 0, 0, i16, this.q);
            }
        }
        l(pf4Var);
        if (!pf4Var.e && this.p == 1) {
            k(pf4Var);
        } else {
            j(pf4Var);
        }
        if (this.n && ((i = pf4Var.g) == 0 || i == 1)) {
            if (this.m == null) {
                this.m = n();
            }
            Bitmap bitmap3 = this.m;
            int i17 = this.r;
            bitmap3.setPixels(iArr, 0, i17, 0, 0, i17, this.q);
        }
        Bitmap n = n();
        int i18 = this.r;
        n.setPixels(iArr, 0, i18, 0, 0, i18, this.q);
        return n;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:14:0x003d, B:19:0x0047, B:21:0x004e, B:22:0x0058, B:24:0x0069, B:26:0x0075, B:30:0x007e, B:32:0x0082, B:34:0x008a, B:35:0x00a0, B:38:0x00a4, B:40:0x00a8, B:42:0x00ba, B:44:0x00be, B:45:0x00c2, B:29:0x007a, B:48:0x00c8, B:50:0x00d0, B:10:0x0011, B:12:0x0019, B:13:0x003b), top: B:55:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:14:0x003d, B:19:0x0047, B:21:0x004e, B:22:0x0058, B:24:0x0069, B:26:0x0075, B:30:0x007e, B:32:0x0082, B:34:0x008a, B:35:0x00a0, B:38:0x00a4, B:40:0x00a8, B:42:0x00ba, B:44:0x00be, B:45:0x00c2, B:29:0x007a, B:48:0x00c8, B:50:0x00d0, B:10:0x0011, B:12:0x0019, B:13:0x003b), top: B:55:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:14:0x003d, B:19:0x0047, B:21:0x004e, B:22:0x0058, B:24:0x0069, B:26:0x0075, B:30:0x007e, B:32:0x0082, B:34:0x008a, B:35:0x00a0, B:38:0x00a4, B:40:0x00a8, B:42:0x00ba, B:44:0x00be, B:45:0x00c2, B:29:0x007a, B:48:0x00c8, B:50:0x00d0, B:10:0x0011, B:12:0x0019, B:13:0x003b), top: B:55:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:14:0x003d, B:19:0x0047, B:21:0x004e, B:22:0x0058, B:24:0x0069, B:26:0x0075, B:30:0x007e, B:32:0x0082, B:34:0x008a, B:35:0x00a0, B:38:0x00a4, B:40:0x00a8, B:42:0x00ba, B:44:0x00be, B:45:0x00c2, B:29:0x007a, B:48:0x00c8, B:50:0x00d0, B:10:0x0011, B:12:0x0019, B:13:0x003b), top: B:55:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4 A[Catch: all -> 0x000e, TRY_ENTER, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:14:0x003d, B:19:0x0047, B:21:0x004e, B:22:0x0058, B:24:0x0069, B:26:0x0075, B:30:0x007e, B:32:0x0082, B:34:0x008a, B:35:0x00a0, B:38:0x00a4, B:40:0x00a8, B:42:0x00ba, B:44:0x00be, B:45:0x00c2, B:29:0x007a, B:48:0x00c8, B:50:0x00d0, B:10:0x0011, B:12:0x0019, B:13:0x003b), top: B:55:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0 A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:14:0x003d, B:19:0x0047, B:21:0x004e, B:22:0x0058, B:24:0x0069, B:26:0x0075, B:30:0x007e, B:32:0x0082, B:34:0x008a, B:35:0x00a0, B:38:0x00a4, B:40:0x00a8, B:42:0x00ba, B:44:0x00be, B:45:0x00c2, B:29:0x007a, B:48:0x00c8, B:50:0x00d0, B:10:0x0011, B:12:0x0019, B:13:0x003b), top: B:55:0x0001 }] */
    @Override // defpackage.jf4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized android.graphics.Bitmap a() {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nta.a():android.graphics.Bitmap");
    }

    @Override // defpackage.jf4
    public void b() {
        this.k = (this.k + 1) % this.l.c;
    }

    @Override // defpackage.jf4
    public int c() {
        return this.l.c;
    }

    @Override // defpackage.jf4
    public void clear() {
        this.l = null;
        byte[] bArr = this.i;
        if (bArr != null) {
            this.c.e(bArr);
        }
        int[] iArr = this.j;
        if (iArr != null) {
            this.c.f(iArr);
        }
        Bitmap bitmap = this.m;
        if (bitmap != null) {
            this.c.a(bitmap);
        }
        this.m = null;
        this.d = null;
        this.s = null;
        byte[] bArr2 = this.e;
        if (bArr2 != null) {
            this.c.e(bArr2);
        }
    }

    @Override // defpackage.jf4
    public void d(@NonNull Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config != config3 && config != (config2 = Bitmap.Config.RGB_565)) {
            throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
        }
        this.t = config;
    }

    @Override // defpackage.jf4
    public int e() {
        int i;
        if (this.l.c > 0 && (i = this.k) >= 0) {
            return m(i);
        }
        return 0;
    }

    @Override // defpackage.jf4
    public void f() {
        this.k = -1;
    }

    @Override // defpackage.jf4
    public int g() {
        return this.k;
    }

    @Override // defpackage.jf4
    @NonNull
    public ByteBuffer getData() {
        return this.d;
    }

    @Override // defpackage.jf4
    public int h() {
        return this.d.limit() + this.i.length + (this.j.length * 4);
    }

    public int m(int i) {
        if (i >= 0) {
            sf4 sf4Var = this.l;
            if (i < sf4Var.c) {
                return sf4Var.e.get(i).i;
            }
        }
        return -1;
    }

    public synchronized void q(@NonNull sf4 sf4Var, @NonNull ByteBuffer byteBuffer, int i) {
        try {
            if (i > 0) {
                int highestOneBit = Integer.highestOneBit(i);
                this.o = 0;
                this.l = sf4Var;
                this.k = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.d.order(ByteOrder.LITTLE_ENDIAN);
                this.n = false;
                Iterator<pf4> it = sf4Var.e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (it.next().g == 3) {
                        this.n = true;
                        break;
                    }
                }
                this.p = highestOneBit;
                int i2 = sf4Var.f;
                this.r = i2 / highestOneBit;
                int i3 = sf4Var.g;
                this.q = i3 / highestOneBit;
                this.i = this.c.b(i2 * i3);
                this.j = this.c.d(this.r * this.q);
            } else {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public nta(@NonNull jf4.a aVar) {
        this.b = new int[256];
        this.t = Bitmap.Config.ARGB_8888;
        this.c = aVar;
        this.l = new sf4();
    }
}
