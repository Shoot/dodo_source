package defpackage;

import com.dodopizza.order.domain.assistant.AssistantApi;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: AssistantSettingsService.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lyv;", "", "", "stateId", "Lsv;", "a", "(Ljava/lang/String;Lcv1;)Ljava/lang/Object;", "Lcom/dodopizza/order/domain/assistant/AssistantApi;", "Lcom/dodopizza/order/domain/assistant/AssistantApi;", "api", "Ltv;", "b", "Ltv;", "converter", "Ljr6;", c.a, "Ljr6;", "mutex", "<init>", "(Lcom/dodopizza/order/domain/assistant/AssistantApi;Ltv;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: yv  reason: default package */
/* loaded from: classes2.dex */
public final class yv {
    private final AssistantApi a;
    private final tv b;
    private final jr6 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AssistantSettingsService.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @nn2(c = "com.dodopizza.order.domain.assistant.settings.AssistantSettingsService", f = "AssistantSettingsService.kt", l = {29}, m = "get")
    /* renamed from: yv$a */
    /* loaded from: classes2.dex */
    public static final class a extends ev1 {
        Object a;
        Object b;
        Object c;
        /* synthetic */ Object d;
        int f;

        a(cv1<? super a> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return yv.this.a(null, this);
        }
    }

    public yv(AssistantApi assistantApi, tv tvVar) {
        z65.h(assistantApi, "api");
        z65.h(tvVar, "converter");
        this.a = assistantApi;
        this.b = tvVar;
        this.c = lr6.b(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, defpackage.cv1<? super defpackage.sv> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.yv.a
            if (r0 == 0) goto L13
            r0 = r7
            yv$a r0 = (defpackage.yv.a) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            yv$a r0 = new yv$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.d
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 != r4) goto L38
            java.lang.Object r6 = r0.c
            jr6 r6 = (defpackage.jr6) r6
            java.lang.Object r1 = r0.b
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.a
            yv r0 = (defpackage.yv) r0
            defpackage.vk9.b(r7)
            r7 = r6
            r6 = r1
            goto L55
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            defpackage.vk9.b(r7)
            jr6 r7 = r5.c
            r0.a = r5
            r0.b = r6
            r0.c = r7
            r0.f = r4
            java.lang.Object r0 = r7.c(r3, r0)
            if (r0 != r1) goto L54
            return r1
        L54:
            r0 = r5
        L55:
            com.dodopizza.order.domain.assistant.AssistantApi r1 = r0.a     // Catch: java.lang.Throwable -> L65
            vv r6 = r1.getSettings(r6)     // Catch: java.lang.Throwable -> L65
            tv r0 = r0.b     // Catch: java.lang.Throwable -> L65
            sv r6 = r0.c(r6)     // Catch: java.lang.Throwable -> L65
            r7.b(r3)
            return r6
        L65:
            r6 = move-exception
            r7.b(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv.a(java.lang.String, cv1):java.lang.Object");
    }
}
