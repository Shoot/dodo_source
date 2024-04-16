package im.threads.business.utils;

import android.net.Uri;
import java.util.List;
import kotlin.Metadata;
/* compiled from: StringExtensions.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\u0018\u0010\u0002\u001a\u00020\u0003*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0001\u001a\u001c\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0001\u001a.\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001¨\u0006\u0010"}, d2 = {"encodeUrl", "", "hasSubstrings", "", "subStrings", "", "paddingEnd", "paddingCount", "", "delimiter", "paddingStart", "paddingStartEnd", "paddingStartCount", "paddingEndCount", "delimiterStart", "delimiterEnd", "threads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StringExtensionsKt {
    public static final String encodeUrl(String str) {
        z65.h(str, "<this>");
        String encode = Uri.encode(str, "@#&=*+-_.,:!?()/~'%");
        z65.g(encode, "encode(this, allowedChars)");
        return encode;
    }

    public static final boolean hasSubstrings(String str, List<String> list) {
        boolean O;
        z65.h(str, "<this>");
        z65.h(list, "subStrings");
        for (String str2 : list) {
            O = m0b.O(str, str2, false, 2, null);
            if (O) {
                return true;
            }
        }
        return false;
    }

    public static final String paddingEnd(String str, int i, String str2) {
        z65.h(str, "<this>");
        z65.h(str2, "delimiter");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(str2);
        }
        String sb2 = sb.toString();
        z65.g(sb2, "stringBuilder.toString()");
        return sb2;
    }

    public static /* synthetic */ String paddingEnd$default(String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = " ";
        }
        return paddingEnd(str, i, str2);
    }

    public static final String paddingStart(String str, int i, String str2) {
        z65.h(str, "<this>");
        z65.h(str2, "delimiter");
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(str2);
        }
        sb.append(str);
        String sb2 = sb.toString();
        z65.g(sb2, "stringBuilder.toString()");
        return sb2;
    }

    public static /* synthetic */ String paddingStart$default(String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = " ";
        }
        return paddingStart(str, i, str2);
    }

    public static final String paddingStartEnd(String str, int i, int i2, String str2, String str3) {
        z65.h(str, "<this>");
        z65.h(str2, "delimiterStart");
        z65.h(str3, "delimiterEnd");
        return paddingEnd(paddingStart(str, i, str2), i2, str3);
    }

    public static /* synthetic */ String paddingStartEnd$default(String str, int i, int i2, String str2, String str3, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            str2 = " ";
        }
        if ((i3 & 8) != 0) {
            str3 = " ";
        }
        return paddingStartEnd(str, i, i2, str2, str3);
    }
}
