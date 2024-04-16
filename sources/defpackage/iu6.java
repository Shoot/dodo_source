package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.b;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: NativeDialogWrapperFragment.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u000e2\u00020\u0001:\u0005\u000f\u000e\u0010\u0011\u0012B\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u0013"}, d2 = {"Liu6;", "Landroidx/fragment/app/c;", "", "ih", "lh", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "<init>", "()V", "b", "a", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: iu6  reason: default package */
/* loaded from: classes.dex */
public final class iu6 extends androidx.fragment.app.c {
    private static final b b = new b(null);

    /* compiled from: NativeDialogWrapperFragment.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015¨\u0006\u0019"}, d2 = {"Liu6$a;", "", "", "titleRes", com.huawei.hms.push.e.a, "", "messageText", "f", "messageRes", "b", "buttonTextRes", DateTokenConverter.CONVERTER_KEY, com.huawei.hms.opendevice.c.a, "", "isCancelable", "a", "Landroidx/fragment/app/Fragment;", "parentFragment", "", "g", "Landroid/os/Bundle;", "Landroid/os/Bundle;", "bundle", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: iu6$a */
    /* loaded from: classes.dex */
    public static final class a {
        private final Bundle a = new Bundle();

        public final a a(boolean z) {
            this.a.putBoolean("is_cancelable", z);
            return this;
        }

        public final a b(int i) {
            if (i > 0) {
                this.a.putInt("message_res", i);
            }
            return this;
        }

        public final a c(int i) {
            if (i > 0) {
                this.a.putInt("negative_button_text_res", i);
            }
            return this;
        }

        public final a d(int i) {
            if (i > 0) {
                this.a.putInt("positive_button_text_res", i);
            }
            return this;
        }

        public final a e(int i) {
            if (i > 0) {
                this.a.putInt("title_res", i);
            }
            return this;
        }

        public final a f(CharSequence charSequence) {
            z65.h(charSequence, "messageText");
            this.a.putCharSequence("title_text", charSequence);
            return this;
        }

        public final void g(Fragment fragment) {
            z65.h(fragment, "parentFragment");
            ((iu6) y64.d(new iu6(), this.a)).show(fragment.getChildFragmentManager(), "TAG");
        }
    }

    /* compiled from: NativeDialogWrapperFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"Liu6$b;", "", "", "IS_CANCELABLE", "Ljava/lang/String;", "MESSAGE_RES", "MESSAGE_TEXT", "NEGATIVE_BUTTON_TEXT_RES", "POSITIVE_BUTTON_TEXT_RES", "TITLE_RES", "TITLE_TEXT", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: iu6$b */
    /* loaded from: classes.dex */
    private static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: NativeDialogWrapperFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Liu6$c;", "", "", "l0", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: iu6$c */
    /* loaded from: classes.dex */
    public interface c {
        void l0();
    }

    /* compiled from: NativeDialogWrapperFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Liu6$d;", "", "", "Z9", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: iu6$d */
    /* loaded from: classes.dex */
    public interface d {
        void Z9();
    }

    /* compiled from: NativeDialogWrapperFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Liu6$e;", "", "", "S9", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: iu6$e */
    /* loaded from: classes.dex */
    public interface e {
        void S9();
    }

