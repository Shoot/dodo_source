package defpackage;

import android.webkit.URLUtil;
import kotlin.Metadata;
/* compiled from: UrlValidator.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"Lbub;", "", "", "item", "", "a", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: bub  reason: default package */
/* loaded from: classes.dex */
public final class bub {
    public boolean a(String str) {
        if (!URLUtil.isHttpUrl(str) && !URLUtil.isHttpsUrl(str)) {
            return false;
        }
        return true;
    }
}
