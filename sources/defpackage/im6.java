package defpackage;

import com.google.gson.Gson;
import com.huawei.hms.opendevice.c;
import defpackage.sk9;
import kotlin.Metadata;
/* compiled from: MobileConfigSerializationManagerImpl.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0014\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000e¨\u0006\u0012"}, d2 = {"Lim6;", "Lhm6;", "Lmb5;", "inAppTreeTargeting", "Ltmb;", c.a, "", "inAppConfig", "Lnx4;", "a", "inAppForm", "Lk54;", "b", "Lcom/google/gson/Gson;", "Lcom/google/gson/Gson;", "gson", "<init>", "(Lcom/google/gson/Gson;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: im6  reason: default package */
/* loaded from: classes.dex */
public final class im6 implements hm6 {
    private final Gson a;

    public im6(Gson gson) {
        z65.h(gson, "gson");
        this.a = gson;
    }

    @Override // defpackage.hm6
    public nx4 a(String str) {
        Object b;
        z65.h(str, "inAppConfig");
        try {
            sk9.a aVar = sk9.b;
            b = sk9.b((nx4) this.a.k(str, nx4.class));
        } catch (Throwable th) {
            sk9.a aVar2 = sk9.b;
            b = sk9.b(vk9.a(th));
        }
        Throwable d = sk9.d(b);
        if (d != null) {
            fk6 fk6Var = fk6.a;
            fk6Var.f(this, "Failed to parse inAppConfig: " + str, d);
        }
        if (sk9.f(b)) {
            b = null;
        }
        return (nx4) b;
    }

    @Override // defpackage.hm6
    public k54 b(mb5 mb5Var) {
        Object b;
        Object obj;
        try {
            sk9.a aVar = sk9.b;
            b = sk9.b((k54) this.a.g(mb5Var, k54.class));
        } catch (Throwable th) {
            sk9.a aVar2 = sk9.b;
            b = sk9.b(vk9.a(th));
        }
        Throwable d = sk9.d(b);
        if (d != null) {
            fk6.a.f(this, "Failed to parse JsonObject: " + mb5Var, d);
        }
        if (sk9.f(b)) {
            obj = null;
        } else {
            obj = b;
        }
        k54 k54Var = (k54) obj;
        if (k54Var != null && k54Var.getVariants() == null) {
            return null;
        }
        if (sk9.f(b)) {
            b = null;
        }
        return (k54) b;
    }

    @Override // defpackage.hm6
    public tmb c(mb5 mb5Var) {
        Object b;
        try {
            sk9.a aVar = sk9.b;
            b = sk9.b((tmb) this.a.g(mb5Var, tmb.class));
        } catch (Throwable th) {
            sk9.a aVar2 = sk9.b;
            b = sk9.b(vk9.a(th));
        }
        Throwable d = sk9.d(b);
        if (d != null) {
            fk6 fk6Var = fk6.a;
            fk6Var.f(this, "Failed to parse JsonObject: " + mb5Var, d);
        }
        if (sk9.f(b)) {
            b = null;
        }
        return (tmb) b;
    }
}