    private final void ih() {
        e eVar;
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof e) {
            eVar = (e) parentFragment;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            eVar.S9();
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void jh(iu6 iu6Var, DialogInterface dialogInterface, int i) {
        z65.h(iu6Var, "this$0");
        iu6Var.ih();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void kh(iu6 iu6Var, DialogInterface dialogInterface, int i) {
        z65.h(iu6Var, "this$0");
        iu6Var.lh();
    }

    private final void lh() {
        d dVar;
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof d) {
            dVar = (d) parentFragment;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            dVar.Z9();
        }
        dismiss();
    }

    @Override // androidx.fragment.app.c
    public Dialog onCreateDialog(Bundle bundle) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Boolean bool = Boolean.TRUE;
        Bundle arguments = getArguments();
        if (arguments != null && (obj6 = arguments.get("is_cancelable")) != null) {
            bool = obj6;
        }
        if (bool != null && !(bool instanceof Boolean)) {
            throw new ClassCastException("Property is_cancelable has different class type");
        } else if (bool != null) {
            setCancelable(bool.booleanValue());
            Integer num = 0;
            Bundle arguments2 = getArguments();
            if (arguments2 != null && (obj5 = arguments2.get("title_res")) != null) {
                num = obj5;
            }
            if (num != null && !(num instanceof Integer)) {
                throw new ClassCastException("Property title_res has different class type");
            } else if (num != null) {
                int intValue = num.intValue();
                Bundle arguments3 = getArguments();
                Object obj7 = null;
                if (arguments3 != null) {
                    obj = arguments3.get("title_text");
                } else {
                    obj = null;
                }
                if (obj != null && !(obj instanceof CharSequence)) {
                    throw new ClassCastException("Property title_text has different class type");
                }
                CharSequence charSequence = (CharSequence) obj;
                Integer num2 = 0;
                Bundle arguments4 = getArguments();
                if (arguments4 != null && (obj4 = arguments4.get("message_res")) != null) {
                    num2 = obj4;
                }
                if (num2 != null && !(num2 instanceof Integer)) {
                    throw new ClassCastException("Property message_res has different class type");
                } else if (num2 != null) {
                    int intValue2 = num2.intValue();
                    Bundle arguments5 = getArguments();
                    if (arguments5 != null) {
                        obj7 = arguments5.get("message_text");
                    }
                    if (obj7 != null && !(obj7 instanceof CharSequence)) {
                        throw new ClassCastException("Property message_text has different class type");
                    }
                    CharSequence charSequence2 = (CharSequence) obj7;
                    Integer num3 = 0;
                    Bundle arguments6 = getArguments();
                    if (arguments6 != null && (obj3 = arguments6.get("positive_button_text_res")) != null) {
                        num3 = obj3;
                    }
                    if (num3 != null && !(num3 instanceof Integer)) {
                        throw new ClassCastException("Property positive_button_text_res has different class type");
                    } else if (num3 != null) {
                        int intValue3 = num3.intValue();
                        Integer num4 = 0;
                        Bundle arguments7 = getArguments();
                        if (arguments7 != null && (obj2 = arguments7.get("negative_button_text_res")) != null) {
                            num4 = obj2;
                        }
                        if (num4 != null && !(num4 instanceof Integer)) {
                            throw new ClassCastException("Property negative_button_text_res has different class type");
                        } else if (num4 != null) {
                            int intValue4 = num4.intValue();
                            b.a aVar = new b.a(requireContext());
                            if (intValue > 0) {
                                aVar.r(intValue);
                            }
                            if (charSequence != null) {
                                aVar.s(charSequence);
                            }
                            if (intValue2 > 0) {
                                aVar.g(intValue2);
                            }
                            if (charSequence2 != null) {
                                aVar.h(charSequence2);
                            }
                            if (intValue3 > 0) {
                                aVar.n(intValue3, new DialogInterface.OnClickListener() { // from class: gu6
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        iu6.jh(iu6.this, dialogInterface, i);
                                    }
                                });
                            }
                            if (intValue4 > 0) {
                                aVar.j(intValue4, new DialogInterface.OnClickListener() { // from class: hu6
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        iu6.kh(iu6.this, dialogInterface, i);
                                    }
                                });
                            }
                            androidx.appcompat.app.b a2 = aVar.a();
                            z65.g(a2, "create(...)");
                            return a2;
                        } else {
                            throw new IllegalArgumentException("Argument with key = negative_button_text_res not found in bundle");
                        }
                    } else {
                        throw new IllegalArgumentException("Argument with key = positive_button_text_res not found in bundle");
                    }
                } else {
                    throw new IllegalArgumentException("Argument with key = message_res not found in bundle");
                }
            } else {
                throw new IllegalArgumentException("Argument with key = title_res not found in bundle");
            }
        } else {
            throw new IllegalArgumentException("Argument with key = is_cancelable not found in bundle");
        }
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        c cVar;
        z65.h(dialogInterface, "dialog");
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof c) {
            cVar = (c) parentFragment;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            cVar.l0();
        }
        super.onDismiss(dialogInterface);
    }
}
