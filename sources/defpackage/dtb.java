package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.UpsaleStateEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.gtb;
import kotlin.Metadata;
/* compiled from: UpsaleServices.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Ldtb;", "Ltsb;", "Lktb;", "Lksb;", "a", "upsale", "", c.a, "", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "b", DateTokenConverter.CONVERTER_KEY, "Lbtb;", "Lbtb;", "upsaleRepository", "Lhtb;", "Lhtb;", "upsaleStateRepository", "Lk63;", "Lk63;", "domainEvents", e.a, "()Ljava/lang/String;", "<init>", "(Lbtb;Lhtb;Lk63;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: dtb  reason: default package */
/* loaded from: classes4.dex */
public final class dtb implements tsb, ktb {
    private final btb a;
    private final htb b;
    private final k63 c;

    public dtb(btb btbVar, htb htbVar, k63 k63Var) {
        z65.h(btbVar, "upsaleRepository");
        z65.h(htbVar, "upsaleStateRepository");
        z65.h(k63Var, "domainEvents");
        this.a = btbVar;
        this.b = htbVar;
        this.c = k63Var;
    }

    private final String e() {
        String str;
        gtb gtbVar = this.b.get();
        if (gtbVar != null) {
            str = gtbVar.a();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // defpackage.tsb
    public ksb a() {
        return this.a.a();
    }

    @Override // defpackage.ktb
    public void b(String str) {
        z65.h(str, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        if (!z65.c(e(), str)) {
            this.b.r();
            this.b.b(new gtb.d(str));
            this.c.b(j63.e);
        }
    }

    @Override // defpackage.tsb
    public void c(ksb ksbVar) {
        z65.h(ksbVar, "upsale");
        if (!z65.c(ksbVar.b(), this.a.a().b())) {
            this.a.b(ksbVar);
            this.c.b(j63.e);
        }
    }

    @Override // defpackage.ktb
    public void d() {
        this.b.a(new gtb.b(e()));
        this.c.b(j63.e);
    }
}
