package defpackage;

import kotlin.Metadata;
/* compiled from: MapAddressVO.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u000b"}, d2 = {"Lgqb;", "La66;", "Le91;", "j", "Le91;", "()Le91;", "clientDeliveryLocation", "", "address", "<init>", "(Ljava/lang/String;Le91;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: gqb  reason: default package */
/* loaded from: classes2.dex */
public final class gqb extends a66 {
    private final e91 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqb(String str, e91 e91Var) {
        super(str, null, null, 0, jq1.c, false, false, o09.undeliverable_address, true, 110, null);
        z65.h(str, "address");
        z65.h(e91Var, "clientDeliveryLocation");
        this.j = e91Var;
    }

    public final e91 j() {
        return this.j;
    }
}
