package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.presentation.product.card.combo.TemplateProductViewHolder;
/* compiled from: ComboTemplateProductBinder.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003BS\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t0\u0015\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001a\u0012\u001c\b\u0002\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\u001e¢\u0006\u0004\b\"\u0010#J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR(\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Laj1;", "Lru/dodopizza/app/presentation/product/card/combo/TemplateProductViewHolder;", "T", "Loyb;", "Lqla;", "view", "data", "", "position", "", "g", "(Lru/dodopizza/app/presentation/product/card/combo/TemplateProductViewHolder;Lqla;I)V", "", "", "changes", "f", "(Lru/dodopizza/app/presentation/product/card/combo/TemplateProductViewHolder;Lqla;ILjava/util/List;)V", "Ljn6;", "a", "Ljn6;", "moneyFactory", "Lkotlin/Function1;", "Lfl8;", "b", "Lkotlin/jvm/functions/Function1;", "onSelectClick", "Lkotlin/Function0;", c.a, "Lkotlin/jvm/functions/Function0;", "onChangeReceiptShown", "Lkotlin/Function2;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/jvm/functions/Function2;", "onIngredientsChanged", "<init>", "(Ljn6;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: aj1  reason: default package */
/* loaded from: classes4.dex */
public final class aj1<T extends TemplateProductViewHolder> extends oyb<T, qla> {
    private final jn6 a;
    private final Function1<fl8, Unit> b;
    private final Function0<Unit> c;
    private final Function2<Integer, fl8, Unit> d;

    public /* synthetic */ aj1(jn6 jn6Var, Function1 function1, Function0 function0, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jn6Var, function1, (i & 4) != 0 ? null : function0, (i & 8) != 0 ? null : function2);
    }

    @Override // defpackage.oyb
    /* renamed from: f */
    public void a(T t, qla qlaVar, int i, List<? extends Object> list) {
        z65.h(t, "view");
        z65.h(qlaVar, "data");
        z65.h(list, "changes");
        super.a(t, qlaVar, i, list);
        for (Object obj : list) {
            if (obj instanceof y89) {
                t.applyChangedReceipt(qlaVar, (y89) obj);
            }
            if ((obj instanceof String) && z65.c(obj, "close_receipt")) {
                t.closeReceiptView();
            }
        }
    }

    @Override // defpackage.oyb
    /* renamed from: g */
    public void b(T t, qla qlaVar, int i) {
        int w;
        Object obj;
        Object obj2;
        fl8 fl8Var;
        Object Z;
        Object Z2;
        z65.h(t, "view");
        z65.h(qlaVar, "data");
        ArrayList<fl8> arrayList = new ArrayList();
        for (Object obj3 : qlaVar.h()) {
            if (qlaVar.g().contains(((fl8) obj3).getId())) {
                arrayList.add(obj3);
            }
        }
        w = lc1.w(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(w);
        for (fl8 fl8Var2 : arrayList) {
            arrayList2.add(fl8Var2.m());
        }
        if (qlaVar.h().size() == 1) {
            Z2 = sc1.Z(qlaVar.h());
            fl8Var = (fl8) Z2;
        } else {
            List<fl8> h = qlaVar.h();
            List<fl8> list = h;
            Iterator<T> it = list.iterator();
            while (true) {
                obj = null;
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (z65.c(qlaVar.j(), ((fl8) obj2).getId())) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            fl8 fl8Var3 = (fl8) obj2;
            if (fl8Var3 == null) {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (!arrayList2.contains(((fl8) next).m())) {
                        obj = next;
                        break;
                    }
                }
                fl8 fl8Var4 = (fl8) obj;
                if (fl8Var4 == null) {
                    Z = sc1.Z(h);
                    fl8Var = (fl8) Z;
                } else {
                    fl8Var = fl8Var4;
                }
            } else {
                fl8Var = fl8Var3;
            }
        }
        t.bind(this.a, qlaVar, fl8Var, this.c);
        t.showImage(fl8Var);
        t.setTitle(fl8Var.getName());
        t.setFoodValueInfo(fl8Var);
        t.setSelectButtonListener(this.b);
        t.setIngredientChangedListener(this.d);
        t.setProductSize(fl8Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public aj1(jn6 jn6Var, Function1<? super fl8, Unit> function1, Function0<Unit> function0, Function2<? super Integer, ? super fl8, Unit> function2) {
        z65.h(jn6Var, "moneyFactory");
        z65.h(function1, "onSelectClick");
        this.a = jn6Var;
        this.b = function1;
        this.c = function0;
        this.d = function2;
    }
}
