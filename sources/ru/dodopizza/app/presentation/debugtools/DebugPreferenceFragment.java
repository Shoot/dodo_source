package ru.dodopizza.app.presentation.debugtools;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.mn2;
import defpackage.uj3;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.presenter.InjectPresenter;
import moxy.presenter.ProvidePresenter;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.AppComponent;
import ru.dodopizza.app.presentation.debugtools.DebugPreferenceFragment;
import ru.dodopizza.app.presentation.debugtools.a;
/* compiled from: DebugPreferenceFragment.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 U2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001VB\u0007¢\u0006\u0004\bS\u0010TJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0007J\u001c\u0010\u0015\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0013H\u0016J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J+\u0010!\u001a\u00020\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00130\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00130\u001eH\u0016¢\u0006\u0004\b!\u0010\"J+\u0010#\u001a\u00020\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00130\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00130\u001eH\u0016¢\u0006\u0004\b#\u0010\"J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0013H\u0016J\b\u0010&\u001a\u00020\u0004H\u0016J\b\u0010'\u001a\u00020\u0004H\u0016J\b\u0010(\u001a\u00020\u0004H\u0016R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u00107R\u0016\u0010<\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u00107R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010B\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u00107R\u0016\u0010D\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u00107R\u0016\u0010F\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bE\u00107R\u001a\u0010L\u001a\u00020G8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\"\u0010M\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010R¨\u0006W"}, d2 = {"Lru/dodopizza/app/presentation/debugtools/DebugPreferenceFragment;", "Lnr6;", "Lno2;", "Llm1;", "", "Xh", "Mh", "ei", "hi", "Th", "Rh", "Ph", "ci", "Vh", "ai", "Lru/dodopizza/app/presentation/debugtools/DebugPreferencePresenter;", "Lh", "Landroid/os/Bundle;", "savedInstanceState", "", "rootKey", "oh", "Landroid/view/View;", "view", "onViewCreated", RemoteMessageConst.Notification.URL, "Zd", "", "isChecked", "oc", "", "environmentsName", "environmentsUrl", "N6", "([Ljava/lang/String;[Ljava/lang/String;)V", "I4", "token", "K1", "y", "zg", "Bc", "Landroidx/preference/ListPreference;", Image.TYPE_MEDIUM, "Landroidx/preference/ListPreference;", "environmentsList", "Landroidx/preference/EditTextPreference;", "n", "Landroidx/preference/EditTextPreference;", "addEnvironment", "Landroidx/preference/MultiSelectListPreference;", "o", "Landroidx/preference/MultiSelectListPreference;", "removeEnvironments", "Landroidx/preference/Preference;", "p", "Landroidx/preference/Preference;", "toggles", "q", "copyPushToken", "r", "copyFirebaseInstallationToken", "Landroidx/preference/SwitchPreference;", Image.TYPE_SMALL, "Landroidx/preference/SwitchPreference;", "closePizzeriaMode", "t", "goToSystemAppInfo", "u", "designSystem", "v", "flipperDiagnostic", "Lkm1;", "w", "Lkm1;", "getComponentDependenciesRegistry", "()Lkm1;", "componentDependenciesRegistry", "presenter", "Lru/dodopizza/app/presentation/debugtools/DebugPreferencePresenter;", "Kh", "()Lru/dodopizza/app/presentation/debugtools/DebugPreferencePresenter;", "setPresenter", "(Lru/dodopizza/app/presentation/debugtools/DebugPreferencePresenter;)V", "<init>", "()V", "x", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DebugPreferenceFragment extends nr6 implements no2, lm1 {
    public static final a x = new a(null);
    private ListPreference m;
    private EditTextPreference n;
    private MultiSelectListPreference o;
    private Preference p;
    @InjectPresenter
    public DebugPreferencePresenter presenter;
    private Preference q;
    private Preference r;
    private SwitchPreference s;
    private Preference t;
    private Preference u;
    private Preference v;
    private final km1 w = eu2.d(this);

    /* compiled from: DebugPreferenceFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lru/dodopizza/app/presentation/debugtools/DebugPreferenceFragment$a;", "", "Lru/dodopizza/app/presentation/debugtools/a$a$a;", "mode", "Lru/dodopizza/app/presentation/debugtools/DebugPreferenceFragment;", "a", "", "EXTRA_MODE", "Ljava/lang/String;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DebugPreferenceFragment a(a.C0563a.EnumC0564a enumC0564a) {
            z65.h(enumC0564a, "mode");
            return (DebugPreferenceFragment) y64.d(new DebugPreferenceFragment(), bi0.c(bi0.d("extra_mode", enumC0564a)));
        }
    }

    private final void Mh() {
        EditTextPreference editTextPreference = this.n;
        EditTextPreference editTextPreference2 = null;
        if (editTextPreference == null) {
            z65.z("addEnvironment");
            editTextPreference = null;
        }
        editTextPreference.Y0(new EditTextPreference.a() { // from class: ao2
            @Override // androidx.preference.EditTextPreference.a
            public final void a(EditText editText) {
                DebugPreferenceFragment.Nh(editText);
            }
        });
        EditTextPreference editTextPreference3 = this.n;
        if (editTextPreference3 == null) {
            z65.z("addEnvironment");
        } else {
            editTextPreference2 = editTextPreference3;
        }
        editTextPreference2.E0(new Preference.c() { // from class: bo2
            @Override // androidx.preference.Preference.c
            public final boolean a(Preference preference, Object obj) {
                boolean Oh;
                Oh = DebugPreferenceFragment.Oh(DebugPreferenceFragment.this, preference, obj);
                return Oh;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Nh(EditText editText) {
        z65.h(editText, "editText");
        editText.setText(new SpannableStringBuilder("https://mapi-gateway.dev-{окружение}.dodois.dev"));
        editText.setTextIsSelectable(true);
        uj3.a aVar = uj3.e;
        editText.setSelection(aVar.b(), aVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Oh(DebugPreferenceFragment debugPreferenceFragment, Preference preference, Object obj) {
        z65.h(debugPreferenceFragment, "this$0");
        DebugPreferencePresenter Kh = debugPreferenceFragment.Kh();
        z65.f(obj, "null cannot be cast to non-null type kotlin.String");
        Kh.y((String) obj);
        return false;
    }

    private final void Ph() {
        SwitchPreference switchPreference = this.s;
        if (switchPreference == null) {
            z65.z("closePizzeriaMode");
            switchPreference = null;
        }
        switchPreference.E0(new Preference.c() { // from class: vn2
            @Override // androidx.preference.Preference.c
            public final boolean a(Preference preference, Object obj) {
                boolean Qh;
                Qh = DebugPreferenceFragment.Qh(DebugPreferenceFragment.this, preference, obj);
                return Qh;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Qh(DebugPreferenceFragment debugPreferenceFragment, Preference preference, Object obj) {
        z65.h(debugPreferenceFragment, "this$0");
        DebugPreferencePresenter Kh = debugPreferenceFragment.Kh();
        z65.f(obj, "null cannot be cast to non-null type kotlin.Boolean");
        Kh.E(!((Boolean) obj).booleanValue());
        return true;
    }

    private final void Rh() {
        Preference preference = this.r;
        if (preference == null) {
            z65.z("copyFirebaseInstallationToken");
            preference = null;
        }
        preference.F0(new Preference.d() { // from class: go2
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference2) {
                boolean Sh;
                Sh = DebugPreferenceFragment.Sh(DebugPreferenceFragment.this, preference2);
                return Sh;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Sh(DebugPreferenceFragment debugPreferenceFragment, Preference preference) {
        z65.h(debugPreferenceFragment, "this$0");
        debugPreferenceFragment.Kh().A();
        return true;
    }

    private final void Th() {
        Preference preference = this.q;
        if (preference == null) {
            z65.z("copyPushToken");
            preference = null;
        }
        preference.F0(new Preference.d() { // from class: wn2
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference2) {
                boolean Uh;
                Uh = DebugPreferenceFragment.Uh(DebugPreferenceFragment.this, preference2);
                return Uh;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Uh(DebugPreferenceFragment debugPreferenceFragment, Preference preference) {
        z65.h(debugPreferenceFragment, "this$0");
        debugPreferenceFragment.Kh().C();
        return true;
    }

    private final void Vh() {
        Preference preference = this.u;
        if (preference == null) {
            z65.z("designSystem");
            preference = null;
        }
        preference.F0(new Preference.d() { // from class: zn2
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference2) {
                boolean Wh;
                Wh = DebugPreferenceFragment.Wh(DebugPreferenceFragment.this, preference2);
                return Wh;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Wh(DebugPreferenceFragment debugPreferenceFragment, Preference preference) {
        ru.dodopizza.app.presentation.debugtools.a aVar;
        z65.h(debugPreferenceFragment, "this$0");
        Fragment parentFragment = debugPreferenceFragment.getParentFragment();
        if (parentFragment instanceof ru.dodopizza.app.presentation.debugtools.a) {
            aVar = (ru.dodopizza.app.presentation.debugtools.a) parentFragment;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.gh();
            return true;
        }
        return true;
    }

    private final void Xh() {
        ListPreference listPreference = this.m;
        ListPreference listPreference2 = null;
        if (listPreference == null) {
            z65.z("environmentsList");
            listPreference = null;
        }
        listPreference.F0(new Preference.d() { // from class: eo2
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference) {
                boolean Yh;
                Yh = DebugPreferenceFragment.Yh(DebugPreferenceFragment.this, preference);
                return Yh;
            }
        });
        ListPreference listPreference3 = this.m;
        if (listPreference3 == null) {
            z65.z("environmentsList");
        } else {
            listPreference2 = listPreference3;
        }
        listPreference2.E0(new Preference.c() { // from class: fo2
            @Override // androidx.preference.Preference.c
            public final boolean a(Preference preference, Object obj) {
                boolean Zh;
                Zh = DebugPreferenceFragment.Zh(DebugPreferenceFragment.this, preference, obj);
                return Zh;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Yh(DebugPreferenceFragment debugPreferenceFragment, Preference preference) {
        z65.h(debugPreferenceFragment, "this$0");
        debugPreferenceFragment.Kh().F();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Zh(DebugPreferenceFragment debugPreferenceFragment, Preference preference, Object obj) {
        z65.h(debugPreferenceFragment, "this$0");
        DebugPreferencePresenter Kh = debugPreferenceFragment.Kh();
        z65.f(obj, "null cannot be cast to non-null type kotlin.String");
        Kh.z((String) obj);
        return true;
    }

    private final void ai() {
        Preference preference = this.v;
        if (preference == null) {
            z65.z("flipperDiagnostic");
            preference = null;
        }
        preference.F0(new Preference.d() { // from class: un2
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference2) {
                boolean bi;
                bi = DebugPreferenceFragment.bi(DebugPreferenceFragment.this, preference2);
                return bi;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bi(DebugPreferenceFragment debugPreferenceFragment, Preference preference) {
        z65.h(debugPreferenceFragment, "this$0");
        Context requireContext = debugPreferenceFragment.requireContext();
        z65.g(requireContext, "requireContext(...)");
        dz3.a(requireContext);
        return true;
    }

    private final void ci() {
        Preference preference = this.t;
        if (preference == null) {
            z65.z("goToSystemAppInfo");
            preference = null;
        }
        preference.F0(new Preference.d() { // from class: yn2
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference2) {
                boolean di;
                di = DebugPreferenceFragment.di(DebugPreferenceFragment.this, preference2);
                return di;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean di(DebugPreferenceFragment debugPreferenceFragment, Preference preference) {
        z65.h(debugPreferenceFragment, "this$0");
        Context requireContext = debugPreferenceFragment.requireContext();
        z65.g(requireContext, "requireContext(...)");
        av1.c(requireContext);
        return true;
    }

    private final void ei() {
        MultiSelectListPreference multiSelectListPreference = this.o;
        MultiSelectListPreference multiSelectListPreference2 = null;
        if (multiSelectListPreference == null) {
            z65.z("removeEnvironments");
            multiSelectListPreference = null;
        }
        multiSelectListPreference.F0(new Preference.d() { // from class: co2
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference) {
                boolean fi;
                fi = DebugPreferenceFragment.fi(DebugPreferenceFragment.this, preference);
                return fi;
            }
        });
        MultiSelectListPreference multiSelectListPreference3 = this.o;
        if (multiSelectListPreference3 == null) {
            z65.z("removeEnvironments");
        } else {
            multiSelectListPreference2 = multiSelectListPreference3;
        }
        multiSelectListPreference2.E0(new Preference.c() { // from class: do2
            @Override // androidx.preference.Preference.c
            public final boolean a(Preference preference, Object obj) {
                boolean gi;
                gi = DebugPreferenceFragment.gi(DebugPreferenceFragment.this, preference, obj);
                return gi;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fi(DebugPreferenceFragment debugPreferenceFragment, Preference preference) {
        z65.h(debugPreferenceFragment, "this$0");
        debugPreferenceFragment.Kh().G();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean gi(DebugPreferenceFragment debugPreferenceFragment, Preference preference, Object obj) {
        z65.h(debugPreferenceFragment, "this$0");
        DebugPreferencePresenter Kh = debugPreferenceFragment.Kh();
        z65.f(obj, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        Kh.D((Set) obj);
        return false;
    }

    private final void hi() {
        Preference preference = this.p;
        if (preference == null) {
            z65.z("toggles");
            preference = null;
        }
        preference.F0(new Preference.d() { // from class: xn2
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference2) {
                boolean ii;
                ii = DebugPreferenceFragment.ii(DebugPreferenceFragment.this, preference2);
                return ii;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ii(DebugPreferenceFragment debugPreferenceFragment, Preference preference) {
        z65.h(debugPreferenceFragment, "this$0");
        debugPreferenceFragment.zg();
        return true;
    }

    @Override // defpackage.no2
    public void Bc() {
        ListPreference listPreference = this.m;
        if (listPreference == null) {
            z65.z("environmentsList");
            listPreference = null;
        }
        of(listPreference);
    }

    @Override // defpackage.no2
    public void I4(String[] strArr, String[] strArr2) {
        z65.h(strArr, "environmentsName");
        z65.h(strArr2, "environmentsUrl");
        MultiSelectListPreference multiSelectListPreference = this.o;
        MultiSelectListPreference multiSelectListPreference2 = null;
        if (multiSelectListPreference == null) {
            z65.z("removeEnvironments");
            multiSelectListPreference = null;
        }
        multiSelectListPreference.Z0(strArr);
        MultiSelectListPreference multiSelectListPreference3 = this.o;
        if (multiSelectListPreference3 == null) {
            z65.z("removeEnvironments");
        } else {
            multiSelectListPreference2 = multiSelectListPreference3;
        }
        multiSelectListPreference2.a1(strArr2);
    }

    @Override // defpackage.no2
    public void K1(String str) {
        z65.h(str, "token");
        Object systemService = requireContext().getSystemService("clipboard");
        z65.f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("token", str));
        Context requireContext = requireContext();
        String substring = str.substring(str.length() - 4, str.length());
        z65.g(substring, "substring(...)");
        Toast.makeText(requireContext, "Сохранено в буфер: *" + substring, 1).show();
    }

    public final DebugPreferencePresenter Kh() {
        DebugPreferencePresenter debugPreferencePresenter = this.presenter;
        if (debugPreferencePresenter != null) {
            return debugPreferencePresenter;
        }
        z65.z("presenter");
        return null;
    }

    @ProvidePresenter
    public final DebugPreferencePresenter Lh() {
        mn2.a y3 = ((AppComponent) getComponentDependenciesRegistry().a(bc9.b(AppComponent.class))).y3();
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("extra_mode")) == null) ? null : null;
        if (obj != null && !(obj instanceof a.C0563a.EnumC0564a)) {
            throw new ClassCastException("Property extra_mode has different class type");
        } else if (obj != null) {
            return y3.a((a.C0563a.EnumC0564a) obj).a();
        } else {
            throw new IllegalArgumentException("Argument with key = extra_mode not found in bundle");
        }
    }

    @Override // defpackage.no2
    public void N6(String[] strArr, String[] strArr2) {
        z65.h(strArr, "environmentsName");
        z65.h(strArr2, "environmentsUrl");
        ListPreference listPreference = this.m;
        ListPreference listPreference2 = null;
        if (listPreference == null) {
            z65.z("environmentsList");
            listPreference = null;
        }
        listPreference.c1(strArr);
        ListPreference listPreference3 = this.m;
        if (listPreference3 == null) {
            z65.z("environmentsList");
        } else {
            listPreference2 = listPreference3;
        }
        listPreference2.d1(strArr2);
    }

    @Override // defpackage.no2
    public void Zd(String str) {
        z65.h(str, RemoteMessageConst.Notification.URL);
        ListPreference listPreference = this.m;
        ListPreference listPreference2 = null;
        if (listPreference == null) {
            z65.z("environmentsList");
            listPreference = null;
        }
        listPreference.e1(str);
        ListPreference listPreference3 = this.m;
        if (listPreference3 == null) {
            z65.z("environmentsList");
            listPreference3 = null;
        }
        ListPreference listPreference4 = this.m;
        if (listPreference4 == null) {
            z65.z("environmentsList");
        } else {
            listPreference2 = listPreference4;
        }
        listPreference3.H0(listPreference2.a1());
    }

    @Override // defpackage.lm1
    public km1 getComponentDependenciesRegistry() {
        return this.w;
    }

    @Override // defpackage.no2
    public void oc(boolean z) {
        SwitchPreference switchPreference = this.s;
        if (switchPreference == null) {
            z65.z("closePizzeriaMode");
            switchPreference = null;
        }
        switchPreference.R0(z);
    }

    @Override // androidx.preference.d
    public void oh(Bundle bundle, String str) {
        gh(R.xml.debug_preference);
        this.m = (ListPreference) lo2.a(this, R.string.pref_debug_environments_list);
        this.n = (EditTextPreference) lo2.a(this, R.string.pref_debug_add_environment);
        this.o = (MultiSelectListPreference) lo2.a(this, R.string.pref_debug_remove_environment);
        this.p = lo2.a(this, R.string.pref_debug_toggles);
        this.q = lo2.a(this, R.string.pref_debug_copy_push_token);
        this.r = lo2.a(this, R.string.pref_debug_copy_firebase_installation_token);
        this.s = (SwitchPreference) lo2.a(this, R.string.pref_debug_activate_close_mode);
        this.t = lo2.a(this, R.string.pref_debug_go_to_system_app_info);
        this.u = lo2.a(this, R.string.pref_debug_design_system);
        this.v = lo2.a(this, R.string.pref_debug_flipper_diagnostic);
    }

    @Override // androidx.preference.d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        Xh();
        Mh();
        ei();
        hi();
        Th();
        Rh();
        Ph();
        ci();
        Vh();
        ai();
    }

    @Override // defpackage.no2
    public void y() {
        d requireActivity = requireActivity();
        z65.f(requireActivity, "null cannot be cast to non-null type com.dodopizza.presentation.activities.BaseActivityView");
        ((y60) requireActivity).y();
    }

    @Override // defpackage.no2
    public void zg() {
        ru.dodopizza.app.presentation.debugtools.a aVar;
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof ru.dodopizza.app.presentation.debugtools.a) {
            aVar = (ru.dodopizza.app.presentation.debugtools.a) parentFragment;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.hh();
        }
    }
}
