package com.dodopizza.order.feature.personaloffer.presentantion;

import androidx.recyclerview.widget.e;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.u2a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: PersonalOffersPresenter.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 j2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002(,BW\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u00106\u001a\u000203\u0012\u0006\u0010:\u001a\u000207\u0012\u0006\u0010>\u001a\u00020;\u0012\u0006\u0010B\u001a\u00020?\u0012\u0006\u0010F\u001a\u00020C\u0012\u000e\b\u0002\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00070G¢\u0006\u0004\bh\u0010iJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0007H\u0002J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0007H\u0002J\b\u0010\u0013\u001a\u00020\u0003H\u0002J\b\u0010\u0014\u001a\u00020\u0003H\u0002J\b\u0010\u0015\u001a\u00020\u0003H\u0002J\b\u0010\u0016\u001a\u00020\u0003H\u0014J\u0012\u0010\u0018\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016J\u0006\u0010\u0019\u001a\u00020\u0003J\u000e\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0007J\u000e\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0007J\u000e\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0007J\u0016\u0010 \u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dJ\u0006\u0010!\u001a\u00020\u0003J\u0006\u0010\"\u001a\u00020\u0003J\u0006\u0010#\u001a\u00020\u0003J\u000e\u0010$\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0007J\u000e\u0010&\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u001dR\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00070G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001c\u0010O\u001a\n L*\u0004\u0018\u00010K0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010V\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010\u0014R\u0014\u0010X\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010\u000fR\u0014\u0010\\\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010^\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010\u0014R\u0018\u0010a\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010e\u001a\u00020b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010g\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010\u000f¨\u0006k"}, d2 = {"Lcom/dodopizza/order/feature/personaloffer/presentantion/PersonalOffersPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lk18;", "", "d0", "H", "", "Lp67;", "personalOffers", "N", "c0", "offerVO", "b0", "K", "J", "I", "applyingOfferVO", "X", "Y", "a0", "Z", "G", "onFirstViewAttach", "view", "L", "S", "P", "V", "R", "", "oldPosition", "newPosition", "T", "O", "M", "Q", "W", "position", "U", "La18;", "a", "La18;", "interactor", "Lnfa;", "b", "Lnfa;", "setPromoCodeInteractor", "Lgc;", com.huawei.hms.opendevice.c.a, "Lgc;", "analytics", "Lo08;", DateTokenConverter.CONVERTER_KEY, "Lo08;", "personalOffersData", "Lk63;", com.huawei.hms.push.e.a, "Lk63;", "domainEvents", "Ly18;", "f", "Ly18;", "personalToCollaborationVOConverter", "Li00;", "g", "Li00;", "authorizationState", "Lhq3;", Image.TYPE_HIGH, "Lhq3;", "featureService", "Ll6;", "i", "Ll6;", "offersDataSet", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "j", "Lorg/slf4j/Logger;", "logger", "", "k", "Ljava/lang/String;", "blockTitle", "", "l", "showDescription", Image.TYPE_MEDIUM, "blockTitleTextAppearance", "Lh18;", "n", "Lh18;", "analyticsSender", "o", "showLoadingState", "p", "Lp67;", "chosenPromoOfferCandidate", "Lcom/dodopizza/order/feature/personaloffer/presentantion/PersonalOffersPresenter$b;", "q", "Lcom/dodopizza/order/feature/personaloffer/presentantion/PersonalOffersPresenter$b;", "state", "r", "prevScrollPosition", "<init>", "(La18;Lnfa;Lgc;Lo08;Lk63;Ly18;Li00;Lhq3;Ll6;)V", Image.TYPE_SMALL, "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class PersonalOffersPresenter extends BasePresenter<k18> {
    public static final a s = new a(null);
    public static final int t = 8;
    private final a18 a;
    private final nfa b;
    private final gc c;
    private final o08 d;
    private final k63 e;
    private final y18 f;
    private final i00 g;
    private final hq3 h;
    private final l6<p67> i;
    private final Logger j;
    private final String k;
    private final boolean l;
    private final int m;
    private final h18 n;
    private final boolean o;
    private p67 p;
    private b q;
    private int r;

    /* compiled from: PersonalOffersPresenter.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\n"}, d2 = {"Lcom/dodopizza/order/feature/personaloffer/presentantion/PersonalOffersPresenter$a;", "", "", "Lp67;", "offers", "", "collaborationAvailable", "a", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Collection<p67> a(Collection<? extends p67> collection, boolean z) {
            z65.h(collection, "offers");
            if (!z) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : collection) {
                    p67 p67Var = (p67) obj;
                    boolean z2 = p67Var instanceof k08;
                    if ((z2 && !((k08) p67Var).p()) || !z2) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
            return collection;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PersonalOffersPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/dodopizza/order/feature/personaloffer/presentantion/PersonalOffersPresenter$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class b {
        public static final b a = new b("IDLE", 0);
        public static final b b = new b("LOADING", 1);
        private static final /* synthetic */ b[] c;
        private static final /* synthetic */ kj3 d;

        static {
            b[] a2 = a();
            c = a2;
            d = lj3.a(a2);
        }

        private b(String str, int i) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{a, b};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) c.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PersonalOffersPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.personaloffer.presentantion.PersonalOffersPresenter$applyPersonalOffers$1", f = "PersonalOffersPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        c(cv1<? super c> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new c(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((c) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PersonalOffersPresenter.this.q = b.b;
                if (PersonalOffersPresenter.this.o) {
                    ((k18) PersonalOffersPresenter.this.getViewState()).Nc();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PersonalOffersPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lp67;", "offers", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.personaloffer.presentantion.PersonalOffersPresenter$applyPersonalOffers$2", f = "PersonalOffersPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends f3b implements Function2<Collection<? extends p67>, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PersonalOffersPresenter.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lp67;", "old", "new", "Landroidx/recyclerview/widget/e$e;", "a", "(Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/e$e;"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class a extends ej5 implements Function2<List<? extends p67>, List<? extends p67>, e.C0047e> {
            public static final a a = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a */
            public final e.C0047e invoke(List<? extends p67> list, List<? extends p67> list2) {
                z65.h(list, "old");
                z65.h(list2, "new");
                e.C0047e b = androidx.recyclerview.widget.e.b(new q67(list, list2));
                z65.g(b, "calculateDiff(...)");
                return b;
            }
        }

        d(cv1<? super d> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            d dVar = new d(cv1Var);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Collection<? extends p67> collection, cv1<? super Unit> cv1Var) {
            return ((d) create(collection, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            List F0;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Collection N = PersonalOffersPresenter.this.N(PersonalOffersPresenter.s.a((Collection) this.b, PersonalOffersPresenter.this.d.f()));
                ((k18) PersonalOffersPresenter.this.getViewState()).D8(!N.isEmpty());
                if (!N.isEmpty()) {
                    if (PersonalOffersPresenter.this.l) {
                        Collection<p67> collection = N;
                        if (!(collection instanceof Collection) || !collection.isEmpty()) {
                            for (p67 p67Var : collection) {
                                if (p67Var.h().c()) {
                                    ((k18) PersonalOffersPresenter.this.getViewState()).L2();
                                    break;
                                }
                            }
                        }
                        if (N.size() == 1) {
                            ((k18) PersonalOffersPresenter.this.getViewState()).W5();
                        } else {
                            ((k18) PersonalOffersPresenter.this.getViewState()).le();
                        }
                    }
                    l6 l6Var = PersonalOffersPresenter.this.i;
                    F0 = sc1.F0(N);
                    l6Var.Z(F0, a.a);
                    PersonalOffersPresenter.this.c0(N);
                } else {
                    PersonalOffersPresenter.this.i.r();
                    ((k18) PersonalOffersPresenter.this.getViewState()).vd();
                    ((k18) PersonalOffersPresenter.this.getViewState()).q8();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PersonalOffersPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.personaloffer.presentantion.PersonalOffersPresenter$applyPersonalOffers$3", f = "PersonalOffersPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        e(cv1<? super e> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            e eVar = new e(cv1Var);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((e) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PersonalOffersPresenter.this.j.error("Failed to get personal offers", (Throwable) this.b);
                ((k18) PersonalOffersPresenter.this.getViewState()).vd();
                ((k18) PersonalOffersPresenter.this.getViewState()).Y9();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PersonalOffersPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.personaloffer.presentantion.PersonalOffersPresenter$applyPersonalOffers$4", f = "PersonalOffersPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        f(cv1<? super f> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new f(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((f) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PersonalOffersPresenter.this.q = b.a;
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PersonalOffersPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.personaloffer.presentantion.PersonalOffersPresenter$applyPersonalPromoAction$1", f = "PersonalOffersPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ p67 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(p67 p67Var, cv1<? super g> cv1Var) {
            super(1, cv1Var);
            this.c = p67Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new g(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((g) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PersonalOffersPresenter.this.q = b.b;
                PersonalOffersPresenter.this.X(this.c);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PersonalOffersPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lw18;", "promoCode", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.personaloffer.presentantion.PersonalOffersPresenter$applyPersonalPromoAction$2", f = "PersonalOffersPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends f3b implements Function2<w18, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ p67 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(p67 p67Var, cv1<? super h> cv1Var) {
            super(2, cv1Var);
            this.d = p67Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            h hVar = new h(this.d, cv1Var);
            hVar.b = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(w18 w18Var, cv1<? super Unit> cv1Var) {
            return ((h) create(w18Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                w18 w18Var = (w18) this.b;
                eq8 e = w18Var.e();
                if (e == eq8.a) {
                    PersonalOffersPresenter.this.Y(this.d);
                    ((k18) PersonalOffersPresenter.this.getViewState()).Me();
                } else if (e == eq8.b) {
                    PersonalOffersPresenter.this.Y(this.d);
                    ((k18) PersonalOffersPresenter.this.getViewState()).ub();
                } else if (e != eq8.c || !z65.c(w18Var.d(), w18.h.a().d())) {
                    PersonalOffersPresenter.this.Z();
                    if (w18Var.f().length() > 0) {
                        ((k18) PersonalOffersPresenter.this.getViewState()).j0(w18Var.f());
                    } else {
                        ((k18) PersonalOffersPresenter.this.getViewState()).R0(fq8.a(w18Var.e()));
                    }
                } else {
                    PersonalOffersPresenter.this.a0();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PersonalOffersPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.personaloffer.presentantion.PersonalOffersPresenter$applyPersonalPromoAction$3", f = "PersonalOffersPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        i(cv1<? super i> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new i(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((i) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PersonalOffersPresenter.this.Z();
                ((k18) PersonalOffersPresenter.this.getViewState()).I9();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PersonalOffersPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.personaloffer.presentantion.PersonalOffersPresenter$applyPersonalPromoAction$4", f = "PersonalOffersPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        j(cv1<? super j> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new j(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((j) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PersonalOffersPresenter.this.q = b.a;
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PersonalOffersPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.personaloffer.presentantion.PersonalOffersPresenter$applyPromoCode$1", f = "PersonalOffersPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ p67 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(p67 p67Var, cv1<? super k> cv1Var) {
            super(1, cv1Var);
            this.c = p67Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new k(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((k) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PersonalOffersPresenter.this.q = b.b;
                PersonalOffersPresenter.this.X(this.c);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PersonalOffersPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lop8;", "promoCode", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.personaloffer.presentantion.PersonalOffersPresenter$applyPromoCode$2", f = "PersonalOffersPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l extends f3b implements Function2<op8, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ p67 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(p67 p67Var, cv1<? super l> cv1Var) {
            super(2, cv1Var);
            this.d = p67Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            l lVar = new l(this.d, cv1Var);
            lVar.b = obj;
            return lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(op8 op8Var, cv1<? super Unit> cv1Var) {
            return ((l) create(op8Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                op8 op8Var = (op8) this.b;
                eq8 e = op8Var.e();
                if (e == eq8.a) {
                    PersonalOffersPresenter.this.Y(this.d);
                    ((k18) PersonalOffersPresenter.this.getViewState()).Me();
                } else if (e == eq8.b) {
                    PersonalOffersPresenter.this.Y(this.d);
                    ((k18) PersonalOffersPresenter.this.getViewState()).ub();
                } else if (e != eq8.c || !z65.c(op8Var.d(), op8.h.a().d())) {
                    PersonalOffersPresenter.this.Z();
                    if (op8Var.f().length() > 0) {
                        ((k18) PersonalOffersPresenter.this.getViewState()).j0(op8Var.f());
                    } else {
                        ((k18) PersonalOffersPresenter.this.getViewState()).R0(fq8.a(op8Var.e()));
                    }
                } else {
                    PersonalOffersPresenter.this.a0();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PersonalOffersPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.personaloffer.presentantion.PersonalOffersPresenter$applyPromoCode$3", f = "PersonalOffersPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class m extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        m(cv1<? super m> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new m(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((m) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PersonalOffersPresenter.this.Z();
                ((k18) PersonalOffersPresenter.this.getViewState()).I9();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PersonalOffersPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.personaloffer.presentantion.PersonalOffersPresenter$applyPromoCode$4", f = "PersonalOffersPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class n extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        n(cv1<? super n> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new n(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((n) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PersonalOffersPresenter.this.q = b.a;
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PersonalOffersPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.personaloffer.presentantion.PersonalOffersPresenter$onResetPersonalOfferClick$1", f = "PersonalOffersPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class o extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ p67 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(p67 p67Var, cv1<? super o> cv1Var) {
            super(1, cv1Var);
            this.c = p67Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new o(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((o) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PersonalOffersPresenter.this.q = b.b;
                PersonalOffersPresenter.this.X(this.c);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PersonalOffersPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.personaloffer.presentantion.PersonalOffersPresenter$onResetPersonalOfferClick$2", f = "PersonalOffersPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class p extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;

        p(cv1<? super p> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new p(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((p) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PersonalOffersPresenter.this.a0();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PersonalOffersPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.personaloffer.presentantion.PersonalOffersPresenter$onResetPersonalOfferClick$3", f = "PersonalOffersPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class q extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        q(cv1<? super q> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            q qVar = new q(cv1Var);
            qVar.b = obj;
            return qVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((q) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PersonalOffersPresenter.this.j.warn("Failed to reset promo code. ", (Throwable) this.b);
                PersonalOffersPresenter.this.Z();
                ((k18) PersonalOffersPresenter.this.getViewState()).I9();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PersonalOffersPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.personaloffer.presentantion.PersonalOffersPresenter$onResetPersonalOfferClick$4", f = "PersonalOffersPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class r extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        r(cv1<? super r> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new r(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((r) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PersonalOffersPresenter.this.q = b.a;
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PersonalOffersPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.personaloffer.presentantion.PersonalOffersPresenter$onSecretCardOpen$1", f = "PersonalOffersPresenter.kt", l = {456}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class s extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ p67 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(p67 p67Var, cv1<? super s> cv1Var) {
            super(1, cv1Var);
            this.c = p67Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new s(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((s) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                a18 a18Var = PersonalOffersPresenter.this.a;
                p67 p67Var = this.c;
                this.a = 1;
                if (a18Var.b(p67Var, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: PersonalOffersPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.personaloffer.presentantion.PersonalOffersPresenter$onSecretCardOpen$2", f = "PersonalOffersPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class t extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ p67 c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PersonalOffersPresenter.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp67;", "item", "", "a", "(Lp67;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class a extends ej5 implements Function1<p67, Boolean> {
            final /* synthetic */ p67 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p67 p67Var) {
                super(1);
                this.a = p67Var;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(p67 p67Var) {
                z65.h(p67Var, "item");
                return Boolean.valueOf(z65.c(p67Var.a(), this.a.a()));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PersonalOffersPresenter.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp67;", "it", "", "", "a", "(Lp67;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class b extends ej5 implements Function1<p67, List<? extends String>> {
            public static final b a = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final List<String> invoke(p67 p67Var) {
                List<String> e;
                z65.h(p67Var, "it");
                p67Var.l(u2a.c.a);
                e = jc1.e("update_open_card");
                return e;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(p67 p67Var, cv1<? super t> cv1Var) {
            super(1, cv1Var);
            this.c = p67Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new t(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((t) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (!PersonalOffersPresenter.this.i.isEmpty()) {
                    PersonalOffersPresenter.this.i.S(new a(this.c), b.a);
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PersonalOffersPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.personaloffer.presentantion.PersonalOffersPresenter$onSecretCardOpen$3", f = "PersonalOffersPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class u extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        u(cv1<? super u> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            u uVar = new u(cv1Var);
            uVar.b = obj;
            return uVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((u) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PersonalOffersPresenter.this.j.warn("Failed to set opening for secret action", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PersonalOffersPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp67;", "offerVO", "", "", "a", "(Lp67;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class v extends ej5 implements Function1<p67, List<? extends String>> {
        final /* synthetic */ p67 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(p67 p67Var) {
            super(1);
            this.a = p67Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(p67 p67Var) {
            List<String> e;
            z65.h(p67Var, "offerVO");
            if (z65.c(p67Var.a(), this.a.a())) {
                p67Var.k(bs5.b);
            } else {
                p67Var.k(bs5.c);
            }
            e = jc1.e("update");
            return e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PersonalOffersPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp67;", "offerVO", "", "", "a", "(Lp67;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class w extends ej5 implements Function1<p67, List<? extends String>> {
        final /* synthetic */ p67 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(p67 p67Var) {
            super(1);
            this.a = p67Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(p67 p67Var) {
            List<String> e;
            z65.h(p67Var, "offerVO");
            p67Var.j(z65.c(p67Var.a(), this.a.a()));
            p67Var.k(bs5.a);
            e = jc1.e("update");
            return e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PersonalOffersPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp67;", "offerVO", "", "", "a", "(Lp67;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class x extends ej5 implements Function1<p67, List<? extends String>> {
        public static final x a = new x();

        x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(p67 p67Var) {
            List<String> e;
            z65.h(p67Var, "offerVO");
            p67Var.k(bs5.a);
            e = jc1.e("update");
            return e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PersonalOffersPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp67;", "offerVO", "", "", "a", "(Lp67;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class y extends ej5 implements Function1<p67, List<? extends String>> {
        public static final y a = new y();

        y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(p67 p67Var) {
            List<String> e;
            z65.h(p67Var, "offerVO");
            p67Var.j(false);
            p67Var.k(bs5.a);
            e = jc1.e("update");
            return e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PersonalOffersPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lj63;", "domainEvent", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.personaloffer.presentantion.PersonalOffersPresenter$subscribeOnDomainEvents$1", f = "PersonalOffersPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class z extends f3b implements Function2<j63, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        z(cv1<? super z> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            z zVar = new z(cv1Var);
            zVar.b = obj;
            return zVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(j63 j63Var, cv1<? super Unit> cv1Var) {
            return ((z) create(j63Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (((j63) this.b) == j63.b && PersonalOffersPresenter.this.q == b.a && PersonalOffersPresenter.this.g.b()) {
                    PersonalOffersPresenter.this.H();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public /* synthetic */ PersonalOffersPresenter(a18 a18Var, nfa nfaVar, gc gcVar, o08 o08Var, k63 k63Var, y18 y18Var, i00 i00Var, hq3 hq3Var, l6 l6Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(a18Var, nfaVar, gcVar, o08Var, k63Var, y18Var, i00Var, hq3Var, (i2 & 256) != 0 ? new l6(null, 1, null) : l6Var);
    }

    private final void G() {
        Object k0;
        gc gcVar = this.c;
        k0 = sc1.k0(this.i);
        gcVar.a(new d08(((p67) k0).a(), this.n));
        ((k18) getViewState()).V2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H() {
        p(o77.a(z77.a(y87.a(r77.a(this.a.a(), new c(null)), new d(null)), new e(null)), new f(null)));
    }

    private final void I(p67 p67Var) {
        p(o77.a(z77.a(y87.a(r77.a(this.b.n(p67Var.a(), i18.b(this.n), p67Var instanceof t2a), new g(p67Var, null)), new h(p67Var, null)), new i(null)), new j(null)));
    }

    private final void J(p67 p67Var) {
        this.p = null;
        if (p67Var.f().length() > 0) {
            K(p67Var);
        } else {
            I(p67Var);
        }
    }

    private final void K(p67 p67Var) {
        p(o77.a(z77.a(y87.a(r77.a(this.b.o(p67Var.f(), i18.b(this.n)), new k(p67Var, null)), new l(p67Var, null)), new m(null)), new n(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Collection<p67> N(Collection<? extends p67> collection) {
        List B0;
        List q0;
        if (this.h.a(bq3.v6)) {
            Collection<? extends p67> collection2 = collection;
            ArrayList arrayList = new ArrayList();
            for (Object obj : collection2) {
                if (((p67) obj).g() != u2a.a.a) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : collection2) {
                if (z65.c(((p67) obj2).g(), u2a.a.a)) {
                    arrayList2.add(obj2);
                }
            }
            B0 = sc1.B0(arrayList2, 1);
            q0 = sc1.q0(arrayList, B0);
            return q0;
        }
        return collection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X(p67 p67Var) {
        this.i.w1(new v(p67Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(p67 p67Var) {
        this.i.w1(new w(p67Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z() {
        this.i.w1(x.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0() {
        this.i.w1(y.a);
    }

    private final void b0(p67 p67Var) {
        u2a g2 = p67Var.g();
        if (g2 instanceof u2a.b) {
            ((k18) getViewState()).Pd();
        } else if (g2 instanceof u2a.c) {
            ((k18) getViewState()).K4();
        } else if (g2 instanceof u2a.a) {
            ((k18) getViewState()).i9();
            if (this.i.size() == 2) {
                G();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(Collection<? extends p67> collection) {
        Object j0;
        if (this.h.a(bq3.v6)) {
            j0 = sc1.j0(collection);
            b0((p67) j0);
            return;
        }
        ((k18) getViewState()).Pd();
    }

    private final void d0() {
        o(wz3.F(this.e.c(), new z(null)));
    }

    @Override // moxy.MvpPresenter
    /* renamed from: L */
    public void attachView(k18 k18Var) {
        super.attachView(k18Var);
        H();
    }

    public final void M() {
        p67 p67Var = this.p;
        if (p67Var != null) {
            J(p67Var);
        }
    }

    public final void O() {
        H();
    }

    public final void P(p67 p67Var) {
        z65.h(p67Var, "offerVO");
        if (this.b.k()) {
            this.p = p67Var;
            ((k18) getViewState()).I0();
            return;
        }
        J(p67Var);
    }

    public final void Q() {
        this.p = null;
    }

    public final void R(p67 p67Var) {
        z65.h(p67Var, "offerVO");
        boolean z2 = p67Var instanceof k08;
        if (z2 && ((k08) p67Var).p()) {
            this.c.a(new gb1(p67Var.a(), p67Var.e(), qb1.b));
            ((k18) getViewState()).Gg(this.f.a(p67Var));
        } else if (z2) {
            ((k18) getViewState()).l3(p67Var, i18.b(this.n));
        } else if (p67Var instanceof t2a) {
            ((k18) getViewState()).Re((t2a) p67Var, i18.b(this.n));
        }
    }

    public final void S() {
        H();
    }

    public final void T(int i2, int i3) {
        Object c0;
        Object c02;
        boolean z2;
        c0 = sc1.c0(this.i, i2);
        p67 p67Var = (p67) c0;
        c02 = sc1.c0(this.i, i3);
        p67 p67Var2 = (p67) c02;
        if (p67Var != null && p67Var2 != null) {
            gc gcVar = this.c;
            if (i3 > i2) {
                z2 = true;
            } else {
                z2 = false;
            }
            gcVar.a(new c08(z2, p67Var.a(), p67Var2.a(), this.n));
        }
    }

    public final void U(int i2) {
        boolean z2;
        Object l0;
        u2a u2aVar;
        if (this.i.size() > 2 && i2 == this.i.size() - 2 && this.r == this.i.size() - 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.h.a(bq3.v6) && z2) {
            l0 = sc1.l0(this.i);
            p67 p67Var = (p67) l0;
            if (p67Var != null) {
                u2aVar = p67Var.g();
            } else {
                u2aVar = null;
            }
            if (z65.c(u2aVar, u2a.a.a)) {
                G();
            }
        }
        this.r = i2;
    }

    public final void V(p67 p67Var) {
        wx<Unit> l2;
        z65.h(p67Var, "offerVO");
        if (p67Var.f().length() > 0) {
            l2 = this.b.m();
        } else {
            l2 = this.b.l();
        }
        p(o77.a(z77.a(y87.a(r77.a(l2, new o(p67Var, null)), new p(null)), new q(null)), new r(null)));
    }

    public final void W(p67 p67Var) {
        z65.h(p67Var, "offerVO");
        this.c.a(new a08(p67Var.a(), this.n));
        p(z77.a(r77.a(hy.a(new s(p67Var, null)), new t(p67Var, null)), new u(null)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        ((k18) getViewState()).A4(this.k);
        ((k18) getViewState()).z3(this.m);
        ((k18) getViewState()).F8(this.i);
        d0();
    }

    public PersonalOffersPresenter(a18 a18Var, nfa nfaVar, gc gcVar, o08 o08Var, k63 k63Var, y18 y18Var, i00 i00Var, hq3 hq3Var, l6<p67> l6Var) {
        z65.h(a18Var, "interactor");
        z65.h(nfaVar, "setPromoCodeInteractor");
        z65.h(gcVar, "analytics");
        z65.h(o08Var, "personalOffersData");
        z65.h(k63Var, "domainEvents");
        z65.h(y18Var, "personalToCollaborationVOConverter");
        z65.h(i00Var, "authorizationState");
        z65.h(hq3Var, "featureService");
        z65.h(l6Var, "offersDataSet");
        this.a = a18Var;
        this.b = nfaVar;
        this.c = gcVar;
        this.d = o08Var;
        this.e = k63Var;
        this.f = y18Var;
        this.g = i00Var;
        this.h = hq3Var;
        this.i = l6Var;
        this.j = LoggerFactory.getLogger("PersonalOffersPresenter");
        this.k = o08Var.b();
        this.l = o08Var.d();
        this.m = o08Var.c();
        this.n = o08Var.a();
        this.o = o08Var.e();
        this.q = b.a;
        this.r = -1;
    }
}
