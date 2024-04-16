package androidx.compose.foundation;

import com.inappstory.sdk.stories.api.models.Image;
import defpackage.sm6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BN\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 JW\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\f\u0010\u0011\u001a\u00020\n*\u00020\u0010H\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R!\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/foundation/h;", "Lyaa;", "Lsm6$c;", "", "enabled", "", "onClickLabel", "Lgn9;", "role", "Lkotlin/Function0;", "", "onClick", "onLongClickLabel", "onLongClick", "h1", "(ZLjava/lang/String;Lgn9;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Ljba;", "U", "n", "Z", "o", "Ljava/lang/String;", "p", "Lgn9;", "q", "Lkotlin/jvm/functions/Function0;", "r", Image.TYPE_SMALL, "y0", "()Z", "shouldMergeDescendantSemantics", "<init>", "(ZLjava/lang/String;Lgn9;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class h extends sm6.c implements yaa {
    private boolean n;
    private String o;
    private gn9 p;
    private Function0<Unit> q;
    private String r;
    private Function0<Unit> s;

    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<Boolean> {
        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            h.this.q.invoke();
            return Boolean.TRUE;
        }
    }

    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<Boolean> {
        b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            Function0 function0 = h.this.s;
            if (function0 != null) {
                function0.invoke();
            }
            return Boolean.TRUE;
        }
    }

    public /* synthetic */ h(boolean z, String str, gn9 gn9Var, Function0 function0, String str2, Function0 function02, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, gn9Var, function0, str2, function02);
    }

    @Override // defpackage.yaa
    public void U(jba jbaVar) {
        z65.h(jbaVar, "<this>");
        gn9 gn9Var = this.p;
        if (gn9Var != null) {
            z65.e(gn9Var);
            hba.j(jbaVar, gn9Var.n());
        }
        hba.d(jbaVar, this.o, new a());
        if (this.s != null) {
            hba.e(jbaVar, this.r, new b());
        }
        if (!this.n) {
            hba.a(jbaVar);
        }
    }

    public final void h1(boolean z, String str, gn9 gn9Var, Function0<Unit> function0, String str2, Function0<Unit> function02) {
        z65.h(function0, "onClick");
        this.n = z;
        this.o = str;
        this.p = gn9Var;
        this.q = function0;
        this.r = str2;
        this.s = function02;
    }

    @Override // defpackage.yaa
    public /* synthetic */ boolean x() {
        return xaa.a(this);
    }

    @Override // defpackage.yaa
    public boolean y0() {
        return true;
    }

    private h(boolean z, String str, gn9 gn9Var, Function0<Unit> function0, String str2, Function0<Unit> function02) {
        z65.h(function0, "onClick");
        this.n = z;
        this.o = str;
        this.p = gn9Var;
        this.q = function0;
        this.r = str2;
        this.s = function02;
    }
}
