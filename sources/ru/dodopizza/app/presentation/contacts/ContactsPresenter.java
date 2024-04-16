package ru.dodopizza.app.presentation.contacts;

import android.os.Handler;
import android.os.Looper;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.dy0;
import defpackage.fy5;
import defpackage.js1;
import defpackage.zw9;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.R;
import ru.dodopizza.app.presentation.contacts.ContactsPresenter;
import ru.dodopizza.app.presentation.phonenumberlogin.e;
/* compiled from: ContactsPresenter.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 _2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B_\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u00106\u001a\u000203\u0012\u0006\u0010:\u001a\u000207\u0012\u0006\u0010>\u001a\u00020;\u0012\u0006\u0010A\u001a\u00020\u000e\u0012\u0006\u0010E\u001a\u00020B\u0012\u0006\u0010I\u001a\u00020F\u0012\u0006\u0010\\\u001a\u00020[¢\u0006\u0004\b]\u0010^J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0003H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\u0003H\u0002J\u0014\u0010\u0011\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0016\u0010\u0014\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0002J\u0016\u0010\u0015\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0003H\u0002J\b\u0010\u0017\u001a\u00020\u0003H\u0014J\u0012\u0010\u0019\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0016J\u0006\u0010\u001b\u001a\u00020\u0003J\u0006\u0010\u001c\u001a\u00020\u0003J\u0006\u0010\u001d\u001a\u00020\u0003J\u0006\u0010\u001e\u001a\u00020\u0003J\u0006\u0010\u001f\u001a\u00020\u0003J\u000e\u0010\"\u001a\u00020\u00032\u0006\u0010!\u001a\u00020 R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010A\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001c\u0010N\u001a\n K*\u0004\u0018\u00010J0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010Q\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u001b\u0010W\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001b\u0010Z\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010T\u001a\u0004\bY\u0010V¨\u0006`"}, d2 = {"Lru/dodopizza/app/presentation/contacts/ContactsPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lzs1;", "", "X", "P", "S", "Q", "V", "Lcom/dodopizza/profile/feature/profilesettings/presentation/a;", "infoData", "Las1;", "E", "R", "Lgc;", "Ldy0$a;", "chatChannel", "W", "Lkotlin/Function0;", "action", "F", "C", "I", "onFirstViewAttach", "view", "B", "onDestroy", "O", "M", "L", "K", "J", "Lbqa;", "socialNetwork", "N", "Lf63;", "a", "Lf63;", "router", "Li00;", "b", "Li00;", "authorizationState", "Lk63;", com.huawei.hms.opendevice.c.a, "Lk63;", "domainEvents", "Lps1;", DateTokenConverter.CONVERTER_KEY, "Lps1;", "interactor", "Lwg6;", com.huawei.hms.push.e.a, "Lwg6;", "menuRefreshInteractor", "Ldf4;", "f", "Ldf4;", "getDataAvailabilityInteractor", "Lns1;", "g", "Lns1;", "contactsInfoConverter", Image.TYPE_HIGH, "Lgc;", "analytics", "Lzt6;", "i", "Lzt6;", "nativeChatUnreadMessagesCount", "Lhq3;", "j", "Lhq3;", "featureService", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "k", "Lorg/slf4j/Logger;", "logger", "l", "Lcom/dodopizza/profile/feature/profilesettings/presentation/a;", "contactInfoData", "", Image.TYPE_MEDIUM, "Lrn5;", "G", "()Z", "isNativeChatEnabled", "n", "H", "isSupportInProfile", "Lwt6;", "nativeChatStateChecker", "<init>", "(Lf63;Li00;Lk63;Lps1;Lwg6;Ldf4;Lns1;Lgc;Lzt6;Lhq3;Lwt6;)V", "o", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ContactsPresenter extends BasePresenter<zs1> {
    public static final a o = new a(null);
    private final f63 a;
    private final i00 b;
    private final k63 c;
    private final ps1 d;
    private final wg6 e;
    private final df4 f;
    private final ns1 g;
    private final gc h;
    private final zt6 i;
    private final hq3 j;
    private final Logger k;
    private com.dodopizza.profile.feature.profilesettings.presentation.a l;
    private final rn5 m;
    private final rn5 n;

    /* compiled from: ContactsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lru/dodopizza/app/presentation/contacts/ContactsPresenter$a;", "", "", "RESULT_ID", "I", "RESULT_LOGIN", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ContactsPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function0<Boolean> {
        final /* synthetic */ wt6 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(wt6 wt6Var) {
            super(0);
            this.a = wt6Var;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.a.a());
        }
    }

    /* compiled from: ContactsPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function0<Boolean> {
        c() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(!ContactsPresenter.this.j.a(bq3.J6));
        }
    }

    /* compiled from: ContactsPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    /* synthetic */ class d extends m94 implements Function0<Unit> {
        d(Object obj) {
            super(0, obj, ContactsPresenter.class, "navigateToNativeChat", "navigateToNativeChat()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((ContactsPresenter) this.receiver).I();
        }
    }

    /* compiled from: ContactsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.contacts.ContactsPresenter$onRefresh$1", f = "ContactsPresenter.kt", l = {168}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class e extends f3b implements Function1<cv1<? super Object>, Object> {
        int a;

        e(cv1<? super e> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new e(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<Object> cv1Var) {
            return ((e) create(cv1Var)).invokeSuspend(Unit.a);
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
                wg6 wg6Var = ContactsPresenter.this.e;
                this.a = 1;
                obj = wg6Var.h(this);
                if (obj == d) {
                    return d;
                }
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ContactsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.contacts.ContactsPresenter$requestContactInfo$1", f = "ContactsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class f extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        f(cv1<? super f> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            f fVar = new f(cv1Var);
            fVar.b = obj;
            return fVar;
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
                Throwable th = (Throwable) this.b;
                ContactsPresenter.this.k.error(th.getMessage(), th);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ContactsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/profile/feature/profilesettings/presentation/a;", "contactInfo", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.contacts.ContactsPresenter$requestContactInfo$2", f = "ContactsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class g extends f3b implements Function2<com.dodopizza.profile.feature.profilesettings.presentation.a, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        g(cv1<? super g> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            g gVar = new g(cv1Var);
            gVar.b = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(com.dodopizza.profile.feature.profilesettings.presentation.a aVar, cv1<? super Unit> cv1Var) {
            return ((g) create(aVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ContactsPresenter.this.l = (com.dodopizza.profile.feature.profilesettings.presentation.a) this.b;
                ContactsPresenter contactsPresenter = ContactsPresenter.this;
                ((zs1) ContactsPresenter.this.getViewState()).G9(contactsPresenter.E(contactsPresenter.l), ContactsPresenter.this.H());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ContactsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lj63;", "domainEvent", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.contacts.ContactsPresenter$subscribeGetUserAuthorized$1", f = "ContactsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class h extends f3b implements Function2<j63, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        h(cv1<? super h> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            h hVar = new h(cv1Var);
            hVar.b = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(j63 j63Var, cv1<? super Unit> cv1Var) {
            return ((h) create(j63Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (((j63) this.b) == j63.c) {
                    ContactsPresenter contactsPresenter = ContactsPresenter.this;
                    ((zs1) ContactsPresenter.this.getViewState()).G9(contactsPresenter.E(contactsPresenter.l), ContactsPresenter.this.H());
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ContactsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lvv6;", "networkAvailabilityState", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.contacts.ContactsPresenter$subscribeOnDataAvailability$1", f = "ContactsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class i extends f3b implements Function2<vv6, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        i(cv1<? super i> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            i iVar = new i(cv1Var);
            iVar.b = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(vv6 vv6Var, cv1<? super Unit> cv1Var) {
            return ((i) create(vv6Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            boolean z;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (((vv6) this.b) == vv6.b) {
                    z = true;
                } else {
                    z = false;
                }
                ((zs1) ContactsPresenter.this.getViewState()).L(z);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ContactsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "messagesCount", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.contacts.ContactsPresenter$subscribeToUnreadChatMessagesCount$1", f = "ContactsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class j extends f3b implements Function2<Integer, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ int b;

        j(cv1<? super j> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            j jVar = new j(cv1Var);
            jVar.b = ((Number) obj).intValue();
            return jVar;
        }

        public final Object i(int i, cv1<? super Unit> cv1Var) {
            return ((j) create(Integer.valueOf(i), cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, cv1<? super Unit> cv1Var) {
            return i(num.intValue(), cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                int i = this.b;
                if (i > 0) {
                    ((zs1) ContactsPresenter.this.getViewState()).h(i);
                } else {
                    ((zs1) ContactsPresenter.this.getViewState()).i();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ContactsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.contacts.ContactsPresenter$subscribeToUnreadChatMessagesCount$2", f = "ContactsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class k extends f3b implements y84<pz3<? super Integer>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        k(cv1<? super k> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super Integer> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            k kVar = new k(cv1Var);
            kVar.b = th;
            return kVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ContactsPresenter.this.k.error("Failed to process unread messages count", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public ContactsPresenter(f63 f63Var, i00 i00Var, k63 k63Var, ps1 ps1Var, wg6 wg6Var, df4 df4Var, ns1 ns1Var, gc gcVar, zt6 zt6Var, hq3 hq3Var, wt6 wt6Var) {
        rn5 b2;
        rn5 b3;
        z65.h(f63Var, "router");
        z65.h(i00Var, "authorizationState");
        z65.h(k63Var, "domainEvents");
        z65.h(ps1Var, "interactor");
        z65.h(wg6Var, "menuRefreshInteractor");
        z65.h(df4Var, "getDataAvailabilityInteractor");
        z65.h(ns1Var, "contactsInfoConverter");
        z65.h(gcVar, "analytics");
        z65.h(zt6Var, "nativeChatUnreadMessagesCount");
        z65.h(hq3Var, "featureService");
        z65.h(wt6Var, "nativeChatStateChecker");
        this.a = f63Var;
        this.b = i00Var;
        this.c = k63Var;
        this.d = ps1Var;
        this.e = wg6Var;
        this.f = df4Var;
        this.g = ns1Var;
        this.h = gcVar;
        this.i = zt6Var;
        this.j = hq3Var;
        this.k = LoggerFactory.getLogger("ContactsPresenter");
        this.l = com.dodopizza.profile.feature.profilesettings.presentation.a.j.a();
        b2 = yn5.b(new b(wt6Var));
        this.m = b2;
        b3 = yn5.b(new c());
        this.n = b3;
    }

    private final void C(final Function0<Unit> function0) {
        this.a.m(R.id.register_success_result, new wk9() { // from class: xs1
            @Override // defpackage.wk9
            public final void onResult(Object obj) {
                ContactsPresenter.D(ContactsPresenter.this, function0, obj);
            }
        });
        g63.b(this.a, "registration_phone_fragment", new ru.dodopizza.app.presentation.phonenumberlogin.e(e.a.g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(ContactsPresenter contactsPresenter, Function0 function0, Object obj) {
        z65.h(contactsPresenter, "this$0");
        z65.h(function0, "$action");
        contactsPresenter.a.j(R.id.register_success_result);
        if ((obj instanceof fy5.b) && contactsPresenter.b.b()) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final as1 E(com.dodopizza.profile.feature.profilesettings.presentation.a aVar) {
        return this.g.a(this.b.b(), G()).invoke(aVar);
    }

    private final void F(Function0<Unit> function0) {
        if (this.b.b()) {
            function0.invoke();
        } else {
            C(function0);
        }
    }

    private final boolean G() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean H() {
        return ((Boolean) this.n.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I() {
        this.a.e(ut6.a());
    }

    private final void P() {
        p(y87.a(z77.a(this.d.a(), new f(null)), new g(null)));
    }

    private final void Q() {
        o(wz3.F(this.c.c(), new h(null)));
    }

    private final void R() {
        o(wz3.F(this.f.a(), new i(null)));
    }

    private final void S() {
        this.a.m(R.id.feedback_result_id, new wk9() { // from class: vs1
            @Override // defpackage.wk9
            public final void onResult(Object obj) {
                ContactsPresenter.T(ContactsPresenter.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(final ContactsPresenter contactsPresenter, final Object obj) {
        z65.h(contactsPresenter, "this$0");
        if (obj instanceof Integer) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: ws1
                @Override // java.lang.Runnable
                public final void run() {
                    ContactsPresenter.U(ContactsPresenter.this, obj);
                }
            }, 16L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(ContactsPresenter contactsPresenter, Object obj) {
        z65.h(contactsPresenter, "this$0");
        ((zs1) contactsPresenter.getViewState()).Ec(((Number) obj).intValue());
    }

    private final void V() {
        o(wz3.h(wz3.F(this.i.a(), new j(null)), new k(null)));
    }

    private final void W(gc gcVar, dy0.a aVar) {
        gcVar.a(dy0.a.a(ck1.d, aVar));
    }

    private final void X() {
        this.h.a(zw9.g.a);
    }

    @Override // moxy.MvpPresenter
    /* renamed from: B */
    public void attachView(zs1 zs1Var) {
        super.attachView(zs1Var);
        P();
        X();
        ((zs1) getViewState()).G9(E(this.l), H());
    }

    public final void J() {
        F(new d(this));
        W(this.h, dy0.a.b);
    }

    public final void K() {
        String d2 = this.l.d();
        if (d2.length() <= 0) {
            d2 = null;
        }
        if (d2 != null) {
            this.a.e(zr3.a());
            this.h.a(new js1.a(ck1.d));
        }
    }

    public final void L() {
        String h2 = this.l.h();
        if (h2.length() <= 0) {
            h2 = null;
        }
        if (h2 != null) {
            ((zs1) getViewState()).a0(h2);
            this.h.a(new h28(ck1.d));
        }
    }

    public final void M() {
        this.a.e(tb.a);
        this.h.a(new js1.b(ck1.d));
    }

    public final void N(bqa bqaVar) {
        z65.h(bqaVar, "socialNetwork");
        String a2 = dqa.a(this.l, bqaVar);
        if (!dqa.b(a2)) {
            Logger logger = this.k;
            logger.error("Failed to open " + bqaVar + ": link is missing");
            return;
        }
        ((zs1) getViewState()).d(a2);
        this.h.a(new js1.c(ck1.d, bqaVar));
    }

    public final void O() {
        p(hy.a(new e(null)));
    }

    @Override // moxy.MvpPresenter
    public void onDestroy() {
        this.a.j(R.id.register_success_result);
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        Q();
        R();
        S();
        V();
    }
}
