package defpackage;

import com.dodopizza.persistence.entity.ServerDeltaTimeEntity;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: ServerDeltaTimeRepositoryImpl.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Ljda;", "Lida;", "", c.a, "delta", "", "b", "a", "Lgk2;", "Lcom/dodopizza/persistence/entity/ServerDeltaTimeEntity;", "Lgk2;", "dao", "Lcom/dodopizza/persistence/entity/ServerDeltaTimeEntity;", "cache", "<init>", "(Lgk2;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: jda  reason: default package */
/* loaded from: classes4.dex */
public final class jda implements ida {
    private final gk2<ServerDeltaTimeEntity> a;
    private ServerDeltaTimeEntity b;

    public jda(gk2<ServerDeltaTimeEntity> gk2Var) {
        z65.h(gk2Var, "dao");
        this.a = gk2Var;
    }

    private final long c() {
        ServerDeltaTimeEntity a = this.a.a(ServerDeltaTimeEntity.ID_VALUE);
        if (a != null) {
            return a.getDelta();
        }
        return 0L;
    }

    @Override // defpackage.ida
    public long a() {
        ServerDeltaTimeEntity serverDeltaTimeEntity = this.b;
        if (serverDeltaTimeEntity != null) {
            return serverDeltaTimeEntity.getDelta();
        }
        return c();
    }

    @Override // defpackage.ida
    public void b(long j) {
        this.b = this.a.h(new ServerDeltaTimeEntity(j));
    }
}
