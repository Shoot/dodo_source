package cloud.mindbox.mobile_sdk.monitoring.data.repositories;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MonitoringRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "a", "()Ljava/util/HashSet;"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MonitoringRepositoryImpl$getRequestIds$1 extends ej5 implements Function0<HashSet<String>> {
    final /* synthetic */ MonitoringRepositoryImpl a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MonitoringRepositoryImpl$getRequestIds$1(MonitoringRepositoryImpl monitoringRepositoryImpl) {
        super(0);
        this.a = monitoringRepositoryImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a */
    public final HashSet<String> invoke() {
        boolean y;
        Gson gson;
        nk6 nk6Var = nk6.a;
        y = l0b.y(nk6Var.i());
        if (!y) {
            gson = this.a.c;
            HashSet<String> hashSet = (HashSet) gson.l(nk6Var.i(), new TypeToken<HashSet<String>>() { // from class: cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl$getRequestIds$1.1
            }.getType());
            if (hashSet == null) {
                return new HashSet<>();
            }
            return hashSet;
        }
        return new HashSet<>();
    }
}
