package defpackage;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
/* compiled from: UrlOpener.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lxtb;", "", "", RemoteMessageConst.Notification.URL, "", "showTitle", "", "a", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: xtb  reason: default package */
/* loaded from: classes.dex */
public interface xtb {

    /* compiled from: UrlOpener.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xtb$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ void a(xtb xtbVar, String str, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = true;
                }
                xtbVar.a(str, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: open");
        }
    }

    void a(String str, boolean z);
}
