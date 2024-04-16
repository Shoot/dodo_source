package cloud.mindbox.mobile_sdk.models.operation;

import ch.qos.logback.core.CoreConstants;
import cloud.mindbox.mobile_sdk.models.operation.adapters.CustomerFieldsAdapter;
import com.google.gson.Gson;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CustomFields.kt */
@y95(CustomerFieldsAdapter.class)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fB9\b\u0016\u0012.\u0010\u0012\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00110\u0010\"\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013B9\b\u0016\u0012.\u0010\u0012\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00140\u0010\"\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014¢\u0006\u0004\b\u000e\u0010\u0015J#\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0016R'\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcloud/mindbox/mobile_sdk/models/operation/CustomFields;", "", "T", "Ljava/lang/Class;", "classOfT", "convertTo", "(Ljava/lang/Class;)Ljava/lang/Object;", "", "toString", "", "fields", "Ljava/util/Map;", "getFields", "()Ljava/util/Map;", "<init>", "(Ljava/util/Map;)V", "", "Lkotlin/Pair;", "pairs", "([Lkotlin/Pair;)V", "Lwp7;", "([Lwp7;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CustomFields {
    private final Map<String, Object> fields;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: CustomFields.kt */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    static final class a<T> extends ej5 implements Function0<T> {
        final /* synthetic */ Class<T> $classOfT;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class<T> cls) {
            super(0);
            this.$classOfT = cls;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            Gson gson = new Gson();
            return (T) gson.k(gson.t(CustomFields.this.getFields()), this.$classOfT);
        }
    }

    public CustomFields() {
        this(null, 1, null);
    }

    public final <T> T convertTo(Class<T> cls) {
        z65.h(cls, "classOfT");
        return (T) yx5.a.b(null, new a(cls));
    }

    public final Map<String, Object> getFields() {
        return this.fields;
    }

    public String toString() {
        return "CustomFields(fields=" + this.fields + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public CustomFields(Map<String, ? extends Object> map) {
        this.fields = map;
    }

    public /* synthetic */ CustomFields(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CustomFields(kotlin.Pair<java.lang.String, ? extends java.lang.Object>... r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pairs"
            defpackage.z65.h(r2, r0)
            java.util.Map r2 = defpackage.d86.v(r2)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cloud.mindbox.mobile_sdk.models.operation.CustomFields.<init>(kotlin.Pair[]):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CustomFields(defpackage.wp7<java.lang.String, java.lang.Object>... r8) {
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
        throw new UnsupportedOperationException("Method not decompiled: cloud.mindbox.mobile_sdk.models.operation.CustomFields.<init>(wp7[]):void");
    }
}
