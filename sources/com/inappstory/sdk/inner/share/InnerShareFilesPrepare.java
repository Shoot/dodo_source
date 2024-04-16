package com.inappstory.sdk.inner.share;

import android.content.Context;
import com.inappstory.sdk.stories.utils.TaskRunner;
import java.util.ArrayList;
/* loaded from: classes3.dex */
public class InnerShareFilesPrepare {

    /* loaded from: classes3.dex */
    class a implements TaskRunner.Callback<ArrayList<String>> {
        final /* synthetic */ ShareFilesPrepareCallback a;

        a(ShareFilesPrepareCallback shareFilesPrepareCallback) {
            this.a = shareFilesPrepareCallback;
        }

        @Override // com.inappstory.sdk.stories.utils.TaskRunner.Callback
        /* renamed from: a */
        public void onComplete(ArrayList<String> arrayList) {
            this.a.onPrepared(arrayList);
        }
    }

    public void prepareFiles(Context context, ShareFilesPrepareCallback shareFilesPrepareCallback, ArrayList<InnerShareFile> arrayList) {
        new TaskRunner().executeAsync(new FilePathFromBase64(context, arrayList), new a(shareFilesPrepareCallback));
    }
}
