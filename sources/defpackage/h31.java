package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OrderHistoryAnalytics.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u001d\b\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lh31;", "Ldc;", "Lqc;", "a", "", "Ljava/lang/String;", "result", "b", "failureMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Luo3;", "Lsh4;", "Lyy6;", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: h31  reason: default package */
/* loaded from: classes2.dex */
public abstract class h31 implements dc {
    private final String a;
    private final String b;

    public /* synthetic */ h31(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    @Override // defpackage.dc
    public final qc a() {
        return bc.e(bc.e(new bc("order_receipt_open"), "result", this.a, false, 4, null), "failureMessage", this.b, false, 4, null).a();
    }

    private h31(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public /* synthetic */ h31(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, null);
    }
}
