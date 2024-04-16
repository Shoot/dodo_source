package androidx.profileinstaller;

import java.util.Arrays;
/* compiled from: ProfileVersion.java */
/* loaded from: classes.dex */
public class j {
    static final byte[] a = {48, 49, 53, 0};
    static final byte[] b = {48, 49, 48, 0};
    static final byte[] c = {48, 48, 57, 0};
    static final byte[] d = {48, 48, 53, 0};
    static final byte[] e = {48, 48, 49, 0};
    static final byte[] f = {48, 48, 49, 0};
    static final byte[] g = {48, 48, 50, 0};

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(byte[] bArr) {
        if (Arrays.equals(bArr, e) || Arrays.equals(bArr, d)) {
            return ":";
        }
        return "!";
    }
}
