package com.huawei.hms.support.api.entity.opendevice;

import com.huawei.hms.core.aidl.AbstractMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
/* loaded from: classes3.dex */
public class OdidResp extends AbstractMessageEntity {
    @Packed
    public String id;

    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        this.id = str;
    }
}
