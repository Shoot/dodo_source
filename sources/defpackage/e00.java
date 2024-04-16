package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import ru.dodopizza.app.domain.blockstore.AuthorizationBlockStoreDataSource;
/* compiled from: AuthorizationRepository.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\bR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000e¨\u0006\u0012"}, d2 = {"Le00;", "", "", "token", "", DateTokenConverter.CONVERTER_KEY, "b", "a", "", c.a, "Lci8;", "Lci8;", "preferencesAssetsDataSource", "Lru/dodopizza/app/domain/blockstore/AuthorizationBlockStoreDataSource;", "Lru/dodopizza/app/domain/blockstore/AuthorizationBlockStoreDataSource;", "blockStoreDataSource", "<init>", "(Lci8;Lru/dodopizza/app/domain/blockstore/AuthorizationBlockStoreDataSource;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: e00  reason: default package */
/* loaded from: classes4.dex */
public final class e00 {
    private final ci8 a;
    private final AuthorizationBlockStoreDataSource b;

    public e00(ci8 ci8Var, AuthorizationBlockStoreDataSource authorizationBlockStoreDataSource) {
        z65.h(ci8Var, "preferencesAssetsDataSource");
        z65.h(authorizationBlockStoreDataSource, "blockStoreDataSource");
        this.a = ci8Var;
        this.b = authorizationBlockStoreDataSource;
    }

    public final void a() {
        this.a.z("");
        this.b.save("");
    }

    public final String b() {
        return this.a.k();
    }

    public final boolean c() {
        boolean z;
        String k = this.a.k();
        String find = this.b.find();
        if (k.length() == 0 && find != null) {
            this.a.z(find);
            z = true;
        } else {
            z = false;
        }
        if (k.length() > 0) {
            this.b.save(k);
        }
        return z;
    }

    public final void d(String str) {
        z65.h(str, "token");
        this.a.z(str);
        this.b.save(str);
    }
}
