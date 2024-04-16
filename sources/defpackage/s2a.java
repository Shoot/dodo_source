package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.order.feature.personaloffer.presentantion.adapter.PersonalOfferViewHolder;
import com.dodopizza.order.feature.personaloffer.presentantion.adapter.SecretCardViewHolder;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.u2a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SecretOfferBinder.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010BW\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J.\u0010\r\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011¨\u0006\u001c"}, d2 = {"Ls2a;", "Loyb;", "Lcom/dodopizza/order/feature/personaloffer/presentantion/adapter/SecretCardViewHolder;", "Lt2a;", "view", "data", "", "position", "", "i", "", "", "changes", Image.TYPE_HIGH, "Lkotlin/Function1;", "Lp67;", "a", "Lkotlin/jvm/functions/Function1;", "applyOfferListener", "b", "resetOfferListener", com.huawei.hms.opendevice.c.a, "moreAboutOfferListener", DateTokenConverter.CONVERTER_KEY, "openSecretOfferListener", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", e.a, "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: s2a  reason: default package */
/* loaded from: classes2.dex */
public final class s2a extends oyb<SecretCardViewHolder, t2a> {
    public static final a e = new a(null);
    private final Function1<p67, Unit> a;
    private final Function1<p67, Unit> b;
    private final Function1<p67, Unit> c;
    private final Function1<p67, Unit> d;

    /* compiled from: SecretOfferBinder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ls2a$a;", "", "", "UPDATE_OPEN_CARD", "Ljava/lang/String;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: s2a$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SecretOfferBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: s2a$b */
    /* loaded from: classes2.dex */
    public static final class b extends ej5 implements Function0<Unit> {
        final /* synthetic */ t2a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(t2a t2aVar) {
            super(0);
            this.b = t2aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            s2a.this.c.invoke(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SecretOfferBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: s2a$c */
    /* loaded from: classes2.dex */
    public static final class c extends ej5 implements Function0<Unit> {
        final /* synthetic */ t2a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(t2a t2aVar) {
            super(0);
            this.b = t2aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            s2a.this.c.invoke(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SecretOfferBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: s2a$d */
    /* loaded from: classes2.dex */
    public static final class d extends ej5 implements Function0<Unit> {
        final /* synthetic */ t2a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(t2a t2aVar) {
            super(0);
            this.b = t2aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            s2a.this.d.invoke(this.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s2a(Function1<? super p67, Unit> function1, Function1<? super p67, Unit> function12, Function1<? super p67, Unit> function13, Function1<? super p67, Unit> function14) {
        z65.h(function1, "applyOfferListener");
        z65.h(function12, "resetOfferListener");
        z65.h(function13, "moreAboutOfferListener");
        z65.h(function14, "openSecretOfferListener");
        this.a = function1;
        this.b = function12;
        this.c = function13;
        this.d = function14;
    }

    @Override // defpackage.oyb
    /* renamed from: h */
    public void a(SecretCardViewHolder secretCardViewHolder, t2a t2aVar, int i, List<? extends Object> list) {
        z65.h(secretCardViewHolder, "view");
        z65.h(t2aVar, "data");
        z65.h(list, "changes");
        if (!list.contains("update_open_card")) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next();
                b(secretCardViewHolder, t2aVar, i);
            }
        }
    }

    @Override // defpackage.oyb
    /* renamed from: i */
    public void b(SecretCardViewHolder secretCardViewHolder, t2a t2aVar, int i) {
        z65.h(secretCardViewHolder, "view");
        z65.h(t2aVar, "data");
        PersonalOfferViewHolder personalOfferViewHolder = secretCardViewHolder.getPersonalOfferViewHolder();
        personalOfferViewHolder.showImageFromLocalRes(t2aVar.n());
        personalOfferViewHolder.setOfferName(t2aVar.e());
        personalOfferViewHolder.setOnMoreImageClickListener(new b(t2aVar));
        personalOfferViewHolder.setOnCardClickListener(new c(t2aVar));
        g08.b(personalOfferViewHolder, t2aVar.h());
        g08.a(personalOfferViewHolder, t2aVar, this.a, this.b, this.c);
        g08.d(personalOfferViewHolder, t2aVar.o());
        personalOfferViewHolder.showSecretActionLabel();
        secretCardViewHolder.setOnOpenListener(new d(t2aVar));
        secretCardViewHolder.showBackImage(t2aVar.n());
        if (t2aVar.g() instanceof u2a.c) {
            secretCardViewHolder.flipToBackSide();
        } else {
            secretCardViewHolder.flipToFrontSide();
        }
    }
}
