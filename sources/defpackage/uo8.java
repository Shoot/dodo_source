package defpackage;

import kotlin.Metadata;
/* compiled from: ProfileSubscriptionService.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\n¨\u0006\u000e"}, d2 = {"Luo8;", "Lto8;", "", "phoneNumber", "", "a", "milliseconds", "", "b", "Lro8;", "Lro8;", "dataSource", "<init>", "(Lro8;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: uo8  reason: default package */
/* loaded from: classes4.dex */
public final class uo8 implements to8 {
    private final ro8 a;

    public uo8(ro8 ro8Var) {
        z65.h(ro8Var, "dataSource");
        this.a = ro8Var;
    }

    @Override // defpackage.to8
    public long a(String str) {
        z65.h(str, "phoneNumber");
        return this.a.b(str);
    }

    @Override // defpackage.to8
    public void b(String str, long j) {
        z65.h(str, "phoneNumber");
        this.a.a(str, j);
    }
}
