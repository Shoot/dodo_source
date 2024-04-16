package com.huawei.hms.support.api.entity.core;

import android.content.Intent;
import com.huawei.hms.core.aidl.annotation.Packed;
/* loaded from: classes3.dex */
public class JosGetNoticeResp extends JosBaseResp {
    @Packed
    private Intent noticeIntent;

    public Intent getNoticeIntent() {
        return (Intent) get(this.noticeIntent);
    }

    public void setNoticeIntent(Intent intent) {
        this.noticeIntent = intent;
    }

    private static <T> T get(T t) {
        return t;
    }
}
