package defpackage;

import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.q24;
import defpackage.w24;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: Owner.kt */
@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u0084\u00012\u00020\u0001:\u0002\u0015\u0011J.\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004H&J$\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H&J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H&J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H&J\u001d\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0004H&J\u0012\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u0004H&J\u001a\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&J*\u0010\u001d\u001a\u00020\u001c2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\b0\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u001aH&J\b\u0010\u001e\u001a\u00020\bH&J\u0010\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010!\u001a\u00020\b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u001aH&J\b\u0010\"\u001a\u00020\bH&J\u0010\u0010$\u001a\u00020\b2\u0006\u0010 \u001a\u00020#H&R\u0014\u0010(\u001a\u00020%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00108\u001a\u0002058&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u001a\u0010B\u001a\u00020=8gX§\u0004¢\u0006\f\u0012\u0004\b@\u0010A\u001a\u0004\b>\u0010?R\u001c\u0010G\u001a\u0004\u0018\u00010C8gX§\u0004¢\u0006\f\u0012\u0004\bF\u0010A\u001a\u0004\bD\u0010ER\u0014\u0010K\u001a\u00020H8&X¦\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8&X¦\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u001a\u0010T\u001a\u00020P8&X¦\u0004¢\u0006\f\u0012\u0004\bS\u0010A\u001a\u0004\bQ\u0010RR\u0014\u0010X\u001a\u00020U8&X¦\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0014\u0010\\\u001a\u00020Y8&X¦\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0014\u0010`\u001a\u00020]8&X¦\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u001a\u0010e\u001a\u00020a8&X§\u0004¢\u0006\f\u0012\u0004\bd\u0010A\u001a\u0004\bb\u0010cR\u0014\u0010i\u001a\u00020f8&X¦\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0014\u0010m\u001a\u00020j8&X¦\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR$\u0010s\u001a\u00020\u00042\u0006\u0010n\u001a\u00020\u00048&@gX¦\u000e¢\u0006\f\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\u0014\u0010w\u001a\u00020t8&X¦\u0004¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0014\u0010{\u001a\u00020x8&X¦\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0014\u0010\u007f\u001a\u00020|8&X¦\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~R\u0018\u0010\u0083\u0001\u001a\u00030\u0080\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0085\u0001À\u0006\u0001"}, d2 = {"Lum7;", "", "Len5;", "layoutNode", "", "affectsLookahead", "forceRequest", "scheduleMeasureAndLayout", "", "q", "k", "f", "node", c.a, "j", "Ls67;", "localPosition", "b", "(J)J", "requestFocus", "sendPointerUpdate", "a", "g", "Lkotlin/Function1;", "Lqn0;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "Lsm7;", Image.TYPE_MEDIUM, "p", "i", "listener", "n", "o", "Lum7$b;", e.a, "Lgn5;", "getSharedDrawScope", "()Lgn5;", "sharedDrawScope", "Lsm4;", "getHapticFeedBack", "()Lsm4;", "hapticFeedBack", "Lu35;", "getInputModeManager", "()Lu35;", "inputModeManager", "Lr91;", "getClipboardManager", "()Lr91;", "clipboardManager", "Lv2;", "getAccessibilityManager", "()Lv2;", "accessibilityManager", "Lucb;", "getTextToolbar", "()Lucb;", "textToolbar", "Ll40;", "getAutofillTree", "()Ll40;", "getAutofillTree$annotations", "()V", "autofillTree", "Lo30;", "getAutofill", "()Lo30;", "getAutofill$annotations", "autofill", "La03;", "getDensity", "()La03;", "density", "Lqbb;", "getTextInputService", "()Lqbb;", "textInputService", "Loc8;", "getPlatformTextInputPluginRegistry", "()Loc8;", "getPlatformTextInputPluginRegistry$annotations", "platformTextInputPluginRegistry", "Ltd8;", "getPointerIconService", "()Ltd8;", "pointerIconService", "Lf24;", "getFocusOwner", "()Lf24;", "focusOwner", "La5c;", "getWindowInfo", "()La5c;", "windowInfo", "Lq24$a;", "getFontLoader", "()Lq24$a;", "getFontLoader$annotations", "fontLoader", "Lw24$b;", "getFontFamilyResolver", "()Lw24$b;", "fontFamilyResolver", "Lqm5;", "getLayoutDirection", "()Lqm5;", "layoutDirection", "<set-?>", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "showLayoutBounds", "Lxyb;", "getViewConfiguration", "()Lxyb;", "viewConfiguration", "Lwm7;", "getSnapshotObserver", "()Lwm7;", "snapshotObserver", "Lxm6;", "getModifierLocalManager", "()Lxm6;", "modifierLocalManager", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "P", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: um7  reason: default package */
/* loaded from: classes.dex */
public interface um7 {
    public static final a P = a.a;

    /* compiled from: Owner.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lum7$a;", "", "", "b", "Z", "a", "()Z", "setEnableExtraAssertions", "(Z)V", "enableExtraAssertions", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: um7$a */
    /* loaded from: classes.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();
        private static boolean b;

        private a() {
        }

        public final boolean a() {
            return b;
        }
    }

    /* compiled from: Owner.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lum7$b;", "", "", "g", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: um7$b */
    /* loaded from: classes.dex */
    public interface b {
        void g();
    }

    void a(boolean z);

    long b(long j);

    void c(en5 en5Var);

    void e(b bVar);

    void f(en5 en5Var);

    void g(en5 en5Var, boolean z);

    v2 getAccessibilityManager();

    o30 getAutofill();

    l40 getAutofillTree();

    r91 getClipboardManager();

    CoroutineContext getCoroutineContext();

    a03 getDensity();

    f24 getFocusOwner();

    w24.b getFontFamilyResolver();

    q24.a getFontLoader();

    sm4 getHapticFeedBack();

    u35 getInputModeManager();

    qm5 getLayoutDirection();

    xm6 getModifierLocalManager();

    oc8 getPlatformTextInputPluginRegistry();

    td8 getPointerIconService();

    gn5 getSharedDrawScope();

    boolean getShowLayoutBounds();

    wm7 getSnapshotObserver();

    qbb getTextInputService();

    ucb getTextToolbar();

    xyb getViewConfiguration();

    a5c getWindowInfo();

    void i(en5 en5Var);

    void j(en5 en5Var);

    void k(en5 en5Var, boolean z, boolean z2);

    sm7 m(Function1<? super qn0, Unit> function1, Function0<Unit> function0);

    void n(Function0<Unit> function0);

    void o();

    void p();

    void q(en5 en5Var, boolean z, boolean z2, boolean z3);

    boolean requestFocus();

    void setShowLayoutBounds(boolean z);
}
