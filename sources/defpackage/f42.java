package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CustomTabsConnectionPackage.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \t2\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\n"}, d2 = {"Lf42;", "", "", "a", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "b", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: f42  reason: default package */
/* loaded from: classes.dex */
public final class f42 {
    public static final a b = new a(null);
    private final Context a;

    /* compiled from: CustomTabsConnectionPackage.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lf42$a;", "", "", "ACTION_CUSTOM_TABS_CONNECTION", "Ljava/lang/String;", "EMPTY", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: f42$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public f42(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = context;
    }

    public final String a() {
        PackageManager packageManager = this.a.getPackageManager();
        Intent data = new Intent().setAction("android.intent.action.VIEW").setData(Uri.parse("http://www.test-url.com"));
        z65.g(data, "setData(...)");
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(data, 0);
        z65.g(queryIntentActivities, "queryIntentActivities(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : queryIntentActivities) {
            Intent intent = new Intent();
            intent.setAction("android.support.customtabs.action.CustomTabsService");
            intent.setPackage(((ResolveInfo) obj).activityInfo.packageName);
            if (packageManager.resolveService(intent, 0) != null) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return "";
        }
        String str = ((ResolveInfo) arrayList.get(0)).activityInfo.packageName;
        z65.g(str, "packageName");
        return str;
    }
}
