package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: WindowInfo.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R$\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR3\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\f8W@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u0004\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Lb5c;", "La5c;", "Ler6;", "", "a", "Ler6;", "_isWindowFocused", "value", "isWindowFocused", "()Z", "b", "(Z)V", "Lje8;", "getKeyboardModifiers-k7X9c1A", "()I", "(I)V", "getKeyboardModifiers-k7X9c1A$annotations", "()V", "keyboardModifiers", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: b5c  reason: default package */
/* loaded from: classes.dex */
public final class b5c implements a5c {
    public static final a b = new a(null);
    private static final er6<je8> c;
    private final er6<Boolean> a;

    /* compiled from: WindowInfo.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb5c$a;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: b5c$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        er6<je8> c2;
        c2 = tpa.c(je8.a(od8.a()), null, 2, null);
        c = c2;
    }

    public b5c() {
        er6<Boolean> c2;
        c2 = tpa.c(Boolean.FALSE, null, 2, null);
        this.a = c2;
    }

    public void a(int i) {
        c.setValue(je8.a(i));
    }

    public void b(boolean z) {
        this.a.setValue(Boolean.valueOf(z));
    }
}
