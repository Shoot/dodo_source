package cloud.mindbox.mobile_sdk.models.operation;

import ch.qos.logback.core.CoreConstants;
import cloud.mindbox.mobile_sdk.models.operation.adapters.IdsAdapter;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Ids.kt */
@y95(IdsAdapter.class)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004¢\u0006\u0004\b\t\u0010\nB9\b\u0016\u0012.\u0010\r\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f0\u000b\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f¢\u0006\u0004\b\t\u0010\u000eB9\b\u0016\u0012.\u0010\r\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000f0\u000b\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000f¢\u0006\u0004\b\t\u0010\u0010B'\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004¢\u0006\u0004\b\t\u0010\u0013BA\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012.\u0010\r\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f0\u000b\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f¢\u0006\u0004\b\t\u0010\u0014BA\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012.\u0010\r\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000f0\u000b\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000f¢\u0006\u0004\b\t\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, d2 = {"Lcloud/mindbox/mobile_sdk/models/operation/Ids;", "", "", "toString", "", "ids", "Ljava/util/Map;", "getIds", "()Ljava/util/Map;", "<init>", "(Ljava/util/Map;)V", "", "Lkotlin/Pair;", "pairs", "([Lkotlin/Pair;)V", "Lwp7;", "([Lwp7;)V", "", Ids.MINDBOX_ID_KEY, "(ILjava/util/Map;)V", "(I[Lkotlin/Pair;)V", "(I[Lwp7;)V", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class Ids {
    public static final a Companion = new a(null);
    private static final String MINDBOX_ID_KEY = "mindboxId";
    private final Map<String, String> ids;

    /* compiled from: Ids.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcloud/mindbox/mobile_sdk/models/operation/Ids$a;", "", "", "MINDBOX_ID_KEY", "Ljava/lang/String;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Ids(Map<String, String> map) {
        z65.h(map, "ids");
        this.ids = map;
    }

    public final Map<String, String> getIds() {
        return this.ids;
    }

    public String toString() {
        return "Ids(ids=" + this.ids + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Ids(Pair<String, String>... pairArr) {
        this(d86.v(pairArr));
        z65.h(pairArr, "pairs");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Ids(int r2, java.util.Map<java.lang.String, java.lang.String> r3) {
        /*
            r1 = this;
            java.lang.String r0 = "ids"
            defpackage.z65.h(r3, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r3)
            java.lang.String r3 = "mindboxId"
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.put(r3, r2)
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cloud.mindbox.mobile_sdk.models.operation.Ids.<init>(int, java.util.Map):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Ids(int r2, kotlin.Pair<java.lang.String, java.lang.String>... r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pairs"
            defpackage.z65.h(r3, r0)
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map r3 = defpackage.d86.v(r3)
            r0.<init>(r3)
            java.lang.String r3 = "mindboxId"
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.put(r3, r2)
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cloud.mindbox.mobile_sdk.models.operation.Ids.<init>(int, kotlin.Pair[]):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Ids(defpackage.wp7<java.lang.String, java.lang.String>... r8) {
        /*
            r7 = this;
            java.lang.String r0 = "pairs"
            defpackage.z65.h(r8, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r8.length
            r2 = 0
            r3 = 0
        Ld:
            if (r3 >= r1) goto L2d
            r4 = r8[r3]
            F r5 = r4.a
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L24
            java.lang.String r6 = "first"
            defpackage.z65.g(r5, r6)
            kotlin.Pair r6 = new kotlin.Pair
            S r4 = r4.b
            r6.<init>(r5, r4)
            goto L25
        L24:
            r6 = 0
        L25:
            if (r6 == 0) goto L2a
            r0.add(r6)
        L2a:
            int r3 = r3 + 1
            goto Ld
        L2d:
            kotlin.Pair[] r8 = new kotlin.Pair[r2]
            java.lang.Object[] r8 = r0.toArray(r8)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            defpackage.z65.f(r8, r0)
            kotlin.Pair[] r8 = (kotlin.Pair[]) r8
            int r0 = r8.length
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r0)
            kotlin.Pair[] r8 = (kotlin.Pair[]) r8
            r7.<init>(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cloud.mindbox.mobile_sdk.models.operation.Ids.<init>(wp7[]):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Ids(int r8, defpackage.wp7<java.lang.String, java.lang.String>... r9) {
        /*
            r7 = this;
            java.lang.String r0 = "pairs"
            defpackage.z65.h(r9, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r9.length
            r2 = 0
            r3 = 0
        Ld:
            if (r3 >= r1) goto L2d
            r4 = r9[r3]
            F r5 = r4.a
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L24
            java.lang.String r6 = "first"
            defpackage.z65.g(r5, r6)
            kotlin.Pair r6 = new kotlin.Pair
            S r4 = r4.b
            r6.<init>(r5, r4)
            goto L25
        L24:
            r6 = 0
        L25:
            if (r6 == 0) goto L2a
            r0.add(r6)
        L2a:
            int r3 = r3 + 1
            goto Ld
        L2d:
            kotlin.Pair[] r9 = new kotlin.Pair[r2]
            java.lang.Object[] r9 = r0.toArray(r9)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            defpackage.z65.f(r9, r0)
            kotlin.Pair[] r9 = (kotlin.Pair[]) r9
            int r0 = r9.length
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r0)
            kotlin.Pair[] r9 = (kotlin.Pair[]) r9
            r7.<init>(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cloud.mindbox.mobile_sdk.models.operation.Ids.<init>(int, wp7[]):void");
    }
}
