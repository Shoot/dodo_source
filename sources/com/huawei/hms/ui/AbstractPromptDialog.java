package com.huawei.hms.ui;

import android.content.Context;
import com.huawei.hms.utils.ResourceLoaderUtil;
/* loaded from: classes3.dex */
public abstract class AbstractPromptDialog extends AbstractDialog {
    @Override // com.huawei.hms.ui.AbstractDialog
    public String onGetNegativeButtonString(Context context) {
        return null;
    }

    @Override // com.huawei.hms.ui.AbstractDialog
    public String onGetTitleString(Context context) {
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(context);
        }
        return ResourceLoaderUtil.getString("hms_bindfaildlg_title");
    }
}
