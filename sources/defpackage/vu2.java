package defpackage;

import com.dodopizza.geo.feature.deliveryaddresslist.adapter.DeliveryAddressVH;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.gv2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: DeliveryAddressBinder.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B/\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0013"}, d2 = {"Lvu2;", "Loyb;", "Lcom/dodopizza/geo/feature/deliveryaddresslist/adapter/DeliveryAddressVH;", "Lgv2$a;", "view", "data", "", "position", "", Image.TYPE_HIGH, "Lkotlin/Function1;", "Lou2;", "a", "Lkotlin/jvm/functions/Function1;", "onRemovePressed", "b", "onEditPressed", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vu2  reason: default package */
/* loaded from: classes2.dex */
public final class vu2 extends oyb<DeliveryAddressVH, gv2.a> {
    private final Function1<ou2, Unit> a;
    private final Function1<gv2.a, Unit> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vu2$a */
    /* loaded from: classes2.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ gv2.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(gv2.a aVar) {
            super(0);
            this.b = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            vu2.this.a.invoke(this.b.e());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vu2$b */
    /* loaded from: classes2.dex */
    public static final class b extends ej5 implements Function0<Unit> {
        final /* synthetic */ gv2.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(gv2.a aVar) {
            super(0);
            this.b = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            vu2.this.b.invoke(this.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public vu2(Function1<? super ou2, Unit> function1, Function1<? super gv2.a, Unit> function12) {
        z65.h(function1, "onRemovePressed");
        z65.h(function12, "onEditPressed");
        this.a = function1;
        this.b = function12;
    }

    @Override // defpackage.oyb
    /* renamed from: h */
    public void b(DeliveryAddressVH deliveryAddressVH, gv2.a aVar, int i) {
        z65.h(deliveryAddressVH, "view");
        z65.h(aVar, "data");
        if (aVar.c().length() > 0) {
            deliveryAddressVH.showAddressName(aVar.c());
        } else {
            deliveryAddressVH.hideAddressName();
        }
        if (aVar.d().length() > 0) {
            deliveryAddressVH.showCommentText(aVar.d());
        } else {
            deliveryAddressVH.hideCommentText();
        }
        deliveryAddressVH.setAddressText(aVar.f());
        deliveryAddressVH.setOnRemovePressedListener(new a(aVar));
        deliveryAddressVH.setOnEditPressedListener(new b(aVar));
    }
}
