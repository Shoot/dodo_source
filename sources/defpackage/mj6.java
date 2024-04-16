package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.lifecycle.d;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import cloud.mindbox.mobile_sdk.InitializeMindboxException;
import cloud.mindbox.mobile_sdk.MindboxConfiguration;
import cloud.mindbox.mobile_sdk.managers.LifecycleManager;
import cloud.mindbox.mobile_sdk.models.Configuration;
import com.dodopizza.kustoworker.KustoStorage;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.dk6;
import defpackage.lx1;
import defpackage.tx4;
import defpackage.v25;
import defpackage.xx9;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: Mindbox.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bv\u0010wJ\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J(\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J(\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0012\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0002J-\u0010\u0016\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0002J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u000bH\u0002J\u001b\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010 \u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0082@ø\u0001\u0000¢\u0006\u0004\b \u0010!J'\u0010\"\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\"\u0010'\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u001a2\b\u0010%\u001a\u0004\u0018\u00010\u000b2\u0006\u0010&\u001a\u00020\u001aH\u0002J\u0010\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020\u001eH\u0002J\u0010\u0010+\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010.\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010,\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u00100\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u000bH\u0002J\u0010\u00101\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\u0006\u00102\u001a\u00020\u000bJ\u001a\u00105\u001a\u00020\u000b2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000703J\u0016\u00106\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000bJ \u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00107\u001a\u00020\u000b2\b\u00108\u001a\u0004\u0018\u00010\u000bJ$\u00109\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J/\u0010;\u001a\u00020\u0007\"\b\b\u0000\u0010\u0013*\u00020:2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0004\b;\u0010<J)\u0010=\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0000¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u000bH\u0000¢\u0006\u0004\b?\u0010@R\u001b\u0010F\u001a\u00020A8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010L\u001a\u00020G8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010S\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR$\u0010X\u001a\u00020\t2\u0006\u0010T\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bU\u0010R\u001a\u0004\bV\u0010WR.\u0010\\\u001a\u001c\u0012\u0004\u0012\u00020\u000b\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0007030Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R,\u0010^\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0007030Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010[R\u0016\u0010b\u001a\u00020_8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b`\u0010aR$\u0010i\u001a\u0004\u0018\u00010\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u001b\u0010o\u001a\u00020j8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u0014\u0010s\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010u\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010+\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006x"}, d2 = {"Lmj6;", "Ldk6;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lqk6;", "pushServices", "", "X", "Lqx1;", "z", "", "savedProvider", "Lrt8;", "U", "serviceHandlers", "O", "token", "C", "T", "operationSystemName", "operationBody", "w", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V", "operationBodyJson", "x", "", "f0", "I", "(Landroid/content/Context;Lcv1;)Ljava/lang/Object;", "Lcloud/mindbox/mobile_sdk/MindboxConfiguration;", "configuration", "F", "(Landroid/content/Context;Lcloud/mindbox/mobile_sdk/MindboxConfiguration;Lcv1;)Ljava/lang/Object;", "b0", "(Landroid/content/Context;Ljava/lang/String;Lcv1;)Ljava/lang/Object;", "isTokenAvailable", "pushToken", "isNotificationEnabled", "R", "newConfiguration", "Lzp1;", "y", "Z", KustoStorage.KustoTable.COLUMN_SOURCE, "requestUrl", "V", "deviceUuid", "A", "e0", "M", "Lkotlin/Function1;", "subscription", "a0", "d0", "uniqKey", "buttonUniqKey", "N", "Lwa7;", "E", "(Landroid/content/Context;Ljava/lang/String;Lwa7;)V", "P", "(Landroid/content/Context;Ljava/util/List;)V", "G", "()Ljava/lang/String;", "La8c;", com.huawei.hms.opendevice.c.a, "Lrn5;", "getMindboxWorkerFactory", "()La8c;", "mindboxWorkerFactory", "Llx1;", DateTokenConverter.CONVERTER_KEY, "Llx1;", "H", "()Llx1;", "coroutineExceptionHandler", "Lem3;", com.huawei.hms.push.e.a, "Lem3;", "infoUpdatedThreadDispatcher", "f", "Lqx1;", "initScope", "<set-?>", "g", "K", "()Lqx1;", "mindboxScope", "Ljava/util/concurrent/ConcurrentHashMap;", Image.TYPE_HIGH, "Ljava/util/concurrent/ConcurrentHashMap;", "tokenCallbacks", "i", "deviceUuidCallbacks", "Lcloud/mindbox/mobile_sdk/managers/LifecycleManager;", "j", "Lcloud/mindbox/mobile_sdk/managers/LifecycleManager;", "lifecycleManager", "k", "Lrt8;", "L", "()Lrt8;", "Y", "(Lrt8;)V", "pushServiceHandler", "Ley4;", "l", "Lbk6;", "J", "()Ley4;", "inAppMessageManager", "Ljr6;", Image.TYPE_MEDIUM, "Ljr6;", "mutex", "n", "firstInitCall", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: mj6  reason: default package */
/* loaded from: classes.dex */
public final class mj6 implements dk6 {
    public static final mj6 a;
    static final /* synthetic */ je5<Object>[] b = {bc9.f(new ar8(mj6.class, "inAppMessageManager", "getInAppMessageManager()Lcloud/mindbox/mobile_sdk/inapp/presentation/InAppMessageManager;", 0))};
    private static final rn5 c;
    private static final lx1 d;
    private static final em3 e;
    private static final qx1 f;
    private static qx1 g;
    private static final ConcurrentHashMap<String, Function1<String, Unit>> h;
    private static final ConcurrentHashMap<String, Function1<String, Unit>> i;
    private static LifecycleManager j;
    private static rt8 k;
    private static final bk6 l;
    private static final jr6 m;
    private static boolean n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Mindbox.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: mj6$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;
        final /* synthetic */ T c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, String str, T t) {
            super(0);
            this.a = context;
            this.b = str;
            this.c = t;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            mj6.a.x(this.a, this.b, tj6.a.m(this.c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Mindbox.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "cloud.mindbox.mobile_sdk.Mindbox$asyncOperation$2", f = "Mindbox.kt", l = {}, m = "invokeSuspend")
    /* renamed from: mj6$b */
    /* loaded from: classes.dex */
    public static final class b extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ Context b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, String str, String str2, cv1<? super b> cv1Var) {
            super(2, cv1Var);
            this.b = context;
            this.c = str;
            this.d = str2;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(this.b, this.c, this.d, cv1Var);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((b) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                v25.a.a(v25.a.APP_STARTED);
                tj6.a.i(this.b, this.c, this.d);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return invoke2(qx1Var, cv1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Mindbox.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzp1;", "a", "()Lzp1;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: mj6$c */
    /* loaded from: classes.dex */
    public static final class c extends ej5 implements Function0<zp1> {
        final /* synthetic */ mj6 a;
        final /* synthetic */ MindboxConfiguration b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(mj6 mj6Var, MindboxConfiguration mindboxConfiguration) {
            super(0);
            this.a = mj6Var;
            this.b = mindboxConfiguration;
        }

        public final zp1 a() {
            zp1 zp1Var;
            fk6 fk6Var = fk6.a;
            mj6 mj6Var = this.a;
            StringBuilder sb = new StringBuilder();
            sb.append("checkConfig. isFirstInitialize: ");
            nk6 nk6Var = nk6.a;
            sb.append(nk6Var.n());
            fk6Var.d(mj6Var, sb.toString());
            if (nk6Var.n()) {
                return zp1.UPDATED;
            }
            Configuration h = in2.a.h();
            if (h != null) {
                MindboxConfiguration mindboxConfiguration = this.b;
                mj6 mj6Var2 = this.a;
                boolean z = true;
                boolean z2 = !z65.c(mindboxConfiguration.getDomain$sdk_release(), h.getDomain());
                boolean z3 = !z65.c(mindboxConfiguration.getEndpointId$sdk_release(), h.getEndpointId());
                if (mindboxConfiguration.getShouldCreateCustomer$sdk_release() == h.getShouldCreateCustomer()) {
                    z = false;
                }
                fk6Var.d(mj6Var2, "checkConfig. isUrlChanged: " + z2 + ", isEndpointChanged: " + z3 + ", isShouldCreateCustomerChanged: " + z);
                if (!z2 && !z3) {
                    if (!z) {
                        zp1Var = zp1.NOT_UPDATED;
                    } else if (h.getShouldCreateCustomer() && !mindboxConfiguration.getShouldCreateCustomer$sdk_release()) {
                        zp1Var = zp1.UPDATED_SCC;
                    } else {
                        zp1Var = zp1.UPDATED;
                    }
                } else {
                    zp1Var = zp1.UPDATED;
                }
                if (zp1Var != null) {
                    return zp1Var;
                }
            }
            return zp1.UPDATED;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ zp1 invoke() {
            return a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Mindbox.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "cloud.mindbox.mobile_sdk.Mindbox$firstInitialization$2", f = "Mindbox.kt", l = {971, 976}, m = "invokeSuspend")
    /* renamed from: mj6$d */
    /* loaded from: classes.dex */
    public static final class d extends f3b implements Function1<cv1<? super Unit>, Object> {
        Object a;
        boolean b;
        int c;
        final /* synthetic */ mj6 d;
        final /* synthetic */ Context e;
        final /* synthetic */ MindboxConfiguration f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Mindbox.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @nn2(c = "cloud.mindbox.mobile_sdk.Mindbox$firstInitialization$2$pushToken$1", f = "Mindbox.kt", l = {972}, m = "invokeSuspend")
        /* renamed from: mj6$d$a */
        /* loaded from: classes.dex */
        public static final class a extends f3b implements Function2<qx1, cv1<? super String>, Object> {
            int a;
            final /* synthetic */ Context b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, cv1<? super a> cv1Var) {
                super(2, cv1Var);
                this.b = context;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                return new a(this.b, cv1Var);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(qx1 qx1Var, cv1<? super String> cv1Var) {
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
                    rt8 L = mj6.a.L();
                    if (L != null) {
                        Context context = this.b;
                        String k = nk6.a.k();
                        this.a = 1;
                        obj = L.l(context, k, this);
                        if (obj == d) {
                            return d;
                        }
                    } else {
                        return null;
                    }
                }
                return (String) obj;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, cv1<? super String> cv1Var) {
                return invoke2(qx1Var, cv1Var);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(mj6 mj6Var, Context context, MindboxConfiguration mindboxConfiguration, cv1<? super d> cv1Var) {
            super(1, cv1Var);
            this.d = mj6Var;
            this.e = context;
            this.f = mindboxConfiguration;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new d(this.d, this.e, this.f, cv1Var);
        }

        public final Object i(cv1<? super Unit> cv1Var) {
            return ((d) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(cv1<? super Unit> cv1Var) {
            return i(cv1Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 253
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mj6.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Mindbox.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "cloud.mindbox.mobile_sdk.Mindbox", f = "Mindbox.kt", l = {1170, 957}, m = "getDeviceId")
    /* renamed from: mj6$e */
    /* loaded from: classes.dex */
    public static final class e extends ev1 {
        Object a;
        Object b;
        /* synthetic */ Object c;
        final /* synthetic */ mj6 d;
        int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(mj6 mj6Var, cv1<? super e> cv1Var) {
            super(cv1Var);
            this.d = mj6Var;
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return this.d.I(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Mindbox.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "cloud.mindbox.mobile_sdk.Mindbox$getDeviceId$2$adid$1", f = "Mindbox.kt", l = {}, m = "invokeSuspend")
    /* renamed from: mj6$f */
    /* loaded from: classes.dex */
    public static final class f extends f3b implements Function2<qx1, cv1<? super String>, Object> {
        int a;
        final /* synthetic */ Context b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Context context, cv1<? super f> cv1Var) {
            super(2, cv1Var);
            this.b = context;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new f(this.b, cv1Var);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(qx1 qx1Var, cv1<? super String> cv1Var) {
            return ((f) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            String e;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                mj6 mj6Var = mj6.a;
                rt8 L = mj6Var.L();
                if (L == null || (e = L.e(this.b)) == null) {
                    return mj6Var.G();
                }
                return e;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, cv1<? super String> cv1Var) {
            return invoke2(qx1Var, cv1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Mindbox.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: mj6$g */
    /* loaded from: classes.dex */
    public static final class g extends ej5 implements Function0<String> {
        final /* synthetic */ mj6 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(mj6 mj6Var) {
            super(0);
            this.a = mj6Var;
        }

        public final String a() {
            fk6.a.d(this.a, "getSdkVersion");
            return "2.7.0";
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ String invoke() {
            return a();
        }
    }

    /* compiled from: Mindbox.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lgo;", "Ley4;", "a", "(Lgo;)Ley4;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: mj6$h */
    /* loaded from: classes.dex */
    static final class h extends ej5 implements Function1<go, ey4> {
        public static final h a = new h();

        static {
        }

        h() {
            super(1);
        }

        public final ey4 a(go goVar) {
            z65.h(goVar, "$this$mindboxInject");
            return goVar.a();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ ey4 invoke(go goVar) {
            return a(goVar);
        }
    }

    /* compiled from: Mindbox.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: mj6$i */
    /* loaded from: classes.dex */
    static final class i extends ej5 implements Function0<Unit> {
        final /* synthetic */ Context a;
        final /* synthetic */ List<qk6> b;
        final /* synthetic */ MindboxConfiguration c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Mindbox.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqk6;", "it", "", "a", "(Lqk6;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: mj6$i$a */
        /* loaded from: classes.dex */
        public static final class a extends ej5 implements Function1<qk6, CharSequence> {
            public static final a a = new a();

            static {
            }

            a() {
                super(1);
            }

            public final CharSequence a(qk6 qk6Var) {
                z65.h(qk6Var, "it");
                String simpleName = qk6Var.getClass().getSimpleName();
                z65.g(simpleName, "it.javaClass.simpleName");
                return simpleName;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ CharSequence invoke(qk6 qk6Var) {
                return a(qk6Var);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Mindbox.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @nn2(c = "cloud.mindbox.mobile_sdk.Mindbox$init$1$2", f = "Mindbox.kt", l = {415, 424}, m = "invokeSuspend")
        /* renamed from: mj6$i$b */
        /* loaded from: classes.dex */
        public static final class b extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
            int a;
            private /* synthetic */ Object b;
            final /* synthetic */ MindboxConfiguration c;
            final /* synthetic */ Context d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(MindboxConfiguration mindboxConfiguration, Context context, cv1<? super b> cv1Var) {
                super(2, cv1Var);
                this.c = mindboxConfiguration;
                this.d = context;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                b bVar = new b(this.c, this.d, cv1Var);
                bVar.b = obj;
                return bVar;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                return ((b) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
            @Override // defpackage.e70
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    Method dump skipped, instructions count: 245
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mj6.i.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                return invoke2(qx1Var, cv1Var);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Mindbox.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: mj6$i$c */
        /* loaded from: classes.dex */
        public static final class c extends ej5 implements Function1<Throwable, Unit> {
            final /* synthetic */ Context a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Mindbox.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @nn2(c = "cloud.mindbox.mobile_sdk.Mindbox$init$1$3$1", f = "Mindbox.kt", l = {438, 439}, m = "invokeSuspend")
            /* renamed from: mj6$i$c$a */
            /* loaded from: classes.dex */
            public static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
                int a;

                a(cv1<? super a> cv1Var) {
                    super(2, cv1Var);
                }

                @Override // defpackage.e70
                public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                    return new a(cv1Var);
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final Object invoke2(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                    return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    Object d;
                    d = c75.d();
                    int i = this.a;
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 2) {
                                vk9.b(obj);
                                mj6.n = false;
                                return Unit.a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        vk9.b(obj);
                    } else {
                        vk9.b(obj);
                        mj6 mj6Var = mj6.a;
                        mj6Var.J().f();
                        mj6Var.J().e();
                        tj6 tj6Var = tj6.a;
                        cr6<tx4> j = tj6Var.j();
                        tx4.a f = tj6Var.f();
                        this.a = 1;
                        if (j.emit(f, this) == d) {
                            return d;
                        }
                    }
                    l95 g = mj6.a.J().g();
                    this.a = 2;
                    if (g.n(this) == d) {
                        return d;
                    }
                    mj6.n = false;
                    return Unit.a;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                    return invoke2(qx1Var, cv1Var);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Context context) {
                super(1);
                this.a = context;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                if (th == null && mj6.n) {
                    Context context = this.a;
                    Activity activity = context instanceof Activity ? (Activity) context : null;
                    if (activity != null) {
                        LifecycleManager lifecycleManager = mj6.j;
                        if (lifecycleManager == null) {
                            z65.z("lifecycleManager");
                            lifecycleManager = null;
                        }
                        if (lifecycleManager.x()) {
                            mj6 mj6Var = mj6.a;
                            mj6Var.J().d(activity);
                            qh0.d(mj6Var.K(), null, null, new a(null), 3, null);
                        }
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Mindbox.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/app/Activity;", "resumedActivity", "", "a", "(Landroid/app/Activity;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: mj6$i$d */
        /* loaded from: classes.dex */
        public static final class d extends ej5 implements Function1<Activity, Unit> {
            public static final d a = new d();

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Mindbox.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @nn2(c = "cloud.mindbox.mobile_sdk.Mindbox$init$1$4$2$1", f = "Mindbox.kt", l = {491, 492}, m = "invokeSuspend")
            /* renamed from: mj6$i$d$a */
            /* loaded from: classes.dex */
            public static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
                int a;

                a(cv1<? super a> cv1Var) {
                    super(2, cv1Var);
                }

                @Override // defpackage.e70
                public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                    return new a(cv1Var);
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final Object invoke2(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                    return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    Object d;
                    d = c75.d();
                    int i = this.a;
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 2) {
                                vk9.b(obj);
                                mj6.n = false;
                                return Unit.a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        vk9.b(obj);
                    } else {
                        vk9.b(obj);
                        v25.a.a(v25.a.SAVE_MINDBOX_CONFIG);
                        if (!mj6.n) {
                            return Unit.a;
                        }
                        mj6 mj6Var = mj6.a;
                        mj6Var.J().f();
                        mj6Var.J().e();
                        tj6 tj6Var = tj6.a;
                        cr6<tx4> j = tj6Var.j();
                        tx4.a f = tj6Var.f();
                        this.a = 1;
                        if (j.emit(f, this) == d) {
                            return d;
                        }
                    }
                    l95 g = mj6.a.J().g();
                    this.a = 2;
                    if (g.n(this) == d) {
                        return d;
                    }
                    mj6.n = false;
                    return Unit.a;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                    return invoke2(qx1Var, cv1Var);
                }
            }

            static {
            }

            d() {
                super(1);
            }

            public final void a(Activity activity) {
                z65.h(activity, "resumedActivity");
                mj6 mj6Var = mj6.a;
                mj6Var.J().a(activity, true);
                if (mj6.n) {
                    qh0.d(mj6Var.K(), null, null, new a(null), 3, null);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Activity activity) {
                a(activity);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Mindbox.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/app/Activity;", "pausedActivity", "", "a", "(Landroid/app/Activity;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: mj6$i$e */
        /* loaded from: classes.dex */
        public static final class e extends ej5 implements Function1<Activity, Unit> {
            public static final e a = new e();

            static {
            }

            e() {
                super(1);
            }

            public final void a(Activity activity) {
                z65.h(activity, "pausedActivity");
                mj6.a.J().c(activity);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Activity activity) {
                a(activity);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Mindbox.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/app/Activity;", "startedActivity", "", "a", "(Landroid/app/Activity;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: mj6$i$f */
        /* loaded from: classes.dex */
        public static final class f extends ej5 implements Function1<Activity, Unit> {
            public static final f a = new f();

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Mindbox.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @nn2(c = "cloud.mindbox.mobile_sdk.Mindbox$init$1$4$4$1", f = "Mindbox.kt", l = {472}, m = "invokeSuspend")
            /* renamed from: mj6$i$f$a */
            /* loaded from: classes.dex */
            public static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
                int a;
                final /* synthetic */ Activity b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(Activity activity, cv1<? super a> cv1Var) {
                    super(2, cv1Var);
                    this.b = activity;
                }

                @Override // defpackage.e70
                public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                    return new a(this.b, cv1Var);
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final Object invoke2(qx1 qx1Var, cv1<? super Unit> cv1Var) {
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
                        if (!nk6.a.n()) {
                            mj6 mj6Var = mj6.a;
                            Context applicationContext = this.b.getApplicationContext();
                            z65.g(applicationContext, "startedActivity.applicationContext");
                            this.a = 1;
                            if (mj6.c0(mj6Var, applicationContext, null, this, 2, null) == d) {
                                return d;
                            }
                        }
                    }
                    return Unit.a;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                    return invoke2(qx1Var, cv1Var);
                }
            }

            static {
            }

            f() {
                super(1);
            }

            public final void a(Activity activity) {
                z65.h(activity, "startedActivity");
                pvb.a.b(activity);
                qh0.d(mj6.a.K(), null, null, new a(activity, null), 3, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Activity activity) {
                a(activity);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Mindbox.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/app/Activity;", "resumedActivity", "", "a", "(Landroid/app/Activity;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: mj6$i$g */
        /* loaded from: classes.dex */
        public static final class g extends ej5 implements Function1<Activity, Unit> {
            public static final g a = new g();

            static {
            }

            g() {
                super(1);
            }

            public final void a(Activity activity) {
                z65.h(activity, "resumedActivity");
                mj6.a.J().b(activity);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Activity activity) {
                a(activity);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Mindbox.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", KustoStorage.KustoTable.COLUMN_SOURCE, "", "requestUrl", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: mj6$i$h */
        /* loaded from: classes.dex */
        public static final class h extends ej5 implements Function2<String, String, Unit> {
            public static final h a = new h();

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Mindbox.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @nn2(c = "cloud.mindbox.mobile_sdk.Mindbox$init$1$4$6$1", f = "Mindbox.kt", l = {}, m = "invokeSuspend")
            /* renamed from: mj6$i$h$a */
            /* loaded from: classes.dex */
            public static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
                int a;
                final /* synthetic */ String b;
                final /* synthetic */ String c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(String str, String str2, cv1<? super a> cv1Var) {
                    super(2, cv1Var);
                    this.b = str;
                    this.c = str2;
                }

                @Override // defpackage.e70
                public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                    return new a(this.b, this.c, cv1Var);
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final Object invoke2(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                    return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    c75.d();
                    if (this.a == 0) {
                        vk9.b(obj);
                        mj6.a.V(sj6.a.a().h(), this.b, this.c);
                        return Unit.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                    return invoke2(qx1Var, cv1Var);
                }
            }

            static {
            }

            h() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
                invoke2(str, str2);
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(String str, String str2) {
                qh0.e(v33.b(), new a(str, str2, null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(Context context, List<? extends qk6> list, MindboxConfiguration mindboxConfiguration) {
            super(0);
            this.a = context;
            this.b = list;
            this.c = mindboxConfiguration;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            String i0;
            String g2 = vn3.g(this.a);
            LifecycleManager lifecycleManager = null;
            if (!vn3.h(this.a, g2)) {
                dk6.a.e(mj6.a, "Skip Mindbox init not in main process! Current process " + g2, null, 2, null);
                return;
            }
            mj6 mj6Var = mj6.a;
            Context applicationContext = this.a.getApplicationContext();
            z65.g(applicationContext, "context.applicationContext");
            mj6Var.P(applicationContext, this.b);
            StringBuilder sb = new StringBuilder();
            sb.append("init in ");
            sb.append(g2);
            sb.append(". firstInitCall: ");
            sb.append(mj6.n);
            sb.append(", configuration: ");
            sb.append(this.c);
            sb.append(", pushServices: ");
            i0 = sc1.i0(this.b, ", ", null, null, 0, null, a.a, 30, null);
            sb.append(i0);
            sb.append(", SdkVersion:");
            sb.append(mj6Var.M());
            mj6Var.S(sb.toString());
            if (!mj6.n) {
                v25.a.c(v25.a.SAVE_MINDBOX_CONFIG);
            }
            w25.a(qh0.d(mj6.f, null, null, new b(this.c, this.a, null), 3, null), v25.a.SAVE_MINDBOX_CONFIG).r(new c(this.a));
            Context applicationContext2 = this.a.getApplicationContext();
            Application application = applicationContext2 instanceof Application ? (Application) applicationContext2 : null;
            if (application != null) {
                Context context = this.a;
                androidx.lifecycle.d lifecycle = androidx.lifecycle.l.l().getLifecycle();
                z65.g(lifecycle, "get().lifecycle");
                if (mj6.j != null) {
                    LifecycleManager lifecycleManager2 = mj6.j;
                    if (lifecycleManager2 == null) {
                        z65.z("lifecycleManager");
                        lifecycleManager2 = null;
                    }
                    application.unregisterActivityLifecycleCallbacks(lifecycleManager2);
                    LifecycleManager lifecycleManager3 = mj6.j;
                    if (lifecycleManager3 == null) {
                        z65.z("lifecycleManager");
                        lifecycleManager3 = null;
                    }
                    lifecycle.d(lifecycleManager3);
                    LifecycleManager lifecycleManager4 = mj6.j;
                    if (lifecycleManager4 == null) {
                        z65.z("lifecycleManager");
                        lifecycleManager4 = null;
                    }
                    lifecycleManager4.F();
                } else {
                    Activity activity = context instanceof Activity ? (Activity) context : null;
                    boolean z = lifecycle.b() == d.b.RESUMED;
                    if (z && activity == null) {
                        dk6.a.b(mj6Var, "Incorrect context type for calling init in this place", null, 2, null);
                    }
                    if (z || !(context instanceof Application)) {
                        dk6.a.e(mj6Var, "We recommend to call Mindbox.init() synchronously from Application.onCreate. If you can't do so, don't forget to call Mindbox.initPushServices from Application.onCreate", null, 2, null);
                    }
                    mj6Var.S("init. init lifecycleManager");
                    mj6.j = new LifecycleManager(activity != null ? activity.getClass().getName() : null, activity != null ? activity.getIntent() : null, !z, d.a, e.a, f.a, g.a, h.a);
                }
                LifecycleManager lifecycleManager5 = mj6.j;
                if (lifecycleManager5 == null) {
                    z65.z("lifecycleManager");
                    lifecycleManager5 = null;
                }
                application.registerActivityLifecycleCallbacks(lifecycleManager5);
                LifecycleManager lifecycleManager6 = mj6.j;
                if (lifecycleManager6 == null) {
                    z65.z("lifecycleManager");
                } else {
                    lifecycleManager = lifecycleManager6;
                }
                lifecycle.a(lifecycleManager);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Mindbox.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqk6;", "it", "", "a", "(Lqk6;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: mj6$j */
    /* loaded from: classes.dex */
    public static final class j extends ej5 implements Function1<qk6, CharSequence> {
        public static final j a = new j();

        static {
        }

        j() {
            super(1);
        }

        public final CharSequence a(qk6 qk6Var) {
            z65.h(qk6Var, "it");
            String simpleName = qk6Var.getClass().getSimpleName();
            z65.g(simpleName, "it.javaClass.simpleName");
            return simpleName;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ CharSequence invoke(qk6 qk6Var) {
            return a(qk6Var);
        }
    }

    /* compiled from: Mindbox.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lhl6;", "a", "()Lhl6;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: mj6$k */
    /* loaded from: classes.dex */
    static final class k extends ej5 implements Function0<hl6> {
        public static final k a = new k();

        static {
        }

        k() {
            super(0);
        }

        public final hl6 a() {
            return hl6.b;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ hl6 invoke() {
            return a();
        }
    }

    /* compiled from: Mindbox.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: mj6$l */
    /* loaded from: classes.dex */
    static final class l extends ej5 implements Function0<Unit> {
        final /* synthetic */ Context a;
        final /* synthetic */ mj6 b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Mindbox.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @nn2(c = "cloud.mindbox.mobile_sdk.Mindbox$onPushClicked$1$1", f = "Mindbox.kt", l = {336}, m = "invokeSuspend")
        /* renamed from: mj6$l$a */
        /* loaded from: classes.dex */
        public static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
            int a;
            final /* synthetic */ Context b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, cv1<? super a> cv1Var) {
                super(2, cv1Var);
                this.b = context;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                return new a(this.b, cv1Var);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(qx1 qx1Var, cv1<? super Unit> cv1Var) {
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
                    mj6 mj6Var = mj6.a;
                    Context context = this.b;
                    this.a = 1;
                    if (mj6.c0(mj6Var, context, null, this, 2, null) == d) {
                        return d;
                    }
                }
                return Unit.a;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                return invoke2(qx1Var, cv1Var);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(Context context, mj6 mj6Var, String str, String str2) {
            super(0);
            this.a = context;
            this.b = mj6Var;
            this.c = str;
            this.d = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            mj6 mj6Var = mj6.a;
            mj6.Q(mj6Var, this.a, null, 2, null);
            fk6 fk6Var = fk6.a;
            mj6 mj6Var2 = this.b;
            fk6Var.d(mj6Var2, "onPushClicked. uniqKey: " + this.c + ", buttonUniqKey: " + this.d);
            tj6.a.n(this.a, new akb(this.c, this.d));
            if (nk6.a.n()) {
                return;
            }
            qh0.d(mj6Var.K(), null, null, new a(this.a, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Mindbox.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Lkotlin/Unit;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: mj6$m */
    /* loaded from: classes.dex */
    public static final class m extends ej5 implements Function0<Unit> {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Context context, String str, String str2) {
            super(0);
            this.a = context;
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            return invoke2();
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Unit invoke2() {
            String endpointId;
            Configuration h = in2.a.h();
            if (h == null || (endpointId = h.getEndpointId()) == null) {
                return null;
            }
            Context context = this.a;
            String str = this.b;
            String str2 = this.c;
            Context applicationContext = context.getApplicationContext();
            String id = TimeZone.getDefault().getID();
            z65.g(id, "getDefault().id");
            bkb bkbVar = new bkb(id, endpointId, str, str2, 7);
            tj6 tj6Var = tj6.a;
            z65.g(applicationContext, "applicationContext");
            tj6Var.g(applicationContext, bkbVar);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Mindbox.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: mj6$n */
    /* loaded from: classes.dex */
    public static final class n extends ej5 implements Function0<Unit> {
        final /* synthetic */ List<qk6> a;
        final /* synthetic */ Context b;
        final /* synthetic */ mj6 c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Mindbox.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @nn2(c = "cloud.mindbox.mobile_sdk.Mindbox$setPushServiceHandler$1$1$2$1", f = "Mindbox.kt", l = {571}, m = "invokeSuspend")
        /* renamed from: mj6$n$a */
        /* loaded from: classes.dex */
        public static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
            int a;
            final /* synthetic */ Context b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, cv1<? super a> cv1Var) {
                super(2, cv1Var);
                this.b = context;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                return new a(this.b, cv1Var);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(qx1 qx1Var, cv1<? super Unit> cv1Var) {
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
                    mj6 mj6Var = mj6.a;
                    Context context = this.b;
                    this.a = 1;
                    if (mj6.c0(mj6Var, context, null, this, 2, null) == d) {
                        return d;
                    }
                }
                return Unit.a;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                return invoke2(qx1Var, cv1Var);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Mindbox.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @nn2(c = "cloud.mindbox.mobile_sdk.Mindbox$setPushServiceHandler$1$1$3", f = "Mindbox.kt", l = {}, m = "invokeSuspend")
        /* renamed from: mj6$n$b */
        /* loaded from: classes.dex */
        public static final class b extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
            int a;
            final /* synthetic */ rt8 b;
            final /* synthetic */ Context c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(rt8 rt8Var, Context context, cv1<? super b> cv1Var) {
                super(2, cv1Var);
                this.b = rt8Var;
                this.c = context;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                return new b(this.b, this.c, cv1Var);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                return ((b) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                c75.d();
                if (this.a == 0) {
                    vk9.b(obj);
                    this.b.h(this.c);
                    return Unit.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                return invoke2(qx1Var, cv1Var);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        n(List<? extends qk6> list, Context context, mj6 mj6Var) {
            super(0);
            this.a = list;
            this.b = context;
            this.c = mj6Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            String j;
            mj6 mj6Var = mj6.a;
            if (mj6Var.L() != null || this.a == null) {
                return;
            }
            nk6 nk6Var = nk6.a;
            rt8 U = mj6Var.U(this.b, this.a, nk6Var.j());
            if (U != null) {
                mj6 mj6Var2 = this.c;
                Context context = this.b;
                mj6Var2.Y(U);
                String f = U.f();
                if (!(!z65.c(f, j))) {
                    f = null;
                }
                if (f != null) {
                    nk6Var.y(f);
                    if (!nk6Var.n()) {
                        qh0.d(mj6Var.K(), null, null, new a(context, null), 3, null);
                    }
                }
                qh0.d(mj6Var.K(), null, null, new b(U, context, null), 3, null);
            }
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"mj6$o", "Lkotlin/coroutines/a;", "Llx1;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "exception", "", "N", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    /* renamed from: mj6$o */
    /* loaded from: classes.dex */
    public static final class o extends kotlin.coroutines.a implements lx1 {
        public o(lx1.a aVar) {
            super(aVar);
        }

        @Override // defpackage.lx1
        public void N(CoroutineContext coroutineContext, Throwable th) {
            fk6.a.f(mj6.a, "Mindbox caught unhandled error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Mindbox.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "cloud.mindbox.mobile_sdk.Mindbox$updateAppInfo$2", f = "Mindbox.kt", l = {1012}, m = "invokeSuspend")
    /* renamed from: mj6$p */
    /* loaded from: classes.dex */
    public static final class p extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ String c;
        final /* synthetic */ Context d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Mindbox.kt */
        @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @nn2(c = "cloud.mindbox.mobile_sdk.Mindbox$updateAppInfo$2$1", f = "Mindbox.kt", l = {1013}, m = "invokeSuspend")
        /* renamed from: mj6$p$a */
        /* loaded from: classes.dex */
        public static final class a extends f3b implements Function1<cv1<? super Unit>, Object> {
            int a;
            final /* synthetic */ String b;
            final /* synthetic */ Context c;
            final /* synthetic */ qx1 d;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Mindbox.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @nn2(c = "cloud.mindbox.mobile_sdk.Mindbox$updateAppInfo$2$1$pushToken$1", f = "Mindbox.kt", l = {1014}, m = "invokeSuspend")
            /* renamed from: mj6$p$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0440a extends f3b implements Function2<qx1, cv1<? super String>, Object> {
                int a;
                final /* synthetic */ Context b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0440a(Context context, cv1<? super C0440a> cv1Var) {
                    super(2, cv1Var);
                    this.b = context;
                }

                @Override // defpackage.e70
                public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                    return new C0440a(this.b, cv1Var);
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final Object invoke2(qx1 qx1Var, cv1<? super String> cv1Var) {
                    return ((C0440a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                        rt8 L = mj6.a.L();
                        if (L != null) {
                            Context context = this.b;
                            String k = nk6.a.k();
                            this.a = 1;
                            obj = L.l(context, k, this);
                            if (obj == d) {
                                return d;
                            }
                        } else {
                            return null;
                        }
                    }
                    return (String) obj;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, cv1<? super String> cv1Var) {
                    return invoke2(qx1Var, cv1Var);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, Context context, qx1 qx1Var, cv1<? super a> cv1Var) {
                super(1, cv1Var);
                this.b = str;
                this.c = context;
                this.d = qx1Var;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(cv1<?> cv1Var) {
                return new a(this.b, this.c, this.d, cv1Var);
            }

            public final Object i(cv1<? super Unit> cv1Var) {
                return ((a) create(cv1Var)).invokeSuspend(Unit.a);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(cv1<? super Unit> cv1Var) {
                return i(cv1Var);
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
            @Override // defpackage.e70
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.Object r0 = defpackage.a75.d()
                    int r1 = r11.a
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    defpackage.vk9.b(r12)
                    goto L39
                Lf:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L17:
                    defpackage.vk9.b(r12)
                    java.lang.String r12 = r11.b
                    if (r12 != 0) goto L3b
                    mj6 r12 = defpackage.mj6.a
                    qx1 r12 = r12.K()
                    kotlin.coroutines.CoroutineContext r12 = r12.getCoroutineContext()
                    mj6$p$a$a r1 = new mj6$p$a$a
                    android.content.Context r3 = r11.c
                    r4 = 0
                    r1.<init>(r3, r4)
                    r11.a = r2
                    java.lang.Object r12 = defpackage.qh0.g(r12, r1, r11)
                    if (r12 != r0) goto L39
                    return r0
                L39:
                    java.lang.String r12 = (java.lang.String) r12
                L3b:
                    if (r12 == 0) goto L46
                    int r0 = r12.length()
                    if (r0 != 0) goto L44
                    goto L46
                L44:
                    r0 = 0
                    goto L47
                L46:
                    r0 = 1
                L47:
                    r5 = r0 ^ 1
                    kt8 r0 = defpackage.kt8.a
                    android.content.Context r1 = r11.c
                    boolean r0 = r0.q(r1)
                    fk6 r1 = defpackage.fk6.a
                    qx1 r2 = r11.d
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r4 = "updateAppInfo. isTokenAvailable: "
                    r3.append(r4)
                    r3.append(r5)
                    java.lang.String r4 = ", pushToken: "
                    r3.append(r4)
                    r3.append(r12)
                    java.lang.String r4 = ", isNotificationEnabled: "
                    r3.append(r4)
                    r3.append(r0)
                    java.lang.String r4 = ", old isNotificationEnabled: "
                    r3.append(r4)
                    nk6 r10 = defpackage.nk6.a
                    boolean r4 = r10.o()
                    r3.append(r4)
                    java.lang.String r3 = r3.toString()
                    r1.d(r2, r3)
                    mj6 r1 = defpackage.mj6.a
                    boolean r2 = defpackage.mj6.o(r1, r5, r12, r0)
                    if (r2 == 0) goto Lc8
                    rrb r2 = new rrb
                    java.lang.String r3 = ""
                    if (r12 != 0) goto L9d
                    java.lang.String r4 = r10.k()
                    if (r4 != 0) goto L9e
                    r4 = r3
                    goto L9e
                L9d:
                    r4 = r12
                L9e:
                    java.lang.String r7 = r10.h()
                    int r8 = r10.g()
                    rt8 r1 = r1.L()
                    if (r1 == 0) goto Lb5
                    java.lang.String r1 = r1.f()
                    if (r1 != 0) goto Lb3
                    goto Lb5
                Lb3:
                    r9 = r1
                    goto Lb6
                Lb5:
                    r9 = r3
                Lb6:
                    r3 = r2
                    r6 = r0
                    r3.<init>(r4, r5, r6, r7, r8, r9)
                    tj6 r1 = defpackage.tj6.a
                    android.content.Context r3 = r11.c
                    r1.d(r3, r2)
                    r10.x(r0)
                    r10.z(r12)
                Lc8:
                    kotlin.Unit r12 = kotlin.Unit.a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mj6.p.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, Context context, cv1<? super p> cv1Var) {
            super(2, cv1Var);
            this.c = str;
            this.d = context;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            p pVar = new p(this.c, this.d, cv1Var);
            pVar.b = obj;
            return pVar;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((p) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                yx5 yx5Var = yx5.a;
                a aVar = new a(this.c, this.d, (qx1) this.b, null);
                this.a = 1;
                if (yx5Var.f(aVar, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return invoke2(qx1Var, cv1Var);
        }
    }

    /* compiled from: Mindbox.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: mj6$q */
    /* loaded from: classes.dex */
    static final class q extends ej5 implements Function0<Unit> {
        final /* synthetic */ Context a;
        final /* synthetic */ mj6 b;
        final /* synthetic */ String c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Mindbox.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @nn2(c = "cloud.mindbox.mobile_sdk.Mindbox$updatePushToken$1$1", f = "Mindbox.kt", l = {287}, m = "invokeSuspend")
        /* renamed from: mj6$q$a */
        /* loaded from: classes.dex */
        public static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
            int a;
            final /* synthetic */ Context b;
            final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, String str, cv1<? super a> cv1Var) {
                super(2, cv1Var);
                this.b = context;
                this.c = str;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                return new a(this.b, this.c, cv1Var);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(qx1 qx1Var, cv1<? super Unit> cv1Var) {
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
                    mj6 mj6Var = mj6.a;
                    Context context = this.b;
                    String str = this.c;
                    this.a = 1;
                    if (mj6Var.b0(context, str, this) == d) {
                        return d;
                    }
                }
                return Unit.a;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                return invoke2(qx1Var, cv1Var);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(Context context, mj6 mj6Var, String str) {
            super(0);
            this.a = context;
            this.b = mj6Var;
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            CharSequence R0;
            mj6 mj6Var = mj6.a;
            mj6.Q(mj6Var, this.a, null, 2, null);
            fk6 fk6Var = fk6.a;
            mj6 mj6Var2 = this.b;
            fk6Var.d(mj6Var2, "updatePushToken. token: " + this.c);
            R0 = m0b.R0(this.c);
            if (R0.toString().length() > 0) {
                if (!nk6.a.n()) {
                    qh0.d(mj6Var.K(), null, null, new a(this.a, this.c, null), 3, null);
                } else {
                    fk6Var.d(this.b, "updatePushToken. MindboxPreferences.isFirstInitialize == true. Skipping update.");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Mindbox.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: mj6$r */
    /* loaded from: classes.dex */
    public static final class r extends ej5 implements Function0<Boolean> {
        final /* synthetic */ String a;
        final /* synthetic */ mj6 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(String str, mj6 mj6Var) {
            super(0);
            this.a = str;
            this.b = mj6Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return invoke();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            if (new ec9("^[A-Za-z0-9-\\.]{1,249}$").f(this.a)) {
                return Boolean.TRUE;
            }
            fk6.a.a(this.b, "Operation name is incorrect. It should contain only latin letters, number, '-' or '.' and length from 1 to 250.");
            return Boolean.FALSE;
        }
    }

    static {
        rn5 b2;
        mj6 mj6Var = new mj6();
        a = mj6Var;
        b2 = yn5.b(k.a);
        c = b2;
        d = new o(lx1.J);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        z65.g(newSingleThreadExecutor, "newSingleThreadExecutor()");
        e = jm3.b(newSingleThreadExecutor);
        f = mj6Var.z();
        g = mj6Var.z();
        h = new ConcurrentHashMap<>();
        i = new ConcurrentHashMap<>();
        l = ck6.a(h.a);
        m = lr6.b(false, 1, null);
        n = true;
    }

    private mj6() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(final String str) {
        Executors.newSingleThreadScheduledExecutor().schedule(new Runnable() { // from class: kj6
            @Override // java.lang.Runnable
            public final void run() {
                mj6.B(str);
            }
        }, 1L, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(String str) {
        z65.h(str, "$deviceUuid");
        Set<String> keySet = i.keySet();
        z65.g(keySet, "deviceUuidCallbacks.keys");
        for (String str2 : keySet) {
            ConcurrentHashMap<String, Function1<String, Unit>> concurrentHashMap = i;
            Function1<String, Unit> function1 = concurrentHashMap.get(str2);
            if (function1 != null) {
                function1.invoke(str);
            }
            concurrentHashMap.remove(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(final String str) {
        Executors.newSingleThreadScheduledExecutor().schedule(new Runnable() { // from class: lj6
            @Override // java.lang.Runnable
            public final void run() {
                mj6.D(str);
            }
        }, 1L, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(String str) {
        Set<String> keySet = h.keySet();
        z65.g(keySet, "tokenCallbacks.keys");
        for (String str2 : keySet) {
            ConcurrentHashMap<String, Function1<String, Unit>> concurrentHashMap = h;
            Function1<String, Unit> function1 = concurrentHashMap.get(str2);
            if (function1 != null) {
                function1.invoke(str);
            }
            concurrentHashMap.remove(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object F(Context context, MindboxConfiguration mindboxConfiguration, cv1<? super Unit> cv1Var) {
        Object d2;
        Object f2 = yx5.a.f(new d(this, context, mindboxConfiguration, null), cv1Var);
        d2 = c75.d();
        if (f2 == d2) {
            return f2;
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002d, B:29:0x0083, B:24:0x005b, B:26:0x0067, B:30:0x008b), top: B:35:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002d, B:29:0x0083, B:24:0x005b, B:26:0x0067, B:30:0x008b), top: B:35:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(android.content.Context r13, defpackage.cv1<? super java.lang.String> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.mj6.e
            if (r0 == 0) goto L13
            r0 = r14
            mj6$e r0 = (defpackage.mj6.e) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            mj6$e r0 = new mj6$e
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.c
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r13 = r0.a
            jr6 r13 = (defpackage.jr6) r13
            defpackage.vk9.b(r14)     // Catch: java.lang.Throwable -> L31
            goto L83
        L31:
            r14 = move-exception
            goto L93
        L33:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3b:
            java.lang.Object r13 = r0.b
            jr6 r13 = (defpackage.jr6) r13
            java.lang.Object r2 = r0.a
            android.content.Context r2 = (android.content.Context) r2
            defpackage.vk9.b(r14)
            goto L5b
        L47:
            defpackage.vk9.b(r14)
            jr6 r14 = defpackage.mj6.m
            r0.a = r13
            r0.b = r14
            r0.e = r4
            java.lang.Object r2 = r14.c(r5, r0)
            if (r2 != r1) goto L59
            return r1
        L59:
            r2 = r13
            r13 = r14
        L5b:
            nk6 r14 = defpackage.nk6.a     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = r14.b()     // Catch: java.lang.Throwable -> L31
            int r4 = r4.length()     // Catch: java.lang.Throwable -> L31
            if (r4 != 0) goto L8b
            qx1 r6 = defpackage.mj6.g     // Catch: java.lang.Throwable -> L31
            r7 = 0
            r8 = 0
            mj6$f r9 = new mj6$f     // Catch: java.lang.Throwable -> L31
            r9.<init>(r2, r5)     // Catch: java.lang.Throwable -> L31
            r10 = 3
            r11 = 0
            hs2 r14 = defpackage.qh0.b(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L31
            r0.a = r13     // Catch: java.lang.Throwable -> L31
            r0.b = r5     // Catch: java.lang.Throwable -> L31
            r0.e = r3     // Catch: java.lang.Throwable -> L31
            java.lang.Object r14 = r14.l0(r0)     // Catch: java.lang.Throwable -> L31
            if (r14 != r1) goto L83
            return r1
        L83:
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> L31
            nk6 r0 = defpackage.nk6.a     // Catch: java.lang.Throwable -> L31
            r0.q(r14)     // Catch: java.lang.Throwable -> L31
            goto L8f
        L8b:
            java.lang.String r14 = r14.b()     // Catch: java.lang.Throwable -> L31
        L8f:
            r13.b(r5)
            return r14
        L93:
            r13.b(r5)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj6.I(android.content.Context, cv1):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ey4 J() {
        return (ey4) l.a(this, b[0]);
    }

    private final rt8 O(Context context, List<? extends rt8> list, String str) {
        boolean y;
        y = l0b.y(str);
        Object obj = null;
        if (y) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((rt8) next).j(context)) {
                    obj = next;
                    break;
                }
            }
            return (rt8) obj;
        }
        fk6 fk6Var = fk6.a;
        mj6 mj6Var = a;
        fk6Var.e(mj6Var, "Mindbox was previously initialized with " + str + " push service but Mindbox did not find it within pushServices. Check your Mindbox.init() and Mindbox.initPushServices()");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void Q(mj6 mj6Var, Context context, List list, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            list = null;
        }
        mj6Var.P(context, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean R(boolean z, String str, boolean z2) {
        if ((z && !z65.c(str, nk6.a.k())) || z2 != nk6.a.o()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final rt8 U(Context context, List<? extends qk6> list, String str) {
        int w;
        Object obj;
        List<? extends qk6> list2 = list;
        w = lc1.w(list2, 10);
        ArrayList arrayList = new ArrayList(w);
        for (qk6 qk6Var : list2) {
            arrayList.add(qk6Var.a(fk6.a, yx5.a));
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (z65.c(((rt8) obj).f(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        rt8 rt8Var = (rt8) obj;
        if (rt8Var == null) {
            return O(context, arrayList, str);
        }
        return rt8Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V(Context context, String str, String str2) {
        yx5.a.d(new m(context, str, str2));
    }

    static /* synthetic */ void W(mj6 mj6Var, Context context, String str, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        mj6Var.V(context, str, str2);
    }

    private final void X(Context context, List<? extends qk6> list) {
        yx5.a.d(new n(list, context, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z(Context context) {
        rx1.d(g, null, 1, null);
        in2.a.o();
        cloud.mindbox.mobile_sdk.services.a.a.d(context);
        nk6.a.p();
        g = z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object b0(Context context, String str, cv1<? super Unit> cv1Var) {
        Object d2;
        Object g2 = qh0.g(e, new p(str, context, null), cv1Var);
        d2 = c75.d();
        if (g2 == d2) {
            return g2;
        }
        return Unit.a;
    }

    static /* synthetic */ Object c0(mj6 mj6Var, Context context, String str, cv1 cv1Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        return mj6Var.b0(context, str, cv1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MindboxConfiguration e0(MindboxConfiguration mindboxConfiguration) {
        String previousDeviceUUID$sdk_release;
        List<xx9.a> e2 = xx9.a.e(mindboxConfiguration.getDomain$sdk_release(), mindboxConfiguration.getEndpointId$sdk_release(), mindboxConfiguration.getPreviousDeviceUUID$sdk_release(), mindboxConfiguration.getPreviousInstallationId$sdk_release());
        if (e2.isEmpty()) {
            return mindboxConfiguration;
        }
        List<xx9.a> list = e2;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (xx9.a aVar : list) {
                if (aVar.i()) {
                    throw new InitializeMindboxException(e2.toString());
                }
            }
        }
        fk6 fk6Var = fk6.a;
        fk6Var.e(this, "Invalid configuration parameters found: " + e2);
        boolean contains = e2.contains(xx9.a.INVALID_DEVICE_ID);
        boolean contains2 = e2.contains(xx9.a.INVALID_INSTALLATION_ID);
        String str = "";
        if (contains) {
            previousDeviceUUID$sdk_release = "";
        } else {
            previousDeviceUUID$sdk_release = mindboxConfiguration.getPreviousDeviceUUID$sdk_release();
        }
        if (!contains2) {
            str = mindboxConfiguration.getPreviousInstallationId$sdk_release();
        }
        return MindboxConfiguration.copy$sdk_release$default(mindboxConfiguration, str, previousDeviceUUID$sdk_release, null, null, null, null, null, false, false, false, 1020, null);
    }

    private final boolean f0(String str) {
        return ((Boolean) yx5.a.b(Boolean.FALSE, new r(str, this))).booleanValue();
    }

    private final <T> void w(Context context, String str, T t) {
        yx5.a.d(new a(context, str, t));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(Context context, String str, String str2) {
        fk6 fk6Var = fk6.a;
        fk6Var.d(this, "asyncOperation. operationBodyJson: " + str2);
        if (f0(str)) {
            qh0.d(f, null, null, new b(context, str, str2, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zp1 y(MindboxConfiguration mindboxConfiguration) {
        return (zp1) yx5.a.b(zp1.UPDATED, new c(this, mindboxConfiguration));
    }

    private final qx1 z() {
        return rx1.a(v33.a().P(k2b.b(null, 1, null)).P(d));
    }

    public final <T extends wa7> void E(Context context, String str, T t) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(str, "operationSystemName");
        z65.h(t, "operationBody");
        Q(this, context, null, 2, null);
        fk6 fk6Var = fk6.a;
        fk6Var.d(this, "executeAsyncOperation. operationSystemName: " + str);
        w(context, str, t);
    }

    public final String G() {
        String uuid = UUID.randomUUID().toString();
        z65.g(uuid, "randomUUID().toString()");
        return uuid;
    }

    public final lx1 H() {
        return d;
    }

    public final qx1 K() {
        return g;
    }

    public final rt8 L() {
        return k;
    }

    public final String M() {
        return (String) yx5.a.b("", new g(this));
    }

    public final void N(Context context, MindboxConfiguration mindboxConfiguration, List<? extends qk6> list) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(mindboxConfiguration, "configuration");
        z65.h(list, "pushServices");
        yx5.a.d(new i(context, list, mindboxConfiguration));
    }

    public final void P(Context context, List<? extends qk6> list) {
        String str;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        sj6 sj6Var = sj6.a;
        Context applicationContext = context.getApplicationContext();
        z65.g(applicationContext, "context.applicationContext");
        sj6Var.b(applicationContext);
        fk6 fk6Var = fk6.a;
        StringBuilder sb = new StringBuilder();
        sb.append("initComponents. pushServices: ");
        if (list != null) {
            str = sc1.i0(list, ", ", null, null, 0, null, j.a, 30, null);
        } else {
            str = null;
        }
        sb.append(str);
        fk6Var.d(this, sb.toString());
        aj.a(context);
        zha.a.k(context);
        in2.a.l(context);
        X(context, list);
    }

    public void S(String str) {
        dk6.a.c(this, str);
    }

    public final void T(Context context, String str, String str2) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(str, "uniqKey");
        yx5.a.d(new l(context, this, str, str2));
    }

    public final void Y(rt8 rt8Var) {
        k = rt8Var;
    }

    public final String a0(Function1<? super String, Unit> function1) {
        z65.h(function1, "subscription");
        fk6.a.d(this, "subscribeDeviceUuid");
        String str = "Subscription-" + UUID.randomUUID() + " (USE THIS ONLY TO UNSUBSCRIBE FROM DeviceUuid IN Mindbox.disposeDeviceUuidSubscription(...))";
        if (zha.a.f()) {
            nk6 nk6Var = nk6.a;
            if (!nk6Var.n()) {
                function1.invoke(nk6Var.b());
                return str;
            }
        }
        i.put(str, function1);
        return str;
    }

    public final void d0(Context context, String str) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(str, "token");
        yx5.a.d(new q(context, this, str));
    }

    @Override // defpackage.dk6
    public void g(String str, Throwable th) {
        dk6.a.d(this, str, th);
    }

    @Override // defpackage.dk6
    public void h(String str, Throwable th) {
        dk6.a.a(this, str, th);
    }
}
