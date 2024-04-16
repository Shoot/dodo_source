package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.g89;
import kotlin.Metadata;
/* compiled from: ThreadLocalDatabaseConnectionHolder.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lydb;", "Lcm2;", "Lg89$a;", c.a, "connection", "", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/ThreadLocal;", "a", "Ljava/lang/ThreadLocal;", "realmConnection", "<init>", "()V", "persistence_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: ydb  reason: default package */
/* loaded from: classes2.dex */
public final class ydb implements cm2<g89.a> {
    private final ThreadLocal<g89.a> a = new ThreadLocal<>();

    @Override // defpackage.cm2
    /* renamed from: c */
    public g89.a a() {
        return this.a.get();
    }

    @Override // defpackage.cm2
    /* renamed from: d */
    public void b(g89.a aVar) {
        this.a.set(aVar);
    }
}
