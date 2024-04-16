package defpackage;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SubmitResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Le1b;", "", "<init>", "()V", "a", "b", "Le1b$a;", "Le1b$b;", "formbuilder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: e1b  reason: default package */
/* loaded from: classes.dex */
public abstract class e1b {

    /* compiled from: SubmitResult.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u000e"}, d2 = {"Le1b$a;", "Le1b;", "Lm54;", "a", "Lm54;", "b", "()Lm54;", "field", "", "I", "()I", "errorCode", "<init>", "(Lm54;I)V", "formbuilder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: e1b$a */
    /* loaded from: classes.dex */
    public static final class a extends e1b {
        private final m54 a;
        private final int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m54 m54Var, int i) {
            super(null);
            z65.h(m54Var, "field");
            this.a = m54Var;
            this.b = i;
        }

        public final int a() {
            return this.b;
        }

        public final m54 b() {
            return this.a;
        }
    }

    /* compiled from: SubmitResult.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\t\u0010\nR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Le1b$b;", "Le1b;", "", "", "Lm54;", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "data", "<init>", "(Ljava/util/Map;)V", "formbuilder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: e1b$b */
    /* loaded from: classes.dex */
    public static final class b extends e1b {
        private final Map<String, m54> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Map<String, ? extends m54> map) {
            super(null);
            z65.h(map, "data");
            this.a = map;
        }

        public final Map<String, m54> a() {
            return this.a;
        }
    }

    private e1b() {
    }

    public /* synthetic */ e1b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
