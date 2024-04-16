package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.order.feature.shoppingcart.adapter.good.snack.SnackCartProductViewHolder;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.eoa;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: SnackCartProductBinder.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0089\u0001\u0012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00060\u001a\u0012\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00060\u001a\u0012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00060\u001a\u0012\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00060\u001a\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060&\u0012\u0006\u0010-\u001a\u00020*\u0012\u0006\u00101\u001a\u00020.\u0012\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00060\u001a¢\u0006\u0004\b4\u00105J\u0014\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0014\u0010\t\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\bH\u0002J\u0014\u0010\f\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001c\u0010\u000e\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J\f\u0010\u0010\u001a\u00020\u000f*\u00020\u0003H\u0002J\u0014\u0010\u0011\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0014\u0010\u0012\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0014\u0010\u0013\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0014\u0010\u0014\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0002J \u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0002H\u0016R \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00060\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00060\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00060\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001dR \u0010%\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00060\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001dR\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R \u00103\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00060\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u001d¨\u00066"}, d2 = {"Ldoa;", "Loyb;", "Lcom/dodopizza/order/feature/shoppingcart/adapter/good/snack/SnackCartProductViewHolder;", "Leoa;", "Leoa$a;", "size", "", "v", "Leoa$a$b;", "u", "", "timeRemain", "q", "data", "w", "Lhn6;", "n", Image.TYPE_SMALL, "r", "t", "o", "view", "", "position", Image.TYPE_MEDIUM, "p", "Lkotlin/Function1;", "Lnq0;", "a", "Lkotlin/jvm/functions/Function1;", "minusCountListener", "b", "plusCountListener", com.huawei.hms.opendevice.c.a, "removeListener", "Lv23;", DateTokenConverter.CONVERTER_KEY, "discountListener", "Lkotlin/Function0;", com.huawei.hms.push.e.a, "Lkotlin/jvm/functions/Function0;", "personalPriceTimerListener", "Lu18;", "f", "Lu18;", "timerFormatter", "Lf5b;", "g", "Lf5b;", "timeProvider", Image.TYPE_HIGH, "editButtonClickListener", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lu18;Lf5b;Lkotlin/jvm/functions/Function1;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: doa  reason: default package */
/* loaded from: classes2.dex */
public final class doa extends oyb<SnackCartProductViewHolder, eoa> {
    private final Function1<nq0, Unit> a;
    private final Function1<nq0, Unit> b;
    private final Function1<nq0, Unit> c;
    private final Function1<v23, Unit> d;
    private final Function0<Unit> e;
    private final u18 f;
    private final f5b g;
    private final Function1<nq0, Unit> h;

