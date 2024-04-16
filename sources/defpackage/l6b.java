package defpackage;

import im.threads.business.transport.PushMessageAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TakeTypeAnalytics.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\nB\u0011\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Ll6b;", "Lqd;", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;)V", "b", "Ll6b$a;", "Ll6b$b;", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: l6b  reason: default package */
/* loaded from: classes4.dex */
public abstract class l6b implements qd {
    private final String a;

    /* compiled from: TakeTypeAnalytics.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll6b$a;", "Ll6b;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: l6b$a */
    /* loaded from: classes4.dex */
    public static final class a extends l6b {
        public static final a b = new a();

        private a() {
            super("checkout", null);
        }
    }

    /* compiled from: TakeTypeAnalytics.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll6b$b;", "Ll6b;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: l6b$b */
    /* loaded from: classes4.dex */
    public static final class b extends l6b {
        public static final b b = new b();

        private b() {
            super(PushMessageAttributes.ALERT, null);
        }
    }

    public /* synthetic */ l6b(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // defpackage.qd
    public String getValue() {
        return this.a;
    }

    private l6b(String str) {
        this.a = str;
    }
}
