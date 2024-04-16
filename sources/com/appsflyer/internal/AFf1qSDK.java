package com.appsflyer.internal;

import android.content.Context;
import android.database.Cursor;
import java.util.Map;
/* loaded from: classes.dex */
public final class AFf1qSDK extends AFf1vSDK {
    private final AFc1xSDK AFInAppEventParameterName;

    public AFf1qSDK(Runnable runnable, AFc1xSDK aFc1xSDK) {
        super("store", "samsung", runnable);
        this.AFInAppEventParameterName = aFc1xSDK;
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    public final void AFInAppEventType(Context context) {
        AFInAppEventParameterName(context, new AFb1lSDK<Map<String, Object>>(context, this.AFInAppEventParameterName, "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") { // from class: com.appsflyer.internal.AFf1qSDK.1
            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x00c3, code lost:
                if (r2 != null) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x00c5, code lost:
                r2.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x00d7, code lost:
                if (0 == 0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x00da, code lost:
                r0 = ((android.content.pm.PackageItemInfo) r10.AFInAppEventType.getPackageManager().resolveContentProvider(r10.AFInAppEventParameterName, 128)).packageName;
                r10.AFKeystoreWrapper.values.put("api_ver", java.lang.Long.valueOf(com.appsflyer.internal.AFa1dSDK.AFKeystoreWrapper(r10.AFInAppEventType, r0)));
                r10.AFKeystoreWrapper.values.put("api_ver_name", com.appsflyer.internal.AFa1dSDK.values(r10.AFInAppEventType, r0));
                r10.AFKeystoreWrapper.valueOf();
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x0115, code lost:
                return r10.AFKeystoreWrapper.values;
             */
            @Override // com.appsflyer.internal.AFb1lSDK
            /* renamed from: AFInAppEventType */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.util.Map<java.lang.String, java.lang.Object> AFKeystoreWrapper() {
                /*
                    Method dump skipped, instructions count: 284
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1qSDK.AnonymousClass1.AFKeystoreWrapper():java.util.Map");
            }

            private static void values(String str, Map<String, Object> map, Cursor cursor) {
                String string;
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
                    return;
                }
                map.put(str, string);
            }

            private static void AFInAppEventType(String str, Map<String, Object> map, Cursor cursor) {
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1) {
                    return;
                }
                long j = cursor.getLong(columnIndex);
                if (j == 0) {
                    return;
                }
                map.put(str, Long.valueOf(j));
            }
        });
    }
}
