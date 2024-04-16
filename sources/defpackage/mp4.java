package defpackage;

import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: HouseAutoCompletePresenter.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0016R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lmp4;", "Lq00;", "Leza;", "x", "selectedStreet", "", "housePart", "", "y", "text", "u", "t", "Lss3;", "item", "v", "f", "Lnp4;", "Lnp4;", "houseAutocompleteInteractor", "Lbl1;", "g", "Lbl1;", "supervisorJob", "Lqx1;", Image.TYPE_HIGH, "Lqx1;", "uiScope", "<init>", "(Lnp4;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: mp4  reason: default package */
/* loaded from: classes4.dex */
public final class mp4 extends q00 {
    private final np4 f;
    private final bl1 g;
    private final qx1 h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HouseAutoCompletePresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "", "items", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.addressform.autocomplete.HouseAutoCompletePresenter$showHousesOnSelectedStreet$1", f = "HouseAutoCompletePresenter.kt", l = {}, m = "invokeSuspend")
    /* renamed from: mp4$a */
    /* loaded from: classes4.dex */
    public static final class a extends f3b implements Function2<List<? extends String>, cv1<? super Unit>, Object> {
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
        public final Object invoke(List<String> list, cv1<? super Unit> cv1Var) {
            return ((a) create(list, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            int w;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                List<String> list = (List) this.b;
                w = lc1.w(list, 10);
                ArrayList arrayList = new ArrayList(w);
                for (String str : list) {
                    arrayList.add(ss3.c.b(str));
                }
                r00 w2 = mp4.w(mp4.this);
                if (w2 != null) {
                    w2.setItems(arrayList);
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public mp4(np4 np4Var) {
        z65.h(np4Var, "houseAutocompleteInteractor");
        this.f = np4Var;
        bl1 b = k2b.b(null, 1, null);
        this.g = b;
        this.h = rx1.a(v33.c().P(b));
    }

    public static final /* synthetic */ r00 w(mp4 mp4Var) {
        return mp4Var.l();
    }

    private final eza x() {
        m54 m54Var;
        ss3 ss3Var;
        Collection<m54> c;
        Object obj;
        i54 m = m();
        eza ezaVar = null;
        if (m != null && (c = m.c()) != null) {
            Iterator<T> it = c.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (z65.c(((m54) obj).c().getName(), n7.b.getValue())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            m54Var = (m54) obj;
        } else {
            m54Var = null;
        }
        if (m54Var != null) {
            ss3Var = m54Var.d();
        } else {
            ss3Var = null;
        }
        if (ss3Var instanceof eza) {
            ezaVar = ss3Var;
        }
        if (ezaVar == null) {
            return new eza("", "", "");
        }
        return ezaVar;
    }

    private final void y(eza ezaVar, String str) {
        wj1.b(y87.a(this.f.f(ts3.a(ezaVar), str), new a(null)), this.h);
    }

    @Override // defpackage.ms3, defpackage.ls3
    public void f() {
        super.f();
        this.g.f0();
    }

    @Override // defpackage.q00
    public void u(String str) {
        z65.h(str, "text");
        j(ss3.c.b(str));
        if (str.length() == 0) {
            return;
        }
        eza x = x();
        if (fza.b(x)) {
            y(x, str);
        }
    }

    @Override // defpackage.q00
    public void v(ss3 ss3Var) {
        z65.h(ss3Var, "item");
        j(ss3Var);
        p();
    }

    @Override // defpackage.q00
    public void t() {
    }
}
