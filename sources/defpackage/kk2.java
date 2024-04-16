package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.List;
import kotlin.Metadata;
/* compiled from: DaoFactory.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0003*\u00020\u0002H\u0002J(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J.\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lkk2;", "Ljk2;", "Lyi3;", "T", "Lej3;", c.a, "Lmk2;", "daoMode", "Lcj3;", "entityInformation", "Lgk2;", "b", "Lod5;", "kClass", "a", "Lhk2;", "Lhk2;", "databaseConnectorRegistry", "Lkkb;", "Lkkb;", "transactionManagerRegistry", "Lbj3;", "Lbj3;", "entityIdGenerator", "Lgj3;", DateTokenConverter.CONVERTER_KEY, "Lgj3;", "entityRelationFinder", "<init>", "(Lhk2;Lkkb;Lbj3;Lgj3;)V", "persistence_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: kk2  reason: default package */
/* loaded from: classes2.dex */
public final class kk2 implements jk2 {
    private final hk2 a;
    private final kkb b;
    private final bj3 c;
    private final gj3 d;

    public kk2(hk2 hk2Var, kkb kkbVar, bj3 bj3Var, gj3 gj3Var) {
        z65.h(hk2Var, "databaseConnectorRegistry");
        z65.h(kkbVar, "transactionManagerRegistry");
        z65.h(bj3Var, "entityIdGenerator");
        z65.h(gj3Var, "entityRelationFinder");
        this.a = hk2Var;
        this.b = kkbVar;
        this.c = bj3Var;
        this.d = gj3Var;
    }

    private final <T extends yi3> gk2<T> b(mk2 mk2Var, cj3 cj3Var) {
        return new lk2(this.a.a(mk2Var), c(), cj3Var, this.b.a(mk2Var));
    }

    private final <T extends yi3> ej3<T> c() {
        List e;
        e = jc1.e(new aj3(this.c, this.d));
        return new fj3(e, null, null, 6, null);
    }

    @Override // defpackage.jk2
    public <T extends yi3> gk2<T> a(od5<T> od5Var, mk2 mk2Var) {
        z65.h(od5Var, "kClass");
        z65.h(mk2Var, "daoMode");
        return b(mk2Var, cj3.a.a(od5Var));
    }
}
