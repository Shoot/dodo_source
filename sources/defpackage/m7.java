package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.AddressDetailsFieldVH;
import ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a;
/* compiled from: AddressDetailsFieldViewBinder.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BI\u0012\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0011\u0012\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R)\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R)\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000f¨\u0006\u001c"}, d2 = {"Lm7;", "Loyb;", "Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/AddressDetailsFieldVH;", "Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/a;", "view", "data", "", "position", "", "f", "Lkotlin/Function2;", "", "a", "Lkotlin/jvm/functions/Function2;", "getEditListener", "()Lkotlin/jvm/functions/Function2;", "editListener", "Lkotlin/Function0;", "b", "Lkotlin/jvm/functions/Function0;", "getDoneListener", "()Lkotlin/jvm/functions/Function0;", "doneListener", c.a, "getOnFocusLostListener", "onFocusLostListener", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: m7  reason: default package */
/* loaded from: classes4.dex */
public final class m7 extends oyb<AddressDetailsFieldVH, a> {
    private final Function2<a, String, Unit> a;
    private final Function0<Unit> b;
    private final Function2<a, String, Unit> c;

    /* JADX WARN: Multi-variable type inference failed */
    public m7(Function2<? super a, ? super String, Unit> function2, Function0<Unit> function0, Function2<? super a, ? super String, Unit> function22) {
        z65.h(function2, "editListener");
        z65.h(function0, "doneListener");
        z65.h(function22, "onFocusLostListener");
        this.a = function2;
        this.b = function0;
        this.c = function22;
    }

    @Override // defpackage.oyb
    /* renamed from: f */
    public void b(AddressDetailsFieldVH addressDetailsFieldVH, a aVar, int i) {
        z65.h(addressDetailsFieldVH, "view");
        z65.h(aVar, "data");
        addressDetailsFieldVH.setField(aVar, this.a, this.b, this.c);
    }
}
