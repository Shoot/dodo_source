package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
final class j4 extends g4 {
    @Override // com.google.android.gms.internal.measurement.g4
    final int a(int i, byte[] bArr, int i2, int i3) {
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return 0;
        }
        while (i2 < i3) {
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b < 0) {
                if (b < -32) {
                    if (i4 >= i3) {
                        return b;
                    }
                    if (b >= -62) {
                        i2 += 2;
                        if (bArr[i4] > -65) {
                        }
                    }
                    return -1;
                } else if (b < -16) {
                    if (i4 >= i3 - 1) {
                        return f4.c(bArr, i4, i3);
                    }
                    int i5 = i2 + 2;
                    byte b2 = bArr[i4];
                    if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                        i2 += 3;
                        if (bArr[i5] > -65) {
                        }
                    }
                    return -1;
                } else if (i4 >= i3 - 2) {
                    return f4.c(bArr, i4, i3);
                } else {
                    int i6 = i2 + 2;
                    byte b3 = bArr[i4];
                    if (b3 <= -65 && (((b << 28) + (b3 + 112)) >> 30) == 0) {
                        int i7 = i2 + 3;
                        if (bArr[i6] <= -65) {
                            i2 += 4;
                            if (bArr[i7] > -65) {
                            }
                        }
                    }
                    return -1;
                }
            }
            i2 = i4;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        return r10 + r0;
     */
    @Override // com.google.android.gms.internal.measurement.g4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(java.lang.String r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.j4.b(java.lang.String, byte[], int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.g4
    public final String c(byte[] bArr, int i, int i2) throws zzjq {
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = bArr[i];
                if (b < 0) {
                    break;
                }
                i++;
                h4.d(b, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = bArr[i];
                if (b2 >= 0) {
                    int i7 = i5 + 1;
                    h4.d(b2, cArr, i5);
                    while (i6 < i3) {
                        byte b3 = bArr[i6];
                        if (b3 < 0) {
                            break;
                        }
                        i6++;
                        h4.d(b3, cArr, i7);
                        i7++;
                    }
                    i5 = i7;
                    i = i6;
                } else if (b2 < -32) {
                    if (i6 < i3) {
                        i += 2;
                        h4.c(b2, bArr[i6], cArr, i5);
                        i5++;
                    } else {
                        throw zzjq.c();
                    }
                } else if (b2 < -16) {
                    if (i6 < i3 - 1) {
                        int i8 = i + 2;
                        i += 3;
                        h4.b(b2, bArr[i6], bArr[i8], cArr, i5);
                        i5++;
                    } else {
                        throw zzjq.c();
                    }
                } else if (i6 < i3 - 2) {
                    byte b4 = bArr[i6];
                    int i9 = i + 3;
                    i += 4;
                    h4.a(b2, b4, bArr[i + 2], bArr[i9], cArr, i5);
                    i5 += 2;
                } else {
                    throw zzjq.c();
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
    }
}
