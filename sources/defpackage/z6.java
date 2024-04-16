package defpackage;

import com.inappstory.sdk.stories.api.models.Image;
import defpackage.n8;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.presentation.addresslist.adapter.AddressVH;
/* compiled from: AddressBinder.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\u001b\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0014\u0010\u0007\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0014\u0010\n\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J \u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016J.\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lz6;", "Loyb;", "Lru/dodopizza/app/presentation/addresslist/adapter/AddressVH;", "Ln8$a;", "data", "", "i", "k", "", "isEnabled", "j", "view", "", "position", Image.TYPE_HIGH, "", "", "changes", "g", "Lkotlin/Function1;", "a", "Lkotlin/jvm/functions/Function1;", "listener", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: z6  reason: default package */
/* loaded from: classes4.dex */
public final class z6 extends oyb<AddressVH, n8.a> {
    public static final a b = new a(null);
    private final Function1<n8.a, Unit> a;

    /* compiled from: AddressBinder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lz6$a;", "", "", "LOADING_CHANGED", "Ljava/lang/String;", "WITHOUT_LOCATION", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: z6$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddressBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z6$b */
    /* loaded from: classes4.dex */
    public static final class b extends ej5 implements Function0<Unit> {
        final /* synthetic */ n8.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(n8.a aVar) {
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
            z6.this.a.invoke(this.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z6(Function1<? super n8.a, Unit> function1) {
        z65.h(function1, "listener");
        this.a = function1;
    }

    private final void i(AddressVH addressVH, n8.a aVar) {
        addressVH.setEnabled(aVar.f());
        addressVH.setIsLoading(aVar.g());
    }

    private final void j(AddressVH addressVH, boolean z) {
        if (z) {
            addressVH.setLabelsColorsForEnabledState();
        } else {
            addressVH.setLabelsColorsForDisabledState();
        }
    }

    private final void k(AddressVH addressVH, n8.a aVar) {
        addressVH.showMessageAddressWithoutLocality(!aVar.e());
        addressVH.setEnabled(aVar.f());
        j(addressVH, aVar.e());
    }

    @Override // defpackage.oyb
    /* renamed from: g */
    public void a(AddressVH addressVH, n8.a aVar, int i, List<? extends Object> list) {
        z65.h(addressVH, "view");
        z65.h(aVar, "data");
        z65.h(list, "changes");
        if (list.contains("is_selected_flag_changed")) {
            addressVH.setIsSelected(aVar.h());
        }
        for (Object obj : list) {
            if (z65.c(obj, "loading_changed")) {
                i(addressVH, aVar);
            } else if (z65.c(obj, "without_location")) {
                k(addressVH, aVar);
            }
        }
    }

    @Override // defpackage.oyb
    /* renamed from: h */
    public void b(AddressVH addressVH, n8.a aVar, int i) {
        boolean y;
        z65.h(addressVH, "view");
        z65.h(aVar, "data");
        addressVH.setAddress(aVar.b());
        addressVH.setComment(aVar.c());
        y = l0b.y(aVar.c());
        addressVH.setCommentVisibility(!y);
        addressVH.setListener(new b(aVar));
        addressVH.setIsSelected(aVar.h());
    }
}
