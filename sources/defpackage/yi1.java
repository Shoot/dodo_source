package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.presentation.product.card.combo.TemplatePizzaViewHolder;
/* compiled from: ComboTemplatePizzaBinder.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B[\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\t0\u0019\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001e\u0012\u001c\b\u0002\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\t\u0018\u00010\"¢\u0006\u0004\b&\u0010'J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\t0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010!\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R(\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\t\u0018\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006("}, d2 = {"Lyi1;", "Lru/dodopizza/app/presentation/product/card/combo/TemplatePizzaViewHolder;", "T", "Loyb;", "Lb88;", "view", "data", "", "position", "", "g", "(Lru/dodopizza/app/presentation/product/card/combo/TemplatePizzaViewHolder;Lb88;I)V", "", "", "changes", "f", "(Lru/dodopizza/app/presentation/product/card/combo/TemplatePizzaViewHolder;Lb88;ILjava/util/List;)V", "Ljn6;", "a", "Ljn6;", "moneyFactory", "", "b", "Z", "isVariantDough", "Lkotlin/Function1;", "Lm78;", c.a, "Lkotlin/jvm/functions/Function1;", "onSelectClick", "Lkotlin/Function0;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/jvm/functions/Function0;", "onChangeReceiptShown", "Lkotlin/Function2;", e.a, "Lkotlin/jvm/functions/Function2;", "onIngredientsChanged", "<init>", "(Ljn6;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: yi1  reason: default package */
/* loaded from: classes4.dex */
public final class yi1<T extends TemplatePizzaViewHolder> extends oyb<T, b88> {
    private final jn6 a;
    private final boolean b;
    private final Function1<m78, Unit> c;
    private final Function0<Unit> d;
    private final Function2<Integer, m78, Unit> e;

    public /* synthetic */ yi1(jn6 jn6Var, boolean z, Function1 function1, Function0 function0, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jn6Var, z, function1, (i & 8) != 0 ? null : function0, (i & 16) != 0 ? null : function2);
    }

    @Override // defpackage.oyb
    /* renamed from: f */
    public void a(T t, b88 b88Var, int i, List<? extends Object> list) {
        z65.h(t, "view");
        z65.h(b88Var, "data");
        z65.h(list, "changes");
        super.a(t, b88Var, i, list);
        for (Object obj : list) {
            if (obj instanceof y89) {
                t.applyChanges(b88Var, (y89) obj);
            }
            if ((obj instanceof String) && z65.c(obj, "close_receipt")) {
                t.closeReceiptView();
            }
        }
    }

    @Override // defpackage.oyb
    /* renamed from: g */
    public void b(T t, b88 b88Var, int i) {
        z65.h(t, "view");
        z65.h(b88Var, "data");
        t.bind(this.a, b88Var, this.b, this.c, this.d, this.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public yi1(jn6 jn6Var, boolean z, Function1<? super m78, Unit> function1, Function0<Unit> function0, Function2<? super Integer, ? super m78, Unit> function2) {
        z65.h(jn6Var, "moneyFactory");
        z65.h(function1, "onSelectClick");
        this.a = jn6Var;
        this.b = z;
        this.c = function1;
        this.d = function0;
        this.e = function2;
    }
}
