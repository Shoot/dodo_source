package com.google.firebase.sessions;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import defpackage.bm1;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FirebaseSessionsRegistrar.kt */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0007\u0010\bJ6\u0010\u0006\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00030\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "", "Lbm1;", "", "kotlin.jvm.PlatformType", "getComponents", "<init>", "()V", "Companion", "a", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    @Deprecated
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final a Companion = new a(null);
    @Deprecated
    private static final su8<qv3> firebaseApp = su8.b(qv3.class);
    @Deprecated
    private static final su8<ew3> firebaseInstallationsApi = su8.b(ew3.class);
    @Deprecated
    private static final su8<kx1> backgroundDispatcher = su8.a(d60.class, kx1.class);
    @Deprecated
    private static final su8<kx1> blockingDispatcher = su8.a(rd0.class, kx1.class);
    @Deprecated
    private static final su8<xlb> transportFactory = su8.b(xlb.class);
    @Deprecated
    private static final su8<gfa> sessionsSettings = su8.b(gfa.class);

    /* compiled from: FirebaseSessionsRegistrar.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R8\u0010\b\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR8\u0010\n\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR8\u0010\f\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u000b0\u000b \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\tR8\u0010\u000e\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\r0\r \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\r0\r\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\tR8\u0010\u0010\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u000f0\u000f \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u000f0\u000f\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\tR8\u0010\u0012\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00110\u0011 \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00110\u0011\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;", "", "", "LIBRARY_NAME", "Ljava/lang/String;", "Lsu8;", "Lkx1;", "kotlin.jvm.PlatformType", "backgroundDispatcher", "Lsu8;", "blockingDispatcher", "Lqv3;", "firebaseApp", "Lew3;", "firebaseInstallationsApi", "Lgfa;", "sessionsSettings", "Lxlb;", "transportFactory", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes2.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-0  reason: not valid java name */
    public static final xx3 m1getComponents$lambda0(im1 im1Var) {
        Object e = im1Var.e(firebaseApp);
        z65.g(e, "container[firebaseApp]");
        Object e2 = im1Var.e(sessionsSettings);
        z65.g(e2, "container[sessionsSettings]");
        Object e3 = im1Var.e(backgroundDispatcher);
        z65.g(e3, "container[backgroundDispatcher]");
        return new xx3((qv3) e, (gfa) e2, (CoroutineContext) e3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-1  reason: not valid java name */
    public static final kea m2getComponents$lambda1(im1 im1Var) {
        return new kea(z2c.a, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-2  reason: not valid java name */
    public static final iea m3getComponents$lambda2(im1 im1Var) {
        Object e = im1Var.e(firebaseApp);
        z65.g(e, "container[firebaseApp]");
        qv3 qv3Var = (qv3) e;
        Object e2 = im1Var.e(firebaseInstallationsApi);
        z65.g(e2, "container[firebaseInstallationsApi]");
        ew3 ew3Var = (ew3) e2;
        Object e3 = im1Var.e(sessionsSettings);
        z65.g(e3, "container[sessionsSettings]");
        gfa gfaVar = (gfa) e3;
        bs8 d = im1Var.d(transportFactory);
        z65.g(d, "container.getProvider(transportFactory)");
        tk3 tk3Var = new tk3(d);
        Object e4 = im1Var.e(backgroundDispatcher);
        z65.g(e4, "container[backgroundDispatcher]");
        return new jea(qv3Var, ew3Var, gfaVar, tk3Var, (CoroutineContext) e4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-3  reason: not valid java name */
    public static final gfa m4getComponents$lambda3(im1 im1Var) {
        Object e = im1Var.e(firebaseApp);
        z65.g(e, "container[firebaseApp]");
        Object e2 = im1Var.e(blockingDispatcher);
        z65.g(e2, "container[blockingDispatcher]");
        Object e3 = im1Var.e(backgroundDispatcher);
        z65.g(e3, "container[backgroundDispatcher]");
        Object e4 = im1Var.e(firebaseInstallationsApi);
        z65.g(e4, "container[firebaseInstallationsApi]");
        return new gfa((qv3) e, (CoroutineContext) e2, (CoroutineContext) e3, (ew3) e4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-4  reason: not valid java name */
    public static final dea m5getComponents$lambda4(im1 im1Var) {
        Context k = ((qv3) im1Var.e(firebaseApp)).k();
        z65.g(k, "container[firebaseApp].applicationContext");
        Object e = im1Var.e(backgroundDispatcher);
        z65.g(e, "container[backgroundDispatcher]");
        return new eea(k, (CoroutineContext) e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-5  reason: not valid java name */
    public static final oea m6getComponents$lambda5(im1 im1Var) {
        Object e = im1Var.e(firebaseApp);
        z65.g(e, "container[firebaseApp]");
        return new pea((qv3) e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<bm1<? extends Object>> getComponents() {
        List<bm1<? extends Object>> o;
        bm1.b h = bm1.e(xx3.class).h(LIBRARY_NAME);
        su8<qv3> su8Var = firebaseApp;
        bm1.b b = h.b(d03.j(su8Var));
        su8<gfa> su8Var2 = sessionsSettings;
        bm1.b b2 = b.b(d03.j(su8Var2));
        su8<kx1> su8Var3 = backgroundDispatcher;
        bm1.b b3 = bm1.e(iea.class).h("session-publisher").b(d03.j(su8Var));
        su8<ew3> su8Var4 = firebaseInstallationsApi;
        o = kc1.o(b2.b(d03.j(su8Var3)).f(new rm1() { // from class: ay3
            @Override // defpackage.rm1
            public final Object a(im1 im1Var) {
                xx3 m1getComponents$lambda0;
                m1getComponents$lambda0 = FirebaseSessionsRegistrar.m1getComponents$lambda0(im1Var);
                return m1getComponents$lambda0;
            }
        }).e().d(), bm1.e(kea.class).h("session-generator").f(new rm1() { // from class: by3
            @Override // defpackage.rm1
            public final Object a(im1 im1Var) {
                kea m2getComponents$lambda1;
                m2getComponents$lambda1 = FirebaseSessionsRegistrar.m2getComponents$lambda1(im1Var);
                return m2getComponents$lambda1;
            }
        }).d(), b3.b(d03.j(su8Var4)).b(d03.j(su8Var2)).b(d03.l(transportFactory)).b(d03.j(su8Var3)).f(new rm1() { // from class: cy3
            @Override // defpackage.rm1
            public final Object a(im1 im1Var) {
                iea m3getComponents$lambda2;
                m3getComponents$lambda2 = FirebaseSessionsRegistrar.m3getComponents$lambda2(im1Var);
                return m3getComponents$lambda2;
            }
        }).d(), bm1.e(gfa.class).h("sessions-settings").b(d03.j(su8Var)).b(d03.j(blockingDispatcher)).b(d03.j(su8Var3)).b(d03.j(su8Var4)).f(new rm1() { // from class: dy3
            @Override // defpackage.rm1
            public final Object a(im1 im1Var) {
                gfa m4getComponents$lambda3;
                m4getComponents$lambda3 = FirebaseSessionsRegistrar.m4getComponents$lambda3(im1Var);
                return m4getComponents$lambda3;
            }
        }).d(), bm1.e(dea.class).h("sessions-datastore").b(d03.j(su8Var)).b(d03.j(su8Var3)).f(new rm1() { // from class: ey3
            @Override // defpackage.rm1
            public final Object a(im1 im1Var) {
                dea m5getComponents$lambda4;
                m5getComponents$lambda4 = FirebaseSessionsRegistrar.m5getComponents$lambda4(im1Var);
                return m5getComponents$lambda4;
            }
        }).d(), bm1.e(oea.class).h("sessions-service-binder").b(d03.j(su8Var)).f(new rm1() { // from class: fy3
            @Override // defpackage.rm1
            public final Object a(im1 im1Var) {
                oea m6getComponents$lambda5;
                m6getComponents$lambda5 = FirebaseSessionsRegistrar.m6getComponents$lambda5(im1Var);
                return m6getComponents$lambda5;
            }
        }).d(), ep5.b(LIBRARY_NAME, "1.2.2"));
        return o;
    }
}
