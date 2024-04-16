package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.h15;
import kotlin.Metadata;
/* compiled from: InfoStoryService.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lk15;", "Lj15;", "Li15;", "screen", "Lh15;", "a", "", "infoStoryId", "", "b", "Lkya;", "Lkya;", "storiesService", "Lhq3;", "Lhq3;", "featureService", "Lgz4;", c.a, "Lgz4;", "infoIdRepository", "Lnz4;", DateTokenConverter.CONVERTER_KEY, "Lnz4;", "inAppStoryStateProvider", "<init>", "(Lkya;Lhq3;Lgz4;Lnz4;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: k15  reason: default package */
/* loaded from: classes4.dex */
public final class k15 implements j15 {
    private final kya a;
    private final hq3 b;
    private final gz4 c;
    private final nz4 d;

    public k15(kya kyaVar, hq3 hq3Var, gz4 gz4Var, nz4 nz4Var) {
        z65.h(kyaVar, "storiesService");
        z65.h(hq3Var, "featureService");
        z65.h(gz4Var, "infoIdRepository");
        z65.h(nz4Var, "inAppStoryStateProvider");
        this.a = kyaVar;
        this.b = hq3Var;
        this.c = gz4Var;
        this.d = nz4Var;
    }

    @Override // defpackage.j15
    public h15 a(i15 i15Var) {
        z65.h(i15Var, "screen");
        boolean z = !this.b.a(bq3.i5);
        String b = this.a.b(i15Var);
        String a = this.c.a(i15Var.i());
        boolean z2 = !this.d.isInitialized().getValue().booleanValue();
        if (z) {
            return h15.a.b;
        }
        if (z2) {
            return h15.b.b;
        }
        if (z65.c(a, b)) {
            return h15.d.b;
        }
        if (b.length() == 0) {
            return h15.c.b;
        }
        return new h15.e(b);
    }

    @Override // defpackage.j15
    public void b(i15 i15Var, String str) {
        z65.h(i15Var, "screen");
        z65.h(str, "infoStoryId");
        this.c.b(i15Var.i(), str);
    }
}
