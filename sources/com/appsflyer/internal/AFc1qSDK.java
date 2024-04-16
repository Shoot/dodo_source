package com.appsflyer.internal;

import android.support.annotation.VisibleForTesting;
import ch.qos.logback.core.CoreConstants;
import com.appsflyer.AppsFlyerLib;
import com.inappstory.sdk.network.NetworkHandler;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\u0018\u0000 \u00012\u00020\r:\u0001\u0001BE\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/appsflyer/internal/AFc1qSDK;", "AFa1vSDK", "", "p0", "", "p1", "", "p2", "p3", "", "p4", "<init>", "(Ljava/lang/String;Ljava/util/Map;[BLjava/lang/String;Z)V", "Lcom/appsflyer/internal/AFc1gSDK;"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFc1qSDK extends AFc1sSDK {
    public static final AFa1vSDK AFa1vSDK = new AFa1vSDK(null);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\b\u0086\u0003\u0018\u00002\u00020\rB\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\u0007\u001a\u0006*\u00020\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/appsflyer/internal/AFc1qSDK$AFa1vSDK;", "", "p0", "p1", "p2", "p3", "p4", "AFInAppEventParameterName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", CoreConstants.VALUE_OF, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "<init>", "()V", ""}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class AFa1vSDK {
        private AFa1vSDK() {
        }

        public /* synthetic */ AFa1vSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @VisibleForTesting
        public static String AFInAppEventParameterName(String str, String str2, String str3, String str4, String str5) {
            z65.h(str, "");
            z65.h(str2, "");
            z65.h(str4, "");
            z65.h(str5, "");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            return AFa1aSDK.values(AFa1aSDK.values(str5, str3, sb.toString()), str4);
        }

        static String valueOf(String str, String str2, String str3) {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format(AFc1pSDK.valueOf, AppsFlyerLib.getInstance().getHostPrefix(), AFb1zSDK.AFInAppEventType().getHostName()));
            sb.append(str);
            sb.append(str3);
            sb.append("?device_id=");
            sb.append(str2);
            return sb.toString();
        }
    }

    /* synthetic */ AFc1qSDK(String str, Map map, byte[] bArr, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i & 4) != 0 ? null : bArr, (i & 8) != 0 ? NetworkHandler.GET : str2, (i & 16) != 0 ? false : z);
    }

    public static final AFc1qSDK AFKeystoreWrapper(String str, String str2, String str3, String str4) {
        Map k;
        z65.h(str, "");
        z65.h(str3, "");
        z65.h(str4, "");
        String valueOf = AFa1vSDK.valueOf(str, str2, str3);
        String valueOf2 = String.valueOf(System.currentTimeMillis());
        k = g86.k(lnb.a("Connection", "close"), lnb.a("af_request_epoch_ms", valueOf2), lnb.a("af_sig", AFa1vSDK.AFInAppEventParameterName(str, str3, str2, str4, valueOf2)));
        AFc1qSDK aFc1qSDK = new AFc1qSDK(valueOf, k, null, null, false, 28, null);
        aFc1qSDK.AFInAppEventParameterName(10000);
        return aFc1qSDK;
    }

    private AFc1qSDK(String str, Map<String, String> map, byte[] bArr, String str2, boolean z) {
        super(str, bArr, str2, map, z);
    }
}
