package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import kotlin.Metadata;
/* compiled from: Secure3DWebView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0002¨\u0006\u0002"}, d2 = {"Landroid/content/Context;", "b", "app_prodRelease"}, k = 2, mv = {1, 9, 0})
/* renamed from: c3a  reason: default package */
/* loaded from: classes4.dex */
public final class c3a {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Context b(Context context) {
        if (Build.VERSION.SDK_INT <= 22) {
            Context createConfigurationContext = context.createConfigurationContext(new Configuration());
            z65.e(createConfigurationContext);
            return createConfigurationContext;
        }
        return context;
    }
}
