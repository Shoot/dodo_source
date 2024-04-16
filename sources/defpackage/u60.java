package defpackage;

import android.util.Base64;
import androidx.annotation.NonNull;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: u60  reason: default package */
/* loaded from: classes2.dex */
public final class u60 {
    @NonNull
    public static String a(@NonNull byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
