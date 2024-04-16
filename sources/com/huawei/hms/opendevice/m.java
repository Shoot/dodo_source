package com.huawei.hms.opendevice;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;
import defpackage.tmb;
import java.util.Map;
import org.slf4j.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReportAaidToken.java */
/* loaded from: classes3.dex */
public class m extends Thread {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;

    public m(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        boolean b;
        boolean d;
        String c;
        if (p.b()) {
            b = n.b(this.a);
            if (b) {
                return;
            }
            String a = o.a(this.a);
            if (!TextUtils.isEmpty(a)) {
                d = n.d(this.a, a, this.b);
                if (!d) {
                    HMSLog.d("ReportAaidToken", "This time need not report.");
                    return;
                }
                String a2 = z.d(this.a).a(tmb.f.REGION_JSON_NAME);
                if (TextUtils.isEmpty(a2)) {
                    HMSLog.i("ReportAaidToken", "The data storage region is empty.");
                    return;
                }
                String a3 = e.a(this.a, "com.huawei.hms.opendevicesdk", Logger.ROOT_LOGGER_NAME, null, a2);
                if (!TextUtils.isEmpty(a3)) {
                    c = n.c(this.a, a, this.b);
                    Context context = this.a;
                    n.b(this.a, d.a(context, a3 + "/rest/appdata/v1/aaid/report", c, (Map<String, String>) null), a, this.b);
                    return;
                }
                return;
            }
            HMSLog.w("ReportAaidToken", "AAID is empty.");
            return;
        }
        HMSLog.d("ReportAaidToken", "Not HW Phone.");
    }
}
