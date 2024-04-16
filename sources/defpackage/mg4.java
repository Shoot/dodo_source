package defpackage;

import androidx.annotation.NonNull;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: mg4  reason: default package */
/* loaded from: classes2.dex */
public final class mg4 {
    private final String a;
    private final String b;

    public mg4(@NonNull String str) {
        this(str, null);
    }

    public mg4(@NonNull String str, String str2) {
        gh8.k(str, "log tag cannot be null");
        gh8.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.a = str;
        if (str2 == null || str2.length() <= 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }
}
