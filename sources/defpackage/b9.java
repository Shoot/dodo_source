package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.adapter.AddressMapComponentVH;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AddressMapComponentBinder.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fBI\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000e\u0012\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0014\u0012\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J.\u0010\r\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R)\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u000e8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012¨\u0006!"}, d2 = {"Lb9;", "Loyb;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/adapter/AddressMapComponentVH;", "Ld7;", "view", "data", "", "position", "", "g", "", "", "changes", "f", "Lkotlin/Function1;", "a", "Lkotlin/jvm/functions/Function1;", Image.TYPE_HIGH, "()Lkotlin/jvm/functions/Function1;", "onNextListener", "Lkotlin/Function2;", "", "b", "Lkotlin/jvm/functions/Function2;", "getOnEditListener", "()Lkotlin/jvm/functions/Function2;", "onEditListener", com.huawei.hms.opendevice.c.a, "getOnFocusLostListener", "onFocusLostListener", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", DateTokenConverter.CONVERTER_KEY, "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: b9  reason: default package */
/* loaded from: classes2.dex */
public final class b9 extends oyb<AddressMapComponentVH, d7> {
    public static final a d = new a(null);
    private final Function1<Integer, Unit> a;
    private final Function2<d7, String, Unit> b;
    private final Function1<d7, Unit> c;

    /* compiled from: AddressMapComponentBinder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lb9$a;", "", "", "UPDATE_ALL_FIELDS", "Ljava/lang/String;", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: b9$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddressMapComponentBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b9$b */
    /* loaded from: classes2.dex */
    public static final class b extends ej5 implements Function0<Unit> {
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i) {
            super(0);
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            b9.this.h().invoke(Integer.valueOf(this.b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddressMapComponentBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b9$c */
    /* loaded from: classes2.dex */
    public static final class c extends ej5 implements Function0<Unit> {
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i) {
            super(0);
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            b9.this.h().invoke(Integer.valueOf(this.b));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b9(Function1<? super Integer, Unit> function1, Function2<? super d7, ? super String, Unit> function2, Function1<? super d7, Unit> function12) {
        z65.h(function1, "onNextListener");
        z65.h(function2, "onEditListener");
        z65.h(function12, "onFocusLostListener");
        this.a = function1;
        this.b = function2;
        this.c = function12;
    }

    @Override // defpackage.oyb
    /* renamed from: f */
    public void a(AddressMapComponentVH addressMapComponentVH, d7 d7Var, int i, List<? extends Object> list) {
        z65.h(addressMapComponentVH, "view");
        z65.h(d7Var, "data");
        z65.h(list, "changes");
        if (list.contains("update_all_fields")) {
            addressMapComponentVH.showAddressComponent(d7Var, new b(i), this.b, this.c);
        }
    }

    @Override // defpackage.oyb
    /* renamed from: g */
    public void b(AddressMapComponentVH addressMapComponentVH, d7 d7Var, int i) {
        z65.h(addressMapComponentVH, "view");
        z65.h(d7Var, "data");
        addressMapComponentVH.showAddressComponent(d7Var, new c(i), this.b, this.c);
    }

    public final Function1<Integer, Unit> h() {
        return this.a;
    }
}
