package defpackage;

import kotlin.Metadata;
/* compiled from: MapAddressVO.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u0011"}, d2 = {"Li9;", "La66;", "Ldt5;", "j", "Ldt5;", "k", "()Ldt5;", "locality", "Le91;", "Le91;", "()Le91;", "clientDeliveryLocation", "", "address", "addressLocation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ldt5;Le91;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: i9  reason: default package */
/* loaded from: classes2.dex */
public final class i9 extends a66 {
    private final dt5 j;
    private final e91 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9(String str, String str2, dt5 dt5Var, e91 e91Var) {
        super(str, str2, null, 0, null, false, true, 0, false, 444, null);
        z65.h(str, "address");
        z65.h(str2, "addressLocation");
        z65.h(dt5Var, "locality");
        z65.h(e91Var, "clientDeliveryLocation");
        this.j = dt5Var;
        this.k = e91Var;
    }

    public final e91 j() {
        return this.k;
    }

    public final dt5 k() {
        return this.j;
    }
}
