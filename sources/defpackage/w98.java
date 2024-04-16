package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PizzeriaSuggestionsResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lw98;", "", "<init>", "()V", "a", "b", "Lw98$a;", "Lw98$b;", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: w98  reason: default package */
/* loaded from: classes2.dex */
public abstract class w98 {

    /* compiled from: PizzeriaSuggestionsResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw98$a;", "Lw98;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: w98$a */
    /* loaded from: classes2.dex */
    public static final class a extends w98 {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* compiled from: PizzeriaSuggestionsResult.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0003\u0010\u000f¨\u0006\u0013"}, d2 = {"Lw98$b;", "Lw98;", "Lb68;", "a", "Lb68;", "b", "()Lb68;", "pizzeria", "", "I", c.a, "()I", "position", "", "Ljava/lang/String;", "()Ljava/lang/String;", "address", "<init>", "(Lb68;ILjava/lang/String;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: w98$b */
    /* loaded from: classes2.dex */
    public static final class b extends w98 {
        private final b68 a;
        private final int b;
        private final String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b68 b68Var, int i, String str) {
            super(null);
            z65.h(b68Var, "pizzeria");
            z65.h(str, "address");
            this.a = b68Var;
            this.b = i;
            this.c = str;
        }

        public final String a() {
            return this.c;
        }

        public final b68 b() {
            return this.a;
        }

        public final int c() {
            return this.b;
        }
    }

    private w98() {
    }

    public /* synthetic */ w98(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
