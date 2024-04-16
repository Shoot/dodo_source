package defpackage;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.Metadata;
/* compiled from: DeferredTimeFormatter.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lws2;", "Lvs2;", "", "timeFrom", "timeTo", "", "b", CrashHianalyticsData.TIME, "a", "Ljgb;", "Ljgb;", "getTimeFormatter", "()Ljgb;", "timeFormatter", "<init>", "(Ljgb;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ws2  reason: default package */
/* loaded from: classes4.dex */
public final class ws2 implements vs2 {
    private final jgb a;

    public ws2(jgb jgbVar) {
        z65.h(jgbVar, "timeFormatter");
        this.a = jgbVar;
    }

    @Override // defpackage.vs2
    public String a(long j) {
        return this.a.c(j);
    }

    @Override // defpackage.vs2
    public String b(long j, long j2) {
        String c = this.a.c(j);
        String c2 = this.a.c(j2);
        return c + " – " + c2;
    }
}
