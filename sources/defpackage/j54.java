package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: FormContextCreator.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lj54;", "", "Lvp2;", "a", "Lvs3;", "Lvs3;", "viewFactory", "Los3;", "b", "Los3;", "fieldPresenterStore", "", "Lis3;", c.a, "Ljava/util/Collection;", "fieldsInfo", "<init>", "(Lvs3;Los3;Ljava/util/Collection;)V", "formbuilder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: j54  reason: default package */
/* loaded from: classes.dex */
public final class j54 {
    private final vs3 a;
    private final os3 b;
    private final Collection<is3> c;

    /* JADX WARN: Multi-variable type inference failed */
    public j54(vs3 vs3Var, os3 os3Var, Collection<? extends is3> collection) {
        z65.h(vs3Var, "viewFactory");
        z65.h(os3Var, "fieldPresenterStore");
        z65.h(collection, "fieldsInfo");
        this.a = vs3Var;
        this.b = os3Var;
        this.c = collection;
    }

    public final vp2 a() {
        vp2 vp2Var = new vp2();
        for (is3 is3Var : this.c) {
            us3 a = this.a.a(is3Var);
            ls3 a2 = this.b.a(is3Var);
            a2.h(vp2Var);
            a2.e(is3Var);
            a.a(a2);
            vp2Var.e(new gs3(a, a2));
        }
        return vp2Var;
    }
}
