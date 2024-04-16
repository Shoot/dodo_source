package im.threads.business.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ThreadsLibBase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.business.core.ThreadsLibBase$Companion$showVersionsLog$1", f = "ThreadsLibBase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ThreadsLibBase$Companion$showVersionsLog$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ThreadsLibBase$Companion$showVersionsLog$1(cv1<? super ThreadsLibBase$Companion$showVersionsLog$1> cv1Var) {
        super(2, cv1Var);
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new ThreadsLibBase$Companion$showVersionsLog$1(cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((ThreadsLibBase$Companion$showVersionsLog$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    @Override // defpackage.e70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            defpackage.a75.d()
            int r0 = r6.label
            if (r0 != 0) goto L7f
            defpackage.vk9.b(r7)
            java.lang.String r7 = "Getting versions from \"api/versions\"..."
            im.threads.business.logger.LoggerEdna.info(r7)
            r7 = 0
            im.threads.business.rest.queries.BackendApi$Companion r0 = im.threads.business.rest.queries.BackendApi.Companion     // Catch: java.lang.Exception -> L21
            im.threads.business.rest.queries.ThreadsApi r0 = r0.get()     // Catch: java.lang.Exception -> L21
            retrofit2.Call r0 = r0.versions()     // Catch: java.lang.Exception -> L21
            if (r0 == 0) goto L22
            retrofit2.Response r0 = r0.execute()     // Catch: java.lang.Exception -> L21
            goto L23
        L21:
        L22:
            r0 = r7
        L23:
            if (r0 == 0) goto L3c
            boolean r1 = r0.isSuccessful()
            r2 = 1
            if (r1 != r2) goto L3c
            java.lang.Object r7 = r0.body()
            im.threads.business.rest.models.VersionsModel r7 = (im.threads.business.rest.models.VersionsModel) r7
            if (r7 == 0) goto L7c
            java.lang.String r7 = r7.toTableString()
            im.threads.business.logger.LoggerEdna.info(r7)
            goto L7c
        L3c:
            if (r0 == 0) goto L47
            int r1 = r0.code()
            java.lang.Integer r1 = defpackage.nf0.c(r1)
            goto L48
        L47:
            r1 = r7
        L48:
            if (r0 == 0) goto L4e
            java.lang.String r7 = r0.message()
        L4e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Failed to get versions from \"api/versions\", error code: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", message: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            im.threads.business.logger.LoggerEdna.info(r7)
            im.threads.business.rest.models.VersionsModel r7 = new im.threads.business.rest.models.VersionsModel
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 7
            r5 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.String r7 = r7.toTableString()
            im.threads.business.logger.LoggerEdna.info(r7)
        L7c:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L7f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.business.core.ThreadsLibBase$Companion$showVersionsLog$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
