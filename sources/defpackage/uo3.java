package defpackage;

import kotlin.Metadata;
/* compiled from: OrderHistoryAnalytics.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Luo3;", "Lh31;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: uo3  reason: default package */
/* loaded from: classes2.dex */
public final class uo3 extends h31 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo3(Throwable th) {
        super("failure", th.getMessage(), null);
        z65.h(th, "throwable");
    }
}
