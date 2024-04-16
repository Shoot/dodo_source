package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: EntityInformation.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcj3;", "", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, "Lcj3$a;", "Lcj3$c;", "persistence_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: cj3  reason: default package */
/* loaded from: classes2.dex */
public abstract class cj3 {
    public static final b a = new b(null);

    /* compiled from: EntityInformation.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcj3$a;", "Lcj3;", "", "b", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "className", "persistence_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: cj3$a */
    /* loaded from: classes2.dex */
    public static final class a extends cj3 {
        private final String b;

        public final String a() {
            return this.b;
        }
    }

    /* compiled from: EntityInformation.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¨\u0006\b"}, d2 = {"Lcj3$b;", "", "Lod5;", "kClass", "Lcj3;", "a", "<init>", "()V", "persistence_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: cj3$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final cj3 a(od5<?> od5Var) {
            z65.h(od5Var, "kClass");
            return new c(od5Var);
        }
    }

    /* compiled from: EntityInformation.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcj3$c;", "Lcj3;", "Lod5;", "b", "Lod5;", "a", "()Lod5;", "kClass", "<init>", "(Lod5;)V", "persistence_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: cj3$c */
    /* loaded from: classes2.dex */
    public static final class c extends cj3 {
        private final od5<?> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(od5<?> od5Var) {
            super(null);
            z65.h(od5Var, "kClass");
            this.b = od5Var;
        }

        public final od5<?> a() {
            return this.b;
        }
    }

    private cj3() {
    }

    public /* synthetic */ cj3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
