package com.huawei.hms.common;

import android.content.Context;
/* loaded from: classes3.dex */
public interface HuaweiApiInterface {
    void setHostContext(Context context);

    void setInnerHms();

    void setSubAppId(String str) throws ApiException;
}
