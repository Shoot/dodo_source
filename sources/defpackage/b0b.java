package defpackage;

import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: b0b  reason: default package */
/* loaded from: classes2.dex */
public class b0b {
    private static final Pattern a = Pattern.compile("\\$\\{(.*?)\\}");

    public static boolean a(String str) {
        if (str != null && !str.trim().isEmpty()) {
            return false;
        }
        return true;
    }
}
