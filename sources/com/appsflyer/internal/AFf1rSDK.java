package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.RequiresApi;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFf1uSDK;
import com.huawei.hms.adapter.internal.CommonCode;
/* loaded from: classes.dex */
public final class AFf1rSDK extends AFf1uSDK {
    private final AFc1xSDK AFInAppEventParameterName;
    final ProviderInfo valueOf;

    @RequiresApi(api = 19)
    public AFf1rSDK(ProviderInfo providerInfo, Runnable runnable, AFc1xSDK aFc1xSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.AFInAppEventParameterName = aFc1xSDK;
        this.valueOf = providerInfo;
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    public final void AFInAppEventType(final Context context) {
        this.AFInAppEventParameterName.AFInAppEventParameterName().execute(new Runnable() { // from class: com.appsflyer.internal.AFf1rSDK.3
            @Override // java.lang.Runnable
            public final void run() {
                AFf1rSDK aFf1rSDK = AFf1rSDK.this;
                aFf1rSDK.afRDLog = System.currentTimeMillis();
                aFf1rSDK.afDebugLog = AFf1uSDK.AFa1ySDK.STARTED;
                aFf1rSDK.addObserver(new AFf1uSDK.AnonymousClass2());
                StringBuilder sb = new StringBuilder("content://");
                sb.append(AFf1rSDK.this.valueOf.authority);
                sb.append("/transaction_id");
                Uri parse = Uri.parse(sb.toString());
                ContentResolver contentResolver = context.getContentResolver();
                StringBuilder sb2 = new StringBuilder("app_id=");
                sb2.append(context.getPackageName());
                Cursor query = contentResolver.query(parse, null, sb2.toString(), null, null);
                if (query != null) {
                    int columnIndex = query.getColumnIndex(CommonCode.MapKey.TRANSACTION_ID);
                    if (columnIndex == -1) {
                        AFLogger.afWarnLog("[Preinstall]: Wrong column name");
                        AFf1rSDK.this.values.put("response", "FEATURE_NOT_SUPPORTED");
                    } else {
                        AFf1rSDK.this.values.put("response", "OK");
                        if (query.moveToFirst()) {
                            String string = query.getString(columnIndex);
                            query.close();
                            if (string != null && !string.isEmpty()) {
                                AFf1rSDK.this.values.put("referrer", string);
                            }
                        }
                    }
                } else {
                    AFLogger.afWarnLog("[Preinstall]: ContentProvider query failed, got null Cursor");
                    AFf1rSDK.this.values.put("response", "SERVICE_UNAVAILABLE");
                }
                AFf1rSDK aFf1rSDK2 = AFf1rSDK.this;
                aFf1rSDK2.values.put("api_ver", Long.valueOf(AFa1dSDK.AFKeystoreWrapper(context, ((PackageItemInfo) aFf1rSDK2.valueOf).packageName)));
                AFf1rSDK aFf1rSDK3 = AFf1rSDK.this;
                aFf1rSDK3.values.put("api_ver_name", AFa1dSDK.values(context, ((PackageItemInfo) aFf1rSDK3.valueOf).packageName));
                AFf1rSDK.this.valueOf();
            }
        });
    }
}
