package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: DodoDomainEvents.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0016J\u0012\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000e¨\u0006\u0014"}, d2 = {"Lu53;", "Lk63;", "Loz3;", "Lj63;", c.a, "Lkl8;", e.a, DateTokenConverter.CONVERTER_KEY, "productCategory", "", "a", "domainEvent", "b", "Lcr6;", "Lcr6;", "domainEventFlow", "menuEventFlow", "menuForFoodMenuFragmentEventFlow", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: u53  reason: default package */
/* loaded from: classes4.dex */
public final class u53 implements k63 {
    private final cr6<j63> a;
    private final cr6<kl8> b;
    private final cr6<kl8> c;

    public u53() {
        zg0 zg0Var = zg0.DROP_OLDEST;
        this.a = uha.b(0, 5, zg0Var, 1, null);
        this.b = uha.b(0, 5, zg0Var, 1, null);
        this.c = uha.a(1, 5, zg0Var);
    }

    @Override // defpackage.k63
    public void a(kl8 kl8Var) {
        kl8 kl8Var2;
        cr6<kl8> cr6Var = this.b;
        if (kl8Var == null) {
            kl8Var2 = kl8.j;
        } else {
            kl8Var2 = kl8Var;
        }
        cr6Var.a(kl8Var2);
        cr6<kl8> cr6Var2 = this.c;
        if (kl8Var == null) {
            kl8Var = kl8.j;
        }
        cr6Var2.a(kl8Var);
    }

    @Override // defpackage.k63
    public void b(j63 j63Var) {
        z65.h(j63Var, "domainEvent");
        this.a.a(j63Var);
    }

    @Override // defpackage.k63
    public oz3<j63> c() {
        return this.a;
    }

    @Override // defpackage.k63
    public oz3<kl8> d() {
        return this.c;
    }

    @Override // defpackage.k63
    public oz3<kl8> e() {
        return this.b;
    }
}
