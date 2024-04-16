package defpackage;

import android.os.Build;
import android.os.ext.SdkExtensions;
import kotlin.Metadata;
/* compiled from: AdServicesInfo.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lh6;", "", "", "a", "<init>", "()V", "ads-adservices_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: h6  reason: default package */
/* loaded from: classes.dex */
public final class h6 {
    public static final h6 a = new h6();

    /* compiled from: AdServicesInfo.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lh6$a;", "", "", "a", "<init>", "()V", "ads-adservices_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: h6$a */
    /* loaded from: classes.dex */
    private static final class a {
        public static final a a = new a();

        private a() {
        }

        public final int a() {
            int extensionVersion;
            extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            return extensionVersion;
        }
    }

    private h6() {
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return a.a.a();
        }
        return 0;
    }
}
