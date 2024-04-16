package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.state.WorkflowApi;
import ru.dodopizza.backend.domain.state.dto.tax.SetTaxPayerIdDto;
/* compiled from: TaxPayerIdService.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0019¨\u0006\u001d"}, d2 = {"La8b;", "Lz7b;", "", "a", "", c.a, "taxPayerId", "b", "Lhq3;", "Lhq3;", "featureService", "Lf8c;", "Lf8c;", "workflowIdProvider", "Lava;", "Lava;", "stateProvider", "Lru/dodopizza/backend/domain/state/WorkflowApi;", DateTokenConverter.CONVERTER_KEY, "Lru/dodopizza/backend/domain/state/WorkflowApi;", "workflowApi", "Ldua;", e.a, "Ldua;", "stateAnalyzer", "()Ljava/lang/String;", "stateId", "<init>", "(Lhq3;Lf8c;Lava;Lru/dodopizza/backend/domain/state/WorkflowApi;Ldua;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: a8b  reason: default package */
/* loaded from: classes4.dex */
public final class a8b implements z7b {
    private final hq3 a;
    private final f8c b;
    private final ava c;
    private final WorkflowApi d;
    private final dua e;

    public a8b(hq3 hq3Var, f8c f8cVar, ava avaVar, WorkflowApi workflowApi, dua duaVar) {
        z65.h(hq3Var, "featureService");
        z65.h(f8cVar, "workflowIdProvider");
        z65.h(avaVar, "stateProvider");
        z65.h(workflowApi, "workflowApi");
        z65.h(duaVar, "stateAnalyzer");
        this.a = hq3Var;
        this.b = f8cVar;
        this.c = avaVar;
        this.d = workflowApi;
        this.e = duaVar;
    }

    private final String d() {
        return this.b.b();
    }

    @Override // defpackage.z7b
    public boolean a() {
        return this.a.a(bq3.p);
    }

    @Override // defpackage.z7b
    public String b(String str) {
        z65.h(str, "taxPayerId");
        WorkflowApi workflowApi = this.d;
        String d = d();
        if (str.length() == 0) {
            str = null;
        }
        String taxPayerId = this.e.d(workflowApi.setTaxPayerId(new SetTaxPayerIdDto(d, str))).getTaxPayerId();
        if (taxPayerId == null) {
            return "";
        }
        return taxPayerId;
    }

    @Override // defpackage.z7b
    public String c() {
        String taxPayerId = this.c.e().getTaxPayerId();
        if (taxPayerId == null) {
            return "";
        }
        return taxPayerId;
    }
}
