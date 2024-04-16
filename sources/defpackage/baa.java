package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: SelectionMapDeliveryVOData.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u001a\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u001c\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¨\u0006\u000b"}, d2 = {"Lf9;", "Lm8;", DateTokenConverter.CONVERTER_KEY, "Lw7;", "addressFields", "", "f", "", "mainFieldValue", "Ldi0;", e.a, "order_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: baa  reason: default package */
/* loaded from: classes2.dex */
public final class baa {

    /* compiled from: SelectionMapDeliveryVOData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: baa$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ye0.values().length];
            try {
                iArr[ye0.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ye0.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[f9.values().length];
            try {
                iArr2[f9.p.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[f9.q.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[f9.o.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[f9.n.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[f9.k.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[f9.m.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[f9.r.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[f9.s.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[f9.l.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m8 d(f9 f9Var) {
        int i = a.$EnumSwitchMapping$0[f9Var.o().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return m8.b;
            }
            throw new NoWhenBranchMatchedException();
        }
        return m8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final di0 e(f9 f9Var, w7 w7Var, String str) {
        switch (a.$EnumSwitchMapping$1[f9Var.ordinal()]) {
            case 4:
                if (y56.h(w7Var)) {
                    return di0.c;
                }
                return di0.a;
            case 5:
                if (str.length() == 0) {
                    return di0.c;
                }
                return di0.a;
            case 6:
                if (str.length() == 0) {
                    return di0.c;
                }
                return di0.a;
            case 7:
                return di0.b;
            case 8:
                return di0.c;
            case 9:
                return di0.b;
            default:
                return di0.c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(f9 f9Var, w7 w7Var) {
        int i = a.$EnumSwitchMapping$1[f9Var.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        if (i != 4) {
            return false;
        }
        return y56.h(w7Var);
    }
}
