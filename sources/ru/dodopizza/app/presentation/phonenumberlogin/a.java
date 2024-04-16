package ru.dodopizza.app.presentation.phonenumberlogin;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.dodopizza.app.presentation.phonenumberlogin.e;
/* compiled from: AnalyticsSenderMapper.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lru/dodopizza/app/presentation/phonenumberlogin/a;", "", "Lru/dodopizza/app/presentation/phonenumberlogin/e$a;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lqd;", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: AnalyticsSenderMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.dodopizza.app.presentation.phonenumberlogin.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C0580a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[e.a.values().length];
            try {
                iArr[e.a.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.a.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.a.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e.a.e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[e.a.f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[e.a.g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final qd a(e.a aVar) {
        z65.h(aVar, CoreConstants.CONTEXT_SCOPE_VALUE);
        switch (C0580a.$EnumSwitchMapping$0[aVar.ordinal()]) {
            case 1:
                return ck1.q;
            case 2:
                return ck1.o;
            case 3:
                return ck1.u;
            case 4:
                return ck1.I;
            case 5:
                return ck1.d;
            case 6:
                return ck1.B;
            case 7:
                return ck1.n;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
