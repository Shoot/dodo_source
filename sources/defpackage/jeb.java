package defpackage;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: ThreadsLibAppMarkerCreator.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\b¨\u0006\f"}, d2 = {"Ljeb;", "", "Lyt6;", "", "b", "topic", "a", "Lmh0;", "Lmh0;", "buildInfo", "<init>", "(Lmh0;)V", "chat_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: jeb  reason: default package */
/* loaded from: classes.dex */
public final class jeb {
    private final mh0 a;

    /* compiled from: ThreadsLibAppMarkerCreator.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jeb$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[yt6.values().length];
            try {
                iArr[yt6.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public jeb(mh0 mh0Var) {
        z65.h(mh0Var, "buildInfo");
        this.a = mh0Var;
    }

    private final String b(yt6 yt6Var) {
        int i;
        if (yt6Var == null) {
            i = -1;
        } else {
            i = a.$EnumSwitchMapping$0[yt6Var.ordinal()];
        }
        if (i != -1) {
            if (i == 1) {
                return "+rating";
            }
            throw new NoWhenBranchMatchedException();
        }
        return "";
    }

    public final String a(yt6 yt6Var) {
        String b = this.a.b();
        String b2 = b(yt6Var);
        return b + b2;
    }
}
