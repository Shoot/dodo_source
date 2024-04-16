package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
/* compiled from: CoroutineStart.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014JY\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\u0006\u0010\b\u001a\u00028\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lux1;", "", "R", "T", "Lkotlin/Function2;", "Lcv1;", "", "block", "receiver", "completion", "", "i", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lcv1;)V", "", "k", "()Z", "isLazy$annotations", "()V", "isLazy", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, DateTokenConverter.CONVERTER_KEY, "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: ux1  reason: default package */
/* loaded from: classes3.dex */
public enum ux1 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* compiled from: CoroutineStart.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: ux1$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ux1.values().length];
            iArr[ux1.DEFAULT.ordinal()] = 1;
            iArr[ux1.ATOMIC.ordinal()] = 2;
            iArr[ux1.UNDISPATCHED.ordinal()] = 3;
            iArr[ux1.LAZY.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final <R, T> void i(Function2<? super R, ? super cv1<? super T>, ? extends Object> function2, R r, cv1<? super T> cv1Var) {
        int i = a.$EnumSwitchMapping$0[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
                kqb.a(function2, r, cv1Var);
                return;
            }
            fv1.b(function2, r, cv1Var);
            return;
        }
        jn0.e(function2, r, cv1Var, null, 4, null);
    }

    public final boolean k() {
        if (this == LAZY) {
            return true;
        }
        return false;
    }
}
