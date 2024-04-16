package com.huawei.hms.framework.network.grs.local.model;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes3.dex */
public class a {
    private String a;
    private final Map<String, c> b = new ConcurrentHashMap(16);

    public c a(String str) {
        if (TextUtils.isEmpty(str)) {
            Logger.w("ApplicationBean", "In getServing(String serviceName), the serviceName is Empty or null");
            return null;
        }
        return this.b.get(str);
    }

    public String b() {
        return this.a;
    }

    public void a() {
        Map<String, c> map = this.b;
        if (map != null) {
            map.clear();
        }
    }

    public void b(String str) {
        this.a = str;
    }

    public void a(long j) {
    }

    public void a(String str, c cVar) {
        if (TextUtils.isEmpty(str) || cVar == null) {
            return;
        }
        this.b.put(str, cVar);
    }
}
