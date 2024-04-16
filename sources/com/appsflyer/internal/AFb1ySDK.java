package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.Nullable;
/* loaded from: classes.dex */
final class AFb1ySDK extends AFb1lSDK<String> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AFb1ySDK(Context context, AFc1xSDK aFc1xSDK) {
        super(context, aFc1xSDK, "com.facebook.katana.provider.AttributionIdProvider", "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFb1lSDK
    /* renamed from: AFInAppEventType */
    public String AFKeystoreWrapper() {
        Cursor cursor;
        Throwable th;
        try {
            ContentResolver contentResolver = this.AFInAppEventType.getContentResolver();
            StringBuilder sb = new StringBuilder("content://");
            sb.append(this.AFInAppEventParameterName);
            cursor = contentResolver.query(Uri.parse(sb.toString()), new String[]{"aid"}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(cursor.getColumnIndex("aid"));
                        cursor.close();
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th3) {
            cursor = null;
            th = th3;
        }
    }

    @Nullable
    public final String AFInAppEventParameterName() {
        this.values.AFInAppEventParameterName().execute(this.valueOf);
        return (String) super.valueOf();
    }

    @Override // com.appsflyer.internal.AFb1lSDK
    @Nullable
    public final /* synthetic */ String valueOf() {
        this.values.AFInAppEventParameterName().execute(this.valueOf);
        return (String) super.valueOf();
    }
}
