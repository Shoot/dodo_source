package defpackage;

import com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistorydetails.selectcheck.adapter.SelectCheckVH;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: SelectCheckBinder.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lj4a;", "Loyb;", "Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistorydetails/selectcheck/adapter/SelectCheckVH;", "Lz21;", "view", "data", "", "position", "", "g", "Lkotlin/Function1;", "a", "Lkotlin/jvm/functions/Function1;", "onCheckSelectedListener", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: j4a  reason: default package */
/* loaded from: classes2.dex */
public final class j4a extends oyb<SelectCheckVH, z21> {
    private final Function1<z21, Unit> a;

    /* compiled from: SelectCheckBinder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: j4a$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[p31.values().length];
            try {
                iArr[p31.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p31.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectCheckBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: j4a$b */
    /* loaded from: classes2.dex */
    public static final class b extends ej5 implements Function0<Unit> {
        final /* synthetic */ z21 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(z21 z21Var) {
            super(0);
            this.b = z21Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            j4a.this.a.invoke(this.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j4a(Function1<? super z21, Unit> function1) {
        z65.h(function1, "onCheckSelectedListener");
        this.a = function1;
    }

    @Override // defpackage.oyb
    /* renamed from: g */
    public void b(SelectCheckVH selectCheckVH, z21 z21Var, int i) {
        z65.h(selectCheckVH, "view");
        z65.h(z21Var, "data");
        int i2 = a.$EnumSwitchMapping$0[z21Var.a().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                selectCheckVH.showCheckName();
            } else {
                selectCheckVH.showRefundCheckName();
            }
        } else {
            selectCheckVH.showSellCheckName();
        }
        selectCheckVH.setOnCheckSelectedListener(new b(z21Var));
    }
}
