package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.chat.feature.chat.NativeChatFeatureDependencies;
import com.dodopizza.chat.feature.chat.presentation.NativeChatPresenter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ft6;
import im.threads.ui.fragments.ChatFragment;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.MvpPresenter;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: NativeChatFragment.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0002@AB\t\b\u0000¢\u0006\u0004\b=\u0010>J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\b\u0010\u0011\u001a\u00020\u0007H\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\b\u0010\u0013\u001a\u00020\u0007H\u0016J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0016R\"\u0010\u001e\u001a\u00020\u00178\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010'\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001b\u00105\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001b\u00109\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b7\u00108R\u001b\u0010<\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00102\u001a\u0004\b;\u00108¨\u0006B"}, d2 = {"Lmt6;", "Lf70;", "Lfu6;", "Lim/threads/ui/fragments/ChatFragment;", "nh", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "Lvt6;", "stateToSave", "w6", "outState", "onSaveInstanceState", "R4", "f5", "Ug", "Lqd;", "sender", "X", "Lh37;", com.huawei.hms.opendevice.c.a, "Lh37;", "ph", "()Lh37;", "setNotificationsPermission$chat_release", "(Lh37;)V", "notificationsPermission", "Las8;", "Lcom/dodopizza/chat/feature/chat/presentation/NativeChatPresenter;", DateTokenConverter.CONVERTER_KEY, "Las8;", "rh", "()Las8;", "setPresenterProvider$chat_release", "(Las8;)V", "presenterProvider", e.a, "Lmoxy/ktx/MoxyKtxDelegate;", "qh", "()Lcom/dodopizza/chat/feature/chat/presentation/NativeChatPresenter;", "presenter", "f", "Lvt6;", "state", "Landroid/view/ViewGroup;", "g", "Lk79;", "th", "()Landroid/view/ViewGroup;", "viewSwitcher", Image.TYPE_HIGH, "oh", "()Landroid/view/View;", "chatContainer", "i", "sh", "progressBar", "<init>", "()V", "j", "a", "b", "chat_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: mt6  reason: default package */
/* loaded from: classes.dex */
public final class mt6 extends f70 implements fu6 {
    public h37 c;
    public as8<NativeChatPresenter> d;
    private final MoxyKtxDelegate e;
    private vt6 f;
    private final k79 g;
    private final k79 h;
    private final k79 i;
    static final /* synthetic */ je5<Object>[] k = {bc9.f(new ar8(mt6.class, "presenter", "getPresenter()Lcom/dodopizza/chat/feature/chat/presentation/NativeChatPresenter;", 0)), bc9.f(new ar8(mt6.class, "viewSwitcher", "getViewSwitcher()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(mt6.class, "chatContainer", "getChatContainer()Landroid/view/View;", 0)), bc9.f(new ar8(mt6.class, "progressBar", "getProgressBar()Landroid/view/View;", 0))};
    public static final b j = new b(null);

    /* compiled from: NativeChatFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lmt6$a;", "Li77;", "", "b", "<init>", "(Lmt6;)V", "chat_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: mt6$a */
    /* loaded from: classes.dex */
    private final class a extends i77 {
        public a() {
            super(true);
        }

        @Override // defpackage.i77
        public void b() {
            mt6.this.qh().onBackPressed();
        }
    }

    /* compiled from: NativeChatFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lmt6$b;", "", "Lgt6;", "data", "Lmt6;", "a", "", "EXTRA_KEY_DATA", "Ljava/lang/String;", "STATE_KEY", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: mt6$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final mt6 a(gt6 gt6Var) {
            z65.h(gt6Var, "data");
            return (mt6) y64.d(new mt6(), bi0.c(bi0.d("data", gt6Var)));
        }
    }

    /* compiled from: NativeChatFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/chat/feature/chat/presentation/NativeChatPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/chat/feature/chat/presentation/NativeChatPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: mt6$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function0<NativeChatPresenter> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final NativeChatPresenter invoke() {
            return mt6.this.rh().get();
        }
    }

    /* compiled from: NativeChatFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.chat.feature.chat.presentation.NativeChatFragment$requestNotificationPermission$1", f = "NativeChatFragment.kt", l = {SyslogConstants.LOG_LOCAL2}, m = "invokeSuspend")
    /* renamed from: mt6$d */
    /* loaded from: classes.dex */
    static final class d extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ qd c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(qd qdVar, cv1<? super d> cv1Var) {
            super(2, cv1Var);
            this.c = qdVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new d(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((d) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                h37 ph = mt6.this.ph();
                androidx.fragment.app.d requireActivity = mt6.this.requireActivity();
                z65.g(requireActivity, "requireActivity(...)");
                qd qdVar = this.c;
                NativeChatPresenter qh = mt6.this.qh();
                this.a = 1;
                if (ph.h(requireActivity, qdVar, qh, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    public mt6() {
        super(uz8.fragment_native_chat);
        c cVar = new c();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.e = new MoxyKtxDelegate(mvpDelegate, NativeChatPresenter.class.getName() + ".presenter", cVar);
        this.g = kb0.e(this, xx8.native_chat_switcher);
        this.h = kb0.e(this, xx8.native_chat_container);
        this.i = kb0.e(this, xx8.native_chat_progress);
    }

    private final ChatFragment nh() {
        Object b0;
        List<Fragment> y0 = getChildFragmentManager().y0();
        z65.g(y0, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : y0) {
            if (obj instanceof ChatFragment) {
                arrayList.add(obj);
            }
        }
        b0 = sc1.b0(arrayList);
        return (ChatFragment) b0;
    }

    private final View oh() {
        return (View) this.h.a(this, k[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NativeChatPresenter qh() {
        MvpPresenter value = this.e.getValue(this, k[0]);
        z65.g(value, "getValue(...)");
        return (NativeChatPresenter) value;
    }

    private final View sh() {
        return (View) this.i.a(this, k[3]);
    }

    private final ViewGroup th() {
        return (ViewGroup) this.g.a(this, k[1]);
    }

    @Override // defpackage.fu6
    public void R4() {
        n1c.e(th(), oh());
        if (nh() != null) {
            return;
        }
        getChildFragmentManager().p().d(xx8.native_chat_container, ChatFragment.class, null).k();
    }

    @Override // defpackage.fu6
    public void Ug() {
        ChatFragment nh = nh();
        if (nh != null && !nh.onBackPressed()) {
            qh().A();
        } else {
            qh().B();
        }
    }

    @Override // defpackage.fu6
    public void X(qd qdVar) {
        z65.h(qdVar, "sender");
        op5 viewLifecycleOwner = getViewLifecycleOwner();
        z65.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        sh0.d(pp5.a(viewLifecycleOwner), null, null, new d(qdVar, null), 3, null);
    }

    @Override // defpackage.fu6
    public void f5() {
        n1c.e(th(), sh());
        ChatFragment nh = nh();
        if (nh == null) {
            return;
        }
        getChildFragmentManager().p().t(nh).n();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Serializable serializable;
        vt6 vt6Var;
        Object obj;
        if (bundle != null) {
            serializable = bundle.getSerializable("native_chat_state");
        } else {
            serializable = null;
        }
        if (serializable instanceof vt6) {
            vt6Var = (vt6) serializable;
        } else {
            vt6Var = null;
        }
        this.f = vt6Var;
        ft6.b a2 = ft6.a.a();
        Bundle arguments = getArguments();
        if (arguments == null || (obj = arguments.get("data")) == null) {
            obj = null;
        }
        if (obj != null && !(obj instanceof gt6)) {
            throw new ClassCastException("Property data has different class type");
        } else if (obj != null) {
            a2.a((NativeChatFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(NativeChatFeatureDependencies.class)), this.f, (gt6) obj).a(this);
            super.onCreate(null);
        } else {
            throw new IllegalArgumentException("Argument with key = data not found in bundle");
        }
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        z65.h(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("native_chat_state", this.f);
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        op5 viewLifecycleOwner = getViewLifecycleOwner();
        z65.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.b(viewLifecycleOwner, new a());
    }

    public final h37 ph() {
        h37 h37Var = this.c;
        if (h37Var != null) {
            return h37Var;
        }
        z65.z("notificationsPermission");
        return null;
    }

    public final as8<NativeChatPresenter> rh() {
        as8<NativeChatPresenter> as8Var = this.d;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // defpackage.fu6
    public void w6(vt6 vt6Var) {
        z65.h(vt6Var, "stateToSave");
        this.f = vt6Var;
    }
}
