package defpackage;

import defpackage.lk0;
import java.util.Arrays;
import kotlin.Metadata;
/* compiled from: Base64.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\r\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000\u001a\u0016\u0010\u0004\u001a\u00020\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0000\" \u0010\n\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0002\u0010\u0005\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\" \u0010\r\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\u0007¨\u0006\u000e"}, d2 = {"", "", "a", "map", "b", "[B", "getBASE64", "()[B", "getBASE64$annotations", "()V", "BASE64", "getBASE64_URL_SAFE", "getBASE64_URL_SAFE$annotations", "BASE64_URL_SAFE", "okio"}, k = 2, mv = {1, 9, 0})
/* renamed from: c  reason: default package */
/* loaded from: classes3.dex */
public final class c {
    private static final byte[] a;
    private static final byte[] b;

    static {
        lk0.a aVar = lk0.d;
        a = aVar.d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").u();
        b = aVar.d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").u();
    }

    public static final byte[] a(String str) {
        int i;
        char charAt;
        z65.h(str, "<this>");
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length--;
        }
        int i2 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            char charAt2 = str.charAt(i6);
            if ('A' <= charAt2 && charAt2 < '[') {
                i = charAt2 - 'A';
            } else if ('a' <= charAt2 && charAt2 < '{') {
                i = charAt2 - 'G';
            } else if ('0' <= charAt2 && charAt2 < ':') {
                i = charAt2 + 4;
            } else if (charAt2 != '+' && charAt2 != '-') {
                if (charAt2 != '/' && charAt2 != '_') {
                    if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                        return null;
                    }
                } else {
                    i = 63;
                }
            } else {
                i = 62;
            }
            i4 = (i4 << 6) | i;
            i3++;
            if (i3 % 4 == 0) {
                bArr[i5] = (byte) (i4 >> 16);
                int i7 = i5 + 2;
                bArr[i5 + 1] = (byte) (i4 >> 8);
                i5 += 3;
                bArr[i7] = (byte) i4;
            }
        }
        int i8 = i3 % 4;
        if (i8 == 1) {
            return null;
        }
        if (i8 != 2) {
            if (i8 == 3) {
                int i9 = i4 << 6;
                int i10 = i5 + 1;
                bArr[i5] = (byte) (i9 >> 16);
                i5 += 2;
                bArr[i10] = (byte) (i9 >> 8);
            }
        } else {
            bArr[i5] = (byte) ((i4 << 12) >> 16);
            i5++;
        }
        if (i5 == i2) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, i5);
        z65.g(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static final String b(byte[] bArr, byte[] bArr2) {
        z65.h(bArr, "<this>");
        z65.h(bArr2, "map");
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b2 = bArr[i];
            int i3 = i + 2;
            byte b3 = bArr[i + 1];
            i += 3;
            byte b4 = bArr[i3];
            bArr3[i2] = bArr2[(b2 & 255) >> 2];
            bArr3[i2 + 1] = bArr2[((b2 & 3) << 4) | ((b3 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr3[i2 + 2] = bArr2[((b3 & 15) << 2) | ((b4 & 255) >> 6)];
            i2 += 4;
            bArr3[i4] = bArr2[b4 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 != 1) {
            if (length2 == 2) {
                int i5 = i + 1;
                byte b5 = bArr[i];
                byte b6 = bArr[i5];
                bArr3[i2] = bArr2[(b5 & 255) >> 2];
                bArr3[i2 + 1] = bArr2[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
                bArr3[i2 + 2] = bArr2[(b6 & 15) << 2];
                bArr3[i2 + 3] = 61;
            }
        } else {
            byte b7 = bArr[i];
            bArr3[i2] = bArr2[(b7 & 255) >> 2];
            bArr3[i2 + 1] = bArr2[(b7 & 3) << 4];
            bArr3[i2 + 2] = 61;
            bArr3[i2 + 3] = 61;
        }
        return sdc.c(bArr3);
    }

    public static /* synthetic */ String c(byte[] bArr, byte[] bArr2, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr2 = a;
        }
        return b(bArr, bArr2);
    }
}
