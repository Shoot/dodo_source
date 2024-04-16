package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PushServiceHandler.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b&\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u001e\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\b\u001a\u00020\u0007H&J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0001H&J\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007J'\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007H$J\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H¤@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lrt8;", "", "Lkotlin/Function1;", "", "", "k", com.huawei.hms.opendevice.c.a, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", Image.TYPE_HIGH, e.a, "Lkotlin/Pair;", "", DateTokenConverter.CONVERTER_KEY, "logParent", "b", "j", "previousToken", "l", "(Landroid/content/Context;Ljava/lang/String;Lcv1;)Ljava/lang/Object;", "i", "g", "(Landroid/content/Context;Lcv1;)Ljava/lang/Object;", "f", "()Ljava/lang/String;", "notificationProvider", "<init>", "()V", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: rt8  reason: default package */
/* loaded from: classes.dex */
public abstract class rt8 {
    public static final a a = new a(null);

    /* compiled from: PushServiceHandler.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lrt8$a;", "", "", "ZERO_ID", "Ljava/lang/String;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: rt8$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PushServiceHandler.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: rt8$b */
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function0<String> {
        final /* synthetic */ Context b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(0);
            this.b = context;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            Pair<String, Boolean> d = rt8.this.d(this.b);
            String a = d.a();
            boolean booleanValue = d.b().booleanValue();
            if (!booleanValue && a != null && a.length() != 0 && !z65.c(a, "00000000-0000-0000-0000-000000000000")) {
                fk6 fk6Var = fk6.a;
                rt8 rt8Var = rt8.this;
                fk6Var.d(rt8Var, "Received from " + rt8.this.f() + " AdvertisingIdClient: device uuid - " + a);
                return a;
            }
            fk6 fk6Var2 = fk6.a;
            rt8 rt8Var2 = rt8.this;
            fk6Var2.d(rt8Var2, "Device uuid cannot be received from " + rt8.this.f() + " AdvertisingIdClient. Will be generated from random. isLimitAdTrackingEnabled = " + booleanValue + ", uuid from AdvertisingIdClient = " + a);
            return rt8.this.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PushServiceHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Throwable;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: rt8$c */
    /* loaded from: classes.dex */
    public static final class c extends ej5 implements Function1<Throwable, String> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Throwable th) {
            z65.h(th, "it");
            fk6 fk6Var = fk6.a;
            rt8 rt8Var = rt8.this;
            fk6Var.d(rt8Var, "Device uuid cannot be received from " + rt8.this.f() + " AdvertisingIdClient. Will be generated from random");
            return rt8.this.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PushServiceHandler.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "cloud.mindbox.mobile_sdk.pushes.PushServiceHandler", f = "PushServiceHandler.kt", l = {70}, m = "registerToken")
    /* renamed from: rt8$d */
    /* loaded from: classes.dex */
    public static final class d extends ev1 {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int e;

        d(cv1<? super d> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return rt8.this.l(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c() {
        String uuid = UUID.randomUUID().toString();
        z65.g(uuid, "randomUUID().toString()");
        return uuid;
    }

    private final Function1<Throwable, String> k() {
        return new c();
    }

    public abstract void b(Context context, Object obj);

    public abstract Pair<String, Boolean> d(Context context);

    public final String e(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        return (String) yx5.a.c(new b(context), k());
    }

    public abstract String f();

    protected abstract Object g(Context context, cv1<? super String> cv1Var);

    public abstract void h(Context context);

    protected abstract boolean i(Context context);

    public final boolean j(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        try {
            boolean i = i(context);
            if (!i) {
                fk6 fk6Var = fk6.a;
                fk6Var.a(this, f() + " services are not available");
                return i;
            }
            return i;
        } catch (Exception e) {
            fk6 fk6Var2 = fk6.a;
            fk6Var2.a(this, "Unable to determine " + f() + " services availability. Failed with exception " + e);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(android.content.Context r5, java.lang.String r6, defpackage.cv1<? super java.lang.String> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.rt8.d
            if (r0 == 0) goto L13
            r0 = r7
            rt8$d r0 = (defpackage.rt8.d) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            rt8$d r0 = new rt8$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.c
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r5 = r0.b
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r0.a
            rt8 r5 = (defpackage.rt8) r5
            defpackage.vk9.b(r7)     // Catch: java.lang.Exception -> L32
            goto L4d
        L32:
            r6 = move-exception
            goto L97
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3c:
            defpackage.vk9.b(r7)
            r0.a = r4     // Catch: java.lang.Exception -> L95
            r0.b = r6     // Catch: java.lang.Exception -> L95
            r0.e = r3     // Catch: java.lang.Exception -> L95
            java.lang.Object r7 = r4.g(r5, r0)     // Catch: java.lang.Exception -> L95
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r5 = r4
        L4d:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L32
            fk6 r0 = defpackage.fk6.a     // Catch: java.lang.Exception -> L32
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L32
            r1.<init>()     // Catch: java.lang.Exception -> L32
            java.lang.String r2 = "registerToken. token: "
            r1.append(r2)     // Catch: java.lang.Exception -> L32
            r1.append(r7)     // Catch: java.lang.Exception -> L32
            java.lang.String r2 = ", previousToken: "
            r1.append(r2)     // Catch: java.lang.Exception -> L32
            r1.append(r6)     // Catch: java.lang.Exception -> L32
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L32
            r0.d(r5, r1)     // Catch: java.lang.Exception -> L32
            if (r7 == 0) goto Lba
            int r1 = r7.length()     // Catch: java.lang.Exception -> L32
            if (r1 != 0) goto L76
            goto Lba
        L76:
            boolean r6 = defpackage.z65.c(r7, r6)     // Catch: java.lang.Exception -> L32
            if (r6 != 0) goto Lba
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L32
            r6.<init>()     // Catch: java.lang.Exception -> L32
            java.lang.String r1 = "Token gets or updates from "
            r6.append(r1)     // Catch: java.lang.Exception -> L32
            java.lang.String r1 = r5.f()     // Catch: java.lang.Exception -> L32
            r6.append(r1)     // Catch: java.lang.Exception -> L32
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L32
            r0.i(r5, r6)     // Catch: java.lang.Exception -> L32
            goto Lba
        L95:
            r6 = move-exception
            r5 = r4
        L97:
            fk6 r7 = defpackage.fk6.a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fetching "
            r0.append(r1)
            java.lang.String r1 = r5.f()
            r0.append(r1)
            java.lang.String r1 = " registration token failed with exception "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.a(r5, r6)
            r7 = 0
        Lba:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rt8.l(android.content.Context, java.lang.String, cv1):java.lang.Object");
    }
}
