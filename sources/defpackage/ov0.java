package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ChangeWorkflowResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lov0;", "", "<init>", "()V", "a", "b", "Lov0$a;", "Lov0$b;", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ov0  reason: default package */
/* loaded from: classes4.dex */
public abstract class ov0 {

    /* compiled from: ChangeWorkflowResult.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lov0$a;", "Lov0;", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "Lov0$a$a;", "Lov0$a$b;", "Lov0$a$c;", "Lov0$a$d;", "Lov0$a$e;", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ov0$a */
    /* loaded from: classes4.dex */
    public static abstract class a extends ov0 {

        /* compiled from: ChangeWorkflowResult.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lov0$a$a;", "Lov0$a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: ov0$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0471a extends a {
            public static final C0471a a = new C0471a();

            private C0471a() {
                super(null);
            }
        }

        /* compiled from: ChangeWorkflowResult.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lov0$a$b;", "Lov0$a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: ov0$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends a {
            public static final b a = new b();

            private b() {
                super(null);
            }
        }

        /* compiled from: ChangeWorkflowResult.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lov0$a$c;", "Lov0$a;", "", "Lnr0;", "a", "Ljava/util/Collection;", "getStoppedCartItems", "()Ljava/util/Collection;", "stoppedCartItems", "<init>", "(Ljava/util/Collection;)V", "base_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: ov0$a$c */
        /* loaded from: classes4.dex */
        public static final class c extends a {
            private final Collection<nr0> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Collection<nr0> collection) {
                super(null);
                z65.h(collection, "stoppedCartItems");
                this.a = collection;
            }
        }

        /* compiled from: ChangeWorkflowResult.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lov0$a$d;", "Lov0$a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: ov0$a$d */
        /* loaded from: classes4.dex */
        public static final class d extends a {
            public static final d a = new d();

            private d() {
                super(null);
            }
        }

        /* compiled from: ChangeWorkflowResult.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\n"}, d2 = {"Lov0$a$e;", "Lov0$a;", "", "Lc8c;", "a", "Ljava/util/Collection;", "()Ljava/util/Collection;", "errors", "<init>", "(Ljava/util/Collection;)V", "base_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: ov0$a$e */
        /* loaded from: classes4.dex */
        public static final class e extends a {
            private final Collection<c8c> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public e(Collection<? extends c8c> collection) {
                super(null);
                z65.h(collection, "errors");
                this.a = collection;
            }

            public final Collection<c8c> a() {
                return this.a;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
            super(null);
        }
    }

    /* compiled from: ChangeWorkflowResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lov0$b;", "Lov0;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ov0$b */
    /* loaded from: classes4.dex */
    public static final class b extends ov0 {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    private ov0() {
    }

    public /* synthetic */ ov0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
