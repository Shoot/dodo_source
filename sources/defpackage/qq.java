package defpackage;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: AppsFlyerService.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u0011"}, d2 = {"Lqq;", "Lpq;", "", "customerId", "", "b", "a", "updatedToken", c.a, "Lcom/appsflyer/AppsFlyerLib;", "Lcom/appsflyer/AppsFlyerLib;", "appsFlyerLib", "Landroid/content/Context;", "Landroid/content/Context;", "appContext", "<init>", "(Lcom/appsflyer/AppsFlyerLib;Landroid/content/Context;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: qq  reason: default package */
/* loaded from: classes4.dex */
public final class qq implements pq {
    private final AppsFlyerLib a;
    private final Context b;

    public qq(AppsFlyerLib appsFlyerLib, Context context) {
        z65.h(appsFlyerLib, "appsFlyerLib");
        z65.h(context, "appContext");
        this.a = appsFlyerLib;
        this.b = context;
    }

    @Override // defpackage.pq
    public String a() {
        String appsFlyerUID = this.a.getAppsFlyerUID(this.b);
        if (appsFlyerUID == null) {
            return "";
        }
        return appsFlyerUID;
    }

    @Override // defpackage.pq
    public void b(String str) {
        z65.h(str, "customerId");
        this.a.setCustomerUserId(str);
    }

    @Override // defpackage.pq
    public void c(String str) {
        z65.h(str, "updatedToken");
        this.a.updateServerUninstallToken(this.b, str);
    }
}
