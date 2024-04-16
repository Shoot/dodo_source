package defpackage;

import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.HashMap;
import kotlin.Metadata;
/* compiled from: DefaultFieldPresenterStore.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR0\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000ej\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010¨\u0006\u0014"}, d2 = {"Ltp2;", "Los3;", "", RemoteMessageConst.Notification.TAG, "Lls3;", "presenter", "", "b", "Lis3;", "fieldInfo", "a", "Lns3;", "Lns3;", "presenterFactory", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "map", "<init>", "(Lns3;)V", "formbuilder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: tp2  reason: default package */
/* loaded from: classes.dex */
public final class tp2 implements os3 {
    private final ns3 a;
    private final HashMap<String, ls3> b;

    public tp2(ns3 ns3Var) {
        z65.h(ns3Var, "presenterFactory");
        this.a = ns3Var;
        this.b = new HashMap<>();
    }

    private final void b(String str, ls3 ls3Var) {
        ls3 ls3Var2 = this.b.get(str);
        if (ls3Var2 != null) {
            ls3Var2.f();
        }
        this.b.put(str, ls3Var);
    }

    @Override // defpackage.os3
    public ls3 a(is3 is3Var) {
        z65.h(is3Var, "fieldInfo");
        ls3 ls3Var = this.b.get(is3Var.getName());
        if (ls3Var == null) {
            ls3Var = this.a.a(is3Var);
            b(is3Var.getName(), ls3Var);
        }
        return ls3Var;
    }
}
