package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: IntervalWaiter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lle8;", "Lw65;", "", "a", "<init>", "()V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: le8  reason: default package */
/* loaded from: classes2.dex */
public final class le8 implements w65 {
    public static final a a = new a(null);

    /* compiled from: IntervalWaiter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lle8$a;", "", "", "POLLING_PAYMENT_INTERVAL", "J", "<init>", "()V", "payment_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: le8$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.w65
    public void a() {
        try {
            Thread.sleep(1500L);
        } catch (InterruptedException unused) {
        }
    }
}
