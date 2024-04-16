package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: InAppGeoRepositoryImpl.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lxx4;", "Lwx4;", "", "a", "(Lcv1;)Ljava/lang/Object;", "Lhe4;", "status", DateTokenConverter.CONVERTER_KEY, com.huawei.hms.opendevice.c.a, "Lpe4;", "b", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ldy4;", "Ldy4;", "inAppMapper", "Lme4;", "Lme4;", "geoSerializationManager", "Lcfa;", "Lcfa;", "sessionStorageManager", "Lwc4;", e.a, "Lwc4;", "gatewayManager", "<init>", "(Landroid/content/Context;Ldy4;Lme4;Lcfa;Lwc4;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: xx4  reason: default package */
/* loaded from: classes.dex */
public final class xx4 implements wx4 {
    private final Context a;
    private final dy4 b;
    private final me4 c;
    private final cfa d;
    private final wc4 e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InAppGeoRepositoryImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "cloud.mindbox.mobile_sdk.inapp.data.repositories.InAppGeoRepositoryImpl", f = "InAppGeoRepositoryImpl.kt", l = {25, 27}, m = "fetchGeo")
    /* renamed from: xx4$a */
    /* loaded from: classes.dex */
    public static final class a extends ev1 {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int e;

        a(cv1<? super a> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return xx4.this.a(this);
        }
    }

    /* compiled from: InAppGeoRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lpe4;", "a", "()Lpe4;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: xx4$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<pe4> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final pe4 invoke() {
            return xx4.this.c.b(nk6.a.f());
        }
    }

    /* compiled from: InAppGeoRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lhe4;", "a", "()Lhe4;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: xx4$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function0<he4> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final he4 invoke() {
            return xx4.this.d.b();
        }
    }

    public xx4(Context context, dy4 dy4Var, me4 me4Var, cfa cfaVar, wc4 wc4Var) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(dy4Var, "inAppMapper");
        z65.h(me4Var, "geoSerializationManager");
        z65.h(cfaVar, "sessionStorageManager");
        z65.h(wc4Var, "gatewayManager");
        this.a = context;
        this.b = dy4Var;
        this.c = me4Var;
        this.d = cfaVar;
        this.e = wc4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    @Override // defpackage.wx4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.cv1<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.xx4.a
            if (r0 == 0) goto L13
            r0 = r7
            xx4$a r0 = (defpackage.xx4.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            xx4$a r0 = new xx4$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.c
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r1 = r0.b
            dy4 r1 = (defpackage.dy4) r1
            java.lang.Object r0 = r0.a
            xx4 r0 = (defpackage.xx4) r0
            defpackage.vk9.b(r7)
            goto L6e
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3c:
            java.lang.Object r2 = r0.a
            xx4 r2 = (defpackage.xx4) r2
            defpackage.vk9.b(r7)
            goto L59
        L44:
            defpackage.vk9.b(r7)
            in2 r7 = defpackage.in2.a
            oz3 r7 = r7.n()
            r0.a = r6
            r0.e = r4
            java.lang.Object r7 = defpackage.wz3.u(r7, r0)
            if (r7 != r1) goto L58
            return r1
        L58:
            r2 = r6
        L59:
            cloud.mindbox.mobile_sdk.models.Configuration r7 = (cloud.mindbox.mobile_sdk.models.Configuration) r7
            dy4 r4 = r2.b
            wc4 r5 = r2.e
            r0.a = r2
            r0.b = r4
            r0.e = r3
            java.lang.Object r7 = r5.j(r7, r0)
            if (r7 != r1) goto L6c
            return r1
        L6c:
            r0 = r2
            r1 = r4
        L6e:
            qe4 r7 = (defpackage.qe4) r7
            pe4 r7 = r1.c(r7)
            nk6 r1 = defpackage.nk6.a
            me4 r2 = r0.c
            java.lang.String r7 = r2.a(r7)
            r1.u(r7)
            cfa r7 = r0.d
            he4 r0 = defpackage.he4.GEO_FETCH_SUCCESS
            r7.i(r0)
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xx4.a(cv1):java.lang.Object");
    }

    @Override // defpackage.wx4
    public pe4 b() {
        return (pe4) yx5.a.b(new pe4("", "", ""), new b());
    }

    @Override // defpackage.wx4
    public he4 c() {
        return (he4) yx5.a.b(he4.GEO_FETCH_ERROR, new c());
    }

    @Override // defpackage.wx4
    public void d(he4 he4Var) {
        z65.h(he4Var, "status");
        this.d.i(he4Var);
    }
}
