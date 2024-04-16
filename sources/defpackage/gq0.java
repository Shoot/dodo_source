package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: CartContentService.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lgq0;", "Lfq0;", "Llia;", "a", "Lija;", "Lija;", "shoppingCartRepository", "Lrr0;", "b", "Lrr0;", "queueItemRepository", "Lorg/slf4j/Logger;", c.a, "Lorg/slf4j/Logger;", "logger", "<init>", "(Lija;Lrr0;)V", "cart"}, k = 1, mv = {1, 9, 0})
/* renamed from: gq0  reason: default package */
/* loaded from: classes.dex */
public final class gq0 implements fq0 {
    private final ija a;
    private final rr0 b;
    private final Logger c;

    public gq0(ija ijaVar, rr0 rr0Var) {
        z65.h(ijaVar, "shoppingCartRepository");
        z65.h(rr0Var, "queueItemRepository");
        this.a = ijaVar;
        this.b = rr0Var;
        Logger logger = LoggerFactory.getLogger("CartContentServiceImpl");
        z65.g(logger, "getLogger(...)");
        this.c = logger;
    }

    @Override // defpackage.fq0
    public lia a() {
        lia a;
        lia liaVar = (lia) mh5.c(this.a.get(), lia.m.a());
        Collection<qr0> b = this.b.b();
        Logger logger = this.c;
        Collection<qr0> collection = b;
        int i = 0;
        int i2 = 0;
        for (qr0 qr0Var : collection) {
            i2 += qr0Var.b();
        }
        int i3 = 0;
        for (nq0 nq0Var : liaVar.f()) {
            i3 += nq0Var.d();
        }
        List<nq0> f = liaVar.f();
        logger.debug("Merge persisted cart items with queue items queue items count = " + i2 + "  persisted items count = " + i3 + ", queue = " + b + ", persisted = " + f);
        xia xiaVar = new xia(liaVar);
        for (qr0 qr0Var2 : collection) {
            xiaVar = xiaVar.b(qr0Var2);
        }
        lia a2 = xiaVar.a();
        Logger logger2 = this.c;
        for (nq0 nq0Var2 : a2.f()) {
            i += nq0Var2.d();
        }
        logger2.debug("Total merged cart items count = " + i);
        a = a2.a((r28 & 1) != 0 ? a2.a : null, (r28 & 2) != 0 ? a2.b : null, (r28 & 4) != 0 ? a2.c : 0, (r28 & 8) != 0 ? a2.d : null, (r28 & 16) != 0 ? a2.e : null, (r28 & 32) != 0 ? a2.f : null, (r28 & 64) != 0 ? a2.g : null, (r28 & 128) != 0 ? a2.h : null, (r28 & 256) != 0 ? a2.i : 0.0d, (r28 & 512) != 0 ? a2.j : null, (r28 & 1024) != 0 ? a2.k : null, (r28 & 2048) != 0 ? a2.l : b.isEmpty());
        return a;
    }
}
