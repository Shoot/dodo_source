package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.order.feature.personaloffer.presentantion.adapter.PersonalOfferViewHolder;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PersonalOfferBinder.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010BC\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J.\u0010\r\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011¨\u0006\u001a"}, d2 = {"Lf08;", "Loyb;", "Lcom/dodopizza/order/feature/personaloffer/presentantion/adapter/PersonalOfferViewHolder;", "Lk08;", "view", "data", "", "position", "", Image.TYPE_HIGH, "", "", "changes", "g", "Lkotlin/Function1;", "Lp67;", "a", "Lkotlin/jvm/functions/Function1;", "applyOfferListener", "b", "resetOfferListener", com.huawei.hms.opendevice.c.a, "moreAboutOfferListener", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", DateTokenConverter.CONVERTER_KEY, "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: f08  reason: default package */
/* loaded from: classes2.dex */
public final class f08 extends oyb<PersonalOfferViewHolder, k08> {
    public static final a d = new a(null);
    private final Function1<p67, Unit> a;
    private final Function1<p67, Unit> b;
    private final Function1<p67, Unit> c;

    /* compiled from: PersonalOfferBinder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lf08$a;", "", "", "UPDATE", "Ljava/lang/String;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: f08$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PersonalOfferBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f08$b */
    /* loaded from: classes2.dex */
    public static final class b extends ej5 implements Function0<Unit> {
        final /* synthetic */ k08 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(k08 k08Var) {
            super(0);
            this.b = k08Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            f08.this.c.invoke(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PersonalOfferBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f08$c */
    /* loaded from: classes2.dex */
    public static final class c extends ej5 implements Function0<Unit> {
        final /* synthetic */ k08 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k08 k08Var) {
            super(0);
            this.b = k08Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            f08.this.c.invoke(this.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f08(Function1<? super p67, Unit> function1, Function1<? super p67, Unit> function12, Function1<? super p67, Unit> function13) {
        z65.h(function1, "applyOfferListener");
        z65.h(function12, "resetOfferListener");
        z65.h(function13, "moreAboutOfferListener");
        this.a = function1;
        this.b = function12;
        this.c = function13;
    }

    @Override // defpackage.oyb
    /* renamed from: g */
    public void a(PersonalOfferViewHolder personalOfferViewHolder, k08 k08Var, int i, List<? extends Object> list) {
        z65.h(personalOfferViewHolder, "view");
        z65.h(k08Var, "data");
        z65.h(list, "changes");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            it.next();
            b(personalOfferViewHolder, k08Var, i);
        }
    }

    @Override // defpackage.oyb
    /* renamed from: h */
    public void b(PersonalOfferViewHolder personalOfferViewHolder, k08 k08Var, int i) {
        z65.h(personalOfferViewHolder, "view");
        z65.h(k08Var, "data");
        g08.c(personalOfferViewHolder, k08Var);
        personalOfferViewHolder.setOfferName(k08Var.e());
        personalOfferViewHolder.setOnMoreImageClickListener(new b(k08Var));
        personalOfferViewHolder.setOnCardClickListener(new c(k08Var));
        g08.b(personalOfferViewHolder, k08Var.h());
        g08.a(personalOfferViewHolder, k08Var, this.a, this.b, this.c);
        g08.d(personalOfferViewHolder, k08Var.o());
    }
}
