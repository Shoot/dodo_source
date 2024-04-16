package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
/* compiled from: EntityIdBinder.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0013"}, d2 = {"Laj3;", "Lmg8;", "Lyi3;", "entity", "", "b", "", DateTokenConverter.CONVERTER_KEY, "", c.a, "a", "Lbj3;", "Lbj3;", "entityIdGenerator", "Lgj3;", "Lgj3;", "entityRelationFinder", "<init>", "(Lbj3;Lgj3;)V", "persistence_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: aj3  reason: default package */
/* loaded from: classes2.dex */
public final class aj3 implements mg8 {
    private final bj3 a;
    private final gj3 b;

    public aj3(bj3 bj3Var, gj3 gj3Var) {
        z65.h(bj3Var, "entityIdGenerator");
        z65.h(gj3Var, "entityRelationFinder");
        this.a = bj3Var;
        this.b = gj3Var;
    }

    private final void b(yi3 yi3Var) {
        if (yi3Var.getId() == null) {
            yi3Var.setId(d());
        }
    }

    private final Collection<yi3> c(yi3 yi3Var) {
        return this.b.a(yi3Var);
    }

    private final String d() {
        return this.a.a();
    }

    @Override // defpackage.mg8
    public void a(yi3 yi3Var) {
        List<yi3> r;
        z65.h(yi3Var, "entity");
        r = kc1.r(yi3Var);
        r.addAll(c(yi3Var));
        for (yi3 yi3Var2 : r) {
            b(yi3Var2);
        }
    }
}
