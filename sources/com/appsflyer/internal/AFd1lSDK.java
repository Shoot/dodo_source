package com.appsflyer.internal;

import android.support.annotation.NonNull;
import com.appsflyer.deeplink.DeepLinkResult;
/* loaded from: classes.dex */
public final class AFd1lSDK extends AFd1tSDK<DeepLinkResult> {
    private final AFb1pSDK AFLogger;
    private DeepLinkResult afDebugLog;

    /* renamed from: com.appsflyer.internal.AFd1lSDK$3  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[DeepLinkResult.Status.values().length];
            values = iArr;
            try {
                iArr[DeepLinkResult.Status.FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                values[DeepLinkResult.Status.NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                values[DeepLinkResult.Status.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public AFd1lSDK(@NonNull AFb1pSDK aFb1pSDK) {
        super(AFd1wSDK.DLSDK, new AFd1wSDK[]{AFd1wSDK.RC_CDN}, "DdlSdk");
        this.AFLogger = aFb1pSDK;
    }

    @Override // com.appsflyer.internal.AFd1tSDK
    @NonNull
    public final AFc1aSDK AFInAppEventParameterName() throws Exception {
        DeepLinkResult AFLogger = this.AFLogger.AFLogger();
        this.afDebugLog = AFLogger;
        if (AnonymousClass3.values[AFLogger.getStatus().ordinal()] != 1) {
            if (this.afDebugLog.getError() == DeepLinkResult.Error.TIMEOUT) {
                return AFc1aSDK.TIMEOUT;
            }
            return AFc1aSDK.FAILURE;
        }
        return AFc1aSDK.SUCCESS;
    }

    @Override // com.appsflyer.internal.AFd1tSDK
    public final long AFInAppEventType() {
        return 90000L;
    }

    @Override // com.appsflyer.internal.AFd1tSDK
    public final boolean valueOf() {
        return false;
    }
}
