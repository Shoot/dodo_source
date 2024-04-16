package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: DefaultFormContext.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016R$\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0006¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001a¨\u0006!"}, d2 = {"Lvp2;", "Li54;", "Lgs3;", "component", "", e.a, "a", DateTokenConverter.CONVERTER_KEY, "Lis3;", "fieldInfo", "b", "Lk87;", "Lk87;", "getOnInvalidateForm", "()Lk87;", Image.TYPE_HIGH, "(Lk87;)V", "onInvalidateForm", "", "Ljava/util/List;", "f", "()Ljava/util/List;", "components", "", "Lus3;", "g", "()Ljava/util/Collection;", "views", "Lm54;", c.a, "fields", "<init>", "()V", "formbuilder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vp2  reason: default package */
/* loaded from: classes.dex */
public final class vp2 implements i54 {
    private k87 a;
    private final List<gs3> b = new ArrayList();

    /* compiled from: DefaultFormContext.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgs3;", "component", "", "a", "(Lgs3;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: vp2$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<gs3, Boolean> {
        final /* synthetic */ is3 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(is3 is3Var) {
            super(1);
            this.a = is3Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(gs3 gs3Var) {
            z65.h(gs3Var, "component");
            return Boolean.valueOf(z65.c(gs3Var.a().c().getName(), this.a.getName()));
        }
    }

    @Override // defpackage.i54
    public void a() {
        this.b.clear();
    }

    @Override // defpackage.i54
    public void b(is3 is3Var) {
        us3 b;
        z65.h(is3Var, "fieldInfo");
        gs3 gs3Var = (gs3) ovb.a(this.b, new a(is3Var));
        if (gs3Var != null && (b = gs3Var.b()) != null) {
            b.c();
        }
    }

    @Override // defpackage.i54
    public Collection<m54> c() {
        int w;
        List<gs3> list = this.b;
        w = lc1.w(list, 10);
        ArrayList arrayList = new ArrayList(w);
        for (gs3 gs3Var : list) {
            arrayList.add(gs3Var.a());
        }
        return arrayList;
    }

    @Override // defpackage.i54
    public void d() {
        k87 k87Var = this.a;
        if (k87Var != null) {
            k87Var.e();
        }
    }

    public final void e(gs3 gs3Var) {
        z65.h(gs3Var, "component");
        this.b.add(gs3Var);
    }

    public final List<gs3> f() {
        return this.b;
    }

    public final Collection<us3> g() {
        int w;
        List<gs3> list = this.b;
        w = lc1.w(list, 10);
        ArrayList arrayList = new ArrayList(w);
        for (gs3 gs3Var : list) {
            arrayList.add(gs3Var.b());
        }
        return arrayList;
    }

    public final void h(k87 k87Var) {
        this.a = k87Var;
    }
}
