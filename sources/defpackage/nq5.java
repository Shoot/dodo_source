package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
/* compiled from: LinkResolverDef.java */
/* renamed from: nq5  reason: default package */
/* loaded from: classes3.dex */
public class nq5 implements mq5 {
    @NonNull
    private static Uri b(@NonNull String str) {
        Uri parse = Uri.parse(str);
        if (TextUtils.isEmpty(parse.getScheme())) {
            return parse.buildUpon().scheme("https").build();
        }
        return parse;
    }

    @Override // defpackage.mq5
    public void a(@NonNull View view, @NonNull String str) {
        Uri b = b(str);
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", b);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Log.w("LinkResolverDef", "Actvity was not found for the link: '" + str + "'");
        }
    }
}
