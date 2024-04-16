package defpackage;

import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.dfa;
import defpackage.jr6;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FirebaseSessionsDependencies.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001f\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u000bH\u0080@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000e\u0010\u000fRT\u0010\u0013\u001aB\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\t0\t \u0011* \u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\t0\t\u0018\u00010\u000b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lzx3;", "", "Ldfa$a;", "subscriberName", "", "a", "Ldfa;", "subscriber", e.a, "Lzx3$a;", "b", "", c.a, "(Lcv1;)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "(Ldfa$a;)Ldfa;", "", "kotlin.jvm.PlatformType", "Ljava/util/Map;", "dependencies", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* renamed from: zx3  reason: default package */
/* loaded from: classes2.dex */
public final class zx3 {
    public static final zx3 a = new zx3();
    private static final Map<dfa.a, a> b = Collections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FirebaseSessionsDependencies.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\r\u001a\u00020\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR$\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lzx3$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "Ljr6;", "a", "Ljr6;", "()Ljr6;", "mutex", "Ldfa;", "b", "Ldfa;", "()Ldfa;", c.a, "(Ldfa;)V", "subscriber", "<init>", "(Ljr6;Ldfa;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    /* renamed from: zx3$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private final jr6 a;
        private dfa b;

        public a(jr6 jr6Var, dfa dfaVar) {
            z65.h(jr6Var, "mutex");
            this.a = jr6Var;
            this.b = dfaVar;
        }

        public final jr6 a() {
            return this.a;
        }

        public final dfa b() {
            return this.b;
        }

        public final void c(dfa dfaVar) {
            this.b = dfaVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (z65.c(this.a, aVar.a) && z65.c(this.b, aVar.b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.a.hashCode() * 31;
            dfa dfaVar = this.b;
            if (dfaVar == null) {
                hashCode = 0;
            } else {
                hashCode = dfaVar.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "Dependency(mutex=" + this.a + ", subscriber=" + this.b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public /* synthetic */ a(jr6 jr6Var, dfa dfaVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(jr6Var, (i & 2) != 0 ? null : dfaVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FirebaseSessionsDependencies.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @nn2(c = "com.google.firebase.sessions.api.FirebaseSessionsDependencies", f = "FirebaseSessionsDependencies.kt", l = {124}, m = "getRegisteredSubscribers$com_google_firebase_firebase_sessions")
    /* renamed from: zx3$b */
    /* loaded from: classes2.dex */
    public static final class b extends ev1 {
        Object a;
        Object b;
        Object c;
        Object d;
        Object e;
        Object f;
        /* synthetic */ Object g;
        int i;

        b(cv1<? super b> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return zx3.this.c(this);
        }
    }

    private zx3() {
    }

    public static final void a(dfa.a aVar) {
        z65.h(aVar, "subscriberName");
        if (aVar != dfa.a.PERFORMANCE) {
            Map<dfa.a, a> map = b;
            if (map.containsKey(aVar)) {
                Log.d("SessionsDependencies", "Dependency " + aVar + " already added.");
                return;
            }
            z65.g(map, "dependencies");
            map.put(aVar, new a(lr6.a(true), null, 2, null));
            Log.d("SessionsDependencies", "Dependency to " + aVar + " added.");
            return;
        }
        throw new IllegalArgumentException("Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support.");
    }

    private final a b(dfa.a aVar) {
        Map<dfa.a, a> map = b;
        z65.g(map, "dependencies");
        a aVar2 = map.get(aVar);
        if (aVar2 != null) {
            z65.g(aVar2, "dependencies.getOrElse(s…load time.\"\n      )\n    }");
            return aVar2;
        }
        throw new IllegalStateException("Cannot get dependency " + aVar + ". Dependencies should be added at class load time.");
    }

    public static final void e(dfa dfaVar) {
        z65.h(dfaVar, "subscriber");
        dfa.a c = dfaVar.c();
        a b2 = a.b(c);
        if (b2.b() != null) {
            Log.d("SessionsDependencies", "Subscriber " + c + " already registered.");
            return;
        }
        b2.c(dfaVar);
        Log.d("SessionsDependencies", "Subscriber " + c + " registered.");
        jr6.a.b(b2.a(), null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5 A[RETURN] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00a1 -> B:27:0x00a2). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.cv1<? super java.util.Map<defpackage.dfa.a, ? extends defpackage.dfa>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.zx3.b
            if (r0 == 0) goto L13
            r0 = r11
            zx3$b r0 = (defpackage.zx3.b) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            zx3$b r0 = new zx3$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.g
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.i
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 != r4) goto L40
            java.lang.Object r2 = r0.f
            java.lang.Object r5 = r0.e
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.d
            jr6 r6 = (defpackage.jr6) r6
            java.lang.Object r7 = r0.c
            dfa$a r7 = (defpackage.dfa.a) r7
            java.lang.Object r8 = r0.b
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.a
            java.util.Map r9 = (java.util.Map) r9
            defpackage.vk9.b(r11)
            goto La2
        L40:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L48:
            defpackage.vk9.b(r11)
            java.util.Map<dfa$a, zx3$a> r11 = defpackage.zx3.b
            java.lang.String r2 = "dependencies"
            defpackage.z65.g(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = defpackage.d86.e(r5)
            r2.<init>(r5)
            java.util.Set r11 = r11.entrySet()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            r8 = r11
            r5 = r2
        L6b:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto Lb5
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r6 = r11.getKey()
            r7 = r6
            dfa$a r7 = (defpackage.dfa.a) r7
            java.lang.Object r11 = r11.getValue()
            zx3$a r11 = (defpackage.zx3.a) r11
            jr6 r6 = r11.a()
            r0.a = r5
            r0.b = r8
            r0.c = r7
            r0.d = r6
            r0.e = r5
            r0.f = r2
            r0.i = r4
            java.lang.Object r11 = r6.c(r3, r0)
            if (r11 != r1) goto La1
            return r1
        La1:
            r9 = r5
        La2:
            zx3 r11 = defpackage.zx3.a     // Catch: java.lang.Throwable -> Lb0
            dfa r11 = r11.d(r7)     // Catch: java.lang.Throwable -> Lb0
            r6.b(r3)
            r5.put(r2, r11)
            r5 = r9
            goto L6b
        Lb0:
            r11 = move-exception
            r6.b(r3)
            throw r11
        Lb5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zx3.c(cv1):java.lang.Object");
    }

    public final dfa d(dfa.a aVar) {
        z65.h(aVar, "subscriberName");
        dfa b2 = b(aVar).b();
        if (b2 != null) {
            return b2;
        }
        throw new IllegalStateException("Subscriber " + aVar + " has not been registered.");
    }
}
