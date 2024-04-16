package defpackage;

import android.webkit.URLUtil;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
/* compiled from: UrlValidator.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcub;", "Laub;", "", RemoteMessageConst.Notification.URL, "", "a", "<init>", "()V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: cub  reason: default package */
/* loaded from: classes4.dex */
public final class cub implements aub {
    @Override // defpackage.aub
    public boolean a(String str) {
        z65.h(str, RemoteMessageConst.Notification.URL);
        return URLUtil.isValidUrl(str);
    }
}
