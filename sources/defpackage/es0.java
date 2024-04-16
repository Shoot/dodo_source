package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.rq0;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: CartService.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u0011\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0007H\u0096\u0001J\u0011\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\tH\u0096\u0001J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011¨\u0006\u0015"}, d2 = {"Les0;", "Lds0;", "Lkq0;", "Lrq0$a;", "cartItemData", "", "a", "Lrq0$b;", DateTokenConverter.CONVERTER_KEY, "Lrq0$c;", "b", "", "Lnq0;", c.a, "Lkq0;", "cartEditService", "Lfq0;", "Lfq0;", "cartContentService", "<init>", "(Lkq0;Lfq0;)V", "cart"}, k = 1, mv = {1, 9, 0})
/* renamed from: es0  reason: default package */
/* loaded from: classes.dex */
public final class es0 implements ds0, kq0 {
    private final kq0 a;
    private final fq0 b;

    public es0(kq0 kq0Var, fq0 fq0Var) {
        z65.h(kq0Var, "cartEditService");
        z65.h(fq0Var, "cartContentService");
        this.a = kq0Var;
        this.b = fq0Var;
    }

    @Override // defpackage.kq0
    public void a(rq0.a aVar) {
        z65.h(aVar, "cartItemData");
        this.a.a(aVar);
    }

    @Override // defpackage.kq0
    public void b(rq0.c cVar) {
        z65.h(cVar, "cartItemData");
        this.a.b(cVar);
    }

    @Override // defpackage.ds0
    public Collection<nq0> c() {
        return this.b.a().e();
    }

    @Override // defpackage.kq0
    public void d(rq0.b bVar) {
        z65.h(bVar, "cartItemData");
        this.a.d(bVar);
    }
}
