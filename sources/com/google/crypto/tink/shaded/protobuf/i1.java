package com.google.crypto.tink.shaded.protobuf;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Utf8.java */
/* loaded from: classes2.dex */
public final class i1 {
    private static final b a;

    /* compiled from: Utf8.java */
    /* loaded from: classes2.dex */
    private static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static void h(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (!m(b2) && (((b << 28) + (b2 + 112)) >> 30) == 0 && !m(b3) && !m(b4)) {
                int r = ((b & 7) << 18) | (r(b2) << 12) | (r(b3) << 6) | r(b4);
                cArr[i] = l(r);
                cArr[i + 1] = q(r);
                return;
            }
            throw InvalidProtocolBufferException.d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void i(byte b, char[] cArr, int i) {
            cArr[i] = (char) b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void j(byte b, byte b2, byte b3, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (!m(b2) && ((b != -32 || b2 >= -96) && ((b != -19 || b2 < -96) && !m(b3)))) {
                cArr[i] = (char) (((b & 15) << 12) | (r(b2) << 6) | r(b3));
                return;
            }
            throw InvalidProtocolBufferException.d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void k(byte b, byte b2, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (b >= -62 && !m(b2)) {
                cArr[i] = (char) (((b & 31) << 6) | r(b2));
                return;
            }
            throw InvalidProtocolBufferException.d();
        }

        private static char l(int i) {
            return (char) ((i >>> 10) + 55232);
        }

        private static boolean m(byte b) {
            if (b > -65) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean n(byte b) {
            if (b >= 0) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean o(byte b) {
            if (b < -16) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean p(byte b) {
            if (b < -32) {
                return true;
            }
            return false;
        }

        private static char q(int i) {
            return (char) ((i & 1023) + 56320);
        }

        private static int r(byte b) {
            return b & 63;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Utf8.java */
    /* loaded from: classes2.dex */
    public static abstract class b {
        b() {
        }

        abstract String a(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException;

        abstract int b(CharSequence charSequence, byte[] bArr, int i, int i2);

        final boolean c(byte[] bArr, int i, int i2) {
            if (d(0, bArr, i, i2) != 0) {
                return false;
            }
            return true;
        }

        abstract int d(int i, byte[] bArr, int i2, int i3);
    }

    /* compiled from: Utf8.java */
    /* loaded from: classes2.dex */
    static final class c extends b {
        c() {
        }

        private static int e(byte[] bArr, int i, int i2) {
            while (i < i2 && bArr[i] >= 0) {
                i++;
            }
            if (i >= i2) {
                return 0;
            }
            return f(bArr, i, i2);
        }

        private static int f(byte[] bArr, int i, int i2) {
            while (i < i2) {
                int i3 = i + 1;
                byte b = bArr[i];
                if (b < 0) {
                    if (b < -32) {
                        if (i3 >= i2) {
                            return b;
                        }
                        if (b >= -62) {
                            i += 2;
                            if (bArr[i3] > -65) {
                            }
                        }
                        return -1;
                    } else if (b < -16) {
                        if (i3 >= i2 - 1) {
                            return i1.l(bArr, i3, i2);
                        }
                        int i4 = i + 2;
                        byte b2 = bArr[i3];
                        if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                            i += 3;
                            if (bArr[i4] > -65) {
                            }
                        }
                        return -1;
                    } else if (i3 >= i2 - 2) {
                        return i1.l(bArr, i3, i2);
                    } else {
                        int i5 = i + 2;
                        byte b3 = bArr[i3];
                        if (b3 <= -65 && (((b << 28) + (b3 + 112)) >> 30) == 0) {
                            int i6 = i + 3;
                            if (bArr[i5] <= -65) {
                                i += 4;
                                if (bArr[i6] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                }
                i = i3;
            }
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i1.b
        String a(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (i < i3) {
                    byte b = bArr[i];
                    if (!a.n(b)) {
                        break;
                    }
                    i++;
                    a.i(b, cArr, i4);
                    i4++;
                }
                int i5 = i4;
                while (i < i3) {
                    int i6 = i + 1;
                    byte b2 = bArr[i];
                    if (a.n(b2)) {
                        int i7 = i5 + 1;
                        a.i(b2, cArr, i5);
                        while (i6 < i3) {
                            byte b3 = bArr[i6];
                            if (!a.n(b3)) {
                                break;
                            }
                            i6++;
                            a.i(b3, cArr, i7);
                            i7++;
                        }
                        i5 = i7;
                        i = i6;
                    } else if (a.p(b2)) {
                        if (i6 < i3) {
                            i += 2;
                            a.k(b2, bArr[i6], cArr, i5);
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.d();
                        }
                    } else if (a.o(b2)) {
                        if (i6 < i3 - 1) {
                            int i8 = i + 2;
                            i += 3;
                            a.j(b2, bArr[i6], bArr[i8], cArr, i5);
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.d();
                        }
                    } else if (i6 < i3 - 2) {
                        byte b4 = bArr[i6];
                        int i9 = i + 3;
                        i += 4;
                        a.h(b2, b4, bArr[i + 2], bArr[i9], cArr, i5);
                        i5 += 2;
                    } else {
                        throw InvalidProtocolBufferException.d();
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
            return r10 + r0;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.i1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int b(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 254
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.i1.c.b(java.lang.CharSequence, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
            if (r8[r9] > (-65)) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
            if (r8[r9] > (-65)) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
            if (r8[r7] > (-65)) goto L51;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.i1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int d(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L86
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L86
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = com.google.crypto.tink.shaded.protobuf.i1.a(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L5c
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5a
                int r7 = com.google.crypto.tink.shaded.protobuf.i1.a(r0, r1)
                return r7
            L5a:
                r9 = 0
                goto L62
            L5c:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L62:
                if (r9 != 0) goto L72
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r9 < r10) goto L6f
                int r7 = com.google.crypto.tink.shaded.protobuf.i1.b(r0, r1, r7)
                return r7
            L6f:
                r5 = r9
                r9 = r7
                r7 = r5
            L72:
                if (r1 > r3) goto L85
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L85
                if (r9 > r3) goto L85
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r7 <= r3) goto L86
            L85:
                return r2
            L86:
                int r7 = e(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.i1.c.d(int, byte[], int, int):int");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Utf8.java */
    /* loaded from: classes2.dex */
    public static class d extends IllegalArgumentException {
        d(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    /* compiled from: Utf8.java */
    /* loaded from: classes2.dex */
    static final class e extends b {
        e() {
        }

        static boolean e() {
            if (h1.E() && h1.F()) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static int f(byte[] r10, long r11, int r13) {
            /*
                int r0 = g(r10, r11, r13)
                int r13 = r13 - r0
                long r0 = (long) r0
                long r11 = r11 + r0
            L7:
                r0 = 0
                r1 = 0
            L9:
                r2 = 1
                if (r13 <= 0) goto L1a
                long r4 = r11 + r2
                byte r1 = com.google.crypto.tink.shaded.protobuf.h1.u(r10, r11)
                if (r1 < 0) goto L19
                int r13 = r13 + (-1)
                r11 = r4
                goto L9
            L19:
                r11 = r4
            L1a:
                if (r13 != 0) goto L1d
                return r0
            L1d:
                int r0 = r13 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L3a
                if (r0 != 0) goto L29
                return r1
            L29:
                int r13 = r13 + (-2)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r11
                byte r11 = com.google.crypto.tink.shaded.protobuf.h1.u(r10, r11)
                if (r11 <= r6) goto L37
                goto L39
            L37:
                r11 = r2
                goto L7
            L39:
                return r5
            L3a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L48
                int r10 = h(r10, r1, r11, r0)
                return r10
            L48:
                int r13 = r13 + (-3)
                long r2 = r2 + r11
                byte r0 = com.google.crypto.tink.shaded.protobuf.h1.u(r10, r11)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L57
                if (r0 < r7) goto L64
            L57:
                r4 = -19
                if (r1 != r4) goto L5d
                if (r0 >= r7) goto L64
            L5d:
                long r11 = r11 + r8
                byte r0 = com.google.crypto.tink.shaded.protobuf.h1.u(r10, r2)
                if (r0 <= r6) goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = h(r10, r1, r11, r0)
                return r10
            L6d:
                int r13 = r13 + (-4)
                long r2 = r2 + r11
                byte r0 = com.google.crypto.tink.shaded.protobuf.h1.u(r10, r11)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r11
                byte r0 = com.google.crypto.tink.shaded.protobuf.h1.u(r10, r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r11 = r11 + r0
                byte r0 = com.google.crypto.tink.shaded.protobuf.h1.u(r10, r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.i1.e.f(byte[], long, int):int");
        }

        private static int g(byte[] bArr, long j, int i) {
            int i2 = 0;
            if (i < 16) {
                return 0;
            }
            while (true) {
                int i3 = i2 + 8;
                if (i3 > i || (h1.A(bArr, h1.h + j) & (-9187201950435737472L)) != 0) {
                    break;
                }
                j += 8;
                i2 = i3;
            }
            while (i2 < i) {
                long j2 = 1 + j;
                if (h1.u(bArr, j) < 0) {
                    return i2;
                }
                i2++;
                j = j2;
            }
            return i;
        }

        private static int h(byte[] bArr, int i, long j, int i2) {
            if (i2 == 0) {
                return i1.i(i);
            }
            if (i2 == 1) {
                return i1.j(i, h1.u(bArr, j));
            }
            if (i2 == 2) {
                return i1.k(i, h1.u(bArr, j), h1.u(bArr, j + 1));
            }
            throw new AssertionError();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i1.b
        String a(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                int g = g(bArr, i, i2) + i;
                int i3 = i + i2;
                while (g < i3 && h1.u(bArr, g) >= 0) {
                    g++;
                }
                if (g == i3) {
                    return new String(bArr, i, i2, y.a);
                }
                char[] cArr = new char[i2];
                int i4 = 0;
                while (i < g) {
                    a.i(h1.u(bArr, i), cArr, i4);
                    i++;
                    i4++;
                }
                int i5 = i4;
                while (g < i3) {
                    int i6 = g + 1;
                    byte u = h1.u(bArr, g);
                    if (a.n(u)) {
                        int i7 = i5 + 1;
                        a.i(u, cArr, i5);
                        while (i6 < i3) {
                            byte u2 = h1.u(bArr, i6);
                            if (!a.n(u2)) {
                                break;
                            }
                            i6++;
                            a.i(u2, cArr, i7);
                            i7++;
                        }
                        i5 = i7;
                        g = i6;
                    } else if (a.p(u)) {
                        if (i6 < i3) {
                            g += 2;
                            a.k(u, h1.u(bArr, i6), cArr, i5);
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.d();
                        }
                    } else if (a.o(u)) {
                        if (i6 < i3 - 1) {
                            int i8 = g + 2;
                            g += 3;
                            a.j(u, h1.u(bArr, i6), h1.u(bArr, i8), cArr, i5);
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.d();
                        }
                    } else if (i6 < i3 - 2) {
                        int i9 = g + 3;
                        g += 4;
                        a.h(u, h1.u(bArr, i6), h1.u(bArr, g + 2), h1.u(bArr, i9), cArr, i5);
                        i5 += 2;
                    } else {
                        throw InvalidProtocolBufferException.d();
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i1.b
        int b(CharSequence charSequence, byte[] bArr, int i, int i2) {
            long j;
            String str;
            String str2;
            int i3;
            long j2;
            long j3;
            char charAt;
            long j4 = i;
            long j5 = i2 + j4;
            int length = charSequence.length();
            String str3 = " at index ";
            String str4 = "Failed writing ";
            if (length <= i2 && bArr.length - i2 >= i) {
                int i4 = 0;
                while (true) {
                    j = 1;
                    if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                        break;
                    }
                    h1.K(bArr, j4, (byte) charAt);
                    i4++;
                    j4 = 1 + j4;
                }
                if (i4 == length) {
                    return (int) j4;
                }
                while (i4 < length) {
                    char charAt2 = charSequence.charAt(i4);
                    if (charAt2 < 128 && j4 < j5) {
                        h1.K(bArr, j4, (byte) charAt2);
                        j3 = j5;
                        str2 = str4;
                        j2 = j;
                        j4 += j;
                        str = str3;
                    } else {
                        if (charAt2 < 2048 && j4 <= j5 - 2) {
                            str = str3;
                            str2 = str4;
                            long j6 = j4 + j;
                            h1.K(bArr, j4, (byte) ((charAt2 >>> 6) | 960));
                            j4 += 2;
                            h1.K(bArr, j6, (byte) ((charAt2 & '?') | 128));
                        } else {
                            str = str3;
                            str2 = str4;
                            if ((charAt2 < 55296 || 57343 < charAt2) && j4 <= j5 - 3) {
                                h1.K(bArr, j4, (byte) ((charAt2 >>> '\f') | 480));
                                long j7 = j4 + 2;
                                h1.K(bArr, j4 + 1, (byte) (((charAt2 >>> 6) & 63) | 128));
                                j4 += 3;
                                h1.K(bArr, j7, (byte) ((charAt2 & '?') | 128));
                            } else if (j4 <= j5 - 4) {
                                int i5 = i4 + 1;
                                if (i5 != length) {
                                    char charAt3 = charSequence.charAt(i5);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        j2 = 1;
                                        h1.K(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                        j3 = j5;
                                        h1.K(bArr, j4 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                        long j8 = j4 + 3;
                                        h1.K(bArr, j4 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                        j4 += 4;
                                        h1.K(bArr, j8, (byte) ((codePoint & 63) | 128));
                                        i4 = i5;
                                    } else {
                                        i4 = i5;
                                    }
                                }
                                throw new d(i4 - 1, length);
                            } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                                throw new d(i4, length);
                            } else {
                                throw new ArrayIndexOutOfBoundsException(str2 + charAt2 + str + j4);
                            }
                        }
                        j3 = j5;
                        j2 = 1;
                    }
                    i4++;
                    str3 = str;
                    str4 = str2;
                    j = j2;
                    j5 = j3;
                }
                return (int) j4;
            }
            throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i + i2));
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
            if (com.google.crypto.tink.shaded.protobuf.h1.u(r13, r2) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
            if (com.google.crypto.tink.shaded.protobuf.h1.u(r13, r2) > (-65)) goto L56;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.i1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int d(int r12, byte[] r13, int r14, int r15) {
            /*
                Method dump skipped, instructions count: 204
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.i1.e.d(int, byte[], int, int):int");
        }
    }

    static {
        b cVar;
        if (e.e() && !com.google.crypto.tink.shaded.protobuf.d.c()) {
            cVar = new e();
        } else {
            cVar = new c();
        }
        a = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
        return a.a(bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return a.b(charSequence, bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i < length) {
                char charAt = charSequence.charAt(i);
                if (charAt < 2048) {
                    i2 += (127 - charAt) >>> 31;
                    i++;
                } else {
                    i2 += h(charSequence, i);
                    break;
                }
            } else {
                break;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i2 + 4294967296L));
    }

    private static int h(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i) >= 65536) {
                        i++;
                    } else {
                        throw new d(i, length);
                    }
                }
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int j(int i, int i2) {
        if (i <= -12 && i2 <= -65) {
            return i ^ (i2 << 8);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int i, int i2, int i3) {
        if (i <= -12 && i2 <= -65 && i3 <= -65) {
            return (i ^ (i2 << 8)) ^ (i3 << 16);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return k(b2, bArr[i], bArr[i + 1]);
                }
                throw new AssertionError();
            }
            return j(b2, bArr[i]);
        }
        return i(b2);
    }

    public static boolean m(byte[] bArr) {
        return a.c(bArr, 0, bArr.length);
    }

    public static boolean n(byte[] bArr, int i, int i2) {
        return a.c(bArr, i, i2);
    }
}
