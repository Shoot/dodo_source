package defpackage;

import com.dodopizza.order.domain.assistant.AssistantApi;
import com.huawei.hms.opendevice.c;
import defpackage.gu;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: AssistantGeneratorService.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Leu;", "", "Lgu;", "Lmt;", "b", "settings", "", "isTransparentImageUrlEnabled", "Lnt;", "a", "(Lgu;ZLcv1;)Ljava/lang/Object;", "Lcom/dodopizza/order/domain/assistant/AssistantApi;", "Lcom/dodopizza/order/domain/assistant/AssistantApi;", "api", "Lpt;", "Lpt;", "converter", "Ljr6;", c.a, "Ljr6;", "mutex", "<init>", "(Lcom/dodopizza/order/domain/assistant/AssistantApi;Lpt;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: eu  reason: default package */
/* loaded from: classes2.dex */
public final class eu {
    private final AssistantApi a;
    private final pt b;
    private final jr6 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AssistantGeneratorService.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @nn2(c = "com.dodopizza.order.domain.assistant.generator.AssistantGeneratorService", f = "AssistantGeneratorService.kt", l = {59}, m = "generate")
    /* renamed from: eu$a */
    /* loaded from: classes2.dex */
    public static final class a extends ev1 {
        Object a;
        Object b;
        Object c;
        boolean d;
        /* synthetic */ Object e;
        int g;

        a(cv1<? super a> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return eu.this.a(null, false, this);
        }
    }

    public eu(AssistantApi assistantApi, pt ptVar) {
        z65.h(assistantApi, "api");
        z65.h(ptVar, "converter");
        this.a = assistantApi;
        this.b = ptVar;
        this.c = lr6.b(false, 1, null);
    }

    private final mt b(gu guVar) {
        int w;
        int w2;
        String e = guVar.C().e();
        String a2 = guVar.C().a();
        if (guVar instanceof gu.a) {
            return new mt(a2, e, null, null, null, null, 32, null);
        }
        if (guVar instanceof gu.b) {
            gu.b bVar = (gu.b) guVar;
            String id = bVar.a().getId();
            Set<av> b = bVar.b();
            w = lc1.w(b, 10);
            ArrayList arrayList = new ArrayList(w);
            for (av avVar : b) {
                arrayList.add(avVar.getId());
            }
            Set<zw> c = bVar.c();
            w2 = lc1.w(c, 10);
            ArrayList arrayList2 = new ArrayList(w2);
            for (zw zwVar : c) {
                arrayList2.add(zwVar.getId());
            }
            return new mt(a2, e, id, arrayList2, arrayList, null, 32, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.gu r6, boolean r7, defpackage.cv1<? super defpackage.nt> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.eu.a
            if (r0 == 0) goto L13
            r0 = r8
            eu$a r0 = (defpackage.eu.a) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            eu$a r0 = new eu$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.e
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 != r4) goto L3a
            boolean r7 = r0.d
            java.lang.Object r6 = r0.c
            jr6 r6 = (defpackage.jr6) r6
            java.lang.Object r1 = r0.b
            gu r1 = (defpackage.gu) r1
            java.lang.Object r0 = r0.a
            eu r0 = (defpackage.eu) r0
            defpackage.vk9.b(r8)
            r8 = r6
            r6 = r1
            goto L59
        L3a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L42:
            defpackage.vk9.b(r8)
            jr6 r8 = r5.c
            r0.a = r5
            r0.b = r6
            r0.c = r8
            r0.d = r7
            r0.g = r4
            java.lang.Object r0 = r8.c(r3, r0)
            if (r0 != r1) goto L58
            return r1
        L58:
            r0 = r5
        L59:
            mt r6 = r0.b(r6)     // Catch: java.lang.Throwable -> L6d
            com.dodopizza.order.domain.assistant.AssistantApi r1 = r0.a     // Catch: java.lang.Throwable -> L6d
            tt r6 = r1.generate(r6)     // Catch: java.lang.Throwable -> L6d
            pt r0 = r0.b     // Catch: java.lang.Throwable -> L6d
            nt r6 = r0.b(r6, r7)     // Catch: java.lang.Throwable -> L6d
            r8.b(r3)
            return r6
        L6d:
            r6 = move-exception
            r8.b(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eu.a(gu, boolean, cv1):java.lang.Object");
    }
}
