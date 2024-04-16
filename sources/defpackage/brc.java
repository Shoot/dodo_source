package defpackage;

import android.util.Base64;
import java.util.Random;
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* renamed from: brc  reason: default package */
/* loaded from: classes2.dex */
public final class brc {
    private static final Random a = new Random();

    public static String a() {
        byte[] bArr = new byte[16];
        a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
