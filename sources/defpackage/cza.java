package defpackage;

import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: StreetAutoCompletePresenter.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcza;", "Lq00;", "", "text", "", "u", "t", "Lss3;", "item", "v", "f", "Ldza;", "Ldza;", "streetAutocompleteInteractor", "Lbl1;", "g", "Lbl1;", "supervisorJob", "Lqx1;", Image.TYPE_HIGH, "Lqx1;", "uiScope", "<init>", "(Ldza;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: cza  reason: default package */
/* loaded from: classes4.dex */
public final class cza extends q00 {
    private final dza f;
    private final bl1 g;
    private final qx1 h;

    /* compiled from: StreetAutoCompletePresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lbza;", "items", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.addressform.autocomplete.StreetAutoCompletePresenter$onTextChanged$1", f = "StreetAutoCompletePresenter.kt", l = {}, m = "invokeSuspend")
    /* renamed from: cza$a */
    /* loaded from: classes4.dex */
    static final class a extends f3b implements Function2<List<? extends bza>, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        a(cv1<? super a> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            a aVar = new a(cv1Var);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(List<? extends bza> list, cv1<? super Unit> cv1Var) {
            return ((a) create(list, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            int w;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                List<bza> list = (List) this.b;
                w = lc1.w(list, 10);
                ArrayList arrayList = new ArrayList(w);
                for (bza bzaVar : list) {
                    String b = bzaVar.b();
                    z65.g(b, "getStreetId(...)");
                    String c = bzaVar.c();
                    z65.g(c, "getStreetName(...)");
                    String a = bzaVar.a();
                    z65.g(a, "getShortStreetName(...)");
                    arrayList.add(new eza(b, c, a));
                }
                r00 w2 = cza.w(cza.this);
                if (w2 != null) {
                    w2.setItems(arrayList);
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public cza(dza dzaVar) {
        z65.h(dzaVar, "streetAutocompleteInteractor");
        this.f = dzaVar;
        bl1 b = k2b.b(null, 1, null);
        this.g = b;
        this.h = rx1.a(v33.c().P(b));
    }

    public static final /* synthetic */ r00 w(cza czaVar) {
        return czaVar.l();
    }

    @Override // defpackage.ms3, defpackage.ls3
    public void f() {
        super.f();
        this.g.f0();
    }

    @Override // defpackage.q00
    public void t() {
        r00 l = l();
        if (l != null) {
            l.d();
        }
        r00 l2 = l();
        if (l2 != null) {
            l2.setInputEnabled(true);
        }
        j(ss3.c.a());
    }

    @Override // defpackage.q00
    public void u(String str) {
        z65.h(str, "text");
        if (str.length() == 0) {
            return;
        }
        wj1.b(y87.a(this.f.f(str), new a(null)), this.h);
    }

    @Override // defpackage.q00
    public void v(ss3 ss3Var) {
        z65.h(ss3Var, "item");
        r00 l = l();
        if (l != null) {
            l.setInputEnabled(false);
        }
        j(ss3Var);
        p();
    }
}
