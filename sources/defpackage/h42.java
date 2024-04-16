package defpackage;

import android.content.Context;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import com.dodopizza.android.customtabs.CustomTabs;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CustomTabsOpener.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0007B'\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\u0016"}, d2 = {"Lh42;", "Lxtb;", "", RemoteMessageConst.Notification.URL, "", "showTitle", "", "a", "Lcom/dodopizza/android/customtabs/CustomTabs;", "Lcom/dodopizza/android/customtabs/CustomTabs;", "customTabs", "Lop5;", "lifecycleOwner", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lf42;", "customTabsConnectionPackage", "Llg0;", "browserIntentFallback", "<init>", "(Lop5;Landroid/content/Context;Lf42;Llg0;)V", "b", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: h42  reason: default package */
/* loaded from: classes.dex */
public final class h42 implements xtb {
    public static final a b = new a(null);
    private final CustomTabs a;

    /* compiled from: CustomTabsOpener.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh42$a;", "", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: h42$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public h42(op5 op5Var, Context context, f42 f42Var, lg0 lg0Var) {
        z65.h(op5Var, "lifecycleOwner");
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(f42Var, "customTabsConnectionPackage");
        z65.h(lg0Var, "browserIntentFallback");
        CustomTabs customTabs = new CustomTabs(context, lg0Var, f42Var);
        customTabs.m(op5Var);
        this.a = customTabs;
    }

    @Override // defpackage.xtb
    public void a(String str, boolean z) {
        z65.h(str, RemoteMessageConst.Notification.URL);
        CustomTabs customTabs = this.a;
        Uri parse = Uri.parse(str);
        z65.g(parse, "parse(...)");
        customTabs.l(parse, z);
    }
}
