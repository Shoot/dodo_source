package defpackage;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: BitReader.java */
/* renamed from: ob0  reason: default package */
/* loaded from: classes3.dex */
final class ob0 {
    private InputStream d;
    private boolean e;
    long f;
    int g;
    private int h;
    private final byte[] a = new byte[4160];
    private final int[] b = new int[1040];
    private final v55 c = new v55();
    private int i = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(ob0 ob0Var, boolean z) {
        if (!ob0Var.e) {
            return;
        }
        int i = ((ob0Var.h << 2) + ((ob0Var.g + 7) >> 3)) - 8;
        int i2 = ob0Var.i;
        if (i <= i2) {
            if (z && i != i2) {
                throw new kg0("Unused bytes after end");
            }
            return;
        }
        throw new kg0("Read after end");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(ob0 ob0Var) throws IOException {
        InputStream inputStream = ob0Var.d;
        ob0Var.d = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(ob0 ob0Var, byte[] bArr, int i, int i2) {
        if ((ob0Var.g & 7) == 0) {
            while (true) {
                int i3 = ob0Var.g;
                if (i3 == 64 || i2 == 0) {
                    break;
                }
                bArr[i] = (byte) (ob0Var.f >>> i3);
                ob0Var.g = i3 + 8;
                i2--;
                i++;
            }
            if (i2 == 0) {
                return;
            }
            int min = Math.min(f(ob0Var), i2 >> 2);
            if (min > 0) {
                int i4 = min << 2;
                System.arraycopy(ob0Var.a, ob0Var.h << 2, bArr, i, i4);
                i += i4;
                i2 -= i4;
                ob0Var.h += min;
            }
            if (i2 == 0) {
                return;
            }
            if (f(ob0Var) > 0) {
                d(ob0Var);
                while (i2 != 0) {
                    long j = ob0Var.f;
                    int i5 = ob0Var.g;
                    bArr[i] = (byte) (j >>> i5);
                    ob0Var.g = i5 + 8;
                    i2--;
                    i++;
                }
                a(ob0Var, false);
                return;
            }
            while (i2 > 0) {
                try {
                    int read = ob0Var.d.read(bArr, i, i2);
                    if (read != -1) {
                        i += read;
                        i2 -= read;
                    } else {
                        throw new kg0("Unexpected end of input");
                    }
                } catch (IOException e) {
                    throw new kg0("Failed to read input", e);
                }
            }
            return;
        }
        throw new kg0("Unaligned copyBytes");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(ob0 ob0Var) {
        int i = ob0Var.g;
        if (i >= 32) {
            int[] iArr = ob0Var.b;
            int i2 = ob0Var.h;
            ob0Var.h = i2 + 1;
            ob0Var.f = (iArr[i2] << 32) | (ob0Var.f >>> 32);
            ob0Var.g = i - 32;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(ob0 ob0Var, InputStream inputStream) {
        if (ob0Var.d == null) {
            v55.b(ob0Var.c, ob0Var.a, ob0Var.b);
            ob0Var.d = inputStream;
            ob0Var.f = 0L;
            ob0Var.g = 64;
            ob0Var.h = 1024;
            ob0Var.e = false;
            h(ob0Var);
            return;
        }
        throw new IllegalStateException("Bit reader already has associated input stream");
    }

    static int f(ob0 ob0Var) {
        int i;
        if (ob0Var.e) {
            i = (ob0Var.i + 3) >> 2;
        } else {
            i = 1024;
        }
        return i - ob0Var.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(ob0 ob0Var) {
        int i = (64 - ob0Var.g) & 7;
        if (i != 0 && i(ob0Var, i) != 0) {
            throw new kg0("Corrupted padding bits");
        }
    }

    private static void h(ob0 ob0Var) {
        j(ob0Var);
        a(ob0Var, false);
        d(ob0Var);
        d(ob0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(ob0 ob0Var, int i) {
        d(ob0Var);
        long j = ob0Var.f;
        int i2 = ob0Var.g;
        int i3 = ((int) (j >>> i2)) & ((1 << i) - 1);
        ob0Var.g = i2 + i;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
        r4.e = true;
        r4.i = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
        r1 = r1 + 3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j(defpackage.ob0 r4) {
        /*
            int r0 = r4.h
            r1 = 1015(0x3f7, float:1.422E-42)
            if (r0 > r1) goto L7
            return
        L7:
            boolean r1 = r4.e
            if (r1 == 0) goto L1b
            int r4 = f(r4)
            r0 = -2
            if (r4 < r0) goto L13
            return
        L13:
            kg0 r4 = new kg0
            java.lang.String r0 = "No more input"
            r4.<init>(r0)
            throw r4
        L1b:
            int r0 = r0 << 2
            int r1 = 4096 - r0
            byte[] r2 = r4.a
            r3 = 0
            java.lang.System.arraycopy(r2, r0, r2, r3, r1)
            r4.h = r3
        L27:
            r0 = 4096(0x1000, float:5.74E-42)
            if (r1 >= r0) goto L4b
            java.io.InputStream r0 = r4.d     // Catch: java.io.IOException -> L3f
            byte[] r2 = r4.a     // Catch: java.io.IOException -> L3f
            int r3 = 4096 - r1
            int r0 = r0.read(r2, r1, r3)     // Catch: java.io.IOException -> L3f
            if (r0 > 0) goto L41
            r0 = 1
            r4.e = r0     // Catch: java.io.IOException -> L3f
            r4.i = r1     // Catch: java.io.IOException -> L3f
            int r1 = r1 + 3
            goto L4b
        L3f:
            r4 = move-exception
            goto L43
        L41:
            int r1 = r1 + r0
            goto L27
        L43:
            kg0 r0 = new kg0
            java.lang.String r1 = "Failed to read input"
            r0.<init>(r1, r4)
            throw r0
        L4b:
            v55 r4 = r4.c
            int r0 = r1 >> 2
            defpackage.v55.a(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ob0.j(ob0):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void k(ob0 ob0Var) {
        if (ob0Var.g == 64) {
            h(ob0Var);
        }
    }
}
