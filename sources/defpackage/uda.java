package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.fda;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.servertime.ServerTimeApi;
/* compiled from: ServerTimeServiceImpl.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n \u0010*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0011¨\u0006\u0015"}, d2 = {"Luda;", "Ltda;", "", "a", "Las8;", "Lru/dodopizza/backend/domain/servertime/ServerTimeApi;", "Las8;", "serverTimeApiProvider", "Lfda;", "b", "Lfda;", "serverDateTimeParser", "Lf5b;", c.a, "Lf5b;", "systemTimeProvider", "kotlin.jvm.PlatformType", "()Lru/dodopizza/backend/domain/servertime/ServerTimeApi;", "serverTimeApi", "<init>", "(Las8;Lfda;Lf5b;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: uda  reason: default package */
/* loaded from: classes4.dex */
public final class uda implements tda {
    private final as8<ServerTimeApi> a;
    private final fda b;
    private final f5b c;

    public uda(as8<ServerTimeApi> as8Var, fda fdaVar, f5b f5bVar) {
        z65.h(as8Var, "serverTimeApiProvider");
        z65.h(fdaVar, "serverDateTimeParser");
        z65.h(f5bVar, "systemTimeProvider");
        this.a = as8Var;
        this.b = fdaVar;
        this.c = f5bVar;
    }

    private final ServerTimeApi b() {
        return this.a.get();
    }

    @Override // defpackage.tda
    public void a() {
        this.c.c(fda.a.a(this.b, b().getServerTime().getDateTimeUtcNow(), null, 2, null));
    }
}
