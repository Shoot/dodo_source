package cloud.mindbox.mobile_sdk.monitoring.data.repositories;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.HashSet;
import kotlin.Metadata;
/* compiled from: MonitoringRepositoryImpl.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\u0006\u0010$\u001a\u00020\"\u0012\u0006\u0010'\u001a\u00020%\u0012\u0006\u0010*\u001a\u00020(\u0012\u0006\u0010-\u001a\u00020+¢\u0006\u0004\b.\u0010/J\u0018\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u0013\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bJ#\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00142\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010,\u0082\u0002\u0004\n\u0002\b\u0019¨\u00060"}, d2 = {"Lcloud/mindbox/mobile_sdk/monitoring/data/repositories/MonitoringRepositoryImpl;", "Lio6;", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "g", "id", "", "f", "Lax5;", "a", "(Lcv1;)Ljava/lang/Object;", "b", "Lddc;", "zonedDateTime", "message", com.huawei.hms.opendevice.c.a, "(Lddc;Ljava/lang/String;Lcv1;)Ljava/lang/Object;", "startTime", "endTime", "", com.huawei.hms.push.e.a, "(Lddc;Lddc;Lcv1;)Ljava/lang/Object;", "monitoringStatus", "requestId", "logs", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcv1;)Ljava/lang/Object;", "Lzn6;", "Lzn6;", "monitoringDao", "Lfo6;", "Lfo6;", "monitoringMapper", "Lcom/google/gson/Gson;", "Lcom/google/gson/Gson;", "gson", "Lfx5;", "Lfx5;", "logStoringDataChecker", "Lko6;", "Lko6;", "monitoringValidator", "Lwc4;", "Lwc4;", "gatewayManager", "<init>", "(Lzn6;Lfo6;Lcom/google/gson/Gson;Lfx5;Lko6;Lwc4;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MonitoringRepositoryImpl implements io6 {
    private final zn6 a;
    private final fo6 b;
    private final Gson c;
    private final fx5 d;
    private final ko6 e;
    private final wc4 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MonitoringRepositoryImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl", f = "MonitoringRepositoryImpl.kt", l = {56}, m = "getFirstLog")
    /* loaded from: classes.dex */
    public static final class a extends ev1 {
        Object a;
        /* synthetic */ Object b;
        int d;

        a(cv1<? super a> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return MonitoringRepositoryImpl.this.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MonitoringRepositoryImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl", f = "MonitoringRepositoryImpl.kt", l = {60}, m = "getLastLog")
    /* loaded from: classes.dex */
    public static final class b extends ev1 {
        Object a;
        /* synthetic */ Object b;
        int d;

        b(cv1<? super b> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return MonitoringRepositoryImpl.this.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MonitoringRepositoryImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl", f = "MonitoringRepositoryImpl.kt", l = {90}, m = "getLogs")
    /* loaded from: classes.dex */
    public static final class c extends ev1 {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int e;

        c(cv1<? super c> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return MonitoringRepositoryImpl.this.e(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MonitoringRepositoryImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl", f = "MonitoringRepositoryImpl.kt", l = {64, 119, 76}, m = "saveLog")
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
            return MonitoringRepositoryImpl.this.c(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MonitoringRepositoryImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl", f = "MonitoringRepositoryImpl.kt", l = {102}, m = "sendLogs")
    /* loaded from: classes.dex */
    public static final class e extends ev1 {
        Object a;
        Object b;
        Object c;
        Object d;
        /* synthetic */ Object e;
        int g;

        e(cv1<? super e> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return MonitoringRepositoryImpl.this.d(null, null, null, this);
        }
    }

    public MonitoringRepositoryImpl(zn6 zn6Var, fo6 fo6Var, Gson gson, fx5 fx5Var, ko6 ko6Var, wc4 wc4Var) {
        z65.h(zn6Var, "monitoringDao");
        z65.h(fo6Var, "monitoringMapper");
        z65.h(gson, "gson");
        z65.h(fx5Var, "logStoringDataChecker");
        z65.h(ko6Var, "monitoringValidator");
        z65.h(wc4Var, "gatewayManager");
        this.a = zn6Var;
        this.b = fo6Var;
        this.c = gson;
        this.d = fx5Var;
        this.e = ko6Var;
        this.f = wc4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // defpackage.io6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.cv1<? super defpackage.ax5> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl.a
            if (r0 == 0) goto L13
            r0 = r6
            cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl$a r0 = (cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl$a r0 = new cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.a
            fo6 r0 = (defpackage.fo6) r0
            defpackage.vk9.b(r6)
            goto L4a
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            defpackage.vk9.b(r6)
            fo6 r6 = r5.b
            zn6 r2 = r5.a
            r0.a = r6
            r0.d = r3
            java.lang.Object r0 = r2.a(r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r4 = r0
            r0 = r6
            r6 = r4
        L4a:
            cloud.mindbox.mobile_sdk.monitoring.data.room.entities.MonitoringEntity r6 = (cloud.mindbox.mobile_sdk.monitoring.data.room.entities.MonitoringEntity) r6
            ax5 r6 = r0.d(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl.a(cv1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // defpackage.io6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(defpackage.cv1<? super defpackage.ax5> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl.b
            if (r0 == 0) goto L13
            r0 = r6
            cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl$b r0 = (cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl.b) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl$b r0 = new cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.a
            fo6 r0 = (defpackage.fo6) r0
            defpackage.vk9.b(r6)
            goto L4a
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            defpackage.vk9.b(r6)
            fo6 r6 = r5.b
            zn6 r2 = r5.a
            r0.a = r6
            r0.d = r3
            java.lang.Object r0 = r2.b(r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r4 = r0
            r0 = r6
            r6 = r4
        L4a:
            cloud.mindbox.mobile_sdk.monitoring.data.room.entities.MonitoringEntity r6 = (cloud.mindbox.mobile_sdk.monitoring.data.room.entities.MonitoringEntity) r6
            ax5 r6 = r0.d(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl.b(cv1):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(1:(1:(6:12|13|14|15|16|17)(2:20|21))(8:22|23|24|(2:26|(1:28))|14|15|16|17))(1:29))(2:36|(1:38)(1:39))|30|(7:32|33|(1:35)|24|(0)|14|15)|16|17))|41|6|7|(0)(0)|30|(0)|16|17) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4 A[Catch: all -> 0x0035, TryCatch #1 {Exception -> 0x00c4, blocks: (B:40:0x00bc, B:21:0x0048, B:31:0x0087, B:14:0x0030, B:39:0x00ba, B:34:0x0098, B:36:0x00a4), top: B:46:0x0024 }] */
    @Override // defpackage.io6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(defpackage.ddc r9, java.lang.String r10, defpackage.cv1<? super kotlin.Unit> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl.d
            if (r0 == 0) goto L13
            r0 = r11
            cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl$d r0 = (cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl.d) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl$d r0 = new cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl$d
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.c
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.e
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L55
            if (r2 == r6) goto L4c
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r9 = r0.a
            jr6 r9 = (defpackage.jr6) r9
            defpackage.vk9.b(r11)     // Catch: java.lang.Throwable -> L35
            goto Lba
        L35:
            r10 = move-exception
            goto Lc0
        L38:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L40:
            java.lang.Object r9 = r0.b
            jr6 r9 = (defpackage.jr6) r9
            java.lang.Object r10 = r0.a
            cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl r10 = (cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl) r10
            defpackage.vk9.b(r11)     // Catch: java.lang.Exception -> Lc4
            goto L98
        L4c:
            java.lang.Object r9 = r0.a
            cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl r9 = (cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl) r9
            defpackage.vk9.b(r11)
            r10 = r9
            goto L75
        L55:
            defpackage.vk9.b(r11)
            zn6 r11 = r8.a
            fo6 r2 = r8.b
            java.lang.String r9 = defpackage.vn3.b(r9)
            java.lang.String r7 = "zonedDateTime.convertToString()"
            defpackage.z65.g(r9, r7)
            cloud.mindbox.mobile_sdk.monitoring.data.room.entities.MonitoringEntity r9 = r2.a(r9, r10)
            r0.a = r8
            r0.e = r6
            java.lang.Object r9 = r11.c(r9, r0)
            if (r9 != r1) goto L74
            return r1
        L74:
            r10 = r8
        L75:
            fx5 r9 = r10.d
            boolean r9 = r9.a()
            if (r9 == 0) goto Lc4
            gx5$a r9 = defpackage.gx5.c
            java.util.concurrent.atomic.AtomicBoolean r9 = r9.b()
            r9.set(r6)
            r9 = 0
            jr6 r9 = defpackage.lr6.b(r9, r6, r5)     // Catch: java.lang.Exception -> Lc4
            r0.a = r10     // Catch: java.lang.Exception -> Lc4
            r0.b = r9     // Catch: java.lang.Exception -> Lc4
            r0.e = r4     // Catch: java.lang.Exception -> Lc4
            java.lang.Object r11 = r9.c(r5, r0)     // Catch: java.lang.Exception -> Lc4
            if (r11 != r1) goto L98
            return r1
        L98:
            gx5$a r11 = defpackage.gx5.c     // Catch: java.lang.Throwable -> L35
            java.util.concurrent.atomic.AtomicBoolean r2 = r11.a()     // Catch: java.lang.Throwable -> L35
            boolean r2 = r2.get()     // Catch: java.lang.Throwable -> L35
            if (r2 != 0) goto Lba
            java.util.concurrent.atomic.AtomicBoolean r11 = r11.a()     // Catch: java.lang.Throwable -> L35
            r11.set(r6)     // Catch: java.lang.Throwable -> L35
            zn6 r10 = r10.a     // Catch: java.lang.Throwable -> L35
            r0.a = r9     // Catch: java.lang.Throwable -> L35
            r0.b = r5     // Catch: java.lang.Throwable -> L35
            r0.e = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r10.e(r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r1) goto Lba
            return r1
        Lba:
            kotlin.Unit r10 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L35
            r9.b(r5)     // Catch: java.lang.Exception -> Lc4
            goto Lc4
        Lc0:
            r9.b(r5)     // Catch: java.lang.Exception -> Lc4
            throw r10     // Catch: java.lang.Exception -> Lc4
        Lc4:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl.c(ddc, java.lang.String, cv1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    @Override // defpackage.io6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(java.lang.String r5, java.lang.String r6, java.util.List<defpackage.ax5> r7, defpackage.cv1<? super kotlin.Unit> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl.e
            if (r0 == 0) goto L13
            r0 = r8
            cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl$e r0 = (cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl.e) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl$e r0 = new cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl$e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.e
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.g
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r5 = r0.d
            r7 = r5
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r5 = r0.c
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r0.b
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.a
            cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl r0 = (cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl) r0
            defpackage.vk9.b(r8)
            goto L5e
        L3b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L43:
            defpackage.vk9.b(r8)
            in2 r8 = defpackage.in2.a
            oz3 r8 = r8.n()
            r0.a = r4
            r0.b = r5
            r0.c = r6
            r0.d = r7
            r0.g = r3
            java.lang.Object r8 = defpackage.wz3.u(r8, r0)
            if (r8 != r1) goto L5d
            return r1
        L5d:
            r0 = r4
        L5e:
            cloud.mindbox.mobile_sdk.models.Configuration r8 = (cloud.mindbox.mobile_sdk.models.Configuration) r8
            wc4 r1 = r0.f
            fo6 r0 = r0.b
            dx5 r5 = r0.c(r5, r6, r7)
            r1.B(r5, r8)
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl.d(java.lang.String, java.lang.String, java.util.List, cv1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    @Override // defpackage.io6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(defpackage.ddc r7, defpackage.ddc r8, defpackage.cv1<? super java.util.List<defpackage.ax5>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl.c
            if (r0 == 0) goto L13
            r0 = r9
            cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl$c r0 = (cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl.c) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl$c r0 = new cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.c
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.b
            fo6 r7 = (defpackage.fo6) r7
            java.lang.Object r8 = r0.a
            cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl r8 = (cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl) r8
            defpackage.vk9.b(r9)
            goto L63
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            defpackage.vk9.b(r9)
            fo6 r9 = r6.b
            zn6 r2 = r6.a
            java.lang.String r7 = defpackage.vn3.b(r7)
            java.lang.String r4 = "startTime.convertToString()"
            defpackage.z65.g(r7, r4)
            java.lang.String r8 = defpackage.vn3.b(r8)
            java.lang.String r4 = "endTime.convertToString()"
            defpackage.z65.g(r8, r4)
            r0.a = r6
            r0.b = r9
            r0.e = r3
            java.lang.Object r7 = r2.d(r7, r8, r0)
            if (r7 != r1) goto L5f
            return r1
        L5f:
            r8 = r6
            r5 = r9
            r9 = r7
            r7 = r5
        L63:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()
        L6e:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L87
            java.lang.Object r1 = r9.next()
            r2 = r1
            cloud.mindbox.mobile_sdk.monitoring.data.room.entities.MonitoringEntity r2 = (cloud.mindbox.mobile_sdk.monitoring.data.room.entities.MonitoringEntity) r2
            ko6 r3 = r8.e
            boolean r2 = r3.d(r2)
            if (r2 == 0) goto L6e
            r0.add(r1)
            goto L6e
        L87:
            java.util.List r7 = r7.b(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl.e(ddc, ddc, cv1):java.lang.Object");
    }

    @Override // defpackage.io6
    public void f(String str) {
        z65.h(str, "id");
        HashSet<String> g = g();
        g.add(str);
        nk6 nk6Var = nk6.a;
        String u = this.c.u(g, new TypeToken<HashSet<String>>() { // from class: cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl$saveRequestId$1
        }.getType());
        z65.g(u, "gson.toJson(logRequestId…shSet<String>>() {}.type)");
        nk6Var.w(u);
    }

    @Override // defpackage.io6
    public HashSet<String> g() {
        return (HashSet) yx5.a.b(new HashSet(), new MonitoringRepositoryImpl$getRequestIds$1(this));
    }
}
