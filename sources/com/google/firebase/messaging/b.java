package com.google.firebase.messaging;

import android.os.Bundle;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.concurrent.TimeUnit;
/* compiled from: Constants.java */
/* loaded from: classes2.dex */
public final class b {
    public static final long a = TimeUnit.MINUTES.toMillis(3);

    /* compiled from: Constants.java */
    /* loaded from: classes2.dex */
    public static final class a {
        public static lr<String, String> a(Bundle bundle) {
            lr<String, String> lrVar = new lr<>();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals(RemoteMessageConst.FROM) && !str.equals(RemoteMessageConst.MSGTYPE) && !str.equals("collapse_key")) {
                        lrVar.put(str, str2);
                    }
                }
            }
            return lrVar;
        }
    }
}
