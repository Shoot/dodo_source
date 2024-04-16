package com.appsflyer.internal;

import android.content.Context;
import java.util.Map;
/* loaded from: classes.dex */
public final class AFf1tSDK extends AFf1vSDK {
    private final AFc1xSDK valueOf;

    public AFf1tSDK(Runnable runnable, AFc1xSDK aFc1xSDK) {
        super("store", "huawei", runnable);
        this.valueOf = aFc1xSDK;
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    public final void AFInAppEventType(Context context) {
        AFInAppEventParameterName(context, new AFb1lSDK<Map<String, Object>>(context, this.valueOf, "com.huawei.appmarket.commondata", "FFE391E0EA186D0734ED601E4E70E3224B7309D48E2075BAC46D8C667EAE7212", "3BAF59A2E5331C30675FAB35FF5FFF0D116142D3D4664F1C3CB804068B40614F") { // from class: com.appsflyer.internal.AFf1tSDK.4
            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x00fd, code lost:
                if (r2 != null) goto L14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x00ff, code lost:
                r2.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0111, code lost:
                if (0 == 0) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0114, code lost:
                r11.AFKeystoreWrapper.valueOf();
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x011d, code lost:
                return r11.AFKeystoreWrapper.values;
             */
            @Override // com.appsflyer.internal.AFb1lSDK
            /* renamed from: AFInAppEventParameterName */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.util.Map<java.lang.String, java.lang.Object> AFKeystoreWrapper() {
                /*
                    Method dump skipped, instructions count: 292
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1tSDK.AnonymousClass4.AFKeystoreWrapper():java.util.Map");
            }
        });
    }
}