    /* compiled from: SnackCartProductBinder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: doa$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[nb6.values().length];
            try {
                iArr[nb6.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[nb6.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[nb6.g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[nb6.h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: doa$b */
    /* loaded from: classes2.dex */
    public static final class b extends ej5 implements Function0<Unit> {
        final /* synthetic */ eoa b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(eoa eoaVar) {
            super(0);
            this.b = eoaVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            doa.this.a.invoke(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: doa$c */
    /* loaded from: classes2.dex */
    public static final class c extends ej5 implements Function0<Unit> {
        final /* synthetic */ eoa b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(eoa eoaVar) {
            super(0);
            this.b = eoaVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            doa.this.b.invoke(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: doa$d */
    /* loaded from: classes2.dex */
    public static final class d extends ej5 implements Function0<Unit> {
        final /* synthetic */ eoa b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(eoa eoaVar) {
            super(0);
            this.b = eoaVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            doa.this.c.invoke(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: doa$e */
    /* loaded from: classes2.dex */
    public static final class e extends ej5 implements Function0<Unit> {
        final /* synthetic */ eoa b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(eoa eoaVar) {
            super(0);
            this.b = eoaVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            doa.this.a.invoke(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: doa$f */
    /* loaded from: classes2.dex */
    public static final class f extends ej5 implements Function0<Unit> {
        final /* synthetic */ eoa b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(eoa eoaVar) {
            super(0);
            this.b = eoaVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            doa.this.b.invoke(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: doa$g */
    /* loaded from: classes2.dex */
    public static final class g extends ej5 implements Function0<Unit> {
        final /* synthetic */ eoa b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(eoa eoaVar) {
            super(0);
            this.b = eoaVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            doa.this.h.invoke(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: doa$h */
    /* loaded from: classes2.dex */
    public static final class h extends ej5 implements Function0<Unit> {
        final /* synthetic */ eoa b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(eoa eoaVar) {
            super(0);
            this.b = eoaVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            doa.this.c.invoke(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: doa$i */
    /* loaded from: classes2.dex */
    public static final class i extends ej5 implements Function0<Unit> {
        final /* synthetic */ eoa b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(eoa eoaVar) {
            super(0);
            this.b = eoaVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            doa.this.a.invoke(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: doa$j */
    /* loaded from: classes2.dex */
    public static final class j extends ej5 implements Function0<Unit> {
        final /* synthetic */ eoa b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(eoa eoaVar) {
            super(0);
            this.b = eoaVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            doa.this.b.invoke(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: doa$k */
    /* loaded from: classes2.dex */
    public static final class k extends ej5 implements Function0<Unit> {
        final /* synthetic */ eoa b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(eoa eoaVar) {
            super(0);
            this.b = eoaVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            doa.this.a.invoke(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: doa$l */
    /* loaded from: classes2.dex */
    public static final class l extends ej5 implements Function0<Unit> {
        final /* synthetic */ eoa b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(eoa eoaVar) {
            super(0);
            this.b = eoaVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            doa.this.b.invoke(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: doa$m */
    /* loaded from: classes2.dex */
    public static final class m extends ej5 implements Function0<Unit> {
        public static final m a = new m();

        m() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: doa$n */
    /* loaded from: classes2.dex */
    public static final class n extends ej5 implements Function0<Unit> {
        final /* synthetic */ eoa b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(eoa eoaVar) {
            super(0);
            this.b = eoaVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            doa.this.d.invoke(this.b.e());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: doa$o */
    /* loaded from: classes2.dex */
    public static final class o extends ej5 implements Function0<Unit> {
        final /* synthetic */ eoa b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(eoa eoaVar) {
            super(0);
            this.b = eoaVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            doa.this.d.invoke(this.b.e());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxq0;", "productIngredient", "", "a", "(Lxq0;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: doa$p */
    /* loaded from: classes2.dex */
    public static final class p extends ej5 implements Function1<xq0, CharSequence> {
        public static final p a = new p();

        p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(xq0 xq0Var) {
            z65.h(xq0Var, "productIngredient");
            return qhb.a(xq0Var.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: doa$q */
    /* loaded from: classes2.dex */
    public static final class q extends ej5 implements Function0<Unit> {
        final /* synthetic */ SnackCartProductViewHolder a;
        final /* synthetic */ doa b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(SnackCartProductViewHolder snackCartProductViewHolder, doa doaVar) {
            super(0);
            this.a = snackCartProductViewHolder;
            this.b = doaVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.enablePersonalPriceBadge(false);
            this.a.setTimerInPersonalPriceBadge(this.b.f, 0L);
            SnackCartProductViewHolder snackCartProductViewHolder = this.a;
            snackCartProductViewHolder.setTextInPersonalPriceBadge(jzb.a(snackCartProductViewHolder, r09.personal_price_badge_discount_expired));
            this.b.e.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: doa$r */
    /* loaded from: classes2.dex */
    public static final class r extends ej5 implements Function0<Unit> {
        final /* synthetic */ eoa b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(eoa eoaVar) {
            super(0);
            this.b = eoaVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            doa.this.c.invoke(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackCartProductBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: doa$s */
    /* loaded from: classes2.dex */
    public static final class s extends ej5 implements Function0<Unit> {
        final /* synthetic */ eoa b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(eoa eoaVar) {
            super(0);
            this.b = eoaVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            doa.this.b.invoke(this.b.c());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public doa(Function1<? super nq0, Unit> function1, Function1<? super nq0, Unit> function12, Function1<? super nq0, Unit> function13, Function1<? super v23, Unit> function14, Function0<Unit> function0, u18 u18Var, f5b f5bVar, Function1<? super nq0, Unit> function15) {
        z65.h(function1, "minusCountListener");
        z65.h(function12, "plusCountListener");
        z65.h(function13, "removeListener");
        z65.h(function14, "discountListener");
        z65.h(function0, "personalPriceTimerListener");
        z65.h(u18Var, "timerFormatter");
        z65.h(f5bVar, "timeProvider");
        z65.h(function15, "editButtonClickListener");
        this.a = function1;
        this.b = function12;
        this.c = function13;
        this.d = function14;
        this.e = function0;
        this.f = u18Var;
        this.g = f5bVar;
        this.h = function15;
    }

    private final hn6 n(eoa eoaVar) {
        hn6 i2 = eoaVar.i();
        v23 e2 = eoaVar.e();
        z65.e(e2);
        return rn6.f(i2, rn6.g(e2.a(), Math.max(eoaVar.a(), 1)));
    }

    private final void o(SnackCartProductViewHolder snackCartProductViewHolder, eoa eoaVar) {
        String i0;
        if (!eoaVar.k().isEmpty()) {
            i0 = sc1.i0(eoaVar.k(), null, null, null, 0, null, p.a, 31, null);
            snackCartProductViewHolder.showAddedToppings(i0);
            return;
        }
        snackCartProductViewHolder.hideToppings();
    }

    private final void q(SnackCartProductViewHolder snackCartProductViewHolder, long j2) {
        snackCartProductViewHolder.showPersonalPriceBadge();
        if (j2 > 0) {
            snackCartProductViewHolder.enablePersonalPriceBadge(true);
            snackCartProductViewHolder.setTimerInPersonalPriceBadge(this.f, j2);
            snackCartProductViewHolder.launchPersonalPriceTimer(this.f, j2, new q(snackCartProductViewHolder, this));
            return;
        }
        snackCartProductViewHolder.hidePersonalPriceBadge();
    }

    private final void r(SnackCartProductViewHolder snackCartProductViewHolder, eoa eoaVar) {
        if (eoaVar.a() > 0) {
            snackCartProductViewHolder.enableMinusCounter();
        } else {
            snackCartProductViewHolder.disableMinusCounter();
        }
        if (eoaVar.a() < eoaVar.g()) {
            snackCartProductViewHolder.enablePlusCounter();
        } else {
            snackCartProductViewHolder.disablePlusCounter();
        }
    }

    private final void s(SnackCartProductViewHolder snackCartProductViewHolder, eoa eoaVar) {
        hn6 n2 = n(eoaVar);
        if (rn6.c(n2, eoaVar.i()) > 0) {
            snackCartProductViewHolder.showPriceSector();
            snackCartProductViewHolder.setFinalPrice(un6.b(eoaVar.i()));
            snackCartProductViewHolder.showRawPrice(un6.b(n2));
        } else if (eoaVar.i().e()) {
            snackCartProductViewHolder.showPriceSector();
            snackCartProductViewHolder.setFinalPrice(un6.b(eoaVar.i()));
            snackCartProductViewHolder.hideRawPrice();
        } else {
            snackCartProductViewHolder.hidePriceSector();
        }
    }

    private final void t(SnackCartProductViewHolder snackCartProductViewHolder, eoa eoaVar) {
        if (eoaVar.a() != 0) {
            snackCartProductViewHolder.showAddedGift();
            snackCartProductViewHolder.setOnRemoveClickListener(new r(eoaVar));
            return;
        }
        snackCartProductViewHolder.showRemovedGift();
        snackCartProductViewHolder.setOnRemoveClickListener(new s(eoaVar));
    }

    private final void u(SnackCartProductViewHolder snackCartProductViewHolder, eoa.a.b bVar) {
        int i2 = a.$EnumSwitchMapping$0[bVar.a().ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    snackCartProductViewHolder.showProductSize(bVar.a(), String.valueOf(bVar.b()));
                    return;
                } else {
                    snackCartProductViewHolder.hideProductSize();
                    return;
                }
            }
            snackCartProductViewHolder.showPortion(String.valueOf(bVar.b()));
            return;
        }
        snackCartProductViewHolder.showProductSize(bVar.a(), String.valueOf((int) bVar.b()));
    }

    private final void v(SnackCartProductViewHolder snackCartProductViewHolder, eoa.a aVar) {
        if (aVar instanceof eoa.a.b) {
            u(snackCartProductViewHolder, (eoa.a.b) aVar);
        } else if (aVar instanceof eoa.a.C0307a) {
            snackCartProductViewHolder.showProductSizeDescription(((eoa.a.C0307a) aVar).a());
        }
    }

    private final void w(SnackCartProductViewHolder snackCartProductViewHolder, eoa eoaVar, long j2) {
        if (j2 <= 0) {
            snackCartProductViewHolder.showPriceSector();
            snackCartProductViewHolder.setFinalPrice(un6.b(n(eoaVar)));
            snackCartProductViewHolder.hideRawPrice();
            return;
        }
        s(snackCartProductViewHolder, eoaVar);
    }

    @Override // defpackage.oyb
    /* renamed from: m */
    public void b(SnackCartProductViewHolder snackCartProductViewHolder, eoa eoaVar, int i2) {
        n18 n18Var;
        z65.h(snackCartProductViewHolder, "view");
        z65.h(eoaVar, "data");
        snackCartProductViewHolder.showImage(eoaVar.f());
        snackCartProductViewHolder.setTitle(eoaVar.h());
        v(snackCartProductViewHolder, eoaVar.j());
        o(snackCartProductViewHolder, eoaVar);
        snackCartProductViewHolder.setOnEditButtonClickListener(new g(eoaVar));
        snackCartProductViewHolder.setEditButtonVisibility(eoaVar.l());
        v23 e2 = eoaVar.e();
        if (e2 != null) {
            n18Var = e2.e();
        } else {
            n18Var = null;
        }
        if (n18Var != null) {
            long a2 = n18Var.a() - this.g.b();
            q(snackCartProductViewHolder, a2);
            if (eoaVar.b()) {
                snackCartProductViewHolder.showStop(eoaVar.d());
                snackCartProductViewHolder.hidePriceSector();
                snackCartProductViewHolder.showRemoveButton();
                snackCartProductViewHolder.setOnRemoveClickListener(new h(eoaVar));
                return;
            }
            snackCartProductViewHolder.hideStop();
            w(snackCartProductViewHolder, eoaVar, a2);
            snackCartProductViewHolder.showCounterButton();
            snackCartProductViewHolder.setOnMinusCounterClickListener(new i(eoaVar));
            snackCartProductViewHolder.setCounter(String.valueOf(eoaVar.a()));
            snackCartProductViewHolder.setOnPlusCounterClickListener(new j(eoaVar));
            r(snackCartProductViewHolder, eoaVar);
        } else if (eoaVar.e() != null && eoaVar.m()) {
            snackCartProductViewHolder.hidePersonalPriceBadge();
            if (eoaVar.b()) {
                snackCartProductViewHolder.showStop(eoaVar.d());
                snackCartProductViewHolder.hidePriceSector();
                snackCartProductViewHolder.showRemoveButton();
                t(snackCartProductViewHolder, eoaVar);
            } else if (eoaVar.g() > 1 && eoaVar.a() != 0) {
                snackCartProductViewHolder.hideStop();
                s(snackCartProductViewHolder, eoaVar);
                snackCartProductViewHolder.showCounterButton();
                snackCartProductViewHolder.setOnMinusCounterClickListener(new k(eoaVar));
                snackCartProductViewHolder.setCounter(String.valueOf(eoaVar.a()));
                snackCartProductViewHolder.setOnPlusCounterClickListener(new l(eoaVar));
                r(snackCartProductViewHolder, eoaVar);
            } else {
                snackCartProductViewHolder.hideStop();
                s(snackCartProductViewHolder, eoaVar);
                snackCartProductViewHolder.showRemoveButton();
                t(snackCartProductViewHolder, eoaVar);
            }
            if (eoaVar.e().d() > 0) {
                snackCartProductViewHolder.setLoyaltyGiftTitle(eoaVar.e().d());
                snackCartProductViewHolder.setOnDiscountClickListener(m.a);
                return;
            }
            snackCartProductViewHolder.setGiftTitle(eoaVar.e().f());
            snackCartProductViewHolder.setOnDiscountClickListener(new n(eoaVar));
        } else if (eoaVar.e() != null && !eoaVar.m()) {
            snackCartProductViewHolder.hidePersonalPriceBadge();
            snackCartProductViewHolder.setDiscountTitle(eoaVar.e().f());
            snackCartProductViewHolder.setOnDiscountClickListener(new o(eoaVar));
            if (eoaVar.b()) {
                snackCartProductViewHolder.showStop(eoaVar.d());
                snackCartProductViewHolder.hidePriceSector();
                snackCartProductViewHolder.showRemoveButton();
                t(snackCartProductViewHolder, eoaVar);
                return;
            }
            snackCartProductViewHolder.hideStop();
            s(snackCartProductViewHolder, eoaVar);
            snackCartProductViewHolder.showCounterButton();
            snackCartProductViewHolder.setOnMinusCounterClickListener(new b(eoaVar));
            snackCartProductViewHolder.setCounter(String.valueOf(eoaVar.a()));
            snackCartProductViewHolder.setOnPlusCounterClickListener(new c(eoaVar));
            r(snackCartProductViewHolder, eoaVar);
        } else {
            snackCartProductViewHolder.hidePersonalPriceBadge();
            snackCartProductViewHolder.hideGift();
            if (eoaVar.b()) {
                snackCartProductViewHolder.showStop(eoaVar.d());
                snackCartProductViewHolder.hidePriceSector();
                snackCartProductViewHolder.showRemoveButton();
                snackCartProductViewHolder.setOnRemoveClickListener(new d(eoaVar));
                return;
            }
            snackCartProductViewHolder.hideStop();
            snackCartProductViewHolder.showPriceSector();
            snackCartProductViewHolder.setFinalPrice(un6.b(eoaVar.i()));
            snackCartProductViewHolder.hideRawPrice();
            snackCartProductViewHolder.showCounterButton();
            snackCartProductViewHolder.setOnMinusCounterClickListener(new e(eoaVar));
            snackCartProductViewHolder.setCounter(String.valueOf(eoaVar.a()));
            snackCartProductViewHolder.setOnPlusCounterClickListener(new f(eoaVar));
            r(snackCartProductViewHolder, eoaVar);
        }
    }

    @Override // defpackage.oyb
    /* renamed from: p */
    public void d(SnackCartProductViewHolder snackCartProductViewHolder) {
        z65.h(snackCartProductViewHolder, "view");
        snackCartProductViewHolder.releasePersonalPriceTimer();
    }
}
