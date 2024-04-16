package defpackage;
/* compiled from: Transform.java */
/* renamed from: pkb  reason: default package */
/* loaded from: classes3.dex */
final class pkb {
    static final pkb[] d = {new pkb("", 0, ""), new pkb("", 0, " "), new pkb(" ", 0, " "), new pkb("", 12, ""), new pkb("", 10, " "), new pkb("", 0, " the "), new pkb(" ", 0, ""), new pkb("s ", 0, " "), new pkb("", 0, " of "), new pkb("", 10, ""), new pkb("", 0, " and "), new pkb("", 13, ""), new pkb("", 1, ""), new pkb(", ", 0, " "), new pkb("", 0, ", "), new pkb(" ", 10, " "), new pkb("", 0, " in "), new pkb("", 0, " to "), new pkb("e ", 0, " "), new pkb("", 0, "\""), new pkb("", 0, "."), new pkb("", 0, "\">"), new pkb("", 0, "\n"), new pkb("", 3, ""), new pkb("", 0, "]"), new pkb("", 0, " for "), new pkb("", 14, ""), new pkb("", 2, ""), new pkb("", 0, " a "), new pkb("", 0, " that "), new pkb(" ", 10, ""), new pkb("", 0, ". "), new pkb(".", 0, ""), new pkb(" ", 0, ", "), new pkb("", 15, ""), new pkb("", 0, " with "), new pkb("", 0, "'"), new pkb("", 0, " from "), new pkb("", 0, " by "), new pkb("", 16, ""), new pkb("", 17, ""), new pkb(" the ", 0, ""), new pkb("", 4, ""), new pkb("", 0, ". The "), new pkb("", 11, ""), new pkb("", 0, " on "), new pkb("", 0, " as "), new pkb("", 0, " is "), new pkb("", 7, ""), new pkb("", 1, "ing "), new pkb("", 0, "\n\t"), new pkb("", 0, ":"), new pkb(" ", 0, ". "), new pkb("", 0, "ed "), new pkb("", 20, ""), new pkb("", 18, ""), new pkb("", 6, ""), new pkb("", 0, "("), new pkb("", 10, ", "), new pkb("", 8, ""), new pkb("", 0, " at "), new pkb("", 0, "ly "), new pkb(" the ", 0, " of "), new pkb("", 5, ""), new pkb("", 9, ""), new pkb(" ", 10, ", "), new pkb("", 10, "\""), new pkb(".", 0, "("), new pkb("", 11, " "), new pkb("", 10, "\">"), new pkb("", 0, "=\""), new pkb(" ", 0, "."), new pkb(".com/", 0, ""), new pkb(" the ", 0, " of the "), new pkb("", 10, "'"), new pkb("", 0, ". This "), new pkb("", 0, ","), new pkb(".", 0, " "), new pkb("", 10, "("), new pkb("", 10, "."), new pkb("", 0, " not "), new pkb(" ", 0, "=\""), new pkb("", 0, "er "), new pkb(" ", 11, " "), new pkb("", 0, "al "), new pkb(" ", 11, ""), new pkb("", 0, "='"), new pkb("", 11, "\""), new pkb("", 10, ". "), new pkb(" ", 0, "("), new pkb("", 0, "ful "), new pkb(" ", 10, ". "), new pkb("", 0, "ive "), new pkb("", 0, "less "), new pkb("", 11, "'"), new pkb("", 0, "est "), new pkb(" ", 10, "."), new pkb("", 11, "\">"), new pkb(" ", 0, "='"), new pkb("", 10, ","), new pkb("", 0, "ize "), new pkb("", 11, "."), new pkb("Â ", 0, ""), new pkb(" ", 0, ","), new pkb("", 10, "=\""), new pkb("", 11, "=\""), new pkb("", 0, "ous "), new pkb("", 11, ", "), new pkb("", 10, "='"), new pkb(" ", 10, ","), new pkb(" ", 11, "=\""), new pkb(" ", 11, ", "), new pkb("", 11, ","), new pkb("", 11, "("), new pkb("", 11, ". "), new pkb(" ", 11, "."), new pkb("", 11, "='"), new pkb(" ", 11, ". "), new pkb(" ", 10, "=\""), new pkb(" ", 11, "='"), new pkb(" ", 10, "='")};
    private final byte[] a;
    private final int b;
    private final byte[] c;

    pkb(String str, int i, String str2) {
        this.a = a(str);
        this.b = i;
        this.c = a(str2);
    }

    static byte[] a(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(byte[] bArr, int i, byte[] bArr2, int i2, int i3, pkb pkbVar) {
        int i4 = i;
        for (byte b : pkbVar.a) {
            bArr[i4] = b;
            i4++;
        }
        int i5 = pkbVar.b;
        int a = t6c.a(i5);
        if (a > i3) {
            a = i3;
        }
        int i6 = i2 + a;
        int b2 = (i3 - a) - t6c.b(i5);
        int i7 = b2;
        while (i7 > 0) {
            bArr[i4] = bArr2[i6];
            i7--;
            i4++;
            i6++;
        }
        if (i5 == 11 || i5 == 10) {
            int i8 = i4 - b2;
            if (i5 == 10) {
                b2 = 1;
            }
            while (b2 > 0) {
                byte b3 = bArr[i8];
                int i9 = b3 & 255;
                if (i9 < 192) {
                    if (i9 >= 97 && i9 <= 122) {
                        bArr[i8] = (byte) (b3 ^ 32);
                    }
                    i8++;
                    b2--;
                } else if (i9 < 224) {
                    int i10 = i8 + 1;
                    bArr[i10] = (byte) (bArr[i10] ^ 32);
                    i8 += 2;
                    b2 -= 2;
                } else {
                    int i11 = i8 + 2;
                    bArr[i11] = (byte) (bArr[i11] ^ 5);
                    i8 += 3;
                    b2 -= 3;
                }
            }
        }
        for (byte b4 : pkbVar.c) {
            bArr[i4] = b4;
            i4++;
        }
        return i4 - i;
    }
}
