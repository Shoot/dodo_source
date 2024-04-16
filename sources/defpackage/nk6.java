package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
/* compiled from: MindboxPreferences.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u000f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b>\u0010?J\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0017\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R$\u0010\u001a\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R$\u0010\u001d\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R$\u0010#\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010%\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0011\"\u0004\b$\u0010\u0013R(\u0010(\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010\u0011\"\u0004\b'\u0010\u0013R$\u0010+\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010\u0011\"\u0004\b*\u0010\u0013R$\u0010.\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010 \"\u0004\b-\u0010\"R$\u00100\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u0011\"\u0004\b/\u0010\u0013R\u0011\u00104\u001a\u0002018F¢\u0006\u0006\u001a\u0004\b2\u00103R$\u00107\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u0010\u0011\"\u0004\b6\u0010\u0013R$\u0010:\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u0010\u0011\"\u0004\b9\u0010\u0013R$\u0010=\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010 \"\u0004\b<\u0010\"¨\u0006@"}, d2 = {"Lnk6;", "", "", "p", "Lqx1;", "b", "Lqx1;", "prefScope", "Lcr6;", "", com.huawei.hms.opendevice.c.a, "Lcr6;", com.huawei.hms.push.e.a, "()Lcr6;", "inAppConfigFlow", "value", "i", "()Ljava/lang/String;", "w", "(Ljava/lang/String;)V", "logsRequestIds", "f", "u", "inAppGeo", DateTokenConverter.CONVERTER_KEY, "t", "inAppConfig", "l", "A", "shownInAppIds", "", "n", "()Z", "r", "(Z)V", "isFirstInitialize", "q", "deviceUuid", "k", "z", "pushToken", "getTokenSaveDate", "B", "tokenSaveDate", "o", "x", "isNotificationEnabled", Image.TYPE_SMALL, "hostAppName", "", "g", "()I", "infoUpdatedVersion", Image.TYPE_HIGH, "v", "instanceId", "j", "y", "notificationProvider", Image.TYPE_MEDIUM, "C", "uuidDebugEnabled", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: nk6  reason: default package */
/* loaded from: classes.dex */
public final class nk6 {
    public static final nk6 a = new nk6();
    private static final qx1 b = rx1.a(v33.a());
    private static final cr6<String> c = uha.b(20, 0, null, 6, null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MindboxPreferences.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: nk6$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function0<String> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            String e = zha.e(zha.a, "key_device_uuid", null, 2, null);
            if (e == null) {
                return "";
            }
            return e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MindboxPreferences.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: nk6$b */
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function0<Unit> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            zha.a.j("key_device_uuid", this.a);
        }
    }

    /* compiled from: MindboxPreferences.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: nk6$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function0<String> {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            String e = zha.e(zha.a, "key_host_app_name", null, 2, null);
            if (e == null) {
                return "";
            }
            return e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MindboxPreferences.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: nk6$d */
    /* loaded from: classes.dex */
    public static final class d extends ej5 implements Function0<Unit> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            zha.a.h("key_host_app_name", this.a);
        }
    }

    /* compiled from: MindboxPreferences.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: nk6$e */
    /* loaded from: classes.dex */
    static final class e extends ej5 implements Function0<String> {
        public static final e a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            String e = zha.e(zha.a, "IN_APP_CONFIG", null, 2, null);
            if (e == null) {
                return "";
            }
            return e;
        }
    }

    /* compiled from: MindboxPreferences.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ll95;", "a", "()Ll95;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: nk6$f */
    /* loaded from: classes.dex */
    static final class f extends ej5 implements Function0<l95> {
        final /* synthetic */ String a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MindboxPreferences.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @nn2(c = "cloud.mindbox.mobile_sdk.repository.MindboxPreferences$inAppConfig$2$1", f = "MindboxPreferences.kt", l = {60}, m = "invokeSuspend")
        /* renamed from: nk6$f$a */
        /* loaded from: classes.dex */
        public static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
            int a;
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, cv1<? super a> cv1Var) {
                super(2, cv1Var);
                this.b = str;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                return new a(this.b, cv1Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                    cr6<String> e = nk6.a.e();
                    String str = this.b;
                    this.a = 1;
                    if (e.emit(str, this) == d) {
                        return d;
                    }
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final l95 invoke() {
            l95 d;
            zha.a.h("IN_APP_CONFIG", this.a);
            d = sh0.d(nk6.b, null, null, new a(this.a, null), 3, null);
            return d;
        }
    }

    /* compiled from: MindboxPreferences.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: nk6$g */
    /* loaded from: classes.dex */
    static final class g extends ej5 implements Function0<String> {
        public static final g a = new g();

        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            String e = zha.e(zha.a, "IN_APP_GEO", null, 2, null);
            if (e == null) {
                return "";
            }
            return e;
        }
    }

    /* compiled from: MindboxPreferences.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: nk6$h */
    /* loaded from: classes.dex */
    static final class h extends ej5 implements Function0<Unit> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            zha.a.h("IN_APP_GEO", this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MindboxPreferences.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: nk6$i */
    /* loaded from: classes.dex */
    public static final class i extends ej5 implements Function0<Integer> {
        public static final i a = new i();

        i() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            zha zhaVar = zha.a;
            int c = zhaVar.c("key_info_updated_version", 1);
            zhaVar.g("key_info_updated_version", c + 1);
            return Integer.valueOf(c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MindboxPreferences.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: nk6$j */
    /* loaded from: classes.dex */
    public static final class j extends ej5 implements Function0<String> {
        public static final j a = new j();

        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            String e = zha.e(zha.a, "key_instance_id", null, 2, null);
            if (e == null) {
                return "";
            }
            return e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MindboxPreferences.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: nk6$k */
    /* loaded from: classes.dex */
    public static final class k extends ej5 implements Function0<Unit> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            zha.a.h("key_instance_id", this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MindboxPreferences.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: nk6$l */
    /* loaded from: classes.dex */
    public static final class l extends ej5 implements Function0<Boolean> {
        public static final l a = new l();

        l() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(zha.a.b("key_is_first_initialization", true));
        }
    }

    /* compiled from: MindboxPreferences.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: nk6$m */
    /* loaded from: classes.dex */
    static final class m extends ej5 implements Function0<Unit> {
        final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            zha.a.i("key_is_first_initialization", this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MindboxPreferences.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: nk6$n */
    /* loaded from: classes.dex */
    public static final class n extends ej5 implements Function0<Boolean> {
        public static final n a = new n();

        n() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(zha.a.b("key_is_notification_enabled", true));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MindboxPreferences.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: nk6$o */
    /* loaded from: classes.dex */
    public static final class o extends ej5 implements Function0<Unit> {
        final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            zha.a.i("key_is_notification_enabled", this.a);
        }
    }

    /* compiled from: MindboxPreferences.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: nk6$p */
    /* loaded from: classes.dex */
    static final class p extends ej5 implements Function0<String> {
        public static final p a = new p();

        p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            String d = zha.a.d("LOGS_REQUEST_IDS", "");
            if (d == null) {
                return "";
            }
            return d;
        }
    }

    /* compiled from: MindboxPreferences.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: nk6$q */
    /* loaded from: classes.dex */
    static final class q extends ej5 implements Function0<Unit> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            zha.a.h("LOGS_REQUEST_IDS", this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MindboxPreferences.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: nk6$r */
    /* loaded from: classes.dex */
    public static final class r extends ej5 implements Function0<String> {
        public static final r a = new r();

        r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            String e = zha.e(zha.a, "key_notification_provider", null, 2, null);
            if (e == null) {
                return "";
            }
            return e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MindboxPreferences.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: nk6$s */
    /* loaded from: classes.dex */
    public static final class s extends ej5 implements Function0<Unit> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            zha.a.h("key_notification_provider", this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MindboxPreferences.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: nk6$t */
    /* loaded from: classes.dex */
    public static final class t extends ej5 implements Function0<String> {
        public static final t a = new t();

        t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return zha.e(zha.a, "key_firebase_token", null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MindboxPreferences.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: nk6$u */
    /* loaded from: classes.dex */
    public static final class u extends ej5 implements Function0<Unit> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            zha.a.h("key_firebase_token", this.a);
            nk6 nk6Var = nk6.a;
            String date = new Date().toString();
            z65.g(date, "Date().toString()");
            nk6Var.B(date);
        }
    }

    /* compiled from: MindboxPreferences.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: nk6$v */
    /* loaded from: classes.dex */
    static final class v extends ej5 implements Function0<String> {
        public static final v a = new v();

        v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            String d = zha.a.d("SHOWN_IDS", "");
            if (d == null) {
                return "";
            }
            return d;
        }
    }

    /* compiled from: MindboxPreferences.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: nk6$w */
    /* loaded from: classes.dex */
    static final class w extends ej5 implements Function0<Unit> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            zha.a.h("SHOWN_IDS", this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MindboxPreferences.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: nk6$x */
    /* loaded from: classes.dex */
    public static final class x extends ej5 implements Function0<Unit> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            zha.a.h("key_firebase_token_save_date", this.a);
        }
    }

    /* compiled from: MindboxPreferences.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: nk6$y */
    /* loaded from: classes.dex */
    static final class y extends ej5 implements Function0<Boolean> {
        public static final y a = new y();

        y() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(zha.a.b("key_uuid_debug_enabled", true));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MindboxPreferences.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: nk6$z */
    /* loaded from: classes.dex */
    public static final class z extends ej5 implements Function0<Unit> {
        final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            zha.a.i("key_uuid_debug_enabled", this.a);
        }
    }

    private nk6() {
    }

    public final void A(String str) {
        z65.h(str, "value");
        yx5.a.d(new w(str));
    }

    public final void B(String str) {
        z65.h(str, "value");
        yx5.a.d(new x(str));
    }

    public final void C(boolean z2) {
        yx5.a.d(new z(z2));
    }

    public final String b() {
        return (String) yx5.a.b("", a.a);
    }

    public final String c() {
        return (String) yx5.a.b("", c.a);
    }

    public final String d() {
        return (String) yx5.a.b("", e.a);
    }

    public final cr6<String> e() {
        return c;
    }

    public final String f() {
        return (String) yx5.a.b("", g.a);
    }

    public final synchronized int g() {
        return ((Number) yx5.a.b(1, i.a)).intValue();
    }

    public final String h() {
        return (String) yx5.a.b("", j.a);
    }

    public final String i() {
        return (String) yx5.a.b("", p.a);
    }

    public final String j() {
        return (String) yx5.a.b("", r.a);
    }

    public final String k() {
        return (String) yx5.a.b(null, t.a);
    }

    public final String l() {
        return (String) yx5.a.b("", v.a);
    }

    public final boolean m() {
        return ((Boolean) yx5.a.b(Boolean.TRUE, y.a)).booleanValue();
    }

    public final boolean n() {
        return ((Boolean) yx5.a.b(Boolean.TRUE, l.a)).booleanValue();
    }

    public final boolean o() {
        return ((Boolean) yx5.a.b(Boolean.TRUE, n.a)).booleanValue();
    }

    public final void p() {
        zha.a.g("key_info_updated_version", 1);
    }

    public final void q(String str) {
        z65.h(str, "value");
        yx5.a.d(new b(str));
    }

    public final void r(boolean z2) {
        yx5.a.d(new m(z2));
    }

    public final void s(String str) {
        z65.h(str, "value");
        yx5.a.d(new d(str));
    }

    public final void t(String str) {
        z65.h(str, "value");
        yx5.a.d(new f(str));
    }

    public final void u(String str) {
        z65.h(str, "value");
        yx5.a.d(new h(str));
    }

    public final void v(String str) {
        z65.h(str, "value");
        yx5.a.d(new k(str));
    }

    public final void w(String str) {
        z65.h(str, "value");
        yx5.a.d(new q(str));
    }

    public final void x(boolean z2) {
        yx5.a.d(new o(z2));
    }

    public final void y(String str) {
        z65.h(str, "value");
        yx5.a.d(new s(str));
    }

    public final void z(String str) {
        yx5.a.d(new u(str));
    }
}
