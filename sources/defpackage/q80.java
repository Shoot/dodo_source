package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import ru.dodopizza.app.domain.blockstore.BaseUrlBlockStoreDataSource;
/* compiled from: BaseUrlRepository.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0001\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\t\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\n\u0010\bR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0013"}, d2 = {"Lq80;", "", "", "a", "()Ljava/lang/String;", RemoteMessageConst.Notification.URL, "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)V", "b", c.a, "Lci8;", "Lci8;", "preferencesAssetsDataSource", "Lru/dodopizza/app/domain/blockstore/BaseUrlBlockStoreDataSource;", "Lru/dodopizza/app/domain/blockstore/BaseUrlBlockStoreDataSource;", "blockStoreDataSource", "<init>", "(Lci8;Lru/dodopizza/app/domain/blockstore/BaseUrlBlockStoreDataSource;)V", "core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: q80  reason: default package */
/* loaded from: classes.dex */
public final class q80 {
    private final ci8 a;
    private final BaseUrlBlockStoreDataSource b;

    public q80(ci8 ci8Var, BaseUrlBlockStoreDataSource baseUrlBlockStoreDataSource) {
        z65.h(ci8Var, "preferencesAssetsDataSource");
        z65.h(baseUrlBlockStoreDataSource, "blockStoreDataSource");
        this.a = ci8Var;
        this.b = baseUrlBlockStoreDataSource;
    }

    public final String a() {
        return this.a.l();
    }

    public final String b() {
        return this.b.find();
    }

    public final void c(String str) {
        z65.h(str, RemoteMessageConst.Notification.URL);
        this.b.save(str);
    }

    public final void d(String str) {
        z65.h(str, RemoteMessageConst.Notification.URL);
        this.a.J(str);
    }
}
