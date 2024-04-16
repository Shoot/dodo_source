package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import defpackage.rq0;
import kotlin.Metadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: CartEditServiceImpl.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Llq0;", "Lkq0;", "Lrq0;", "cartItemData", "", e.a, "Lrq0$a;", "a", "Lrq0$b;", DateTokenConverter.CONVERTER_KEY, "Lrq0$c;", "b", "Las0;", "Las0;", "cartQueueService", "Lorg/slf4j/Logger;", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger", "<init>", "(Las0;)V", "cart"}, k = 1, mv = {1, 9, 0})
/* renamed from: lq0  reason: default package */
/* loaded from: classes.dex */
public final class lq0 implements kq0 {
    private final as0 a;
    private final Logger b;

    public lq0(as0 as0Var) {
        z65.h(as0Var, "cartQueueService");
        this.a = as0Var;
        Logger logger = LoggerFactory.getLogger("CartEditServiceImpl");
        z65.g(logger, "getLogger(...)");
        this.b = logger;
    }

    private final void e(rq0 rq0Var) {
        this.a.a(qr0.f.a(rq0Var));
    }

    @Override // defpackage.kq0
    public void a(rq0.a aVar) {
        z65.h(aVar, "cartItemData");
        Logger logger = this.b;
        String l = aVar.l();
        logger.debug("Add to cart shoppingId = " + l);
        e(aVar);
    }

    @Override // defpackage.kq0
    public void b(rq0.c cVar) {
        z65.h(cVar, "cartItemData");
        Logger logger = this.b;
        uq0 b = cVar.b();
        logger.debug("Remove from cart cartId = " + b);
        e(cVar);
    }

    @Override // defpackage.kq0
    public void d(rq0.b bVar) {
        z65.h(bVar, "cartItemData");
        Logger logger = this.b;
        uq0 b = bVar.b();
        logger.debug("Edit in cart cartItemId = " + b);
        e(bVar);
    }
}
