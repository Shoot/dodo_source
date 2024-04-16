package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.appsflyer.AppsFlyerLib;
import com.huawei.hms.opendevice.c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: AppsFlyerConsumer.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Ldq;", "Lrj1;", "", "event", "", "", "params", "", c.a, "Lqc;", "analyticsEvent", "a", "Landroid/content/Context;", "b", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "events", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "analytics-consumer-appsflyer_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: dq  reason: default package */
/* loaded from: classes.dex */
public final class dq extends rj1 {
    private final Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq(Context context, List<String> list) {
        super(list);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(list, "events");
        this.b = context;
    }

    private final void c(String str, Map<String, ? extends Object> map) {
        AppsFlyerLib.getInstance().logEvent(this.b, str, map);
    }

    @Override // defpackage.lc
    public void a(qc qcVar) {
        z65.h(qcVar, "analyticsEvent");
        c(qcVar.c(), qcVar.d());
    }
}
